public class Teste {

    private int a;
    private int b;
    private int c;

    public Teste(){}
    public Teste(int a){}
    public Teste(int a, int b){}
    public Teste(int a, int b, int c){}

    public int somar(int a, int b){
        return a + b;
    }

    public int somar(int b, int c, int a){
        return c + b;
    }
}
