import java.util.Scanner;

public class pernyataanestedif {
    public static void main(String[] args) {
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();

        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan > 50000) {
                diskon = 50000;
            } else if (belanjaan > 1000000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else {
            if (belanjaan > 100000) {
                diskon = 50000;
            } else {
                diskon = 0;
            }
        }

        bayar = belanjaan - diskon;

        System.out.println("Total bayar: Rp. " + bayar);
        scan.close();
    }
}
