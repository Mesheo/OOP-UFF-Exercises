/* 
Determine a saída do seguinte programa:
*/

public class ex02 {
    public static void main(String[] args) {
        for (int i = 2; i <= 8; i = i + 2) {
            for (int j = i; j <= 4; j++) {
                for (int k = 1; k <= j; k = k + i) {
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }   
    }
}

/*
RESPOSTA
a saída de i, j, k é 
2, 2, 1 
2, 3, 1
2, 3, 3
2, 4, 1
2, 4, 3
4, 4, 1

Loop i -> loop mais externo i começa com o valor 2 e vai até o 8 com 
incrementos de 2 (ou seja 2,4,6,8)
Loop j -> o segundo loop começa com o valor de i, nesse caso 2 desde a primeira iteração, 
e vai até 4 (ou seja, 2,3,4)
Loop k -> o loop mais interno começa com o valor 1 e vai até j incrementando de i em i. 
como ele começa com 1 na primeira iteraçao somaremos 2 (valor inicial de i) e k termina valendo 3.
como sua segunda condiçao é ser <= a j (que só vai ate 4), na segunda iteracao k(3)+i(2) já saimos do loop (ou seja 1,3)
*/