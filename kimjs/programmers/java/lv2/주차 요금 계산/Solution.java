import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<Integer, String> inMap = new HashMap<>(); // IN 데이터 담는 용도
        HashMap<Integer, Integer> timeMap = new HashMap<>(); // 차량별 총 시간 담는 용도
        
        for (String record : records) {
            
            String[] recordArr = record.split(" ");
            
            int carNum = Integer.parseInt(recordArr[1]);
            if("IN".equals(recordArr[2])) inMap.put(carNum, recordArr[0]);
            else {
                timeMap.put(carNum, timeMap.getOrDefault(carNum, 0) + (setTime(inMap.get(carNum).substring(0, 2), inMap.get(carNum).substring(3, 5), recordArr[0].substring(0, 2), recordArr[0].substring(3, 5))/60));
                
                inMap.remove(carNum);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(inMap.keySet());
        for (int s : keySet) {
            timeMap.put(s, timeMap.getOrDefault(s, 0) + (setTime(inMap.get(s).substring(0, 2), inMap.get(s).substring(3, 5), "23", "59")/60));
            inMap.remove(s);
        }
        
        keySet = new ArrayList<>(timeMap.keySet());
        Collections.sort(keySet);
        
        int[] answer = new int[timeMap.size()];
        int index = 0;
        for (int s : keySet) {
            
            if (timeMap.get(s) > fees[0])
                answer[index] = (int) (fees[1] + Math.ceil((double) (timeMap.get(s) - fees[0]) / fees[2]) * fees[3]);
            else
                answer[index] = fees[1];
            
            index++;
        }
        
        return answer;
    }

    // 시간 계산
    static int setTime(String a, String b, String c, String d) {
        LocalTime inTime = LocalTime.of(Integer.valueOf(a), Integer.valueOf(b));
        LocalTime outTime = LocalTime.of(Integer.valueOf(c), Integer.valueOf(d));
        Duration duration = Duration.between(inTime, outTime);
        
        return (int) duration.getSeconds();
    }
}
