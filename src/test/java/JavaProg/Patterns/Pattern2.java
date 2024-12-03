package JavaProg.Patterns;

public class Pattern2 {
    public static void main(String[] args) {

        int n = 4,m=4;
        for(int i=1;i<=n;i++){
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Other Way");

        for(int i=1;i<=m;i++){
            for (int j = 1; j <= m-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
