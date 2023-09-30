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
    static int W, H;
    static boolean[][] visited;
    static int[][] map;
    static int sumCount;
    static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            if (W == 0) {
                break;
            }
            H = Integer.parseInt(st.nextToken());
            map = new int[H][W];
            visited = new boolean[H][W];

            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            sumCount = 0; // 섬 갯수 초기화
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) { // 방문하지않은 섬이있다면 섬 갯수 증가
                        sumCount++;
                        bfs(i, j);
                    }
                }
            }

            sb.append(sumCount + "\n");

        }
        System.out.println(sb);
    }

    static void bfs(int i, int j) {
        visited[i][j] = true;
        Queue<int[]> queue = new LinkedList();
        queue.offer(new int[] { i, j });
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < dx.length; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x >= 0 && y >= 0 && x < H && y < W) {
                    if (!visited[x][y] && map[x][y] == 1) {
                        visited[x][y] = true;
                        queue.offer(new int[] { x, y });
                    }
                }
            }
        }
    }
}