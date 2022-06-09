public class P1E5 {
    public static void main(String[] arg){
        double DG, DP, PP, PG, PM, QTDLITROS;
        DG = 10;
        DP = 10;
        PG = 10;
        PP = 10;
        PM = (PP + PG)/2;
        QTDLITROS =  DG*DP*PM*785;
        System.out.println("Serão necessários " + QTDLITROS + "Litros");
    }
}
