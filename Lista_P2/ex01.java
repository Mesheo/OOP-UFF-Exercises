/*
Faça um programa para representar a árvore genealógica de uma família.
Para tal, crie uma classe Pessoa que permita indicar, além de nome e
idade, o pai e a mãe. Tenha em mente que pai e mãe também são do
tipo Pessoa
*/

class Pessoa{
    public String nome;
    public double idade;
    public Pessoa pai = null; 
    public Pessoa mae = null;

    Pessoa(String nome, double idade, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }
    
    private void exibirArvoreGenealogica(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.pai != null) {
            System.out.println("Pai: " + this.pai.nome);
        }
        if (this.mae != null) {
            System.out.println("Mãe: " + this.mae.nome);
        }
        System.out.println();
        if (this.pai != null) {
            this.pai.exibirArvoreGenealogica();
        }
        if (this.mae != null) {
            this.mae.exibirArvoreGenealogica();
        }
    }

    public static void main(String[] args){
        Pessoa avo_mulher = new Pessoa("Valdisleia", 65, null, null);
        Pessoa avo_homem = new Pessoa("Lourival", 73, null, null);
        Pessoa pessoa3 = new Pessoa("Pedro", 5, avo_homem, avo_mulher);
        Pessoa pessoa4 = new Pessoa("Ana", 3, avo_homem, avo_mulher);

        pessoa3.exibirArvoreGenealogica();
        System.out.println("---------------------");
        pessoa4.exibirArvoreGenealogica();
    }
}