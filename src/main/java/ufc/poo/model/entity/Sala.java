package ufc.poo.model.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "salas")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "unidade_sala", nullable = false)
    private int unidade;

    @Column(name = "numero_sala", nullable = false)
    private int numeroDaSala;

    @ManyToOne
    @JoinColumn(name = "instituicao_id", nullable = false)
    private Instituicao instituicao;

    public Sala(int unidade, int numeroDaSala, Instituicao instituicao) {
        this.unidade = unidade;
        this.numeroDaSala = numeroDaSala;
        this.instituicao = instituicao;
    }

    public Sala() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
}
