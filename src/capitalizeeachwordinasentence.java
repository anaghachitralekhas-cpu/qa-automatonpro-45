public class capitalizeeachwordinasentence {
    public static void main(String[] args) {
        String str= "i love me i am so happy i love my life";
        String[] words=str.trim().split("\\s+");
        String cap="";
        for(int i= 0; i<=words.length-1 ; i++) {
         // cap+=words[i]+" ";
            cap+=Character.toUpperCase(words[i].charAt(0))+words[i].substring(1)+" ";
        }
     System.out.println(cap);
    }
}
