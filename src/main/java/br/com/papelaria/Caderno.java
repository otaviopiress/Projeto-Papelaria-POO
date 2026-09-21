package br.com.papelaria;

import jdk.swing.interop.SwingInterOpUtils;

public class Caderno extends Produto implements Desconto {
    private int numeroDeFolhas;


    public Caderno(String nome, double preco, int numeroDeFolhas) {
        super(nome, preco);
        this.numeroDeFolhas = numeroDeFolhas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
            System.out.println("Caderno: "+getNome()+" - Folha: "+numeroDeFolhas+" - Preço R$: "+getPreco());
    }

    @Override
    public double aplicarDesconto(double percentual){
        return getPreco() - (getPreco()*0.2);
    }
}