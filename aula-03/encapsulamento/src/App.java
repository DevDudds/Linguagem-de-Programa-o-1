import model.Candidato;
import model.Evento;

public class App {
    public static void main(String[] args) throws Exception {
        Evento evento1 = new Evento();
        evento1.setNome("IFBA Techweek");
        evento1.setLocal("IFBA");
        evento1.setVagas(150);

        System.out.println("Nome: " + evento1.getNome());
        System.out.println("Local: " + evento1.getLocal());
        System.out.println("Vagas: " + evento1.getVagas());
    }
}
