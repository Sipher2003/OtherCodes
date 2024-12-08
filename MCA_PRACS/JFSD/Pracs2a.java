// lambda

public class Pracs2a {
    
    @FunctionalInterface
    interface Converter{
        double convert(double value);
    
    }
    
    public static void main(String[] args) {
        Converter faretocelci=(farenhit)->(farenhit-32)*5/9;

        double farenhit=98.6;
        double celcies=faretocelci.convert(farenhit);
        System.out.println("Celcius is "+(celcies));
    }
}
