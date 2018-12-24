import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Change{

    public static void ChanEl(List<List<Object>>outerList){
		System.out.printf("\n Press 1, in order to change column name. \n Press 2, in order to change an element.");
		Scanner answer = new Scanner(System.in);
		int whatTochange = answer.nextInt();

		if(whatTochange == 1) {
			System.out.printf("\n Give the name of the column that you want to change:");
			Scanner col = new Scanner(System.in);
			Object column = col.next();
			int found = Change.searchColumn(outerList,column);

			if(found != -1){
				System.out.printf("\n Insert new name for column %p",column);
				Scanner newName = new Scanner(System.in);
				Object nColName = newName.next();
				outerList.get(found).set(0,nColName);
			} else {
				System.out.printf("\n The Column you want to change does not exist. \n");
			}

		} else if(whatTochange == 2) {
			System.out.printf("\n Please insert the name of the column that contains the element you want to change:");
			Scanner col = new Scanner(System.in);
			Object column = col.next();
			int columnFound = Change.searchColumn(outerList,column);

			if (columnFound != -1){
				System.out.printf("\n Please insert the element you want to change:");
				Scanner el = new Scanner(System.in);
				Object element = el.next();
				int searchEl = Change.searchElement(outerList, element, columnFound);

				if(searchEl != -1){
					System.out.printf("Please insert new Object:");
					Scanner newEl = new Scanner(System.in);
					Object newElement = newEl.next();
					outerList.get(columnFound).set(searchEl,newElement);


				} else {
					System.out.printf("\n The element you inserted does not exist in the database. Please try again.\n");
				}

			}else {
				System.out.printf("\n The column name you inserted does not exist in the Database.\n");
			}
		}
}

public static int searchColumn(List<List<Object>>outerList,Object Elsearched){
	int i = 0;
	Boolean flag = false;

	do{
			if(outerList.get(0).get(i) == Elsearched ){
				flag = true;
			} else{
				i++;
			}

	}while(i < outerList.size() && flag == false);

	if(flag == false){
		i = -1;
	}
	return i;
}

public static int searchElement(List<List<Object>>outerList,Object Elsearched, int col){
	int i = 0;
	Boolean flag = false;
	int elFound = -1;

	do{
		if(outerList.get(i).get(col) == Elsearched){
			elFound = i;
			flag = true;
		} else {
			i++;
		}
		}while(flag == false && i < outerList.size());

		return elFound;
}

}
