package assignment1;
import java.util.Scanner;

public class student {
    Scanner s = new Scanner(System.in);
    int n;
    int[][] scores;
    int[] avg;

    void input() {
        n = s.nextInt();
        scores = new int[n][5];
        avg = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                scores[i][j] = s.nextInt();
            }
        }
    }

    void TotalScores() {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += scores[i][j];
            }
            avg[i] = sum / 5;
        }
    }

    public static void main(String[] args) {
        student t = new student();
        t.input();
        t.TotalScores();

        int count = 0;
        for (int i = 1; i < t.n; i++) {
            if (t.avg[0] > t.avg[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
