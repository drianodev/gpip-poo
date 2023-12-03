package ufc.poo.model.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "manutencoes")
public class Manutencao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_manutencao", nullable = false)
    private Date data;

    @Column(name = "tipo_patrimonio", nullable = false, length = 80)
    private String tipoManutencao;

    @Column(name = "descricao_manutencao", nullable = false, length = 200)
    private String descricao;

    @OneToOne
    @JoinColumn(name = "patrimonio_id", nullable = false)
    private Patrimonio patrimonio;

    public Manutencao(Date data, String tipoManutencao, String descricao, Patrimonio patrimonio) {
        this.data = data;
        this.tipoManutencao = tipoManutencao;
        this.descricao = descricao;
        this.patrimonio = patrimonio;
    }

    public Manutencao() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }
}
