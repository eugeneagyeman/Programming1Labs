/* FlashCard is an object that stores a question and answer in an instance of this object.
A template for a flashcard
*/
public class FlashCard {
    /*Declaring instance variables.
    A FlashCard should have a question and its corresponding answer.
    */
    private String question;
    private String answer;

    //Building a Flashcard Object by taking the properties in the parameters
    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    /* Getter Methods */

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
