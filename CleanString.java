public class CleanString {

    // Filter out all adjacent characters that appear more than once
    public static String CleanedString(String str) {
        String temp = "";
        String[] characters = str.split("");
        int i = 0;
        while(i < characters.length-1) {
            if(characters[i].equals(characters[i+1])) {
                i -= -1;
            } else {
                temp += characters[i];
                i += 1;
            }
        }
        if(characters[i].equals(characters[i-1]) == false) {
            temp += characters[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        String[] Strings = {"yyzzza", "abbbcdd", "Hello"};
            for(String k:Strings) {
                System.out.println(CleanedString(k));
        }
    }
}