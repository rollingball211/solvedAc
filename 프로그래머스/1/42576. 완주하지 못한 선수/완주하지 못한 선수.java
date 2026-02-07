import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String,Integer> map = new HashMap<>();
        
        //모든 참가자들을 저장함
        for (String parti : participant) {
            map.put(parti, map.getOrDefault(parti,0) + 1);
        }
        
        
        //map에서 완주자들을 제거함
        for (String done : completion) {
            
            map.put(done, map.get(done) -1);
        }
        
        
        //저장된 map에서 그 값이 0이아니라면 그사람이 미완주자
        //keySet 
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        
        
        
        return answer;
    }
}