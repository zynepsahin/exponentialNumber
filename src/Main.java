import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, val = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Tabanı girin:");
        a = inp.nextInt();
        System.out.print("Üssü girin:");
        b = inp.nextInt();


        for (int i = 0; i < b; i++) {
            val *= a;
        }
        System.out.println(val);
    }
}
