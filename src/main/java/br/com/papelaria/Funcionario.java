package br.com.papelaria;

// abstract: não existe "funcionário genérico"; só tipos concretos, como Vendedor
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) { //Isso é um metodo
        this.nome = nome;
        this.salario = salario;
    }

    // Cada tipo de funcionário calcula o bônus do seu jeito; a subclasse é obrigada a implementar
    public abstract double calcularBonus(); //Isso é um metodo
}