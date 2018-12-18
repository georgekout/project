package java_programming_2.DataBase;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Change{

    public void ChanEl(ArrayList<List<Object>>outerList){
	System.out.print("Give column name that contains the element you want to change: \n");
	Scanner col = new Scanner(System.in);
	col.next();
	System.out.print("What element do you want to change? \n");
	Scanner el = new Scanner(System.in);
	el.next();
	if(Change.searchColumn(outerList,col) != -1){

	}


}

public static int searchColumn(ArrayList<List<Object>>outerList,Object Elsearched){
	int i = 0;
	Boolean flag = false;
    int eleFound;

	do{
			if(outerList.get(0).get(i) == Elsearched ){
				eleFound = i;
				flag = true;
			} else{
				i++;
			}

	}while(i < outerList.size() && flag == false);
	if(flag == false){
		System.out.println("Column doesn't exist");
		eleFound = -1;
	}
	return i;
}

}