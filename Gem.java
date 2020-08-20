import java.util.Scanner;
import java.io.File;  
import java.util.Random;
import java.io.FileNotFoundException;



public class Gem {
   
    int[] pile1;
    int[] pile2;

    public int average(int[] list){
        
        int average = 0;
        for(int i = 0; i < list.length; i++){
            average += list[i];
        }
        return average;
    }

    public void sum(int gem, int[] list){
       
    }
       
        
    public static void main(String[] args){
        int gem;
        int[] gemList;
        Gem sort = new Gem();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input type : 1 - manual entry, 2 - file based");
        int input = sc.nextInt();
        
        if(input == 1){
            System.out.println("Enter the number of gems");
            gem = sc.nextInt();
            gemList = new int[gem];
            for(int i = 0; i < gem; i++){
                gemList[i] =random.nextInt(50000);
            }
            System.out.println(sort.average(gemList));
            //findSum(gem,gemList);
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
                sort.average(gemList); 
            } catch (FileNotFoundException e){
                System.out.println("Couldn't find file");
            }
        }
        //Gem sort = new Gem();
        //sort.average(gemList);
    }    
}
