package pilhaefila.main;

import pilhaefila.basica.Processo;
import pilhaefila.estrutura.Fila;

public class Cabeça {
    public static void main(String[] args) {

        Fila fila = new Fila();

        Processo p1 = new Processo(1, "Documento A");
        Processo p2 = new Processo(2, "Documento B");
        Processo p3 = new Processo(3, "Documento C");

        System.out.println("Adicionando processos...");

        fila.adicionar(p1);
        fila.adicionar(p2);
        fila.adicionar(p3);

        fila.mostrar();

        System.out.println("\nPrimeiro processo da fila:");
        System.out.println(fila.verificar());

        System.out.println("\nRemovendo processo:");
        System.out.println(fila.remover());

        fila.mostrar();

        System.out.println("\nInvertendo a fila...");

        fila.inverter();

        fila.mostrar();
    }
}

