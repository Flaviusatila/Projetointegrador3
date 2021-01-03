package eVacina.evacina.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import eVacina.evacina.entites.ItemVacina;
import eVacina.evacina.entites.Vacina;

import java.util.Date;

public class ListaItemVacinaDTO {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("obesevacoes")
    private String observacoes;

    @JsonProperty("dose")
    private String dose;

    @JsonProperty("data_aplicacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dataAplicacao;

    public ListaItemVacinaDTO() {
    }

    public ListaItemVacinaDTO(ItemVacina item) {
        this.nome = item.getVacina().getNome();
        this.observacoes = item.getObservacao();
        this.dose = item.getVacina().getDose();
        this.dataAplicacao = item.getDataAplicacao();
    }

    public Date getDataAplicacao(Date dataAplicacao) {
        return this.dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public ItemVacina toEntity(){return new ItemVacina(dataAplicacao, observacoes,nome,dose);}
}