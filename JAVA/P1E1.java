public class P1E1 {
    public static void main(String[] args){
        double m, h, t, cavalos;
        m=10000.0;
        h=200.0;
        t=10.0;
        cavalos=m*h/t/745.6999;
        System.out.println("Cavalos: "+Math.ceil(cavalos));
    }
}