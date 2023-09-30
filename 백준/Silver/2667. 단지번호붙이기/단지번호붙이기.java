import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Main
 */
public class Main {
    static int N, danziSu, zipSu; // 단지 수 집의 수
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { -1, 0, 1, 0 };
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        danziSu = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == '1' && !visited[i][j]) { // 집이 있고 방문하지 않았다면
                    zipSu = 0;
                    danziSu++;
                    dfs(i, j);
                    list.add(zipSu);
                }
            }
        }
        Collections.sort(list);

        System.out.println(danziSu);

        for (int num : list) {
            System.out.println(num);
        }

    }

    static void dfs(int i, int j) {
        zipSu++;
        visited[i][j] = true;
        for (int k = 0; k < dx.length; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >= 0 && y >= 0 && x < N && y < N) {
                if (!visited[x][y] && map[x][y] == '1') {
                    visited[x][y] = true;
                    dfs(x, y);
                }
            }
        }
    }
}