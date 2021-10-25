public class PrintGrid
{
	public static void PrintOut(int [][] numbers)		//Funktion, die das Ergebnis ausPrinted.
	{
		for (int y = 0; y < 9; y++)
		{
			for (int x = 0; x < 3; x++)				//For-Schleife f�r alle x- und y-Koordinaten.
			{
				System.out.print(numbers[x][y] + "  ");
			}
			System.out.print(" |  ");
			for (int x = 3; x < 6; x++) {
				System.out.print(numbers[x][y] + "  ");
			}
			System.out.print(" |  ");
			for (int x = 6; x < 9; x++) {
				System.out.print(numbers[x][y] + "  ");
			}
			if (CheckGrid.LineBools[y]) {
				System.out.print("T");		
			}
			if (!CheckGrid.LineBools[y]) {
				System.out.print("F");		//True und False wird ausgegeben.
			}
			
			if (y == 2 || y == 5) {
				System.out.println();
			}
			System.out.println();
		}
		for (int i = 0; i < 9; i++) {
			if (i == 3 || i == 6) {
				System.out.print("    ");
			}
			if(!CheckGrid.ColumnBools[i]) {
				System.out.print("F  ");
			}
			if(CheckGrid.ColumnBools[i]) {
				System.out.print("T  ");		//True und False wird ausgegeben.
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		/*
		for (int y = 0; y < 9; y++)
		{
			for (int x = 0; x < 3; x++)				//For-Schleife f�r alle x- und y-Koordinaten.
			{
				System.out.print(numbers[x][y]);
				System.out.print(" ");
			}
			for (int x = 3; x < 6; x++) {
				System.out.print(numbers[x][y]);
				System.out.print(" ");
			}
			for (int x = 6; x < 9; x++) {
				System.out.print(numbers[x][y]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		*/
	}
}