public class Main {
	
	static int[][] numbers = new int[9][9];	//Array f�r die Zahlen im Sudoku.
	static int[][] numbersSolution = new int[9][9];
	static int[][] numbersRemoved = new int[9][9];
	
	static int count = 0;
	
	static boolean repeatLines = true;		//M�ssen die Zeilen wiederholt werden?
	static boolean repeatColumns = true;	//M�ssen die Spalten wiederholt werden?
	
	
	
	public static void GenerateSudoku()		//Diese Funktion generiert das Sudoku.
	{
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				numbers[x][y] = 0;
				numbersSolution[x][y] = 0;
				numbersRemoved[x][y] = 0;
			}
			
		}
		repeatLines = true;
		repeatColumns = true;
		while (repeatLines || repeatColumns) {	//while-Schleife, die so lange l�uft, bis ein Sudoku fertig ist.
			GenerateGrid.GenerateSquare(numbers);		//Die 9 Zahlen in jedem Quadrat werden angelegt.
			count++;
			repeatLines = false;
			repeatColumns = false;
			
			for (int ii = 0; ii < 20; ii++)
			{
				for (int j = 0; j < 9; j++)
				{
					ChangeNumbers.ChangeNumbersColumn(j);
				}
				
				for (int j = 0; j < 9; j++)
				{
					ChangeNumbers.ChangeNumbersLine(j);
				}
			}			//Die Zeilen und Spalten werden berichtigt.
			
			CheckGrid.ProofLine(numbers);		//Zeilen werden gepr�ft.
			CheckGrid.ProofColumn(numbers);	//Spalten werden gepr�ft.
			
			for (int i = 0; i < 9; i++)
			{
				if (CheckGrid.ColumnBools[i] == false)
				{
					repeatColumns = true;
				}
			}		//repeatColumns = true, wenn auch nur eine Spalte nicht richtig ist. Die while-Schleife wird wiederholt.
			
			for (int i = 0; i < 9; i++)
			{
				if (CheckGrid.LineBools[i] == false)
				{
					repeatLines = true;
				}
			}		//repeatLines = true, wenn auch nur eine Zeile nicht richtig ist. Die while-Schleife wird wiederholt.
			
		}
		CheckGrid.ProofLine(numbers);
		CheckGrid.ProofColumn(numbers);	//Zeilen und Spalten werden nochmals gepr�ft.
	}
}
