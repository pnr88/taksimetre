import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        Scanner impute =new Scanner(System.in);
        double KM ,total;

        System.out.print("Mesafeyi KM cinsinden giriniz=");
        KM= impute.nextDouble();
        double perKm=2.20;

        total=(perKm*KM) +10;
        total=(total < 20) ? 20 : total;

        System.out.println("TOTAL="+total);

    }
}
