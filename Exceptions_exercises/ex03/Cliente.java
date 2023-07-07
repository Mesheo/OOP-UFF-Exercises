package ex03;

public class Cliente{
    private String cpf;

    public void setCpf(String cpf) throws DadoInvalidoException{
        if(!cpfValido(cpf)){
            throw new DadoInvalidoException("CPF invalido");
        }
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    private boolean cpfValido(String cpf){
        return cpf.length() == 11;
    }
}

class DadoInvalidoException extends Exception{
    public DadoInvalidoException(String menssagem){
        super(menssagem);
    }
}