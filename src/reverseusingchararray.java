public class reverseusingchararray {


    public static void main(String[] args) {
        String ana= "Hello World";
        char[] a= ana.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }

}
