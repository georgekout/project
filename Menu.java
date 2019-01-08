import java.util.List;
import java.util.Scanner;

public class Menu {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Input in = new Input();
		Change ch = new Change();
		Delete del = new Delete();
		Output out = new Output();
		int answer = -1;
		do{
			System.out.println("--Database Menu--");
			System.out.println("Choose one of the following actions: ");
			System.out.println("1.Create database.");
			System.out.println("2.Input more data.");
			System.out.println("3.Change data in pre-existing database.");
			System.out.println("4.Delete data from pre-existing database.");
			System.out.println("5.View Data.");
			System.out.println("6.Exit.");
			answer = sc.nextInt();

			if(answer == 1){
				in.categoryInput();
			} else if(answer == 2){
				in.dataInput();
			} else if(answer == 3 ){
				ch.ChanEl(in.outerList);
			} else if(answer == 4){
				del.deleteEl(in.outerList);
			} else if(answer == 5){
				out.printDatabase(in.outerList);
			} else if(answer == 6){
				break;
			} else {
				System.out.println("The option you selected does not exist. Please choose a valid option.");
			}
			System.out.println("");

		} while(answer != 6);
	}
}
