public class Gem {
  
  int gem;
    
  
  
  
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input type : 1 - manual entry, 2 - name of file");
    int input = sc.nextInt();
    if(input == 1){
      System.out.println("Enter the number of gems");
      gem = sc.nextInt();    
    }
  }
}
