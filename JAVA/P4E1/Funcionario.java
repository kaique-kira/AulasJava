package P4E1;

import java.util.Date;

public class Funcionario extends Pessoa {
    private double salario;
    private Date dataAdmissoa;
    private String cargo;

    public Funcionario(String nome, String CPF, Date dataNascimento, double salario, Date dataAdmissoa, String cargo) {
        super(nome, CPF, dataNascimento);
        this.salario = salario;
        this.dataAdmissoa = dataAdmissoa;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissoa() {
        return dataAdmissoa;
    }

    public void setDataAdmissoa(Date dataAdmissoa) {
        this.dataAdmissoa = dataAdmissoa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
