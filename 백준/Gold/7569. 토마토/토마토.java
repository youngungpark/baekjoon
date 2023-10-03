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
    static int N, M, H;
    static int[][][] map;
    static boolean[][][] visited;
    static int cnt;
    static int result;
    static int[] dx = { 0, 0, 0, 0, -1, 1 };
    static int[] dy = { 0, -1, 0, 1, 0, 0 };
    static int[] dz = { -1, 0, 1, 0, 0, 0 };
    static Queue<int[]> queue = new LinkedList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map = new int[H][N][M];
        visited = new boolean[H][N][M];
        cnt = 0;
        result = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());
                    if (map[i][j][k] == 0) {
                        cnt++; // 익지않은토마토 갯수++
                    }
                }
            }
        }

        if (cnt == 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < M; k++) {
                        if (map[i][j][k] == 1) {
                            queue.offer(new int[] { i, j, k });
                            visited[i][j][k] = true;
                        }
                    }
                }
            }
            bfs();

            if (cnt == 0) {
                System.out.println(result - 1);
            } else {
                System.out.println(-1);
            }

        }

    }

    static void bfs() {
        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            for (int l = 0; l < dx.length; l++) {
                int x = dx[l] + now[0];
                int y = dy[l] + now[1];
                int z = dz[l] + now[2];
                if (x >= 0 && y >= 0 && z >= 0 && x < H && y < N && z < M) { // 유효한 좌표면
                    if (!visited[x][y][z] && map[x][y][z] == 0) {
                        cnt--; // 익지않은토마토 갯수--
                        visited[x][y][z] = true;
                        queue.offer(new int[] { x, y, z });
                        map[x][y][z] = map[now[0]][now[1]][now[2]] + 1;
                        result = map[x][y][z];
                    }
                }
            }
        }
    }
}
