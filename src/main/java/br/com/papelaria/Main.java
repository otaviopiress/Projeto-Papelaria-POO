package br.com.papelaria;

import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Caderno caderno = new Caderno("Caderno Universitário", 20.0, 200);
        Estojo estojo = new Estojo("Estojo Escolar", 15.0);

        loja.adicionarProdutos(caderno);
        loja.adicionarProdutos(estojo);

        System.out.println("=== Lista de Produtos===");
        loja.listarProdutos();

        System.out.println("\n=== Aplicando Desconto ===");
        double  novoPreco = estojo.aplicarDesconto(10);
        System.out.println("Novo preço do Estojo é: "+novoPreco);

        System.out.println("\n=== Criando Funcionários ===");
        Funcionario vendedor = new Vendedor("Otávio", 3000);
        System.out.println("Bônus do Vendedor R$ "+vendedor.calcularBonus());

        System.out.println("\n === Criando um Pedido ===");
        Pedido pedido = new Pedido(1, "Ana Silva", 50.0);
        System.out.println("Pedido: "+pedido);

    }
}