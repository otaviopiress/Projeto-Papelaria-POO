package br.com.papelaria;

// record: classe imutável só para dados; o Java gera construtor, id(), cliente(), valorTotal(),
// equals, hashCode e toString automaticamente
public record Pedido(int id, String cliente, double valorTotal) { //Isso é um construtor
}