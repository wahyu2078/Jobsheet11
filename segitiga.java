import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mulai dari 3 = ");
        int N = input.nextInt();

        if (N < 3) {
        } else {
            for (int i = 1; i <= N; i++) {

                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }


                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }

                System.out.println();
            }
        }
    }
}
