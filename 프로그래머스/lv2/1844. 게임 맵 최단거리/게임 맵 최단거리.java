import java.util.*;

class Solution {
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    public int solution(int[][] maps) {
        visited = new boolean[maps.length+1][maps[0].length+1];
        int answer = 0;
        dfs(0,0,maps);
        answer = maps[maps.length-1][maps[0].length-1];
        if(answer == 1){
            answer = -1;
        }
        return answer;
    }
    static void dfs(int i,int j,int[][] maps){
        Queue<int[]> queue = new LinkedList();
        visited[i][j] = true;
        queue.offer(new int[] {i,j});
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for(int k=0; k<dx.length; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<maps.length && y<maps[0].length){
                    if(!visited[x][y] && maps[x][y] == 1){   //방문하지않았고 지나갈수있는 길이면
                        visited[x][y] = true;
                        maps[x][y] = maps[now[0]][now[1]] + 1;
                        queue.offer(new int[] {x,y});
                    }
                }
            }
        }
    }
    
}