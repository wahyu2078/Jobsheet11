import java.util.Scanner;

public class bintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mulai dari 5 = ");
        int N = input.nextInt();

        if (N < 5) {
        } else {
            for (int i = N; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
