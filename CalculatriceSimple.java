class CalculatriceSimple {
    public static void main(String[] args) {
        double nombre1 = 10;
        double nombre2 = 3;
        char operation = '/'; // +, -, *, /
        double resultat = 0;
        
        switch (operation) {
            case '+':
                resultat = nombre1 + nombre2;
                break;
            case '-':
                resultat = nombre1 - nombre2;
                break;
            case '*':
                resultat = nombre1 * nombre2;
                break;
            case '/':
                resultat = nombre1 / nombre2;
                break;
            default:
                System.out.println("Opération invalide");
                return;
        }
        
        System.out.println(nombre1 + " " + operation + " " + nombre2 + " = " + resultat);
    }
}