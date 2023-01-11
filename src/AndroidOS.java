public class AndroidOS {
    public AndroidOS() {
        System.out.println("AndroidOS Booting Up...");
    }

    public void runQuizApp() {
        // Create three questions here
        Question question1 = new Question(921238, "How tall is the Eiffel tower?",
                "1024 ft","1063 ft","1124 ft","1163 ft",1);
        System.out.println("Question 1: " + question1.questionText);
        System.out.println("The Answer is, " + question1.answer1);
        question1.playerAnswer = 1;
        System.out.println("The player choose: " + question1.playerAnswer);
    }

    public static void main(String[] args) {
        System.out.println("Starting: AndroidOS");
        AndroidOS androidOS = new AndroidOS();
        androidOS.runQuizApp();
    }
}
