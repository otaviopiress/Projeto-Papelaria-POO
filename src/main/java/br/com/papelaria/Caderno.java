package br.com.papelaria;

// extends: Caderno "é um" Produto e herda nome, preço e exibirDetalhes()
// implements: além disso, "sabe" receber desconto (contrato da interface Desconto)

public class Caderno extends Produto implements Desconto {
    private int numeroDeFolhas;


    // super(...) manda nome e preço para o construtor de Produto (eles são private lá)
    public Caderno(String nome, double preco, int numeroDeFolhas) {
        super(nome, preco);
        this.numeroDeFolhas = numeroDeFolhas;
    }

    // Reaproveita a versão do pai e acrescenta o que é específico do Caderno
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Caderno: " + getNome() + " - Folha: " + numeroDeFolhas + " - Preço R$: " + getPreco());
    }

    // TODO: o parâmetro percentual não está sendo usado (desconto fixo de 20%)
    @Override
    public double aplicarDesconto(double percentual) {
        return getPreco() - (getPreco() * 0.2);
    }
}