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
    static int N;
    static int[] visited;
    static ArrayList<Integer>[] map;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new ArrayList[N + 1];
        visited = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            map[i] = new ArrayList<>();
            visited[i] = -1;
        }
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            map[s].add(e);
            map[e].add(s);
        }

        bfs(1);
        for (int i : visited) {
            if (i > 0) {
                System.out.println(i);
            }
        }
    }

    static void bfs(int idx) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(idx);
        visited[idx]++;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i : map[now]) {
                if (visited[i] == -1) {
                    visited[i] = now;
                    queue.offer(i);
                }
            }
        }
    }
}