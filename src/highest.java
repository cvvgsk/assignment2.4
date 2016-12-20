import java.util.Scanner;

public class highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("enter the value a");
int a=sc.nextInt();
System.out.println("enter the value b");
int b=sc.nextInt();
System.out.println("enter the value c");
int c=sc.nextInt();
if(a>b){
	System.out.println(" a is greater");
}
else
if(c>b)
{
	System.out.println("c is greater");
	}

else{
	System.out.println("b is greater");
}

	}

}
