package ufc.poo.model.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "movimentacoes")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_movimentacao", nullable = false)
    private Date dataMovimentacao;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario responsavel;

    @OneToOne
    @JoinColumn(name = "patrimonio_id", nullable = false)
    private Patrimonio patrimonio;

    @Column(name = "tipo_movimentacao", nullable = false, length = 80)
    private String tipoMovimentacao;

    public Movimentacao(Date dataMovimentacao, Usuario responsavel, Patrimonio patrimonio, String tipoMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
        this.responsavel = responsavel;
        this.patrimonio = patrimonio;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Movimentacao() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
}
