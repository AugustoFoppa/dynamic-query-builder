package org.acme.pais;

import java.sql.Timestamp;

import org.acme.core.IDomain;

public class Pais implements IDomain {


    private Long id;
    private String nome;
    private String sigla;
    private String ibge;
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
    @Override
	public Timestamp getVersion() {
		return version;
	}
    @Override
	public void setVersion(Timestamp version) {
		this.version = version;
	}
}
