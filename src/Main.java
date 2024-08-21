/*autora: rafaela vecchi pelentier*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Lista_Circular lista = new Lista_Circular();
        Scanner teclado = new Scanner(System.in);

        while(true){
            System.out.println("==== LISTA CIRCULAR ====");
            System.out.println("1. Inserir\n2. Remover\n3. Imprimir\n4. Sair\n");
            int opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite os itens da lista (digite '0' para parar): ");
                    int item;
                    while(true){
                        item = teclado.nextInt();
                        if (item == 0){
                            System.out.println("Imprimindo lista:");
                            lista.imprimir();
                            break;
                        }
                        lista.inserir(item);
                        lista.imprimir();
                    } break;
                case 2:lista.remover();lista.imprimir();break;
                case 3: lista.imprimir();break;
                case 4: System.out.println("Programa Encerrado.");return;
                default: System.out.println("Opção invalida");
            }
        }

    }
}
