public class ex02 {
    public static void main(String[] args){
        int[] coordenadas_A = {1, 2, 3};
        int[] coordenadas_B = {4, 5, 6};

        double distancia = calcularDistanciaEntrePontos(coordenadas_A, coordenadas_B);
        System.out.println("A distancia é de "+ distancia + " metros");
    }

    public static double calcularDistanciaEntrePontos(int[] coordenada1, int[] coordenada2){
        double catetoA = Math.abs(coordenada1[0] - coordenada2[0]);
        double catetoB = Math.abs(coordenada1[1] - coordenada2[1]);
        double catetoC = Math.abs(coordenada1[2] - coordenada2[2]);

        double soma_dos_quadrados = Math.pow(catetoA, 2) + Math.pow(catetoB, 2) + Math.pow(catetoC, 2);
        double distancia = Math.sqrt(soma_dos_quadrados);
        return distancia;
    }
}
