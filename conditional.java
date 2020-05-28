import java.util.Scanner;
public class conditional {
	
	public static void main(String[] args){
		double base = 1.7;
		int temp = 0;
		double population =0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please ente the current Temputare");
		temp = keyboard.nextInt();

		population = temp > 45 ? base*10 : base*2;
		 System.out.println("Population is in current area is " + population);
	}}
