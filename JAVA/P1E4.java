public class P1E4 {
    public static void main(String[] args) {
        int hora, min, seg, falta, passou;
        hora=10;
        min=50;
        seg=47;
        passou=hora*3600+min*60+seg;
        falta=86400-passou;
        System.out.println("Passou " + (passou) + "Desde a meia-noite");
        System.out.println("Falta " + (falta) + "Para a meia-noite");


    }
}