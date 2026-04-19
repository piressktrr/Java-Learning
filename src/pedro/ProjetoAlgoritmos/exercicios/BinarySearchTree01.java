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
        private int contadorAlturaEsquerda = 1;
        private int contadorAlturaDireita = 1;
        private int altura = 0;


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
            System.out.println();
            System.out.println("Tamanho da árvore: " + alturaRecursiva(raiz));
            System.out.println("Número de nós: " + contarNos());
        }

        public int contarNos() {
            return numNos;
        }

        public void buscaRapida(No raizAtual) {
            if (raizAtual.esquerda != null) {
                buscar(raizAtual.esquerda, 10);
                return;
            }
            System.out.println();
        } // ele ta retornando false mesmo com o valor verdadeiro
        // a altura da arvore nao esta contando corretamente

       public boolean buscar(No atual, int valor) {
            if (atual == null) return false; // nao achou
            if (valor == atual.valorDoTopoArvore) return true; // achou

            if (valor < atual.valorDoTopoArvore) {
                return buscar(atual.esquerda, valor); // só vai para a esquerda
            } else {
                return buscar(atual.direita, valor); // só vai para a direita
            }
//            if (valor != atual.valorDoTopoArvore) {
////                buscaRapida(atual);
////            } else {
////                return true;
////            }
////            return false;
//            }
       }

       public void imprimirT() {
           System.out.println(buscar(raiz, 10));
       }
        private int alturaRecursiva(No atual) {
                if (atual == null) return 0;
                int altEsq = alturaRecursiva(atual.esquerda);
                int altDir = alturaRecursiva(atual.direita);
                return 1 + Math.max(altEsq, altDir);
//            if (atual.esquerda != null) {
//                contadorAlturaEsquerda++;
//                alturaRecursiva(atual.esquerda);
//            } else if (atual.direita != null) {
//                alturaRecursiva(atual.direita);
//            } else if (atual.esquerda == null && atual.direita == null && contadorAlturaDireita == 1) {
//                atual = raiz;
//                contadorAlturaDireita++;
//                alturaRecursiva(atual.direita);
//            }
//
//            if (atual.esquerda == null && atual.direita == null && contadorAlturaEsquerda > contadorAlturaDireita){
//                altura = contadorAlturaEsquerda;
//            } else if (atual.esquerda == null && atual.direita == null && contadorAlturaEsquerda < contadorAlturaDireita){
//                altura = contadorAlturaDireita;
//
//            }
//            return altura;
        }

    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.inserirChamada(30);
        bst.inserirChamada(40);
        bst.inserirChamada(20);
        bst.inserirChamada(10);
        bst.imprimirT();
        bst.imprimirArvore();


    }
}
