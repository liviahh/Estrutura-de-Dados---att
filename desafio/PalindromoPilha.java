package desafio;


import java.text.Normalizer;
import java.util.Scanner;
import java.util.Stack;

public class PalindromoPilha {

    private static String prepararTexto(String texto) {
        String textoSemAcentos = Normalizer.normalize(texto, Normalizer.Form.NFD);
        textoSemAcentos = textoSemAcentos.replaceAll("\\p{M}", "");

        return textoSemAcentos
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");
    }

    public static boolean verificarPalindromo(String texto) {

        String palavra = prepararTexto(texto);
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length(); i++) {
            char caractere = pilha.pop();

            if (palavra.charAt(i) != caractere) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = teclado.nextLine();

        boolean resultado = verificarPalindromo(texto);

        if (resultado) {
            System.out.println("\"" + texto + "\" É um palíndromo.");
        } else {
            System.out.println("\"" + texto + "\" NÃO é um palíndromo.");
        }

        teclado.close();
    }
}