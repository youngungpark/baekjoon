class Solution {
    static boolean[][] visited;
    
    public int solution(int n, int[][] computers) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1) {
                    computers[j][i] = 1;
                } else if (computers[j][i] == 1) {
                    computers[i][j] = 1;
                }
            }
        }

        int answer = 0;
        visited = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && computers[i][j] == 1) {
                    visited[i][j] = true;
                    answer++;
                    dfs(i, j, computers, n);
                }
            }
        }
        
        return answer;
    }

    static void dfs(int i, int j, int[][] computers, int n) {
        visited[i][j] = true;
        
        for (int k = 0; k < n; k++) {
            if (!visited[j][k] && computers[j][k] == 1) {
                visited[j][k] = true;
                dfs(j, k, computers, n);
            }
        }
    }
}
