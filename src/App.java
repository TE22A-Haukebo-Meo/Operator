import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner tb = new Scanner(System.in);
        System.out.println("Droppa le tal");
        int tal1 = tb.nextInt();
        int tal2 = tb.nextInt();
        System.out.println(tal1==tal2);
        System.out.println(tal1<tal2);
        System.out.println(tal1>tal2);
    }
}
