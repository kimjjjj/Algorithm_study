class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i=0; i<n; i++) {
            /********** code 1 **********/
            String str1 = Integer.toString(arr1[i], 2);
            str1 = "0".repeat(n - str1.length()) + str1;
            
            String str2 = Integer.toString(arr2[i], 2);
            str2 = "0".repeat(n - str2.length()) + str2;
            
            String[] strArr1 = str1.split("");
            String[] strArr2 = str2.split("");
            
            String temp = "";
            for (int j=0; j<n; j++) {
                if ("0".equals(strArr1[j]) && "0".equals(strArr2[j])) temp += " ";
                else temp += "#";
            }
            
            answer[i] = temp;
            /****************************/
            
            /********** code 2 **********/
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            answer[i] = "0".repeat(n - str.length()) + str;
            
            answer[i] = answer[i].replace("0", " ");
            answer[i] = answer[i].replace("1", "#");
            /****************************/
        }
            
        return answer;
    }
}
