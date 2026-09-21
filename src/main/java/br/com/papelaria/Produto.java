package br.com.papelaria; /* Namespace do projeto. Serve para organizar o codigo em diretorios e evitar
conflitos de nome de classes entre pacotes distintos. */


public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) { //Isso é construtor
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes(){ //Isso é construtor
        System.out.println("Produto: "+nome+" - Preço: R$ "+preco);
    }
}