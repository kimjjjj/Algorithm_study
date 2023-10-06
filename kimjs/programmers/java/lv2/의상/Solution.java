import java.util.*;
import static java.util.stream.Collectors.*;

class Solution {
    public int solution(String[][] clothes) {
        
        /**
         * 만약에 옷의 종류가 1개라고 해봅시다. 개수는 a개입니다.
         * 그럼 총 a가지의 경우가 있겠죠?
         * 
         * 종류가 2개가 되고 각각의 옷의 개수는 a, b개입니다.
         * 그럼 경우의 수는 a, b, ab가 되므로 조합의 개수는 (a+b) + (ab)가지입니다.
         * 
         * 3개가 된다면? (a+b+c) + (ab+bc+ca) + (abc)가지입니다.
         * 
         * 어디서 많이 보시지 않았나요? 학창시절에 우리는 다항식을 배우는데 위의 가짓수는 n차식(n = 옷의 종류의 개수) 계수들의 합입니다.
         * 
         * 즉 옷의 종류가 3가지고 각각의 옷의 개수가 a, b, c라면 (x+a)(x+b)(x+c) = x3 + (a+b+c)x2 + (ab+bc+ca)x + (abc)라는 식이 정립됩니다. 보이시죠? 총 조합의 개수가 계수에 다 포함되어 있습니다.
         * 
         * 해당 식의 계수의 합을 구하려면 x=1을 대입해주면 됩니다. 그 후 맨 앞 x3 의 계수는 정답에 포함되지 않으므로 마지막에 1을 빼주는 겁니다.
         * x=1을 대입한 식은 (1+a)(1+b)(1+c)가 되고 그 값에 1을 뺀 후 리턴해주면 정답이 나오는 이유가 그것입니다.
         */
        
        /********** code 1 **********/
        int answer = clothes.length;
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0)+1);
        }
        
        if (map.size() > 1) {
            
            int count = 1;
            for(String key : map.keySet()){
                count *= map.get(key) + 1;
            }
            
            answer = count - 1;
        }
        /****************************/

        /********** code 2 **********/
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0)+1);
        }
        
        Collection<Integer> intColl = map.values();
        
        answer = intColl.stream().reduce(1, (a, b) -> a*(b+1)) - 1;
        /****************************/

        /********** code 3 **********/
        int answer = Arrays.stream(clothes)
            .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
            .values()
            .stream()
            .reduce(1L, (a, b) -> a*(b+1)).intValue() - 1;
        /****************************/
        
        return answer;
    }
}
