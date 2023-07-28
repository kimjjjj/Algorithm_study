import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        List<String> leftList = new ArrayList<>();
        List<String> rightList = new ArrayList<>();
        
        leftList.add("*");
        rightList.add("#");
        
        int[] leftTemp = new int[2];
        int[] rightTemp = new int[2];
        int[] nowTemp = new int[2];
        
        for (Integer i : numbers) {
            
            if (i == 1 || i == 4 || i == 7) {
                leftList.add(String.valueOf(i));
                answer.append("L");
            } else if (i == 3 || i == 6 || i == 9) {
                rightList.add(String.valueOf(i));
                answer.append("R");
            } else {
                
                leftTemp = cal(leftList.get(leftList.size()-1));
                rightTemp = cal(rightList.get(rightList.size()-1));
                
                nowTemp = cal(String.valueOf(i));
                
                int leftCal = (Math.abs(leftTemp[0] - nowTemp[0]) + Math.abs(leftTemp[1] - nowTemp[1]));
                int rightCal = (Math.abs(rightTemp[0] - nowTemp[0]) + Math.abs(rightTemp[1] - nowTemp[1]));
                
                if (leftCal == rightCal) {
                    if ("right".equals(hand)) {
                        rightList.add(String.valueOf(i));
                        answer.append("R");
                    } else if ("left".equals(hand)) {
                        leftList.add(String.valueOf(i));
                        answer.append("L");
                    }
                } else if (leftCal > rightCal) {
                    rightList.add(String.valueOf(i));
                    answer.append("R");
                } else {
                    leftList.add(String.valueOf(i));
                    answer.append("L");
                }
            }
        }
        
        return answer.toString();
    }
    
    static int[] cal(String s) {
        int x = 0, y = 0;
        
        if ("1".equals(s)) {
            x = 0;
            y = 0;
        } else if ("2".equals(s)) {
            x = 0;
            y = 1;
        } else if ("3".equals(s)) {
            x = 0;
            y = 2;
        } else if ("4".equals(s)) {
            x = 1;
            y = 0;
        } else if ("5".equals(s)) {
            x = 1;
            y = 1;
        } else if ("6".equals(s)) {
            x = 1;
            y = 2;
        } else if ("7".equals(s)) {
            x = 2;
            y = 0;
        } else if ("8".equals(s)) {
            x = 2;
            y = 1;
        } else if ("9".equals(s)) {
            x = 2;
            y = 2;
        } else if ("*".equals(s)) {
            x = 3;
            y = 0;
        } else if ("0".equals(s)) {
            x = 3;
            y = 1;
        } else if ("#".equals(s)) {
            x = 3;
            y = 2;
        }
        
        int[] temp = {x, y};
        
        return temp;
    }
}
