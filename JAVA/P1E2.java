public class P1E2 {
    public static void main(String[] args){
        double q1,q2,q3,q4,q5,q6, moedasreal, dolar;
        q1=1;
        q2=50;
        q3=25;
        q4=10;
        q5=5;
        q6=1;
        dolar=4.93;
        moedasreal=(q1+0.5*q2+0.25*q3+0.1*q4+0.05*q5+0.01*q6)*dolar;
        System.out.println("Moedas em real: " + (moedasreal));
    }
}

