import java.util.HashMap;
public class secondnonrepeatingcharacter {
    public static void main(String[] args) {
        String name="ammu";
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:name.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:name.toCharArray()){
            if(map.get(ch)==1){
                count++;
            if(count==2){
                System.out.println(ch);
            }

            }
        }
    }
}
