import java.util.Scanner;

public class Ex01 {
    private static void tirarCarteira(String idadeString){
        try{
            int idade = Integer.parseInt(idadeString);
            if(idade < 18){
                throw new IllegalArgumentException("Ainda é menor de idade");
            }
            System.out.println("Parabens voce tirou sua carteira");
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversao " + e);
        } catch (IllegalArgumentException e){
            System.out.println("Erro argumento improprio " + e);
        } 
    }

    public static void main( String[] args){
        tirarCarteira(new Scanner(System.in).nextLine());
    }
}