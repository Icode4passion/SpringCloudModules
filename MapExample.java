import java.util.*;
import java.lang.*;

public class MapExample {

    public static void main(String[] args){
        Map<String, Integer> map 
            = new TreeMap<>(); 

        map.put("mahesh",1);
        map.put("Anusha",7);
        map.put("Udaya",11);
        map.put("Ram",1);


        Set<String> key = map.keySet();
        for (String s : key){
            System.out.println("->"+s);
        }

        Collection<Integer> value = map.values();
        for (Integer in : value){
            System.out.println(">" + in);
        }

        Set<Map.Entry<String,Integer>> entries = map.entrySet();

        for (Map.Entry<String,Integer> entry : entries ){
            System.out.println("Keys "+ entry.getKey() + "Map values "+entry.getValue());
        }

        // for (Map.Entry<String,Integer> e : map.entrySet()){
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }

        // System.out.println(map);

        // System.out.println(map.get("Anusha"));

        
    }
    
}