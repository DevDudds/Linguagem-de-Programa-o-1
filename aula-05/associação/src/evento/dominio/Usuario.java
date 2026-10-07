package evento.dominio;

public abstract class Usuario {

    private String nome;
    private String email;
    private long id;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getId() {
        return id;
    }   
    
    protected Usuario() {
    }

    protected Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    
    
}
