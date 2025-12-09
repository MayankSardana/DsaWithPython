import java . util . *;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {};
		quickSort(arr , 0 , arr.length - 1);
		for(int r:arr){
		    System.out.print(r + " ");
		}
	}
	
	public static void quickSort(int[] arr , int low , int high){
	    if(low>high){
	        return;
	    }
	    int point = quickSelect(arr , low , high);
	    quickSort(arr , low , point - 1);
	    quickSort(arr , point + 1 , high);
	    return;
	}
	public static int quickSelect(int[] arr , int lo , int hi){
	    int pivot = arr[hi];
	    int i = lo;
	    int j = lo;
	    while(i<=hi){
	        if(arr[i]<=pivot){
	           int temp = arr[i];
	           arr[i] = arr[j];
	           arr[j] = temp;
	           j++;
	        }
	        i++;
	    }
	    return j - 1;
	}
}
