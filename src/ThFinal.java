public class ThFinal {
    public static void main(String[] args) {
        printPermutations("abcd","");
        // ab = ab , aa , bb , ba
    }



    public static void printPermutations(String s,String perm){
        if (s.isEmpty()){
            System.out.println(perm);
            return;
        }
        for (int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            String remainingStr = s.substring(0,i) + s.substring(i+1);
            printPermutations(remainingStr,perm+current);
        }
    }
}
