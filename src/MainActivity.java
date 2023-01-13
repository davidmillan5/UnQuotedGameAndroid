public class MainActivity {

    int generateRandomNumber(int max){
        double randomNumber = Math.random();
        double calculatedNumber = max * randomNumber;
        return (int)calculatedNumber;
    }

    String getGameOverMessage(int totalCorrect, int totalQuestions) {
        if (totalCorrect == totalQuestions) {
            return "You got all " + totalQuestions + " right! You won!";
        } else{
            return "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next Time!";
        }
    }
}
