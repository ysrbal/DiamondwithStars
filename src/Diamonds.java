import java.util.Scanner;

public class Diamonds {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        System.out.print("Lutfen N Sayisini Giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i =1; i<n; i++){
            for (int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (((2*n) - (2*i)+1)-2); j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
