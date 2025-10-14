/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java . util . *;
public class Main
{
	public static void main(String[] args) {
		String str = "abcdef";
		HashSet<String> set = new HashSet<>();
		for(int i = 0;i<str.length();i++)
		{
		    for(int j = i;j<str.length();j++)
		    {
		        String s = str.substring(i , j + 1);
		        if(set.contains(s)==false){
		            System.out.print(s + " ");
		            set.add(s);
		        }
		    }
		}
	}
}
