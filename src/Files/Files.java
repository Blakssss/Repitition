package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Files {
  File file = new File("Testing.txt");

  //WRITING A FILE
void run() throws FileNotFoundException {
  try {
    PrintStream fileOutput = new PrintStream(file);
    fileOutput.println("Testing all day");
    fileOutput.println("Testing next day as well.");
  }catch (IOException e){
    System.out.println("wtf happened");
    e.printStackTrace();
  }
}
  //READING A FILE
void run2() throws FileNotFoundException {
  try {
    Scanner input = new Scanner(file);
    while (input.hasNextLine()) {
      System.out.println(input.nextLine());
    }
  } catch (FileNotFoundException e){
    System.out.println("WTF");
    e.printStackTrace();
  }
}

  public static void main(String[] args) throws FileNotFoundException {
    Files files = new Files();
    files.run();
    files.run2();
  }
}
