package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Files {
  //WRITING A FILE
void run() throws FileNotFoundException {
  File file = new File("Testing.txt");
  PrintStream fileOutput = new PrintStream(file);
  fileOutput.println("Testing all day");
  fileOutput.println("Testing next day as well.");
}
  //READING A FILE
void run2() throws FileNotFoundException {
  File file = new File("Testing2.txt");
  Scanner input = new Scanner(file);
  while (input.hasNext()) {
    System.out.println(input.hasNextLine());
  }
}

  public static void main(String[] args) throws FileNotFoundException {
    Files files = new Files();
    files.run();
    files.run2();
  }
}
