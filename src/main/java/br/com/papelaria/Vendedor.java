package br.com.papelaria;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, double salario) { //Isso é um metodo
        super(nome, salario);
    }

    // Bônus de 10% do salário (o salário é acessível aqui porque é protected na classe pai)
    @Override
    public double calcularBonus() { //Isso é um metodo
        return salario * 0.1;
    }

}