package br.com.papelaria;

public class Estojo extends Produto implements Desconto {
    public Estojo(String nome, double preco) {  //Isso é um metodo
        super(nome, preco);
    }

    // Desconto em %: 10 vira 10/100, ou seja, 10% do preço. Devolve o novo preço sem alterar o produto
    @Override
    public double aplicarDesconto(double percentual) {
        return getPreco() - (getPreco() * (percentual / 100));
    }


}