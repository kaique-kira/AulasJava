package P4E1;

import java.util.Date;

public class Professor extends Pessoa{
    private double Salario;
    private String Disciplina;

    public Professor(String nome, String CPF, Date dataNascimento, double salario, String disciplina) {
        super(nome, CPF, dataNascimento);
        Salario = salario;
        Disciplina = disciplina;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String disciplina) {
        Disciplina = disciplina;
    }
}
