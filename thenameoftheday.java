import java.util.Scanner;
public class thenameoftheday {
	public static void main(String[] args){
		int daynumber;
		Scanner enter = new Scanner(System.in);
		System.out.println("Plese enter the number of the week day:");
		daynumber = enter.nextInt();

		if (daynumber >0 && daynumber<8) 
		{

		switch(daynumber){
			case 1:
				System.out.println("Today is Monday");
				break;
			case 2:
				System.out.println("Today is Tuesday");
				break;
			case 3:
				System.out.println("Today is Wednesday");
                                break;
			case 4:
				System.out.println("Today is Thursday");
                                break;
			case 5:
				System.out.println("Today is Friday");
                                break;
			case 6:
				System.out.println("Today is Saturday");
                                break;
			case 7:
				System.out.println("Today is Sunday");
                                break;
		}}
		else {
			System.out.println("Please enter anumber between 1 - 7 ");
		}
	}
                                
}
