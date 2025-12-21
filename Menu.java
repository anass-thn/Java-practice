import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entree = "Aucune";
        String plat = "Aucun";
        String dessert = "Aucun";
        String boisson = "Aucune";
        int choix = 0;

        do {
            System.out.println("\n===== Menu Restaurant =====");
            System.out.println("1. Entree");
            System.out.println("2. Plat");
            System.out.println("3. Dessert");
            System.out.println("4. Boisson");
            System.out.println("5. Terminer la commande");
            System.out.print("Votre choix : ");

            if (scanner.hasNextInt()) {
                choix = scanner.nextInt();
            } else {
                scanner.next(); // Consume invalid input
                System.out.println("Veuillez entrer un nombre valide.");
                continue;
            }

            switch (choix) {
                case 1:
                    System.out.println("===== Entree =====");
                    System.out.println("1. Salade");
                    System.out.println("2. Quiche");
                    System.out.println("3. Ratatouille");
                    System.out.println("4. Retour");
                    int choixEntree = scanner.nextInt();
                    switch (choixEntree) {
                        case 1:
                            entree = "Salade";
                            break;
                        case 2:
                            entree = "Quiche";
                            break;
                        case 3:
                            entree = "Ratatouille";
                            break;
                        default:
                            break;
                    }
                    if (choixEntree >= 1 && choixEntree <= 3)
                        System.out.println("Entree choisie : " + entree);
                    break;

                case 2:
                    System.out.println("===== Plat =====");
                    System.out.println("1. Poulet");
                    System.out.println("2. Poisson");
                    System.out.println("3. Boeuf");
                    System.out.println("4. Retour");
                    int choixPlat = scanner.nextInt();
                    switch (choixPlat) {
                        case 1:
                            plat = "Poulet";
                            break;
                        case 2:
                            plat = "Poisson";
                            break;
                        case 3:
                            plat = "Boeuf";
                            break;
                        default:
                            break;
                    }
                    if (choixPlat >= 1 && choixPlat <= 3)
                        System.out.println("Plat choisi : " + plat);
                    break;

                case 3:
                    System.out.println("===== Dessert =====");
                    System.out.println("1. Tarte Tatin");
                    System.out.println("2. Crepes");
                    System.out.println("3. Mousse");
                    System.out.println("4. Retour");
                    int choixDessert = scanner.nextInt();
                    switch (choixDessert) {
                        case 1:
                            dessert = "Tarte Tatin";
                            break;
                        case 2:
                            dessert = "Crepes";
                            break;
                        case 3:
                            dessert = "Mousse";
                            break;
                        default:
                            break;
                    }
                    if (choixDessert >= 1 && choixDessert <= 3)
                        System.out.println("Dessert choisi : " + dessert);
                    break;

                case 4:
                    System.out.println("===== Boisson =====");
                    System.out.println("1. Limonade");
                    System.out.println("2. Jus d'orange");
                    System.out.println("3. Jus de pomme");
                    System.out.println("4. Retour");
                    int choixBoisson = scanner.nextInt();
                    switch (choixBoisson) {
                        case 1:
                            boisson = "Limonade";
                            break;
                        case 2:
                            boisson = "Jus d'orange";
                            break;
                        case 3:
                            boisson = "Jus de pomme";
                            break;
                        default:
                            break;
                    }
                    if (choixBoisson >= 1 && choixBoisson <= 3)
                        System.out.println("Boisson choisie : " + boisson);
                    break;

                case 5:
                    System.out.println("Validation de la commande...");
                    break;

                default:
                    System.out.println("Choix invalide");
            }
        } while (choix != 5);

        System.out.println("\n===== Votre Commande Finale =====");
        System.out.println("Entree  : " + entree);
        System.out.println("Plat    : " + plat);
        System.out.println("Dessert : " + dessert);
        System.out.println("Boisson : " + boisson);
        System.out.println("================================");
        System.out.println("Merci de votre visite !");

        scanner.close();
    }
}
