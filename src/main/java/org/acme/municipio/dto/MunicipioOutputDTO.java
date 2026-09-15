package org.acme.municipio.dto;

import java.sql.Timestamp;

import org.acme.estado.dto.EstadoOutputDTO;

public class MunicipioOutputDTO {

    private Long id;
    private String nome;
    private String ibge;
    private EstadoOutputDTO estado;
    private byte[] logotipo;
    private String configuracoesWS;
    private String tags;
    private Timestamp version;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
    public EstadoOutputDTO getEstado() {
        return estado;
    }
    public void setEstado(EstadoOutputDTO estado) {
        this.estado = estado;
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
    public Timestamp getVersion() {
        return version;
    }
    public void setVersion(Timestamp version) {
        this.version = version;
    }
}
