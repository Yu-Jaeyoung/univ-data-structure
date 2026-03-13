package exercise;

public class ScoreAverageEnhancedFor {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }
}
