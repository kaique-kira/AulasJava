package P4E1;

import java.util.Date;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String Nome, String CPF, Date dataNascimento, String matricula) {
        super(Nome,CPF,dataNascimento);
        this.matricula = matricula;
        }
    public double tirarCopia(int qtd){
        return 0.07 * qtd;
    }

    }

