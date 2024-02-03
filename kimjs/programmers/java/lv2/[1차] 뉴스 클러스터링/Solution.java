import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        String[] strArr1 = str1.split("");
        String[] strArr2 = str2.split("");
        
        Map<String, Integer> strMap1 = getMap(strArr1);
        Map<String, Integer> strMap2 = getMap(strArr2);
        
        if (strMap1.isEmpty() && strMap2.isEmpty()) return 65536;
        
        int cnt1 = 0, cnt2 = 0;
        for (String strMap1Key : strMap1.keySet()) {
            
            int strMap1Value = 0, strMap2Value = 0;
            if (!"".equals(strMap1.get(strMap1Key))) {
                strMap1Value = strMap1.get(strMap1Key);
            }
            
            cnt2 += strMap1Value;
            
            if (strMap2.get(strMap1Key) != null) {
                strMap2Value = strMap2.get(strMap1Key);
            }
            
            if (strMap1Value > 0 && strMap2Value > 0) {
                if (strMap1Value == strMap2Value) {
                    cnt1 += strMap1Value;
                    strMap1.put(strMap1Key, 0);
                    strMap2.put(strMap1Key, 0);
                } else {
                    cnt1 += Math.min(strMap1Value, strMap2Value);
                    
                    if(strMap1Value > strMap2Value) {
                        strMap1.put(strMap1Key, strMap1Value - strMap2Value);
                        strMap2.put(strMap1Key, 0);
                    }
                    
                    if(strMap1Value < strMap2Value) {
                        strMap1.put(strMap1Key, 0);
                        strMap2.put(strMap1Key, strMap2Value - strMap1Value);
                    }
                }
            }
        }
        
        for (String key : strMap2.keySet()) {
            cnt2 += strMap2.get(key);
        }
        
        answer = (int)Math.floor((double)cnt1 / cnt2 * 65536);
        
        return answer;
    }
    
    static Map<String, Integer> getMap(String[] strArr) {
        Map<String, Integer> strMap = new HashMap<>();
        
        for (int i=1; i<strArr.length; i++) {
            String str = strArr[i-1] + strArr[i];
            
            if(str.matches("^[A-Z]*$")) {
                strMap.put(str, strMap.getOrDefault(str, 0)+1);
            }
        }
        
        return strMap;
    }
}
