import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
      // 사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i< score.length; i++) {
            pq.add(score[i]);
        }
        
        //갯수 
        int box = score.length/m;
        
        for (int i = 0; i < box; i++) {
            for (int j = 0; j < m-1; j++) {
                pq.poll(); //큰거 모아놓은거 다 버림, 최솟값의 사과값이 그 상자의 사과값이 되니까
            }
            answer += pq.poll() * m ;
        }
        
        
        
        
        
        
        
        
        return answer;
    }
}