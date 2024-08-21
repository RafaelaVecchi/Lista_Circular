public class Node { // node = nó
    private Integer informacao; // valor para armazenar
    private Node proximo; // ponteiro para o próximo nó

    public Node() {
        this.informacao = null;
        this.proximo = null;
    }

    // retorna o valor armazenado no atributo informacao do nó.
    public Integer getInformacao() {
        return informacao;
    }

    // define o valor do atributo informacao
    public void setInformacao(Integer informacao) {
        this.informacao = informacao;
    }

    // retorna a referência para o próximo nó na lista encadeada
    public Node getProximo() {
        return proximo;
    }

    // define o próximo nó para o qual o nó atual deve apontar.
    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

}