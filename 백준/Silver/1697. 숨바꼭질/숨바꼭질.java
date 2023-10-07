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
    static int[] visited;
    static int[] map;
    static int[] dx = { -1, 1, 2 };
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[200000];
        visited = new int[200000];
        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }

    }

    static void bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s]++;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            if (K == now) {
                System.out.println(visited[K] - 1);

            }
            for (int j = 0; j < dx.length; j++) {
                int x = 0;
                if (j < 2) {
                    x = now + dx[j];
                } else {
                    x = now * dx[j];
                }
                if (x >= 0 && x < 100001 && visited[x] == 0) {
                    queue.offer(x);
                    visited[x] = visited[now] + 1;

                }
            }
        }
    }
}