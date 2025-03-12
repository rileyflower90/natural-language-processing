import java.util.ArrayList;
import java.util.Scanner;

public class MyNLP {


  private String user;
  private ArrayList<String> textFile;
  private ArrayList<String> options;
  // TODO: Create 1-2 meaningful ArrayList 

  // TODO: assigned initial values for your instance variables
  public MyNLP(String userInput, String filename) {

  this.user = userInput;
  this.textFile = FileReader.toStringList(filename);
    this.options = buildOptions();
    
  }

public ArrayList<String> buildOptions(){
    ArrayList<String> userOptions = new ArrayList<String>();
    for (int i= 0; i< textFile.size(); i++){
      String temp = textFile.get(i);
      int index = temp.indexOf(":");
      temp = temp.substring(0, index-1);
      userOptions.add(temp.toLowerCase());
      // System.out.println(temp.toLowerCase());
    }
  return userOptions;
}
  
  public String comprehendInput(){

  // System.out.println(options.size());
  for (int i = 0; i< options.size(); i++){
    if (user.equals(options.get(i))){
      int temp = textFile.get(i).indexOf(": ");
      return textFile.get(i).substring(temp+2);
    }
  }
    return "Not found!";
  }

  /**
   * Javadoc example
   * @param parameter1 the first parameter
   * @return what is returned from this method
   */

  /**
   * Starts the app and gets user input
   */


  /**
   * Prints the summary of my NLP project
   */
  public void printSummary() {
    System.out.println(comprehendInput());
  }

}