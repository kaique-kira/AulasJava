public class P1E3 {
    public static void main(String[] args){
        double Celsius = 35; 
        double F = Celsius*1.8 + 32;
        double K = Celsius +273.15;
        double Ra = Celsius*1.8+32+459.67;
        double Re = Celsius *0.8;

        System.out.println("F: "+Math.ceil(F));
        System.out.println("K: "+Math.ceil(K));
        System.out.println("Ra: "+Math.ceil(Ra));
        System.out.println("Re: "+Math.ceil(Re));
    }
}
