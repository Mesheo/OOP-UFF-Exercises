// Faça um programa que leia uma frase e informe o número de ocorrências de cada
// palavra da frase (Dica: Use Map para fazer essa contagem)
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class ex01{
    private static String frase = "oi meu nome eh jorge eh deus eh bode";
    public static void main(String[] args){
        Map<String, Integer> quantidade_palavras = contaPalavras(frase);
        System.out.println(quantidade_palavras);
    }
    
    private static Map<String, Integer> contaPalavras(String msg){
        Map<String, Integer> contador_palavras = new HashMap<String, Integer>();
        String[] palavras = frase.split(" ");

        for (String palavra : palavras){
            if (contador_palavras.containsKey(palavra)){
                int quantidae_atual = contador_palavras.get(palavra);
                contador_palavras.put(palavra, quantidae_atual+1);
            }
            contador_palavras.put(palavra, 1);
        }    

        return contador_palavras;
    }
}