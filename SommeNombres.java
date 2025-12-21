// Somme des nombres de 1 à n
public class SommeNombres {
    public static void main(String[] args) {
        int n = 10;
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i;
        }
        System.out.println("La somme des nombres de 1 à " + n + " est : " + somme);
    }
}
