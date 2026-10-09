package pilhaefila.estrutura;

import java.util.Stack;

import pilhaefila.basica.Processo;

public class Fila {
    private No inicio;
    private No fim;

    private class No {
        Processo processo;
        No proximo;

        No(Processo processo) {
            this.processo = processo;
            this.proximo = null;
        }
    }

    // Adicionar processo no final da fila
    public void adicionar(Processo processo) {

        No novo = new No(processo);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    // Remover processo do início da fila
    public Processo remover() {

        if (inicio == null) {
            return null;
        }

        Processo processo = inicio.processo;
        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }

        return processo;
    }

    // Verificar o primeiro elemento da fila
    public Processo verificar() {

        if (inicio == null) {
            return null;
        }

        return inicio.processo;
    }

    // Mostrar todos os elementos
    public void mostrar() {

        if (inicio == null) {
            System.out.println("Fila vazia.");
            return;
        }

        No atual = inicio;

        System.out.println("=== FILA ===");

        while (atual != null) {
            System.out.println(atual.processo);
            atual = atual.proximo;
        }
    }

    // Inverter a fila usando uma pilha
    public void inverter() {

        Stack<Processo> pilha = new Stack<>();

        // Coloca todos os processos na pilha
        while (inicio != null) {
            pilha.push(remover());
        }

        // Retira da pilha e adiciona novamente na fila
        while (!pilha.isEmpty()) {
            adicionar(pilha.pop());
        }
    }
}
