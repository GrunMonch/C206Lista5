package br.inatel.c206.lista5.funcionario;

public class Funcionario {
    private int id;
    private double salario;
    private int filhos;

    public Funcionario(int id, double salario, int filhos) {
        this.id = id;
        this.salario = salario;
        this.filhos = filhos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getFilhos() {
        return filhos;
    }

    public void setFilhos(int filhos) {
        this.filhos = filhos;
    }
}
