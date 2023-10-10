import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String s) {
        /********** code 1 **********/
        Set<String> set = new LinkedHashSet<>();
        
        s = s.replace("{", "");
        
        String[] arr = s.split("}");
        
        for (int i=0; i<arr.length; i++) {
            if (",".equals(arr[i].substring(0, 1))) {
                arr[i] = arr[i].substring(1, arr[i].length());
            }
        }
        
        Map<Integer, String> map = new HashMap<>();
        
        for (String str : arr) {
            map.put(str.split(",").length, str);
        }
        
        int idx = 1;
        for (int i=0; i<map.size(); i++) {
            for (String str : map.get(idx).split(",")) {
                set.add(str);
            }
            idx++;
        }
        
        int[] answer = new int[set.size()];
        
        Iterator<String> iterator = set.iterator();
        
        idx = 0;
        while(iterator.hasNext()) {
            answer[idx] = Integer.parseInt(iterator.next());
            idx++;
        }

        return answer;
        /****************************/

        
        /********** code 2 **********/
        String[] arr = s.replaceAll("[{}]", " ").trim().split(" , ");
        
        Arrays.sort(arr, (o1, o2) -> o1.length()-o2.length());
        
        int[] answer = new int[arr.length];
        
        Set<String> set = new HashSet<>();
        
        int idx = 0;
        for (String str1 : arr) {
            for (String str2 : str1.split(",")) {
                if (set.add(str2)) answer[idx++] = Integer.parseInt(str2);
            }
        }
        
        return answer;
        /****************************/

        
        /********** code 3 **********/
        final Map<Integer, Integer> counts = new LinkedHashMap<>();
        
        Stream.of(s.replaceAll("[}{]", "").split(","))
            .mapToInt(Integer::parseInt)
            .forEach(i -> counts.merge(i, 1, Integer::sum));
        
        return counts.entrySet().stream()
            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .map(Map.Entry::getKey)
            .mapToInt(x -> x).toArray();
        /****************************/
    }
}
