package evento.dominio;
import java.util.Set;

public class Participante extends Usuario {

    private boolean pagante;
    private Set<Evento> eventos;

    public Participante(String nome, String email, long id) {
        super(nome, email, id);
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
