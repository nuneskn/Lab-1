import java.util.Scanner;
import java.io.File;  
import java.util.Random;



public class Gem {
  
  int gem = 0;
  int[gem] gemList;
  Random random = new Random();
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input type : 1 - manual entry, 2 - name of file");
    int input = sc.nextInt();
    if(input == 1){
      System.out.println("Enter the number of gems");
      gem = sc.nextInt();    
      for(int i = 0; i < gem; i++){
          gem[i] = random.nextInt(50000);
      }
    }
    else if(input == 2){
      System.out.println("Enter name of the file");
      String filename = sc.nextLine();
      File myFile = new File(filename);
      Scanner reader = new Scanner(myFile);
      gem = reader.nextInt();
      while(reader.hasNext()){
        for(int i = 0; i < gem; i++){
          gem[i] = reader.nextInt();
        }
      }
    }
  }
}
