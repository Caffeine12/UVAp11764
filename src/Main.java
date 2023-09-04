import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();

        for (int i=1;i<=testCase;i++)
        {
            int highJump=0, lowJump=0;
            int wallNumber=sc.nextInt(); 
            String blank=sc.nextLine();      //blank is just for calncelling out the new line character from previous nextInt() method                                 
            String wallstring=sc.nextLine();
            String[] wallArr=wallstring.split("\\s");
            int[] wallIntArr=Arrays.stream(wallArr).mapToInt(Integer::parseInt).toArray();
            for(int j=0;j<wallNumber-1;j++)
            {
                if(wallIntArr[j]<wallIntArr[j+1])
                {
                    highJump++;
                }
                else if(wallIntArr[j]>wallIntArr[j+1])
                {
                    lowJump++;
                }                
            }
            System.out.println("Case "+ i +": "+highJump+" "+lowJump);
        }
    }
}
