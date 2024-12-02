package JavaProg.Informatica;

public class PyramidPattern {
    public static void main(String[] args) {

        int n = 4;
        for(int i=1;i<=n;i++){

            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if(i+j<=n){
                    System.out.print(" ");
                }else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
