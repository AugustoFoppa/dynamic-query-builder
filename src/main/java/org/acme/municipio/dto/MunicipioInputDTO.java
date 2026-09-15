package org.acme.municipio.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class MunicipioInputDTO {

    @NotEmpty
    @Size(max = 60)
    private String nome;

    @NotNull
    @Size(max = 10)
    private String ibge;

    @NotNull
    @Positive
    private Long estadoId;

    private byte[] logotipo;

    private String configuracoesWS;

    @Size(max = 240)
    private String tags;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIbge() {
        return ibge;
    }
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }
    public Long getEstadoId() {
        return estadoId;
    }
    public void setEstadoId(Long estadoId) {
        this.estadoId = estadoId;
    }
    public byte[] getLogotipo() {
        return logotipo;
    }
    public void setLogotipo(byte[] logotipo) {
        this.logotipo = logotipo;
    }
    public String getConfiguracoesWS() {
        return configuracoesWS;
    }
    public void setConfiguracoesWS(String configuracoesWS) {
        this.configuracoesWS = configuracoesWS;
    }
    public String getTags() {
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
}
