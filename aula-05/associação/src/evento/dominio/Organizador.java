package evento.dominio;

public class Organizador extends Usuario {

    private String setor;

    protected Organizador(){}

    public Organizador(String nome, String email, long id, String setor){
        super(nome, email, id);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    
}
