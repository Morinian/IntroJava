package implementation;

public class MercadoArray implements Mercados{

    private final String[] item; //precisa inicializar

    private int lastIndex;

    public  MercadoArray(final int size){
        item = new String[size];
        lastIndex = -1;
    }

    @Override
    public void add(String items) {
        if(lastIndex == item.length-1){
            System.err.println("Lista de Supermercado cheia");
        }else{
            lastIndex++;
            item[lastIndex] = items;
        }
    }

    @Override
    public void print() {
        System.out.println("----------------------------------");
        if (lastIndex < 0 ){
            System.out.println("Lista de supermercado vazia");
        }
        for (int i= 0; i <= lastIndex; i++){
            System.out.println(i + "-" + item[i]);
        }
        System.out.println("----------------------------------");
    }

    @Override
    public void delete(int index) {
        if(index >=0 && index <= lastIndex){
            shift(index);
            lastIndex--;
        }else {
            System.err.println("Indice invalido: " + index);
        }
    }

    private  void shift(final int index){
        for (int i = index; i < lastIndex; i++){
            item[i] = item[i+1];
        }
    }
}
