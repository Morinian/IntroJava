package animal;

public class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoEspirito;

    public Animal(String nome, String cor, int altura, double peso, String estadoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;
    }

    void comer(){}
    void dormir(){}

    void soar(){
        System.out.println(" ");
    }
}
