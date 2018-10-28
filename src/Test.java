import java.util.HashSet;

public class Test {
    public static void main (String[] args){
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> temp = set1;

        System.out.println(set1);
        System.out.println(temp);
    }
}
