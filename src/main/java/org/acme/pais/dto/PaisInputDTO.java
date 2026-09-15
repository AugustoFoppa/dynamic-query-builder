package org.acme.pais.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PaisInputDTO {

    @NotBlank
    @Size(max = 60)
    private String nome;

    @NotBlank
    @Size(max = 4)
    private String sigla;

    @NotBlank
    @Size(max = 10)
    private String ibge;

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
}
