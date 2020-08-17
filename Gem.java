import java.util.Scanner;
import java.io.File;  
import java.util.Random;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Gem {
   
    ArrayList pile1 = new ArrayList<Integer>();
    ArrayList pile2 = new ArrayList<Integer>();
    
    public static int findSum(int num, int[] list){
    
        return 0; 
    }
     
    public static void main(String[] args){
        int gem;
        int[] gemList;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input type : 1 - manual entry, 2 - file based");
        int input = sc.nextInt();
        if(input == 1){
            System.out.println("Enter the number of gems");
            gem = sc.nextInt();
            gemList = new int[gem];
            for(int i = 0; i < gem; i++){
                gemList[i] = random.nextInt(50000);
            }
            findSum(gem,gemList);
        }
        if(input == 2){
            System.out.println("Enter name of file");
            String filename = sc.nextLine();
            try{
                File myFile = new File(filename);
                Scanner reader = new Scanner(myFile);
                gem = reader.nextInt();
                gemList = new int[gem];
                for(int i = 0; i < gem;i++){
                    gemList[i] = reader.nextInt();
                } 
            } catch (FileNotFoundException e){
                System.out.println("Couldn't find file");
            }
        }
    }    
}
