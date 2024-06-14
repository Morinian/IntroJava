package animal;

public class Gato extends Animal{
    static int numeroDeGatos;

    public Gato(String nome, String cor, int altura, double peso,String estadoEspirito){
        super(nome,cor,altura,peso,estadoEspirito);

        numeroDeGatos++;
    }
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
