import evento.dominio.Usuario;
import evento.dominio.Organizador;
import evento.dominio.Participante;
import evento.dominio.Evento;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Organizador organizador1 = new Organizador("Eduardo", "Eduardo@Email.com", "Programador");

        Participante participante1 = new Participante("Edu", "edu@email.com");
        Participante participante2 = new Participante("Dudu", "dudu@email.com");

        Evento evento = new Evento("TechWeek II", LocalDate.now(), "IFBA", 100, organizador1);

        System.out.println("A " + evento.getNome() + " é organizado por " + evento.getOrganizador().getNome() + " O " + evento.getOrganizador().getSetor());
    }
}
