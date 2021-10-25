import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckGrid
{
	//List-Array f�r die sp�tere Pr�fung der Zeilen und Spalten
	static boolean LineBools[] = new boolean[9];
	static boolean ColumnBools[] = new boolean[9];
	
	static List<Integer> AllNumbers = new ArrayList<Integer>();			//Integer-Liste wird mit Zahlen von 1-9 gef�llt.
	static List<Integer> CheckNumbers = new ArrayList<Integer>();		//Integer-Liste wird mit Zahlen aus der Zeile gef�llt.

	public static void ProofLine(int [][] numbers)		//Funktion, um die Zeilen zu �berpr�fen.
	{
		AllNumbers.clear();
		CheckNumbers.clear();

		for (int i = 0; i < 9; i++)
        {
            AllNumbers.add(i + 1);		//Array wird von 1-9 gef�llt.
        }
		for (int y = 0; y < 9; y++)
		{
			for (int x = 0; x < 9; x++)
			{
				CheckNumbers.add(numbers[x][y]);
				Collections.sort(CheckNumbers);				//Zahlen aus der Zeile werden sortiert.
				if (AllNumbers.equals(CheckNumbers))		//Zeilen werden mit den Zahlen von 1-9 abgegleicht.
				{
					LineBools[y] = true;
				}
				else
					LineBools[y] = false;
			}
			CheckNumbers.clear();	
		}
	}
	
	public static void ProofColumn(int [][] numbers)		//Funktion, um die Spalten zupr�fen.
	{
		AllNumbers.clear();
		CheckNumbers.clear();

		for (int i = 0; i < 9; i++)
        {
            AllNumbers.add(i + 1);			//Array wird von 1-9 gef�llt.
        }
		for (int y = 0; y < 9; y++)
		{
			for (int x = 0; x < 9; x++)
			{
				CheckNumbers.add(numbers[y][x]);
				Collections.sort(CheckNumbers);				//Zahlen aus den Spalten werden sortiert.
				if (AllNumbers.equals(CheckNumbers))		//Spalten werden mit den Zahlen von 1-9 abgegleicht.
				{
					ColumnBools[y] = true;
				}
				else
					ColumnBools[y] = false;
			}
			CheckNumbers.clear();
		}
	}
}
