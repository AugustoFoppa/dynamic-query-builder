package org.acme.estado.dto;

import java.sql.Timestamp;

import org.acme.estado.RegiaoEnum;
import org.acme.pais.dto.PaisOutputDTO;

public class EstadoOutputDTO {

    private Long id;
    private String nome;
    private String sigla;
    private String ibge;
    private RegiaoEnum regiao;
    private PaisOutputDTO pais;
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
    public PaisOutputDTO getPais() {
        return pais;
    }
    public void setPais(PaisOutputDTO pais) {
        this.pais = pais;
    }
    public Timestamp getVersion() {
        return version;
    }
    public void setVersion(Timestamp version) {
        this.version = version;
    }
}
