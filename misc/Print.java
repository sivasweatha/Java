import java.util.*;

public class Print {
    public static void main(String[] args) {
        // Animal a = new Animal();
        // String y = a.dog();
        // System.out.println(y);
        System.out.println("What is your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hi " + name);
    }
}