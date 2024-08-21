import java.util.Scanner;
public class Lista_Circular {
    private Node lista;
    public Lista_Circular(){
        this.lista = null;
    }

    // insere elementos
    public void inserir(int elemento){
        // criando nó
        Node no = new Node();
        no.setInformacao(elemento);

        if(lista == null){
            lista = no;
            no.setProximo(lista); // Aponta para si mesmo, formando um ciclo
        } else {
            Node atual = lista;
            while(atual.getProximo() != lista){// Condição de parada é encontrar o nó que aponta para o primeiro nó
                atual = atual.getProximo();
            }
            atual.setProximo(no);
            no.setProximo(lista); // O novo nó aponta para o primeiro nó
        }
    }

    // remove elementos
    public void remover(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do elemento que deseja remover: ");
        int valor = teclado.nextInt();

        if(lista == null){
            System.out.println("Lista vazia");
            return;
        }

        Node atual = lista;
        Node anterior = null;

        // Percorre a lista procurando o nó com o valor
        while (atual != null && atual.getInformacao() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }

        // Se encontrou o nó com o valor
        if (atual != null) {
            if (anterior == null) {
                // Se o nó a ser removido é o primeiro
                lista = atual.getProximo();
            } else {
                // Se o nó a ser removido está no meio ou no final
                anterior.setProximo(atual.getProximo());
            }
            System.out.println("Elemento removido!");
        } else {
            // Se não encontrou o elemento
            System.out.println("Elemento não encontrado na lista.");
        }

    }

    // imprimir elementos
    public void imprimir() {
        if (lista == null) {
            System.out.println("Lista vazia");
            return;
        }

        Node atual = lista;
        do {
            System.out.print(atual.getInformacao() + " -> ");
            atual = atual.getProximo();
        } while (atual != lista); // Condição de parada é voltar ao primeiro nó

        System.out.println("(volta ao início)");
    }
}