import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {

    private List<Contato> agenda = new ArrayList<>();

    public Boolean verificaContato(Contato contato){
        return !contato.getNome().isBlank() || contato.getNumero() != null;
    }

    public Boolean verificarNumero(String numero){
        return numero.matches("[0-9]+") || numero.length() == 11;
    }

    public void inseriContato(Contato contato){
        if(verificaContato(contato)) agenda.add(contato);
    }

    public List<Contato> buscarTodosContatos(){
        return agenda;
    }

    public List<Contato> buscarTodosContatosPorOrdemAlfabetica(){
        List<Contato> sortAgenda = agenda;
        Collections.sort(sortAgenda);
        return sortAgenda;
    }

    public List<Contato> buscarPorNome(String stringBusca){
        return agenda.stream().filter(
                contato -> contato.getNome().contains(stringBusca)).toList();
    }

    public List<Contato> buscarPorNumero(String numeroBusca){
        return agenda.stream().filter(
                contato -> contato.getNumero().contains(numeroBusca)).toList();
    }



    public void atualizarContatoPorNome(String nome, String novoNome, String novoNumero){
        for (Contato contato : agenda) {
            if (nome.equals(contato.getNome()) && verificarNumero(novoNumero)){
                contato.setNome(novoNome);
                contato.setNumero(novoNumero);
            }
        }
    }

    public void atualizarContatoPorNumero(String numero, String novoNome, String novoNumero){
        for (Contato contato : agenda) {
            if (numero.equals(contato.getNumero()) && verificarNumero(novoNumero)){
                contato.setNome(novoNome);
                contato.setNumero(novoNumero);
            }
        }
    }

    public void excluirContatoPorNome(String nome){

        for(int i = 0; i < agenda.size(); i++){
            if(nome.equals(agenda.get(i).getNome())) {
                agenda.remove(i);
            }
        }
    }

    public void excluirContatoPorNumero(String numero){

        for(int i = 0; i < agenda.size(); i++){
            if(numero.equals(agenda.get(i).getNumero())) {
                agenda.remove(i);
            }
        }
    }


    public void imprimirTodosContatos(){
        Integer indice = 0;
        for (Contato contato: agenda) {
            System.out.println(indice++ + " - Nome: " + contato.getNome() + " || Telefone: " + contato.getNumero());
        }
    }

    public void imprimirTodosContatosEmOrdem(){
        List<Contato> sortAgenda = agenda;
        Collections.sort(sortAgenda);
        Integer indice = 0;
        for (Contato contato: sortAgenda) {
            System.out.println(indice++ + " - Nome: " + contato.getNome() + " || Telefone: " + contato.getNumero());
        }
    }
}
