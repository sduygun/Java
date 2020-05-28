import java.util.Random;
import java.util.Scanner;
public class rndm
{
	public static void main(String[] args){
		int rnumber, range = 0;
		
		Random random = new Random();
		Scanner enter = new Scanner(System.in);
		System.out.println("Please Enter a Range for Random numbers");
		range = enter.nextInt();
		rnumber = random.nextInt(range);
		System.out.println("The random number is " + rnumber);
	}}	
		

