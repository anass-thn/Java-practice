import java.util.Arrays;

public class fusiontableaux {
    public static void main(String[] args) {
        int[] tab1 = {1, 3, 5, 7, 9};
        int[] tab2 = {2, 4, 6, 8, 10};
        int[] tab3 = new int[tab1.length + tab2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i<tab1.length && j<tab2.length){
            if (tab1[i]<tab2[j]){
                tab3[k] = tab1[i];
                i++;
            }else{
                tab3[k] = tab2[j];
                j++;
            }
            k++;
        }
        while (i<tab1.length){
            tab3[k] = tab1[i];
            i++;
            k++;
        }
        while (j<tab2.length){
            tab3[k] = tab2[j];
            j++;
            k++;
        }
        System.out.println("Tableau fusionné : " + Arrays.toString(tab3));
    }
}
