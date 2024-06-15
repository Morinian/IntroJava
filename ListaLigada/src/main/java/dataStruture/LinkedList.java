package dataStruture;

public class LinkedList {

    private Node head; // sempre fixo no primeiro da lista
    private Node tail; // sempre fixo no ultimo da lista
    private  int length;

    class Node{
        String data;
        Node next; //referencia o proximo nó

        Node(String data){
            this.data = data;
        }
    }

    public  LinkedList(String data){
        //vai inicializar

        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead(){
        if(this.head == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Head: "+ head.data);
        }
    }
    public void getTail(){
        if(this.tail == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Tail: "+ tail.data);
        }
    }
    public void getLength(){
        System.out.println("Length: " + this.length);
    }


    //Tornar a lista vazia
    public  void makeEmpty(){
        head = null;
        tail = null;
        length = 0 ;
    }

    //leitor da lista
    public void print(){
        Node temp = this.head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList("elemento 1");
        list.getHead();
        list.getTail();
        list.getLength();

        list.print();
    }
}
