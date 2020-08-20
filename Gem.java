import java.util.Scanner;
import java.io.File;  
import java.util.Random;
import java.io.FileNotFoundException;



public class Gem {
   
    int[] pile1;
    int[] pile2;

    public int halfAverage(int[] list){
        
        int average = 0;
        for(int i = 0; i < list.length; i++){
            average += list[i];
        }
        return average / list.length;
    }

    public int[] dividefirsthalf(int gem, int[] list){  
       pile1 = new int[gem];
       //pile2 = new int[gem];
       for(int i = 0; i < list.length / 2; i++){
                if(list[i] != 0){
                    pile1[i] = list[i];
                }
                else{
                    continue;
                }      
       }
       /*for(int z = list.length / 2; z < list.length; z++){
            for(int m = 0; m < gem; m++){
                pile2[m] = list[z];
            }
       }*/
        return pile1;
    }

    public int[] divideSecondHalf(int gem, int[] list){
        pile2 = new int[gem / 2];
        for(int i = 0; i < list.length; i++){
            pile2[i] 
        }
        return pile2;
    }

    public void toString(int[] list){
        for(int i = 0; i < list.length;i++){
            System.out.print(" " + list[i] + " ");
        }
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
            System.out.println(sort.halfAverage(gemList));
            sort.toString(sort.dividefirsthalf(gem,gemList));
            sort.toString(sort.divideSecondHalf(gem,gemList)); 
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
                sort.halfAverage(gemList); 
            } catch (FileNotFoundException e){
                System.out.println("Couldn't find file");
            }
        }
    }    
}
