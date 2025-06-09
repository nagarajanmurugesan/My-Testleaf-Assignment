package Week3Day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintDuplicates {
    public static void main(String[] args) {
        int valuesone[] = {2,5,7,7,5,9,2,3};
        Arrays.sort(valuesone);
        int arraylength = valuesone.length;
        for (int i = 0; i <arraylength-1; i++) {
            if (valuesone [i]== valuesone[i+1]) {
                System.out.println("Duplicate is"+valuesone[i]);
            }


        }
    }
}
