package ExemploForEach;

public class Main {
    public static  void main(String[] args){

        String[] vetor = new  String[] {"Adriano","Bob","Ricardo"};

        System.out.println("######## Impressao com For #############");
        for(int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("######## Impressao com For Each #############");
        //Laço For Each
        for (String obj : vetor){
            System.out.println(obj);
        }

    }
}
