import java.util.HashMap;
public class firstnonrepeatincharacter {
    public static void main(String[] args) {
        String name="swiss";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:name.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
       for(char ch:map.keySet()){
           if(map.get(ch)==1){
               System.out.println(ch);
               break;
           }
       }
    }
}
