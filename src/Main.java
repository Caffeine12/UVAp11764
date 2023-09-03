import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        for (int i=1;i<=testCase;i++)
        {
            int wallNumber=sc.nextInt(); 
            String blank=sc.nextLine();      //blank is just for calncelling out the new line character from nextInt() method                                 
            String wallstring=sc.nextLine();
            String[] wallArr=wallstring.split("\\s");
            int[] wallIntArr=Arrays.stream(wallArr).mapToInt(Integer::parseInt).toArray();                
            
            
        }
    }
}
