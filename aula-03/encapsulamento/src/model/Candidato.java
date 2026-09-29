package model;

public class Candidato {

    private String nome;
    private int numero;
    private int votos;

    public Candidato(){
        this.votos = 0;
    };

    public void setNome(String nome){
        if (nome.length() > 2)
            this.nome = nome;
        else 
            System.err.println("Nome inválido");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    /*public void setVotos(){
        this.votos++;
    }*/

    public int getVotos(){
        return this.votos;
    }
}
