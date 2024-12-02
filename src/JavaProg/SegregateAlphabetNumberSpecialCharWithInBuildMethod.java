package JavaProg;

public class SegregateAlphabetNumberSpecialCharWithInBuildMethod {
    public static void main(String[] args) {
        String s = "Sala#123ga@gmail.com".toLowerCase();
        char[] ch = s.toCharArray();
        String alpha = "";
        String num="";
        String spcl="";
        for(char c: ch){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                alpha = alpha + c;
            } else if (c>='0' && c<='9') {
                num = num + c;
            }else {
                spcl = spcl + c;
            }
        }
        System.out.println(alpha+" "+num+" "+spcl);
    }
}
