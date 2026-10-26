import java.util.HashMap;
public class characterfrequency {
    public static void main(String[] args) {
     String str="banana";
     char[] ch=str.toCharArray();
     HashMap<Character,Integer>map=new HashMap<>();
     for(char c:ch){
      map.put(c,map.getOrDefault(c,0)+1) ;
     }
     System.out.println(map);
     System.out.println(map.size());
     System.out.println(map.keySet());
     System.out.println(map.values());
    }
}
