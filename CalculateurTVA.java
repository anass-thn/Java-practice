class CalculateurTVA {
    public static void main(String[] args) {
        double prixHT = 100; 
        double tva = 20;
        double prixTTC = prixHT + (prixHT * tva / 100);
        System.out.println("Prix HT : " + prixHT);
        System.out.println("TVA : " + tva + "% " );
        System.out.println("Prix TTC : " + prixTTC);
    }
}
