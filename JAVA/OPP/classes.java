public class classes {
    public String Nome;
    public String SobreNome;
    public int Idade;
    public String password;
    public double Salario;
    private boolean IsLooged;
    public endereco endereco;

    public void setLogged(boolean logged){
        IsLooged = logged;
    }

    public String GetFullName(){
        return Nome + " " + SobreNome;
    }
    }
    

