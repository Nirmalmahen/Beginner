import java.util.*;
class No{
public static void main(String args[]){
int input;
Scanner in=new Scanner(System.in);
input=in.nextInt();
if(input<0)
System.out.println("Negative");
else if(input>0)
System.out.println("Positive");
else
System.out.println("Zero");
}
}