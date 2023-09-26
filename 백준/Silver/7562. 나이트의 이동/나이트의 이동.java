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
    static int l, t, si, sj, ei, ej; // 왼쪽부터 체스판 변의크기,테스트케이스 수 , 시작점 i,j , 도착점 i,j
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = { -1, -2, -2, -1, 1, 2, 2, 1 };
    static int[] dy = { -2, -1, 1, 2, -2, -1, 1, 2 };
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int T = 0; T < t; T++) {
            l = Integer.parseInt(br.readLine()); // 체스판 한 변의 크기
            map = new int[l][l];
            visited = new boolean[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine());
            si = Integer.parseInt(st.nextToken());
            sj = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            ei = Integer.parseInt(st.nextToken());
            ej = Integer.parseInt(st.nextToken());

            dfs(si, sj);

            sb.append(map[ei][ej] + "\n");

        }
        System.out.println(sb);
    }

    static void dfs(int i, int j) {
        visited[i][j] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { i, j });
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < dx.length; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < l && y < l) {
                    if (!visited[x][y]) {
                        visited[x][y] = true;
                        map[x][y] = map[now[0]][now[1]] + 1;
                        queue.offer(new int[] { x, y });
                    }
                }
            }
        }
    }
}
