package br.com.papelaria;

/* Classe base de tudo que a loja vende: guarda o que é comum a qualquer produto. */

public class Produto {
    // private: só esta classe altera os campos; de fora, apenas via getters/setters
    private String nome;
    private double preco;

    // Construtor: cria o objeto já com nome e preço preenchidos
    public Produto(String nome, double preco) {
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

    // Comportamento padrão; as subclasses podem sobrescrevê-lo (override)
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + " - Preço: R$ " + preco);
    }
}