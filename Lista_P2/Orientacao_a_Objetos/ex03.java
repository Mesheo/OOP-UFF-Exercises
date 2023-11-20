/*
Faça um programa de agenda que permita guardar dois tipos de contato: pessoa física e pessoa jurídica. 
Para pessoa física, guarde o nome, o CPF, o endereço e a data de aniversário. 

Para pessoa jurídica, guarde a razão social, o CNPJ, o endereço e o faturamento. 

Permita tanto listar todos os contatos da agenda quanto buscar um contato específico
pelo seu CPF, se for pessoa física, ou pelo CNPJ, se for pessoa jurídica.
Use herança e polimorfismo.
*/

import java.util.ArrayList;
import java.util.List;

abstract class Contato{
    String nome;
    String endereco;
    String identificador;

    public Contato(String nome, String endereco, String identificador) {
        this.nome = nome;
        this.endereco = endereco;
        this.identificador = identificador;
    }

    public String getIdentificador(){
        return this.identificador;
    }

    public abstract void exibirInfo();
}

class PessoaFisica extends Contato {
    String cpf;
    String dataAniversario;

    public PessoaFisica(String nome, String cpf, String endereco, String data){
        super(nome, endereco, cpf);
        this.dataAniversario = data;
    }
    
    public void exibirInfo(){
        System.out.println("----------------- CONTATO PESSOA FISICA");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.identificador);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Data: " + this.dataAniversario);
        System.out.println();

    }
}

class PessoaJuridica extends Contato {
    private String razaoSocial;
    private String cnpj;
    private double faturamento;

    public PessoaJuridica(String nome, String endereco, String razaoSocial, String cnpj, double faturamento) {
        super(nome, endereco, cnpj);
        this.razaoSocial = razaoSocial;
        this.faturamento = faturamento;
    }

    public void exibirInfo(){
        System.out.println("----------------- CONTATO PESSOA JURIDICA");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Razao Social: " + this.razaoSocial);
        System.out.println("CNPJ: " + this.identificador);
        System.out.println("Faturamento: " + this.faturamento);
    }
} 

class Agenda{
    public static void linha(){
        System.out.println("-----------------------------------------------");
    }
    List<Contato> listaDeContatos = new ArrayList<>();
    
    public void inserirContato(Contato contato){
        listaDeContatos.add(contato);
    }

    public void listarContatos(){
        for (Contato contato : listaDeContatos){
            contato.exibirInfo();
        }
        Agenda.linha();
    }

    public void acharContato(String identificador){
        for (Contato contato : listaDeContatos) {
            if (contato.getIdentificador().equals(identificador)) {
                System.out.println("Contato encontrado! " + contato);
                Agenda.linha();
                return;
            }   
        }  
        System.out.println("Contato não encontrado.");
        linha();
    }
}

public class ex03 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.inserirContato(new PessoaFisica("Fulano Silva", "12345678901", "Rua sao sebatiao", "25 de fevereiro"));
        agenda.inserirContato(new PessoaJuridica("Zezinho Corporation", "Rua sao joao", "Zezinho Corporation", "29314983000112", 5000.0));

        agenda.listarContatos();

        agenda.acharContato("12345678901");
        agenda.acharContato("29314983000112");
        agenda.acharContato("000000");
    }
}