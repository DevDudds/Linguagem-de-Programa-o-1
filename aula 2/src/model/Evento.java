package model;

/* Pilares da POO
   Abstração
   Encapsulamento
   Herança
   Polimorfismo
*/

public class Evento /* extends Object */ {
    // Atributos
    public String nome;
    public String data;
    public String local;
    public int capacidade;

    // Método: Construtor

    public Evento(){

    }

    public Evento(String nome, String local, String data, int capacidade){
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.capacidade = capacidade;
    }

    // Método
    public String resumo(){

        return nome + " (" + local + ") - até " + capacidade + " vagas";
    }
}