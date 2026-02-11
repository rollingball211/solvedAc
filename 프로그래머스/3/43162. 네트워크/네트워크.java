import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        //연결된 덩어리가 총 몇개인가?
        //a-b , b-c 이면 a-b-c 이다.
        
        boolean [] visited = new boolean[n]; 
        
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                answer++;
                bfs(i,n,computers,visited);
            }
        }
        return answer;
    }
    
    public static void bfs(int start, int n, int[][] computers, boolean [] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            //현재 컴퓨터와 연결된 다른 컴퓨터들을 조사
            
            for (int i =0; i < n; i++) {
                //1.연결되어 있고 2. 아직 방문하지 않았다면?
                
                if (computers[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
            
            
            }
            
        }
}