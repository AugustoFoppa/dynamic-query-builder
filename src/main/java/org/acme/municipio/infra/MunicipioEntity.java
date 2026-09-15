package org.acme.municipio.infra;

import java.sql.Timestamp;
import java.util.Objects;

import org.acme.core.IEntity;
import org.acme.estado.infra.EstadoEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Entidade JPA que representa um Município na tabela "db_master".
 */
@Entity
@Table(name = "municipios", catalog = "db_master")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MunicipioEntity implements IEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty
    @Size(max = 60)
    @Column(name = "nome", nullable = false, length = 60)
    private String nome;

    @NotNull
    @Size(max = 10)
    @Column(name = "codigo_ibge", length = 10)
    private String ibge;

    @NotNull
    @Positive
    @Column(name = "estado_id")
    private Long estadoId;
    @ManyToOne
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "estado_id", referencedColumnName = "id", updatable = false, insertable = false)
    private EstadoEntity estado;

    @Lob
    @Column(name = "logotipo", columnDefinition = "LONGBLOB")
    private byte[] logotipo;

    @Lob
    @Column(name = "nfse_webservices", columnDefinition = "LONGTEXT")
    private String configuracoesWS;

    @Size(max = 240)
    @Column(name = "tags", length = 240)
    private String tags;

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
    public EstadoEntity getEstado() {
        return estado;
    }
    public void setEstado(EstadoEntity estado) {
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
        if (!(o instanceof MunicipioEntity that)) return false;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
