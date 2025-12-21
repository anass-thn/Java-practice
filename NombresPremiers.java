public class NombresPremiers {
    public static void main(String[] args) {
        System.err.println("Nombres premiers jusqu'a 100 : ");
        for (int i = 2; i <= 100; i++) {
            boolean estPremier = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    estPremier = false;
                    break;
                }
            }
            if (estPremier) {
                System.out.println(i);
            }
        }
    }
}
