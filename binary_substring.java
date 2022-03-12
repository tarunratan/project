//import scanner
import java.util.Scanner;
public class binary_substring 
{

    //function to find all substrings of a given string
    public static void findSubstrings(String str)
    {int count=0;
        int result=0;
        //length of the string
        int n = str.length();
        //traverse through all possible substrings
        for(int i=1; i<=n; i++)
        {
            //traverse through all possible combinations
            for(int j=0; j<=n-i; j++)
            {
                count++;
                //print the substring
                System.out.println(str.substring(j, j+i));
                String store=str.substring(j, j+i);
                result+=Integer.parseInt(store);
            }
        }
        System.out.println("Total number of substrings: "+count+"\n"+"Total sum of substrings: "+result);
    }
   

    //main method
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        findSubstrings(a);
    }

    
}
