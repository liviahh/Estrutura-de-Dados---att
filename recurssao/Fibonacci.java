package recurssao;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int quantidade = teclado.nextInt();

        System.out.println("Sequência de Fibonacci:");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        teclado.close();
    }
}