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
    static int F, S, G, U, D;
    static int[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        map = new int[F + 1];
        visited = new boolean[F + 1];

        bfs(S);

        if (S == G) {
            System.out.print(0);
        } else if (map[G] == 0) {
            System.out.println("use the stairs");
        } else {
            System.out.println(map[G]);
        }

    }

    static void bfs(int idx) {
        visited[idx] = true; // 초기 방문 표시
        Queue<int[]> queue = new LinkedList();

        queue.offer(new int[] { idx });
        while (!queue.isEmpty()) {
            int now[] = queue.poll();

            int x = now[0] + U;
            int y = now[0] - D;
            if (x <= F && !visited[x]) {

                visited[x] = true;
                map[x] = map[now[0]] + 1;
                queue.offer(new int[] { x });
            }

            if (y > 0 && !visited[y]) {
                visited[y] = true;
                map[y] = map[now[0]] + 1;
                queue.offer(new int[] { y });
            }

        }
    }
}