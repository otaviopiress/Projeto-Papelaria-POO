package br.com.papelaria;

public class Estojo extends Produto implements Desconto {
    public Estojo(String nome, double preco){ //Isso é construtor
        super(nome, preco);
    }

    @Override
    public double aplicarDesconto(double percentual){ //Isso é construtor
        return getPreco() - (getPreco()*(percentual/100));
    }


}