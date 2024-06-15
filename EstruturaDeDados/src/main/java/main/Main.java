package main;

import implementation.MercadoArray;
import implementation.Mercados;

import java.util.Scanner;

public class Main {

    private final static int SIZE = 3;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Mercados mercados = new MercadoArray(SIZE);
        int opcao;

        do{
            System.out.println("\n Lista de compras");
            System.out.println("1- Inserir");
            System.out.println("2- Listar");
            System.out.println("3- Remove");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opçção");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = scanner.next(); //only simpre word
                    mercados.add(item);
                    break;
                case 2:
                    mercados.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do item a ser removido: ");
                    int index = scanner.nextInt();
                    mercados.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa....");
                    break;
                default:
                    System.out.println("Opção inválidade. Por favor, escolha novamente");
            }
        }while (opcao != 4);

        scanner.close();
    }



}
