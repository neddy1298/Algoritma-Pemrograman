import java.util.Scanner;

public class pernyataanswtichcase {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input nawa warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("lampu merah, barhasil!");
                break;

            case "kusing":
                System.out.println("lampu kusing, barhasil!");
                break;

            case "hijau":
                System.out.println("lampu hijau, barhasil!");
                break;

            default:
                System.out.println("Warna lampu salah!");
        }

        scan.close();
    }
}
