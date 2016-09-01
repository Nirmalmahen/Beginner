import java.util.*;
public class Decreasing {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter size of array:");
int n=in.nextInt();
int arr[]=new int[n];
int arr1[]=new int[n];
int i=0;
for(i=0;i<arr.length;i++)
	arr[i]=in.nextInt();
Arrays.sort(arr);
i=0;
for(int j=arr.length-1;j>=0;j--){
	arr1[i]=arr[j];
	System.out.print(arr1[i]+" ");
	i++;
}
	}
}