import java.util.*;
class PrintNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N to print upto n numbers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
