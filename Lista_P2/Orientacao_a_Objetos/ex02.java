/*
Faça um programa que calcule a área de uma figura geométrica. Aceite
quatro tipos de figura geométrica: quadrado, retângulo, triângulo e
círculo. Use herança e polimorfismo.
*/
import java.util.Scanner;

abstract class FiguraGeometrica{
    abstract double calcularArea();
}

class Retangulo extends FiguraGeometrica {
    double largura;
    double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return largura*altura;
    }
}

class Quadrado extends Retangulo {
    public Quadrado(double lado){
        super(lado, lado);
    }
}

class Circulo extends FiguraGeometrica{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Triangulo extends Retangulo{
    public Triangulo(double largura, double altura){
        super(largura, altura);
    }

    @Override
    public double calcularArea(){
        return (largura * altura)/2;
    }
}

class CalculadoraDeArea{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Voce quer calcular area de quais figuras? \nQUADRADO = q\nRETANGULO = r\nCIRCULO = c\nTRIANGULO = t");
        char escolha = teclado.next().toLowerCase().charAt(0);

        switch (escolha) {
            case 'q':
                System.out.println("\nInforme o lado do quadrado: ");
                double ladoQuadrado = teclado.nextDouble();
                Quadrado quadrado = new Quadrado(ladoQuadrado);
                System.out.println("A área do quadrado é: " + quadrado.calcularArea());
                break;

            case 'r':
                System.out.println("\nInforme a largura do retangulo: ");
                double largura = teclado.nextDouble();

                System.out.println("\nInforme a altura do retangulo: ");
                double altura = teclado.nextDouble();

                Retangulo retangulo = new Retangulo(largura, altura);
                System.out.println("A área do retangulo é: " + retangulo.calcularArea());
                break;
        
            case 'c':
                System.out.println("Informe o raio do círculo: ");
                double raio = teclado.nextDouble();

                Circulo circulo = new Circulo(raio);
                System.out.println("A área do círculo é: " + circulo.calcularArea());
                break;

            case 't':
                System.out.println("\nInforme a base do triangulo: ");
                double larguraT = teclado.nextDouble();

                System.out.println("\nInforme a altura do triangulo: ");
                double alturaT = teclado.nextDouble();

                Triangulo triangulo = new Triangulo(larguraT, alturaT);
                System.out.println("A área do triangulo é: " + triangulo.calcularArea());
                break;
        }
    }
}