public class Menu{

	public static void main(String[] args){
		Input input = new Input();
		input.categoryInput();
		Change change = new Change();
		Change.ChanEl(input.outerList);

		 for (int i = 0; i < input.outerList.size() ;i++) {
		            System.out.println(input.outerList.get(i));
        }
	}
}