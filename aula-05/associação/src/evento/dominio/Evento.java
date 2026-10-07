package evento.dominio;

import java.util.Set;
import java.time.LocalDate;
import java.util.List;

public class Evento {
    private long id;
    private String nome;
    private LocalDate data;
    private String local;
    private int capacidade;
    private Organizador organizador;
    private List<Programacao> programacao;
    private Set<Participante> participantes;
    protected Evento() {
    }
    public Evento(long id, String nome, LocalDate data, String local, int capacidade, Organizador organizador) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
        this.organizador = organizador;
    }
    public long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public Organizador getOrganizador() {
        return organizador;
    }
    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }
    public List<Programacao> getProgramacao() {
        return programacao;
    }
    public void setProgramacao(List<Programacao> programacao) {
        this.programacao = programacao;
    }
    public Set<Participante> getParticipantes() {
        return participantes;
    }
    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    
}
