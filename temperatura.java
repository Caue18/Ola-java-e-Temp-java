public class temperatura {
    public static void main(String[] args) {
        Double C, K, RE,Ra, F;
        C =  2.43; // Celsius
        F = C * 1.8 + 32; // Fahrenheit
        K = C + 273.15; // Kevin
        RE = C * 0.8; // Réaumur
        Ra =  C * 1.8 + 32 + 459.67; // Rankine
        System.out.println( C+  "°C equivale a  "+F +" °F");
        System.out.println(C+ "°C equivale  a   "+K +"°K");
        System.out.println(C+ "°C  equivale a "   +RE +"°RE  ou " +Ra + "°Ra" );
    }
}