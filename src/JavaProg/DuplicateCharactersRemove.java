package JavaProg;

public class DuplicateCharactersRemove {
    public static void main(String[] args) {
        String s = "Character s".toLowerCase();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i] != ' ') {
                for (int j = i + 1; j < s.length(); j++) {
                    if (ch[i] == ch[j]) {
                        ch[j] = ' ';
                    }
                }
            }
        }
        for(char c : ch){
            if(c != ' '){
                System.out.println(c);
            }
        }
        streamLogic(s);
    }
    private static void streamLogic(String s){
        s.chars().mapToObj(c -> (char)c)
                .distinct()
                .map(String::valueOf)
                .forEach(System.out::print);
    }
}
