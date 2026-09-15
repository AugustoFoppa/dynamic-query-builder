package org.acme.estado.infra;

import org.acme.core.IEntity;
import org.acme.estado.RegiaoEnum;
import org.acme.pais.infra.PaisEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "estados", catalog = "db_master")
@XmlRootElement
public class EstadoEntity implements IEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty
    @Size(max = 60)
    @Column(name = "nome", nullable = false, length = 60)
    private String nome;

    @NotEmpty
    @Size(min = 2, max = 2)
    @Column(name = "sigla", nullable = false, length = 2)
    private String sigla;

    @NotEmpty
    @Size(max = 10)
    @Column(name = "codigo_ibge", length = 10)
    private String ibge;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "regiao", nullable = false)
    private RegiaoEnum regiao;

    @NotNull
    @Positive
    @Column(name = "pais_id")
    private Long paisId;
    @ManyToOne
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "pais_id", referencedColumnName = "id", insertable = false, updatable = false)
    private PaisEntity pais;

    @Lob
    @Column(name = "campo_adic", columnDefinition = "LONGTEXT")
    private String campos;

    @Version
    @Column(name = "last_update", columnDefinition = "DATETIME(0)")
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
    public Long getPaisId() {
        return paisId;
    }
    public void setPaisId(Long paisId) {
        this.paisId = paisId;
    }
    public PaisEntity getPais() {
        return pais;
    }
    public void setPais(PaisEntity pais) {
        this.pais = pais;
    }
    public String getCampos() {
        return campos;
    }
    public void setCampos(String campos) {
        this.campos = campos;
    }
    @Override
    public Timestamp getVersion() {
        return version;
    }
    @Override
    public void setVersion(Timestamp version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstadoEntity that)) return false;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
