import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupWordsTask {
    public static HashMap<Character, List<Integer>> groupIt(List<String> strArr){
        return strArr
                .stream()
                .collect(Collectors
                        .groupingBy(x -> x.charAt(0), HashMap::new, toList()))
                .entrySet()
                .stream()
                .collect(Collectors
                        .groupingBy(x -> x.getKey(),
                                HashMap::new, Collectors.mapping(t -> {
                                            int count = 0;
                                            for(String str : t.getValue()){
                                                count += StringUtils.countMatches(str, t.getKey());
                                            }
                                            return count;
                                        }, toList()
                                        )));
    }
}
