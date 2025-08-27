package workshop;
public class ResultProcessor {
        public static int calculateScore(String[] correct, String[] user) {
            int score = 0;
            for (int i = 0; i < correct.length; i++) {
                if (i < user.length && correct[i].equalsIgnoreCase(user[i])) {
                    score++;
                }
            }
            return score;
        }
        public static String getGrade(int score, int total) {
            double percent = (score * 100.0) / total;
            if (percent >= 90) return "A";
            else if (percent >= 75) return "B";
            else if (percent >= 60) return "C";
            else if (percent >= 40) return "D";
            else return "F";
        }
        public static void main(String[] args) {
            String[] correctAnswers = {"A", "B", "C", "D", "A"};
            String[][] userAnswers = {
                    {"A", "B", "C", "D", "A"},
                    {"A", "B", "D", "D", "A"},
                    {"A", "C", "C", "D", "B"},
                    {"B", "C", "D", "A", "C"}
            };
            int[] scores = new int[userAnswers.length];
            for (int i = 0; i < userAnswers.length; i++) {
                scores[i] = calculateScore(correctAnswers, userAnswers[i]);
                String grade = getGrade(scores[i], correctAnswers.length);
                System.out.println("User " + (i + 1) + " Score: " + scores[i] + " Grade: " + grade);
            }
        }
    }
