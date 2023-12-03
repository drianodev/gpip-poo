package ufc.poo.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "relatorios")
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "criterio_relatorio", nullable = false, length = 80)
    private String criterio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_relatorio", nullable = false)
    private Date dataGeracao;

    @OneToOne
    @JoinColumn(name = "patrimonio_id", nullable = false)
    private Patrimonio patrimonio;

    private static List<Relatorio> relatorios = new ArrayList<>();

    public Relatorio(String criterio, Date dataGeracao, Patrimonio patrimonio) {
        this.criterio = criterio;
        this.dataGeracao = dataGeracao;
        this.patrimonio = patrimonio;
    }

    public Relatorio() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }

    public static List<Relatorio> listarRelatorios() {
        return relatorios;
    }

    public void gerarRelatorio() {
        relatorios.add(this);
    }
}
