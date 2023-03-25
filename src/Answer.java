import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Answer {
    private ArrayList<String> unfilteredAnswer = new ArrayList<>();
    private ReadFile answerFile;
    private String commaSeparated;
    private ArrayList<String> elements;
    private ArrayList<String> filteredAnswer = new ArrayList<>();
    private static ArrayList<String> correctAns = new ArrayList<>();
    private List<List<String>> data;

    public void getAnswers() {
        answerFile = new ReadFile();
        data = answerFile.getData();
        // All answers (with regex)
        for (int i = 1; i < data.size(); i++ ){
            unfilteredAnswer.add(data.get(i).get(1));
        }
        // Correct answer
        for(int i = 1; i < data.size(); i++){
            correctAns.add(data.get(i).get(2));
        }
//        for(int i = 0; i < unfilteredAnswer.size(); i++){
//            System.out.println(unfilteredAnswer.get(i));
//        }
    }


    public ArrayList<String> separateByRegex() {
        for (int i = 0; i < unfilteredAnswer.size(); i++) {
                commaSeparated = unfilteredAnswer.get(i);
                //elements = Stream.of(commaSeparated.split(",")).map(String::trim).toList();
                elements = new ArrayList<>(Arrays.asList(commaSeparated.split(" - ")));
                filteredAnswer.addAll(elements);
        }
        return filteredAnswer;
    }
//    public static void getCorrAnswer(){
//        ReadFile corrFile = new ReadFile("C:\\Users\\ADMIN\\Desktop\\correctAnswer.txt");
//        correctAns = corrFile.getData();
//    }


    public void checkAns(String input,int qNum){
        if(input.equals(correctAns.get(qNum))){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }

//    public static void main(String[] args) {
//        Answer ans = new Answer();
//        ans.getAnswers();
//        ArrayList<String> test = new ArrayList<>();
//        test = ans.separateByRegex();
//    }
}


