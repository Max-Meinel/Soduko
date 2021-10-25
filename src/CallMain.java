public class CallMain {
	
	/*public static void main(String[] args) {
		
		int stayedNumbers = 33;
		//int stayedNumbers = 38;
		//int stayedNumbers = 43;
		Start(stayedNumbers);	
		
		
		
	}*/
	
	static void Start(int stayedNumbers) {
		boolean repeat;
		Main.GenerateSudoku();
		PrintGrid.PrintOut(Main.numbersSolution);
		PrintGrid.PrintOut(Main.numbersRemoved);
		PrintGrid.PrintOut(Main.numbers);
		
		do {
			repeat = false;
			for (int x = 0; x < 9; x++) {
				for (int y = 0; y < 9; y++) {
					Main.numbersSolution[x][y] = Main.numbers[x][y];
				}
			}
				
			PrepareSolution.RemoveNumbers(stayedNumbers);
			for (int x = 0; x < 9; x++) {
				for (int y = 0; y < 9; y++) {
					Main.numbersRemoved[x][y] = Main.numbersSolution[x][y];
				}
			}
			
			Solver.SolveGrid();
		
			for (int x = 0; x < 9; x++) {
				for (int y = 0; y < 9; y++) {
					if (Main.numbersSolution[x][y] == 0 ) {
						repeat = true;
					}
				}
			}
		} while(repeat);
		PrintGrid.PrintOut(Main.numbersSolution);
		PrintGrid.PrintOut(Main.numbersRemoved);
	}
}
