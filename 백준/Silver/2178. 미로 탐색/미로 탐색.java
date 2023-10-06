import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        System.out.println(map[N - 1][M - 1]);

    }

    static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList();
        visited[i][j] = true;
        queue.offer(new int[] { i, j });
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < dx.length; k++) {
                int x = dx[k] + now[0];
                int y = dy[k] + now[1];
                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (!visited[x][y] && map[x][y] == 1) { // 방문하지않았고 이동할 수 있으면
                        visited[x][y] = true;
                        map[x][y] = map[now[0]][now[1]] + 1;    // 해당 칸 = 이전 칸 + 1 칸
                        queue.offer(new int[] { x, y });
                    }
                }
            }
        }
    }
}