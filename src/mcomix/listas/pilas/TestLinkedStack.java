package mcomix.listas.pilas;

import java.io.*;

public class TestLinkedStack {

  public static void main(String args[]) {
	String file = "C:/Users/Becario/Documents/ws_programas2015/Estructuras/src/input.txt";
    FileReader f = null; // to read files
    BufferedReader reader = null; // reading buffer
    String line = null; // read lines
    LinkedStack stack = new LinkedStack(); // initialization

    if (args.length < 1) {
      System.err.println("Please invoke the program like this:");
      System.err.println("\tLinkedStack file");
    }

    // opens the file
    try {
      f = new FileReader(file);
      reader = new BufferedReader(f);
      while ((line = reader.readLine()) != null)
        stack.push(line);
    } catch (Exception e) {
      System.err.println("File not found " + args[0]);
      return;
    }

    // Gets the strings from the stack and prints them
    while ((line = (String) stack.pop()) != null) {
      System.out.println(line);
    }
  }

}
