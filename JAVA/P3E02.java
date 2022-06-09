public class P3E02 {

    private static int sequencia;
    private int numPesquisa;
    private char sexo;
    private char resposta;


    public P3E02(){
        this.numPesquisa = ++sequencia;
    }

    public P3E02(int numPesquisa, char sexo, char resposta) {
        this.numPesquisa = numPesquisa;
        this.sexo = sexo;
        this.resposta = resposta;
    }

    public static int getSequencia() {
        return sequencia;
    }

    public static void setSequencia(int sequencia) {
        P3E02.sequencia = sequencia;
    }

    public int getNumPesquisa() {
        return numPesquisa;
    }

    public void setNumPesquisa(int numPesquisa) {
        this.numPesquisa = numPesquisa;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getResposta() {
        return resposta;
    }

    public void setResposta(char resposta) {
        this.resposta = resposta;
    }
    public static int qhrs (ArrayList al) {
        int cont=0;
        for(int i=0;i<al.size();i++) {
            Pesquisa p = (Pesquisa) al.get(i);
            if(p.getSexo()=='M' && p.getResposta()=='S') {
                cont++;
            }
        }
        return cont;
    }

    // phrs - percentual de homens que responderam sim
    public static double phrs (ArrayList al) {
        double contH=0;
        double contS=0;
        for(int i=0;i<al.size();i++) {
            Pesquisa p = (Pesquisa) al.get(i);
            if(p.getSexo()=='M'){
                contH++;
                if(p.getResposta()=='S') {
                    contS++;
                }
            }
        }
        return contS/contH*100.0;
    }


}