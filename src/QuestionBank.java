import java.util.ArrayList;

public class QuestionBank {
    private ArrayList<String> questions;
    private ReadFile questionFile;

    void getQuestions(){
        questionFile = new ReadFile("C:\\Users\\ADMIN\\Desktop\\question.txt");
        this.questions = questionFile.getData();
    }
    public ArrayList<String> getArray(){
        return questions;
    }

    public void displayQuestions(int index){
        System.out.println();
        System.out.println("QUESTION " + (index+1));
        System.out.println(this.questions.get(index));
    }

}
