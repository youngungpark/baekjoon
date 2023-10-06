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
    static int[][] map;
    static boolean[][] visited;
    static int piece, iceberg, year;
    static Queue<int[]> queue = new LinkedList();
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    static int[][] zeroMap;
    static boolean isTrue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        zeroMap = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] > 0) {
                    piece++; // 빙하조각 갯수 증가
                }
            }
        }

        while (piece > 0) { // 빙하가 녹을때까지 반복
            year++;
            zeroMapSet(); // 둘러싼 0 카운트
            meltingIceberg();// 빙하녹이기
            checkIceberg(); // 덩어리 갯수 체크
            if (isTrue) {
                break;
            }
        }
        if (isTrue) {
            System.out.println(year);
        } else {
            System.out.println(0);
        }
    }

    static void zeroMapSet() {
        zeroMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < dx.length; k++) {
                    int x = dx[k] + i;
                    int y = dy[k] + j;
                    if (x >= 0 && y >= 0 && x < N && y < M) {
                        if (map[x][y] == 0) {// 둘러싼 0의 갯수 카운트
                            zeroMap[i][j]++;
                        }
                    }
                }
            }
        }
        // for (int i = 0; i < N; i++) {
        // for (int j = 0; j < M; j++) {
        // System.out.print(zeroMap[i][j] + " ");
        // }
        // System.out.println();
        // }
    }

    static void meltingIceberg() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] > 0) {
                    map[i][j] = Math.max(0, map[i][j] - zeroMap[i][j]);
                    if (map[i][j] == 0) {
                        piece--;
                    }
                }
            }
        }
    }

    static void checkIceberg() {
        visited = new boolean[N][M]; // 방문 배열 초기화
        // for (int i = 0; i < N; i++) {
        // for (int j = 0; j < M; j++) {
        // System.out.print(map[i][j] + " ");
        // }
        // System.out.println();
        // }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] > 0 && !visited[i][j]) {// 빙하가 있고 방문하지 않았으면
                    count++;
                    bfs(i, j);
                }
            }
        }
        // System.out.print(count);
        if (count > 1) {
            isTrue = true;
        }
    }

    static void bfs(int i, int j) {
        visited[i][j] = true;
        queue.offer(new int[] { i, j });
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < dx.length; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (!visited[x][y] && map[x][y] > 0) {
                        visited[x][y] = true;
                        queue.offer(new int[] { x, y });
                    }
                }
            }
        }
    }
}