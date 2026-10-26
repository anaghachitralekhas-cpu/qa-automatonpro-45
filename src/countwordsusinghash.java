import java.util.HashMap;
public class countwordsusinghash {
    public static void main(String[] args) {


        String name = "i am anagha";
        String[] words = name.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println(map.size());

    }
}
