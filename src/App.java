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

        int[] fält = {4,5,2};
        System.out.println(fält[0]==fält[1]);
        System.out.println(fält[0]==fält[2]);
        System.out.println(fält[0]<fält[1]);
        System.out.println(fält[0]>fält[2]);

        System.out.println("Uno mas tal plz");
            tb.nextLine();
        int x = tb.nextInt();
        System.out.println("Addera 7");
        x=x+7;
        System.out.println(x);
        System.out.println("Multiplicera med 2");
        x=x*2;
        System.out.println(x);
        System.out.println("Subtrahera 6");
        x=x-6;
        System.out.println(x);
        System.out.println("Halvera");
        x=x/2;
        System.out.println(x);
        System.out.println("Addera 3");
        x=x+3;
        System.out.println(x);
        System.out.println("Subtrahera ditt ursprungliga tal");
        x=x-7;
        System.out.println("Svaret är 7!");
    }
}
