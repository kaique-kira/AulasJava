public class Turma {
    private int IdTurma;
    private int QtdAlunos;
    private double Notas[];

    public Turma() {}
    public Turma(int idTurma, int qtdAlunos, double[] notas) {
        IdTurma = idTurma;
        QtdAlunos = qtdAlunos;
        Notas = notas;
    }

    public double[] getNotas() {
        return Notas;
    }

    public void setNotas(double[] notas) {
        Notas = notas;
    }

    public int getIdTurma() {
        return IdTurma;
    }

    public void setIdTurma(int idTurma) {
        IdTurma = idTurma;
    }

    public int getQtdAlunos() {
        return QtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        QtdAlunos = qtdAlunos;
    }

    public double MediaAluno(){
        double SomaNota = 0.0;
        for ( int i = 0);
        return SomaNota/Notas.length;
    }

}
