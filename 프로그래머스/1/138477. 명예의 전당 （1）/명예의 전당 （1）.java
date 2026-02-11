import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        // 정답을 담을 배열 (매일매일 발표하니까 점수의 개수만큼..)
        int[] answer = new int[score.length];
        
        // 우선순위 큐 선언 (기본: 작은 숫자가 우선 = Min Heap)
        // 명예의 전당에는 '상위 k명'만 남고,'가장 점수가 낮은 사람'이 커트라인. 최저값을 찾아주면 됨
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            // 1. 일단 오늘 점수를 큐에 넣습니다.
            pq.add(score[i]);
            
            // 2. 만약 명예의 전당(k명)보다 사람이 많아지면?
            if (pq.size() > k) {
                pq.poll(); 
                //가장 작은 수 를 내보냄
            }
            
            // 3. 현재 명예의 전당에 있는 사람 중 꼴찌(최솟값) 점수 기록
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}