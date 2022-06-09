package P4E1;

import java.util.Date;

public class Pessoa {
    protected String Nome;
    protected String CPF;
    protected Date dataNascimento;

    public Pessoa(String nome, String CPF, Date dataNascimento) {
        Nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double tirarCopia(int qtd){
        return 0.10 * qtd;
    }


}
