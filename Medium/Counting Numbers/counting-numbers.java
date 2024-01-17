import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int test_case = 0; test_case < t; test_case++) {
            int N = scanner.nextInt();
            if (N > 45) {
                System.out.println(0);
                continue;
            }

            // N is the total sum and the digits can be 5
            long[][] dp = new long[46][6];
            dp[0][0] = 1;

            for (int i = 0; i <= N; i++) {
                for (int j = 1; j <= 5; j++) {
                    for (int dig = 0; dig < 10; dig++) {
                        int s = i - dig;
                        if (s >= 0) {
                            dp[i][j] += dp[s][j - 1];
                        }
                    }
                }
            }

            System.out.println(dp[N][5]);
        }
    }
}
