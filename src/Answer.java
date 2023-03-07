import java.util.ArrayList;
import java.util.Arrays;


public class Answer {
    private ArrayList<String> unfilteredAnswer;
    private ReadFile answerFile;
    private String commaSeparated;
    private ArrayList<String> elements;
    private ArrayList<String> filteredAnswer = new ArrayList<String>();
    private static ArrayList<String> correctAns = new ArrayList<String>();

    public void getFile() {
        answerFile = new ReadFile("C:\\Users\\ADMIN\\Desktop\\answer.txt");
        this.unfilteredAnswer = answerFile.getData();
    }

    public ArrayList<String> separateByComma() {
        for (int i = 0; i < unfilteredAnswer.size(); i++) {
                commaSeparated = unfilteredAnswer.get(i);
                //elements = Stream.of(commaSeparated.split(",")).map(String::trim).toList();
                elements = new ArrayList<>(Arrays.asList(commaSeparated.split(", ")));
                filteredAnswer.addAll(elements);
        }
        return filteredAnswer;
    }
    public static void getCorrAnswer(){
        ReadFile corrFile = new ReadFile("C:\\Users\\ADMIN\\Desktop\\correctAnswer.txt");
        correctAns = corrFile.getData();
    }

    public void checkAns(String input,int qNum){
        if(input.equals(correctAns.get(qNum))){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}


