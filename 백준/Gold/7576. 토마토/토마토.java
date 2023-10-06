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
    static int[][] map;
    static boolean[][] visited;
    static int M, N;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    static int count;
    static int day;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] > 0) {
                    queue.offer(new int[] { i, j });
                    visited[i][j] = true;
                } else if (map[i][j] == 0) {// 익지않은 토마토 카운트
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            bfs();
            if (count == 0) { // 모두 익었으면
                System.out.println(day - 1);
            } else {
                System.out.println(-1);
            }
        }

    }

    static void bfs() {
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < dx.length; i++) {
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];
                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (!visited[x][y] && map[x][y] == 0) {// 익지않은 토마토고 방문하지 않았으면
                        map[x][y] = map[now[0]][now[1]] + 1; // 누적 일수
                        count--;
                        visited[x][y] = true;
                        day = Math.max(day, map[x][y]);
                        queue.offer(new int[] { x, y });
                    }
                }
            }
        }
    }
}