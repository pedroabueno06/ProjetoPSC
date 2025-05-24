package models;
import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;
import java.time.LocalDate;

@Entity
@Table(name = "Tarefa")
public class tarefa {
    @Id
    private int id;
    private String nome;
    private String prioridade;
    private LocalDate dataVendecimento;
    private String status;
    private LocalDate dataConclusao;

    @ManyToOne
    @JoinColumn(name = "Pedro")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "Anna")
    private Usuario responsavel;

    public tarefa(int id, String nome, String prioridade, LocalDate dataVendecimento, String status, LocalDate dataConclusao, Projeto projeto, Usuario responsavel) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.dataVendecimento = dataVendecimento;
        this.status = status;
        this.dataConclusao = dataConclusao;
        this.projeto = projeto;
        this.responsavel = responsavel;
    }
}