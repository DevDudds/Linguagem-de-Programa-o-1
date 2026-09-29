import model.Evento;

public class App {

    public static void main(String[] args) throws Exception {
        
        Evento evento = new Evento();

        evento.nome = "IFBA TechWeek";
        evento.capacidade = 10;
        evento.data = "25/12/2026";
        evento.local = "auditório - ifba";

        System.out.println(evento.resumo());

        Evento eventoEE = new Evento();
        eventoEE.nome = "Semana de Eng.";
        eventoEE.capacidade = 1;
        eventoEE.data = "23/12/2026";
        eventoEE.local = "auditório - ifba";

        Evento teste = new Evento("Semana BCC", "IFBA", "hoje", 200);
        System.out.println(teste.resumo());
    }
}