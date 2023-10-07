import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {
    static int[] visited;
    static ArrayList<Integer>[] map;
    static int N, M, K, X;
    static boolean isTrue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        map = new ArrayList[N + 1];
        visited = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            map[s].add(e);
        }

        bfs(X);
        if (isTrue) {
            for (int i = 1; i < N + 1; i++) {
                if ((visited[i] - 1) == K) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println(-1);
        }

    }

    static void bfs(int s) {
        visited[s]++;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i : map[now]) {
                if (visited[i] == 0) {
                    visited[i] = visited[now] + 1;
                    if ((visited[i] - 1) == K) {
                        isTrue = true;
                    }
                    queue.offer(i);
                }
            }
        }
    }
}