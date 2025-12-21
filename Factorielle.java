public class Factorielle {
    public static void main(String[] args) {
        int n = 6;
        int factorielle = 1;
        for (int i = 1; i<=n; i++){
            factorielle *= i;
        }
        System.out.println("La factorielle de " + n + "est : " + factorielle);
    }
}
