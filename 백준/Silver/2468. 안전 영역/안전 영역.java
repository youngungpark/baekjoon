import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static int[][] map;
    static int N;
    static boolean isSafe = false;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        int max_height = 0; // 최대 높이 변수 추가
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max_height = Math.max(max_height, map[i][j]); // 최대 높이 갱신
            }
        }

        int result = 0;

        for (int k = 0; k < max_height; k++) { // k의 범위 수정
            visited = new boolean[N][N]; // 비가 0부터 내리므로 방문배열 초기화
            int temp = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && map[i][j] > k) {
                        isSafe = true;
                        temp++;
                        bfs(i, j, k);
                    }
                }
            }
            result = Math.max(temp, result);
        }

        if (isSafe) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }

    static void bfs(int i, int j, int condition) {
        Queue<int[]> queue = new LinkedList();
        queue.offer(new int[] { i, j });
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < dx.length; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < N) {
                    if (!visited[x][y] && map[x][y] > condition) {
                        visited[x][y] = true;
                        queue.offer(new int[] { x, y });
                    }
                }
            }
        }
    }
}
