package ex02;

public class TesteContaCorrente{
    public static void main(String[] args){
        ContaCorrente nubank = new ContaCorrente(100, 0);
        try {
            nubank.depositar(50);
            nubank.setValorLimite(100);
            nubank.sacar(200); // excecao
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            nubank.depositar(-10); // excecao
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

