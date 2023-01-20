import java.util.Scanner;
public class CountWords
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String words = in.nextLine();
        int count = 1;
        for(int i=0; i<words.length();i++)
        {
            char ch = words.charAt(i);
            if(ch == ' ')
            {
                count += 1;
            }
        }
        System.out.println(String.format("There are %o words in the string",count));

    }
}
