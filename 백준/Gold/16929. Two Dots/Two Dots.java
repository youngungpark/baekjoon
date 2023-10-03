import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {
    static char[][] map;
    static int N, M;
    static int[] dx = { 1, 0, 0, -1 };
    static int[] dy = { 0, 1, -1, 0 };
    static boolean[][] visited;
    static boolean result = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited = new boolean[N][M];
                dfs(i, j, i, j, 1);

            }
        }

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static void dfs(int si, int sj, int i, int j, int depth) {
        visited[i][j] = true;
        int color = map[i][j];

        for (int k = 0; k < dx.length; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >= 0 && y >= 0 && x < N && y < M && color == map[x][y]) {
                if (!visited[x][y]) {

                    dfs(si, sj, x, y, depth + 1);
                } else {
                    if (si == x && sj == y && depth >= 4) {
                        result = true;
                    }
                }
            }
        }

    }
}