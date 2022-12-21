import java.util.Scanner;

public class Main {

    static int Recursive(int base, int pow) {
        Scanner input = new Scanner(System.in);
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, pow;
        System.out.print("Taban Değerini Giriniz : ");
        base = input.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        pow = input.nextInt();

        System.out.println("Sonuç : " + Recursive(base, pow));
    }
}
