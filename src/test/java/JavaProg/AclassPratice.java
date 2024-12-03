package JavaProg;

import java.util.Arrays;

public class AclassPratice {
    public static void main(String[] args) {

        int nums = 211184;
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int nums) {
        int count = 0;
        while(nums > 0){
            System.out.println(Integer.toBinaryString(nums));
            nums = nums & (nums << 1);
            count++;
        }
        return count;
    }
}
