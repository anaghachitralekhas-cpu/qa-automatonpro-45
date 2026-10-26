public class countwordsinastring {
    public static void main(String[] args) {
        String str= "I love myself I am happy";
        String[] s=str.trim().split("\\s+");
        System.out.println(s.length);
    }
}
