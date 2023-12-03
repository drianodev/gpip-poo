package ufc.poo.model.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "patrimonios")
public class Patrimonio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "numero_tombo", nullable = false)
    private String numeroTombo;

    @Column(name = "descricao_patrimonio", nullable = false, length = 200)
    private String descricao;

    @Column(name = "estado_patrimonio", nullable = false, length = 80)
    private String estado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_aquisicao", nullable = false)
    private Date dataAquisicao;

    @ManyToOne
    @JoinColumn(name = "instituicao_id", nullable = false)
    private Instituicao instituicao;

    @ManyToOne
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;

    public Patrimonio(String numeroTombo, String descricao, String estado,
                      Date dataAquisicao, Instituicao instituicao, Sala sala) {
        this.numeroTombo = numeroTombo;
        this.descricao = descricao;
        this.estado = estado;
        this.dataAquisicao = dataAquisicao;
        this.instituicao = instituicao;
        this.sala = sala;
    }

    public Patrimonio(String numeroTombo, String descricao, String estado,
                      Date dataAquisicao, Instituicao instituicao) {
        this.numeroTombo = numeroTombo;
        this.descricao = descricao;
        this.estado = estado;
        this.dataAquisicao = dataAquisicao;
        this.instituicao = instituicao;
    }

    public Patrimonio() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumeroTombo() {
        return numeroTombo;
    }

    public void setNumeroTombo(String numeroTombo) {
        this.numeroTombo = numeroTombo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
