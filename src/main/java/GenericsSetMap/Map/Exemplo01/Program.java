package GenericsSetMap.Map.Exemplo01;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        //Inserindo elemento no map
        cookies.put("Nome", "Maria");
        cookies.put("Email","maria@gmail.com");
        cookies.put("Telefone","989399929");



        //Removendo com a chave informada
        cookies.remove("Email");
        cookies.put("Telefone", "191929292");

        System.out.println("Contem a chave com nome telefone: " + cookies.containsKey("Telefone"));
        System.out.println("Email: " + cookies.get("Email"));
        System.out.println("Tamanho: " + cookies.size());

       for(String key : cookies.keySet()){
           System.out.println(key + ": " + cookies.get(key));
       }
    }
}
