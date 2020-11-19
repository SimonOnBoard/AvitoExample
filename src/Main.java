import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Collection collection = new HashSet<>();
        print(collection);
    }

    public static void print(Collection collection) {
        System.out.println("A");
    }
    public static void print(HashSet collection) {
        System.out.println("B");
    }
    public static void print(Set collection) {
        System.out.println("C");
    }
}
