import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {
    static int N, S, E, M;
    static int[][] map;
    static boolean[] visited;
    static boolean isTrue = false;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
            map[y][x] = 1;
        }
        int depth = 0;
        dfs(S, depth);

        if (isTrue) {
        } else {
            System.out.println(-1);
        }
    }

    static void dfs(int idx, int depth) {
        visited[idx] = true;
        if (idx == E) {
            System.out.println(depth);
            isTrue = true;
        }
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i] && map[idx][i] == 1) { // 방문하지 않았고 관계가 있다면
                dfs(i, depth + 1);
            }
        }
    }
}