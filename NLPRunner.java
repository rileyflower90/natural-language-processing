import java.util.ArrayList;
import java.util.Scanner;

public class NLPRunner {
  public static void main(String[] args) {

    // Instantiate a MyNLP object ("student-developed class")
  

        Scanner input = new Scanner(System.in);

    System.out.println("Ask your user your question here");
    String userInput = input.nextLine();

    // TODO: add logic based on the user input

  MyNLP nlp = new MyNLP(userInput, "text-file.txt");

    
    nlp.printSummary();
    
  }
}
