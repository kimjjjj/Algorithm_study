class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        /********** code 1 **********/
        for (String s : babbling) {
            s = s.replace("aya", "0");
            s = s.replace("ye", "1");
            s = s.replace("woo", "2");
            s = s.replace("ma", "3");
            
            boolean charChk = false;
            for (int i=0; i<s.length(); i++) {
                
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    charChk = true;
                    break;
                }
            }
            
            if (charChk == false) {
                
                boolean douChk = false;
                for (int i=1; i<s.length(); i++) {
                    
                    if (s.charAt(i-1) == s.charAt(i)) {
                        douChk = true;
                    }
                }
                
                if (douChk == false) {
                    answer++;
                }
            }
        }
        /****************************/

        /********** code 2 **********/
        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                continue;
            }

            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length()  == 0) answer++;
        }
        /****************************/
        return answer;
    }
}
