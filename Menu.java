public class Menu{

	public static void main(String[] args){
		Input input = new Input();
		input.categoryInput();
		Change change = new Change();
		Change.ChanEl(input.outerList);
		Output output = new Output();
		Output.printDatabase(input.outerList);
	}
}
