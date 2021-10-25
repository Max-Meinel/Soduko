import java.util.ArrayList;
import java.util.List;	

public class GenerateGrid
{
	
	static List<Integer> AllNumbers = new ArrayList<Integer>();		//Liste mit Zahlen von 1-9.
	
	static int result;
	static int index;
		
		public static void GenerateSquare(int [][] numbers) //Funktion um die Einzelnen Quadrate zu bestimmen.
		{
						
			for (int j = 0; j < 3; j++)
			{
				for (int i = 0; i < 3; i++)
				{
					for (int ii = 0; ii < 9; ii++) //Nummern von 1-9 f�llen
			        {
			            AllNumbers.add(ii + 1);
			        }

					for (int y = 0; y < 3; y++)
			        {
			            for (int x = 0; x < 3; x++)
			            {
			            	numbers[x + 3 * i][y + 3 * j] = Calculator(); //Berechnen der Startl�sung f�r jeweils ein Quadrat
			            }
			        }	
				}
			}			
		} //Ende Startl�sung f�r alle einzelnen Quadrate
		
		private static int Calculator() //Berechnen der Startl�sung jeweils f�r ein Quadrat
		{
			//F�r jede Zahl muss die Funktion durchlaufen werden. Am Ende wird diese Zahl aus der Liste gel�scht.
			java.util.Random random = new java.util.Random();
				
			index = random.nextInt(AllNumbers.size()); //Eine Stelle in der Liste als random suchen
			result = AllNumbers.get(index); //Wert in der Liste an dieser Stelle suchen, das ist die Zahl, die sp�ter im Quadrat verwendet wird

			AllNumbers.remove(Integer.valueOf(result)); //L�schen der verwendeten Zahl aus der Liste
		
			return result;
		} //Ende Startl�sung f�r ein Quadrat
}
