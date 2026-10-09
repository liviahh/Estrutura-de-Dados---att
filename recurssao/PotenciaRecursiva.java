package recurssao;

import java.util.Scanner;

public class PotenciaRecursiva {

    public static double potencia(double base, int expoente) {

        if (expoente == 0) {
            return 1;
        }

        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = teclado.nextDouble();

        System.out.print("Digite a potência: ");
        int expoente = teclado.nextInt();

        double resultado = potencia(base, expoente);

        System.out.println("Resultado: " + resultado);

        teclado.close();
    }
}
