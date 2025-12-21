public class ComparateurNombre {
    public static void main(String[] args) {
        int nombre1 = 10;
        int nombre2 = 20;
        int nombre3 = 15;
        
        if (nombre1 > nombre2 && nombre1 > nombre3) {
            System.out.println("Le nombre 1 est le plus grand");
        } else if (nombre2 > nombre1 && nombre2 > nombre3) {
            System.out.println("Le nombre 2 est le plus grand");
        } else if (nombre3 > nombre1 && nombre3 > nombre2) {
            System.out.println("Le nombre 3 est le plus grand");
        } else {
            System.out.println("Les nombres sont egaux");
        }
    }   
}
