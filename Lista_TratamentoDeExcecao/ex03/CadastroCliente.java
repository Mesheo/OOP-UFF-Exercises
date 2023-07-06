package ex03;

public class CadastroCliente{
    private Cliente[] clientes = new Cliente[10];
    private int posicao = 0;

    public void inserir(Cliente cliente) throws RepositorioException, ClienteJaExistenteException {
        for (int i=0; i<posicao; i++){
            if (clientes[i].getCpf().equals(cliente.getCpf())){
                throw new ClienteJaExistenteException("Cliente ja inserido");
            }
        }  

        if (posicao == clientes.length){
            throw new RepositorioException("Nao é possivel adicionar mais clientes");
        }
        clientes[posicao++] = cliente;
    }

    public Cliente buscar(String cpf) throws ClienteInexistenteException {
        for (int i=0 ; i<this.posicao; i++){
            if (clientes[i].getCpf().equals(cpf)){
                return clientes[i];
            }
        }
        throw new ClienteInexistenteException("CPF não cadastrado");
    }

}


// Classe para indicar que o repositório está cheio
class RepositorioException extends Exception {
    public RepositorioException(String message) {
        super(message);
    }
}

// Classe para indicar que o cliente já existe
class ClienteJaExistenteException extends Exception {
    public ClienteJaExistenteException(String message) {
        super(message);
    }
}

// Classe para indicar que o cliente não existe
class ClienteInexistenteException extends Exception {
    public ClienteInexistenteException(String message) {
        super(message);
    }
}