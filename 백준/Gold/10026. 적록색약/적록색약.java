import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Main
 */
public class Main {
    static int[] result = new int[2];
    static char[][] map;
    static boolean[][] visited;
    static int N;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

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
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    count++;
                    bfs(i, j, false);
                }
            }
        }
        System.out.println(count);
        count = 0;
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    count++;
                    bfs(i, j, true);
                }
            }
        }
        System.out.println(count);
    }

    static void bfs(int i, int j, boolean isTrue) {
        visited[i][j] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { i, j });

        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            for (int k = 0; k < dx.length; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < N) { // 범위 체크
                    char currentColor = map[now[0]][now[1]];
                    char color = map[x][y];
                    if (isTrue) {
                        if (currentColor == 'R' || currentColor == 'G') {
                            if (color == 'R' || color == 'G') {
                                if (!visited[x][y]) {
                                    queue.offer(new int[] { x, y });
                                    visited[x][y] = true;
                                }
                            }
                        } else if (!visited[x][y] && color == currentColor) {
                            queue.offer(new int[] { x, y });
                            visited[x][y] = true;
                        }
                    } else {
                        if (!visited[x][y] && color == currentColor) {
                            queue.offer(new int[] { x, y });
                            visited[x][y] = true;
                        }
                    }

                }
            }
        }
    }
}