class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        //s만큼 잘라야함
        
        String subMyString1 = my_string.substring(0,s);
        int a = overwrite_string.length();
        String subMyString2 = my_string.substring(s+a);
        
        
        answer = subMyString1 + overwrite_string+subMyString2;
        
        
        return answer;
    }
}