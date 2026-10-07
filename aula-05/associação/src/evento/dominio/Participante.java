package evento.dominio;
import java.util.Set;
import java.util.List;

public class Participante extends Usuario {

    private boolean pagante;
    private Set<Evento> eventos;

    public Participante(String nome, String email) {
        this(nome, email, false);
    }

    public Participante(String nome, String email, boolean pagante){
        setNome(nome);
        setEmail(email);
        setPagante(pagante);
    }

    protected Participante() {
    }

    public boolean isPagante() {
        return pagante;
    }

    public void setPagante(boolean pagante) {
        this.pagante = pagante;
    }

    public Set<Evento> getEventos() {
        return eventos;
    }
}
