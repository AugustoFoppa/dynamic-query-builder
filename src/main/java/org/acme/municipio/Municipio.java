package org.acme.municipio;

import java.sql.Timestamp;

import org.acme.core.IDomain;
import org.acme.estado.Estado;

public class Municipio implements IDomain {

    private Long id;
    private String nome;
    private String ibge;
    private Estado estado;
    private byte[] logotipo;
    private String configuracoesWS;
    private String tags;
    private Timestamp version;

    @Override
	public Long getId() {
		return id;
	}
    @Override
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
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
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
    @Override
	public Timestamp getVersion() {
		return version;
	}
    @Override
	public void setVersion(Timestamp version) {
		this.version = version;
	}
}
