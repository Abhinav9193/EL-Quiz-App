import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctOption;

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class QuizzApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"Venus", "Mars", "Jupiter", "Mercury"}, 2));
        questions.add(new Question(
                "What is the capital city of Australia?",
                new String[]{"Sydney", "Canberra", "Melbourne", "Perth"}, 2));
        questions.add(new Question(
                "Which data type is used to store true/false values in Java?",
                new String[]{"String", "int", "boolean", "char"}, 3));
        questions.add(new Question(
                "Who invented the telephone?",
                new String[]{"Alexander Graham Bell", "Thomas Edison", "Nikola Tesla", "James Watt"}, 1));
        questions.add(new Question(
                "Which gas do plants absorb during photosynthesis?",
                new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, 2));

        int score = 0;

        System.out.println("===== Welcome to the Online Quiz App =====\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println((i + 1) + ". " + q.questionText);

            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ") " + q.options[j]);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == q.correctOption) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.options[q.correctOption - 1] + "\n");
            }
        }

        System.out.println("===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + questions.size());
        sc.close();
    }
}
