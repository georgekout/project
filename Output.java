import java.util.List;
import java.util.Scanner;

/* The class which prints the database by choosing all the database , a line or a column.*/
public class Output {

    /* The main method of this class which asks the user what he/she wants to do */
    public static void printDatabase(List<List<Object>> outerList) {
        System.out.print("\n Press 1, in order to see all the elements"
                + " that the database contains. \n "
                + "Press 2, in order to see a specific line.  \n "
                + "Press 3 in order to see a column.");
        Scanner answer = new Scanner(System.in);
        int whatToShow = answer.nextInt();

        if (whatToShow == 1) {
            for (int i = 0; i < outerList.size(); i++) {
				System.out.println(outerList.get(i));
        	}
        } else if (whatToShow == 2) {
            System.out.println("Please insert an element of the line "
                    + "you would like to be shown: ");
            Scanner answer1 = new Scanner(System.in);
            Object linEl = answer1.next();
            System.out.println("Please insert the column "
                    + "that contains that element: ");
            Scanner answer2 = new Scanner(System.in);
            Object linCol = answer2.next();
            int found = Change.searchColumn(outerList, linCol);

            if (found != -1) {
				int foundLine = Change.searchElement(outerList, linEl, found);
				if (foundLine != -1) {
					for (int z = 0; z < outerList.get(0).size(); z++) {
						System.out.print(outerList.get(foundLine).get(z));
						System.out.print(" ");
					}
					System.out.println();
				} else {
					System.out.println("The element you inserted "
                            + "does not exist in the database.");
				}
			} else {
				System.out.println("The column you inserted "
                        + "does not exist in the database.");
			}

        } else if (whatToShow == 3) {
            System.out.print("\n Please insert the name of the "
                    + "column you would like to see:");
            Scanner col = new Scanner(System.in);
            Object column = col.next();
            int columnFound = Change.searchColumn(outerList, column);

            if (columnFound != -1) {
				for (int i = 0; i < outerList.size(); i++) {
					if (outerList.get(i).get(columnFound) == null) {
						break;
					} else {
						System.out.println(outerList.get(i).get(columnFound));
					}
				}
			} else {
           	 	System.out.print("\n The column you inserted "
                        + "does not exist in the database.");
            }
        } else {
            System.out.println("\n The option you selected does not exist."
                    + " Please try again. \n");
        }
    }
}
