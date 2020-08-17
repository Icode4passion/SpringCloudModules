import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBinder{
    public static void main(String[] args){
        System.out.println("Stream.of(Values..)");
        Stream<Integer> sb = Stream.of(1,2,3,4,5,6);
        sb.forEach(x->System.out.print(x+" "));
        System.out.println("\nStream.of(arrayOfElements)");
        Stream<Integer> st = Stream.of(new Integer []{11,2,13,12,111,34});
        st.forEach(x->System.out.print(x+ " "));
        System.out.println("\nList of Streams");
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0 ; i <10 ; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumber = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        //stream.forEach(p -> System.out.print(p + " "));
        System.out.print(evenNumber + "\n");
        //Integer[] evenNumber = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);        
        


        System.out.println("Core stream operations");


        List<String> name = new ArrayList<>();
        name.add("Mahesh");
        name.add("Anusha");
        name.add("Anoop");
        name.add("Sheish");
        name.add("weere");


        name.stream().filter((s) -> s.startsWith("M")).forEach(x -> System.out.println(x));
        name.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(x -> System.out.println(x));
        name.stream().sorted().forEach(x -> System.out.println(x));

    }

}