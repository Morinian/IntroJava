import Lojas.Petshop;
import animal.Cachorro;
import animal.Gato;

public class Main {
    public static void main(String[] args) {

        //definição de objetos
        Cachorro cachorro1 = new Cachorro("Pingo","Marrom",30,5.5,5,"nada");
        Cachorro cachorro2 = new Cachorro("Pingo","Marrom",30,5.5,5,"nada");

        Gato gato1 = new Gato("Pingo","Marrom",30,5.5,"nada");

        cachorro2.soar();
        gato1.soar();

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoEspirito());

        petshop.tosar(cachorro2);
        System.out.println(cachorro2.getEstadoEspirito());

        /*cachorro1.setNome("Puppy");
        cachorro1.setCor("Marrom");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoDoRabo(5);*/

        // System.out.println(cachorro1);  mostra o endereço na memória

        /*
        System.out.println("o cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
         */
    }
}