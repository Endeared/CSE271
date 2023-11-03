import java.awt.Color;
import java.util.*;

public class MapDemo_Test {
   public static void main(String[] args){
      Map<String, ArrayList<String>> favoriteColors = new HashMap<String, ArrayList<String>>();
      favoriteColors.put("Juliet", Color.RED);
      favoriteColors.put("Romeo", Color.GREEN);
      
      Set<String> keySet = favoriteColors.keySet();
      for (String key : keySet)
      {
        Color value = favoriteColors.get(key);
        System.out.println(key + "->" + value);
      }
   }
   
}