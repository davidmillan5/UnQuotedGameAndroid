public class Question {
    //The correct Answer
    int correctAnswer;

    //Players Answer
    int playerAnswer;

    //Identifier
    int imageId;

    String questionText;
    String answerZero;
    String answerOne ;
    String answerTwo ;
    String answerThree;


    //Constructors


    public Question(int correctAnswer, int playerAnswer, int imageId, String questionText, String answerZero, String answerOne, String answerTwo, String answerThree) {
        this.correctAnswer = correctAnswer;
        this.playerAnswer = -1;
        this.imageId = imageId;
        this.questionText = questionText;
        this.answerZero = answerZero;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
    }
}
