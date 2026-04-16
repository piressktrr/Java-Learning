package pedro.ProjetoAlgoritmos;

public class TestArvoreBinaria {
    private static class No{
        int registro;
        No esquerda, direita;

        public No(int registro) {
            this.registro = registro;
            esquerda = direita = null;
        }
    }
    private static class BinarySearch {
        No raiz;

        public BinarySearch() {
            raiz = null; // raiz começar nulo pro  java reconhecer
        }

        public void inserir(int valor) {
            raiz = inserirRecursivo(raiz, valor); // chama o outro metodo passando a raiz como parametro
        }

        No  inserirRecursivo(No atual, int valor) {
            // como a árvore cresce apra baixo, precisa comparar com um nó, depois com o filho dele, depois como neto...

            if (atual == null) {
                return new No(valor); // entrega o novo nó criado
                // cria um nó quando o nó atualfor nulo
            }

            if (valor < atual.registro) {
                atual.esquerda = inserirRecursivo(atual.esquerda, valor);
                // vai pra esquerda
            } else if (valor > atual.registro) {
                atual.direita = inserirRecursivo(atual.direita, valor);
                // vai pra direita
            }
            return atual; // entrega o nó que já existia, mantendo a árvore conectada e montada
        }

        public void imprimir() {
            central(raiz);
            System.out.println();
        }
    }



    public static void central (No p) {
        if (p != null) {
            central(p.esquerda); // chama ate encontrar uma referencia null, indo pra esquerda atra do menor va,lor possivel
            System.out.println(p.registro + " "); // depois imprime esse valor da chave, que é onde ele vai estar (raiz local)
            central(p.direita); // ve todos da direita, indo pra direita atrasdo maior valor possivel
        }
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();


        // cria a arvore com a raiz nula
        // o inserir chama o inserirRecursivo que passa a raiz nula e o valor 10
        // o inserirRecursivo ve que a raiz é nula e cria um novo Nó com o valor 10, onde sua esquerda e direita serão nulos
        // depois, o inserir chama o inserirRecursivo que passa a raiz que ja recebeu o 10, e o valor 40
        // programa checa e ve que o 40 é menor que o 10, e não é nulo
        // programa faz o Nó da DIREITA receber o valor 40 e sua esquerda e direita nulos
        // depois o programa pega o 20, faz a raiz chamar o inserirRecursivo e faz a raiz ser o registro 10 no topo,
        // sua esquerda nula, sua direita com o 40, e a direita e esquerda do nulos. ai ele pega esse nó do 40 e verifica
        // sua direita e esquerda (como sua esquerda é nula ai adiciona o 20 a esquerda do nó do 40)


        // devolve o nó que eu acabei de criar pro pai dele. Exemplo: devolver o nó 20 pra esquerda do 40.

        // pedir pro claude explicar bem detalhadamente depois
        bs.inserir(10);
        bs.inserir(40);
        bs.inserir(20);
        bs.inserir(30);
        bs.inserir(90);
        bs.inserir(5);

        bs.imprimir();
    }
}
