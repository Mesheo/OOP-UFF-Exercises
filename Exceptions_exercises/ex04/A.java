package ex04;

public class A{
    public static void main(String[] args) throws ExcecaoVerificada {
        metodoA();
    }

    private static void metodoA() throws ExcecaoVerificada{
        metodoB();
        metodoC();
    }

    private static void metodoB() throws ExcecaoVerificada {
        lancaExcecaoVerificada();
    }

    private static void metodoC(){
        lancaExcecaoNaoVerificada();
    }

    private static void lancaExcecaoVerificada() throws ExcecaoVerificada {
        throw new ExcecaoVerificada();
    }

    private static void lancaExcecaoNaoVerificada() throws ExcecaoNaoVerificada {
        throw new ExcecaoNaoVerificada();
    }
}

class ExcecaoVerificada extends Exception{
    public ExcecaoVerificada() {
        super("Excecao Verificada");
    }
}

class ExcecaoNaoVerificada extends RuntimeException{
    public ExcecaoNaoVerificada() {
        super("Excecao Nao Verificada");
    }
}