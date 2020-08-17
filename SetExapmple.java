import java.util.*;

class Main {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("Hungry");
        s.add("Men");
        s.add("a");
        s.add("Hungry");
        for (String a : s)
              System.out.println(a.length()+  " distinct words: " + a);
    }
}