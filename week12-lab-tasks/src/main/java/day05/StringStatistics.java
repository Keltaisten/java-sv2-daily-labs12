package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {
    public Map<Character, Integer> charactersInAWord(String word){
        Map<Character, Integer> result = new HashMap<>();
        for(Character actual : word.toCharArray()){
            if(result.containsKey(actual)){
                result.replace(actual,result.get(actual) + 1);
            }
            else{
                result.put(actual,1);
            }
        }
        return result;
    }
}
