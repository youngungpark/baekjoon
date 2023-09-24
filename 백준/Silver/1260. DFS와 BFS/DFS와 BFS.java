import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {
    static int N, M, V;
    static boolean[] visited;
    static int[][] map;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        map = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            map[s][e] = 1;
            map[e][s] = 1;
        }

        dfs(V);
        visited = new boolean[N + 1];
        System.out.println();
        bfs(V);
        System.out.println(sb);

    }

    static void dfs(int v) {
        System.out.print(v + " ");
        visited[v] = true;
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i] && map[v][i] == 1) { // 방문하지않았고 연결된 엣지가 있으면
                dfs(i);
            }
        }
    }

    static void bfs(int v) {

        Queue<Integer> queue = new LinkedList();
        queue.offer(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            System.out.print(nowNode + " ");
            for (int i = 1; i < N + 1; i++) {
                if (map[nowNode][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }

    }
}