package evento.dominio;

import java.util.Set;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Evento {
    private long id;
    private String nome;
    private LocalDate data;
    private String local;
    private int capacidade;
    private Organizador organizador;
    private List<Programacao> programacao = new ArrayList<>();
    private Set<Participante> participantes = new HashSet<>();

    protected Evento() {
    }

    public Evento(String nome, LocalDate data, String local, int capacidade, Organizador organizador) {
        setNome(nome);
        setData(data);
        setLocal(local);
        setCapacidade(capacidade);
        setOrganizador(organizador);
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
        return new HashSet<>(participantes);
    }
    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    
}
