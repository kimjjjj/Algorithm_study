class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] cntArr = new int[privacies.length];
        int idx = 0;
        
        // 년, 월, 일
        int todayY = Integer.parseInt(today.substring(0, 4));
        int todayM = Integer.parseInt(today.substring(5, 7));
        int todayD = Integer.parseInt(today.substring(8, 10));
        
        // 일로 계산
        int todayDate = (todayY * 12 * 28) + (todayM * 28) + todayD;
        
        for (int i=0; i<privacies.length; i++) {
            // 년, 월, 일
            int priY = Integer.parseInt(privacies[i].substring(0, 4));
            int priM = Integer.parseInt(privacies[i].substring(5, 7));
            int priD = Integer.parseInt(privacies[i].substring(8, 10));
            
            // 일로 계산
            int priDate = (priY * 12 * 28) + (priM * 28) + priD;
            
            for (int j=0; j<terms.length; j++) {
                if (terms[j].substring(0, 1).equals(privacies[i].substring(privacies[i].length()-1, privacies[i].length()))) {
                    int addMonth = Integer.parseInt(terms[j].substring(2, terms[j].length())) * 28;
                    priDate += addMonth;
                    
                    // 날짜 비교
                    if (todayDate > priDate || todayDate == priDate) {
                        cntArr[idx] = i+1;
                        idx++;
                    }
                }
            }
        }
        
        int cnt = 0;
        for (int i=0; i<cntArr.length; i++) {
            if (cntArr[i] != 0) cnt++;
        }
        
        int[] answer = new int[cnt];
        
        idx = 0;
        for (int i=0; i<cntArr.length; i++) {
            if (cntArr[i] != 0) {
                answer[idx] = cntArr[i];
                idx++;
            }
        }
        
        return answer;
    }
}
