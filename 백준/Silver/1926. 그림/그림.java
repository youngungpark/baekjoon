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
    static int N, M;
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static int count, area;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    count++; // 그림의 갯수
                    bfs(i, j, 1);
                }
            }
        }
        System.out.println(count);
        System.out.println(area);
    }

    static void bfs(int i, int j, int depth) {
        Queue<int[]> queue = new LinkedList();
        visited[i][j] = true;
        queue.offer(new int[] { i, j });
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < dx.length; k++) {
                int x = dx[k] + now[0];
                int y = dy[k] + now[1];
                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (!visited[x][y] && map[x][y] == 1) {// 좌표가 유효한 값이고 방문하지 않았으면
                        depth++;
                        visited[x][y] = true;
                        queue.offer(new int[] { x, y });
                    }
                }
            }
            area = Math.max(area, depth);
        }

    }
}