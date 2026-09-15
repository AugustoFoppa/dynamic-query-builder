package org.acme.estado.dto;

import org.acme.estado.RegiaoEnum;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class EstadoInputDTO {

    @NotEmpty
    @Size(max = 60)
    private String nome;

    @NotEmpty
    @Size(min = 2, max = 2)
    private String sigla;

    @NotEmpty
    @Size(max = 10)
    private String ibge;

    @NotNull
    private RegiaoEnum regiao;

    @NotNull
    @Positive
    private Long paisId;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getIbge() {
        return ibge;
    }
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }
    public RegiaoEnum getRegiao() {
        return regiao;
    }
    public void setRegiao(RegiaoEnum regiao) {
        this.regiao = regiao;
    }
    public Long getPaisId() {
        return paisId;
    }
    public void setPaisId(Long paisId) {
        this.paisId = paisId;
    }
}
