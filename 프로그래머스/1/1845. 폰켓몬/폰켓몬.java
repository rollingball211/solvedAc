import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        //map.size()와 nums의 length를 비교
        
        //내가 가져갈 수 있는 수
        int num1 = nums.length/2;
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (Integer keys : nums) {
            map.put(keys, map.getOrDefault(keys,0)+1);
        }
        
        int num2 = map.size();
        
        if (num1 < num2) {
            answer = num1;
        } else if (num1 > num2) {
            answer = num2;
        } else 
           answer = num1;
        
        return answer;
 }
}