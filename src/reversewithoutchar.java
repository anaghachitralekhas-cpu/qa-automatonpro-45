public class reversewithoutchar {
    public static void main(String[] args) {
        String str="Anagha";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
           rev=rev+str.charAt(i);
        }
        System.out.print(rev);
    }
}
