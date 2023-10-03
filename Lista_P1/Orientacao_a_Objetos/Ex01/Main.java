public class Main {

    public static void linha(){
        System.out.println("-----------------------------------------------");
    }
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.inseriContato(new Contato("Fulano Silva", "2140028922"));
        agenda.inseriContato(new Contato("Ciclano Souza", "21123456789"));
        agenda.inseriContato(new Contato("Bertrano Batista", "11987654321"));
        agenda.inseriContato(new Contato("Ambev Ramos", "55121212121"));

        for (Contato contato: agenda.buscarTodosContatos()) {
            System.out.println(contato.toString());
        }

        Main.linha();

        for (Contato contato: agenda.buscarTodosContatosPorOrdemAlfabetica()) {
            System.out.println(contato.toString());
        }

        Main.linha();

        for (Contato contato: agenda.buscarPorNome("Ber")) {
            System.out.println(contato.toString());
        }

        Main.linha();

        for (Contato contato: agenda.buscarPorNome("lan")) {
            System.out.println(contato.toString());
        }

        // Atualizar por nome

        agenda.atualizarContatoPorNome("Ciclano Souza", "Ciclano Santos", "21123456789");

        Main.linha();

        agenda.imprimirTodosContatosEmOrdem();

        // Atualizar por numero

        agenda.atualizarContatoPorNumero("21123456789", "Ciclano Santos Santana", "21123456710");

        Main.linha();

        agenda.imprimirTodosContatosEmOrdem();

        // excluir por nome

        agenda.excluirContatoPorNome("Ciclano Santos Santana");

        Main.linha();

        agenda.imprimirTodosContatos();

        // excluir por numero

        agenda.excluirContatoPorNumero("55121212121");

        Main.linha();

        agenda.imprimirTodosContatos();
    }
}