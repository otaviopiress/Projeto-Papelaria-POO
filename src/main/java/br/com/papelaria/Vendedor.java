package br.com.papelaria;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, double salario){ //Isso é construtor
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario*0.1;
    }

}