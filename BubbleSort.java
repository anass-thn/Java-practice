import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] tab = {45, 25 , 65, 12, 34, 92};
        int n = tab.length;
        for ( int i = 0; i<n-1;i++) {
            for (int j=0 ; j<n-1-i ; j++){
                if (tab[j]>tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        System.out.println("Tableau trié : " + Arrays.toString(tab)); 
    }
}
