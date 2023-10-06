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
    static ArrayList<Integer>[] map;
    static boolean[] visited;
    static int N, E, count; // 노드,엣지,바이러스 걸린 컴퓨터 수

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());
        map = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i < N + 1; i++) {
            map[i] = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            map[s].add(e);
            map[e].add(s);
        }
        bfs(1);
        System.out.println(count);
    }

    static void bfs(int idx) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(idx);
        visited[idx] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i : map[now]) {
                if (!visited[i]) {
                    count++;
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}