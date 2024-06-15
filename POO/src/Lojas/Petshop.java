package Lojas;

import animal.Animal;
import animal.Cachorro;

public class Petshop {

    public void darBanho(Animal animal){
        animal.setEstadoEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoEspirito("tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoEspirito("com saudades");
    }
}
