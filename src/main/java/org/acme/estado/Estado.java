package org.acme.estado;

import java.sql.Timestamp;

import org.acme.core.IDomain;
import org.acme.pais.Pais;

public class Estado implements IDomain {

    private Long id;
    private String nome;
    private String sigla;
    private String ibge;
    private RegiaoEnum regiao;
    private Pais pais;
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
	public RegiaoEnum getRegiao() {
		return regiao;
	}
	public void setRegiao(RegiaoEnum regiao) {
		this.regiao = regiao;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
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
