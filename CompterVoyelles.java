public class CompterVoyelles {
    public static void main(String[] args) {
        String mot = "anass";
        int compteur = 0;
        for (int i = 0; i < mot.length(); i++){
            char lettre = mot.charAt(i);
            if (lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u'){
                compteur++;
            }
        }
        System.out.println("Le mot " + mot + " contient " + compteur + " voyelles.");
    }
}
 