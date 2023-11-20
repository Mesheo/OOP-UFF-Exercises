/*
Calcule a distância entre dois pontos num espaço de 3 dimensões.
*/

class ex02{
    public static double calcularDistancia(double[] ponto_A, double[] ponto_B){
        if (ponto_A.length != 3 || ponto_B.length != 3) {
            throw new IllegalArgumentException("Os pontos devem ter 3 coordenadas (x, y, z).");
        }

        double deltaX = ponto_A[0] - ponto_B[0];
        double deltaY = ponto_A[1] - ponto_B[1];
        double deltaZ = ponto_A[2] - ponto_B[2];

       double distancia;
        try {
            distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Erro ao calcular a distância. Certifique-se de que os pontos são diferentes.");
        }

        return distancia;
    }

    public static void main(String[] args){
        double[] ponto_A = { 0.0, 0.0, 0.0 }; // x, y, z
        double[] ponto_B = { 1.0, 0.0, 0.0 }; // x, y, z

        double distancia = calcularDistancia(ponto_A, ponto_B);
        System.out.println("A distancia é: "+ distancia);
    }   
}

/*
Caso de Teste 1:
    ponto_A = { 1.0, 2.0, 3.0 }
    ponto_B = { 4.0, 5.0, 6.0 }
    
    Saída Esperada: 5.196152422706632

Caso de Teste 2:
    ponto_A = { 0.0, 0.0, 0.0 }
    ponto_B = { 1.0, 0.0, 0.0 }

    Saída Esperada = 1
*/