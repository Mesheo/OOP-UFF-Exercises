/*
Calcule a raiz quadrada aproximada de um número inteiro, respeitando
o erro máximo, ambos informados pelo usuário. Não utilize funções
predefinidas.
*/

class ex03{
    public int calcularRaizQuadrada(numero){
        int resultado;


        return resultado;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int numero = teclado.nextInt();

        System.out.println("A raiz quadrada de" + numero + "é" + calcularRaizQuadrada(numero));
    }
}