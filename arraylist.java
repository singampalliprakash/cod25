import java.util.ArrayList;
import java.util.Iterator;

public class SimpleList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {     //hasnext is to print the elements one by one
            System.out.println(it.next());
        }
    }
}
