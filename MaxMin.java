import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] tab = {45, 25 , 65, 12, 34, 92};  
        int max = tab[0];
        int min = tab[0];
        for ( int i = 1 ; i < tab.length ; i++) {
            if ( tab[i] > max ) {
                max = tab[i];
            }
            if ( tab[i] < min ) {
                min = tab[i];
            }
        }
        System.out.println("Le tableau est : "+ Arrays.toString(tab));
        System.out.println("Le max est : " + max);
        System.out.println("Le min est : " + min);
    }
}
