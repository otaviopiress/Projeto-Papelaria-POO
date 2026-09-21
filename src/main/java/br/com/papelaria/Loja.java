package br.com.papelaria;

import java.util.ArrayList;
import java.util.List;

// List é o contrato; ArrayList é a implementação. <Produto>: só aceita Produto (e subclasses)
public class Loja {
    private List<Produto> produtos = new ArrayList<>();

    public Loja() {

    }

    public void adicionarProdutos(Produto produto) { //Isso é um metodo
        produtos.add(produto);
    }

    // for-each: para cada Produto p dentro da lista
    // Polimorfismo: p é declarado como Produto, mas roda o exibirDetalhes() do Caderno ou do Estojo,
    // conforme o objeto real que está na lista
    public void listarProdutos() { //Isso é um for para percorrer o array
        for (Produto p : produtos) {
            p.exibirDetalhes();
        }
    }
}