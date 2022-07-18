import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class mainDriver {

public static void main(String args[]) throws IOException{

double numOfWheels;
double weight;
File cycle = new File("Cycle.txt");
Scanner input = new Scanner(System.in);
 	if (!cycle.exists()){
      System.out.println("This file does not exist in the database");
}
System.out.println("Enter Number of Wheels on your Cycle:");
numOfWheels = input.nextDouble();

System.out.println("Enter Weight of your Cycle :");
weight = input.nextDouble();

Cycleer newBike = new Cycleer(numOfWheels,weight);
  PrintWriter displayer = new PrintWriter(cycle);
  displayer.println(newBike.toString());
  displayer.close();
} 
}