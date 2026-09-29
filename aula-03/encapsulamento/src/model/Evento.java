package model;

public class Evento {

    private String nome;
    private String local;
    private int vagas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        if (vagas < 0)
            System.out.println("Vagas deve ser maior que 0!");
        else
            this.vagas = vagas;
    }

    public Evento(){};
}
