import java.util.*;
public class Repeated {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter the no of registration:");
int n=in.nextInt();
int arr[]=new int[n];
System.out.println("Enter the array:");
int i=0;
for(i=0;i<n;i++)
	arr[i]=in.nextInt();
int count=0;
Set<Integer> o=new TreeSet<Integer>();
for(i=0;i<arr.length;i++){
	count=0;
	for(int j=0;j<arr.length;j++){
		if(arr[i]==arr[j])
			count++;
		if(count>=2)
		o.add(arr[i]);	
	}
}
System.out.println(o);
	}

}
