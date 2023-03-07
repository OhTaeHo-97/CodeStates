import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
    static int N;

    static void input() {
        Reader scanner = new Reader();

        N = scanner.nextInt();
    }

    static void solution() {
        StringBuilder sb = new StringBuilder();
        for(int row = 0; row < N; row++) {
            for(int blank = 0; blank < row; blank++)
                sb.append(' ');

            for(int star = 0; star < N - row; star++)
                sb.append('*');

            sb.append('\n');
        }

        System.out.print(sb);
    }

    public static void main(String[] args) {
        input();
        solution();
    }

    static class Reader {
        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
