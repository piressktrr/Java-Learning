package pedro.ProjetoAlgoritmos.exercicios;

public class BinarySearchTree01 {
    private static class No {
        int valorDoTopoArvore;
        No esquerda, direita;

        public No(int valor) {
            this.valorDoTopoArvore = valor;
            esquerda = null;
            direita = null;
        }
    }

    private static class BinaryTree {
        No raiz;
        private int numNos;
        private int valorDireita = 0;
        private int valorEsquerda = 0;
        public BinaryTree() {
            this.raiz = null;
        }

        public void inserirChamada(int valor) {
            raiz = navegacaoRecursivaNumeros(raiz, valor);
        }

        No navegacaoRecursivaNumeros(No raizAtual, int valor) {
            if (raizAtual == null) {
                raizAtual = new No(valor);
                numNos++;
            }

            if (valor < raizAtual.valorDoTopoArvore) {
                raizAtual.esquerda = navegacaoRecursivaNumeros(raizAtual.esquerda, valor);
            } else if (valor > raizAtual.valorDoTopoArvore) {
                raizAtual.direita = navegacaoRecursivaNumeros(raizAtual.direita, valor);
            }
            return raizAtual;
        }

        private static void centralizarNumerosParaImprimir(No raizAtual) {
            if (raizAtual != null) {
                centralizarNumerosParaImprimir(raizAtual.esquerda);
                System.out.print(raizAtual.valorDoTopoArvore + " ");
                centralizarNumerosParaImprimir(raizAtual.direita);
            }
        }

        public void imprimirArvore() {
            centralizarNumerosParaImprimir(raiz);
            System.out.println("tamanho da árvore: " +alturaRecursiva(raiz));
        }

        public int contarNos() {
            return numNos;
        }

//        public boolean buscar(No atual, int valor) {
//
//        }

        private int alturaRecursiva(No atual) {

            if (atual != null) {
                alturaRecursiva(atual.esquerda);
                valorEsquerda++;
                alturaRecursiva(atual.direita);
                valorDireita++;
            }

            if (valorEsquerda > valorDireita) {
                return valorEsquerda;
            } else {
                return valorDireita;
            }
        }

    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.inserirChamada(30);
        bst.inserirChamada(40);
        bst.inserirChamada(25);
        bst.inserirChamada(15);
        bst.inserirChamada(45);
        bst.inserirChamada(35);
        bst.inserirChamada(27);
        bst.imprimirArvore();
        System.out.println("número de nós: "+bst.contarNos());

    }
}
