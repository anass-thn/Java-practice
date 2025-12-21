import java.util.Scanner;

public class devinet {
    public static void main(String[] args) {
        int nbrSecret = 8;
        int nbrDevine = 0;
        Scanner scanner = new Scanner(System.in);

        while (nbrDevine != nbrSecret) {
            System.out.println("Devinez le nombre secret : ");
            nbrDevine = scanner.nextInt();
            if (nbrDevine < nbrSecret) {
                System.out.println("Trop petit");
            } else {
                System.out.println("Trop grand");
            }
        }
        System.out.println("Bravo !");
        scanner.close();
    }
}