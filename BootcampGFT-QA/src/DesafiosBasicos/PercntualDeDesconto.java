import java.util.Scanner;

public class PercntualDeDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();

        int valorDesconto = M - S;
        int PercentualDesconto = valorDesconto * 100 / M;

        System.out.println("O desconto foi de " + PercentualDesconto + "%");

    }
}
