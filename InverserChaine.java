public class InverserChaine {
    public static void main(String[] args) {
        String chaine = "Hello World";
        String chaineInverse = "";
        for (int i = chaine.length() - 1; i >= 0; i--) {
            chaineInverse += chaine.charAt(i);
        }
        System.out.println("Chaine originale : " + chaine);
        System.out.println("Chaine inverse : " + chaineInverse);
    }
}
