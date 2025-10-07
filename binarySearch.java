/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int arr[] = {-1,1,2,3,4,5,6,7,8,9,10};
	    int l = 0;
	    int h = arr.length - 1;
	    int t = 14;
	    while(l<=h)
	    {
	        int mid = (l + h)/2;
	        if(arr[mid]==t){
	            System.out.print("got " + t);
	            break;
	        }else if(arr[mid]<t){
	            l = mid + 1;
	        }else{
	            h = mid - 1;
	        }
	    }
	}
}
