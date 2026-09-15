package org.acme.pais.infra;

import org.acme.core.IEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * Entidade JPA que representa um País na tabela "db_master".
 */
@Entity
@Table(name = "paises", catalog = "db_master")
@XmlRootElement
public class PaisEntity implements IEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotBlank
    @Size(max = 60)
    @Column(name = "nome", nullable = false, length = 60)
    private String nome;
    @NotBlank
    @Size(max = 4)
    @Column(name = "sigla", length = 10, nullable = false)
    private String sigla;
    @NotBlank
    @Size(max = 10)
    @Column(name = "codigo_ibge", length = 10)
    private String ibge;
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
        if (!(o instanceof PaisEntity that)) return false;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
