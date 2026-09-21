package br.com.papelaria;

public interface Desconto {
    /**
     * Contrato: quem implementar precisa informar como calcula o preço com desconto.
     */
    double aplicarDesconto(double percentual); //Isso é um metodo
}