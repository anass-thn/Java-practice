public class CalculateurNote {
    public static void main(String[] args) {
        int note = 45;

        if (note >= 90) {
            System.out.println("Note Exellent = A");
        } else if (note >= 80) {
            System.out.println("Note Très Bien = B");
        } else if (note >= 70) {
            System.out.println("Note Bien = C");
        } else if (note >= 60) {
            System.out.println("Note Passable = D");
        } else {
            System.out.println("Note Insuffisante = E");
        }
    }
}
