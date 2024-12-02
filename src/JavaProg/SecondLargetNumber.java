package JavaProg;

public class SecondLargetNumber {

    public static void main(String[] args) {
        int[] nums = {4,0,1,1,1,2,2,3,3,4,5,4,4,4,5,5,5,5};
        if(nums.length < 2){
            throw new NullPointerException();
        }
        int secLar = Integer.MIN_VALUE;
        int Large = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > Large){
                secLar = Large;
                Large = nums[i];
            } else if (nums[i] > secLar && nums[i] != Large) {
                secLar = nums[i];
            }
        }
        System.out.println(secLar);
    }
}
