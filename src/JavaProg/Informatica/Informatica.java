package JavaProg.Informatica;

import java.util.Arrays;

public class Informatica {
    public static void main(String[] args) {

        int[] a = {1,4,3,-9,2,-1};
        int s;
        for(int i=0;i<=a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i] > 0) {
                System.out.println(a[i]);
            }
        }
        int[] result = Arrays.stream(new int[]{1,4,3,-9,2,-1}).filter(i -> i>0)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(result));
    }
}
