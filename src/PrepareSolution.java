import java.util.Random;

public class PrepareSolution {
	
	static int cube1;
	static int cube2;
	static int cube3;
	static int cube4;
	static int cube5;
	static int cube6;
	static int cube7;
	static int cube8;
	static int cube9;
	
	static int type = 1;
	
	static boolean repeatLines = true;		//M�ssen die Zeilen wiederholt werden?
	static boolean repeatColumns = true;	//M�ssen die Spalten wiederholt werden?
	
	public static void RemoveNumbers(int number) {
				
		findNumbers(number);
		
		removeNumbers(cube1, 0, 0);
		removeNumbers(cube2, 3, 0);
		removeNumbers(cube3, 6, 0);
		removeNumbers(cube4, 0, 3);
		removeNumbers(cube5, 3, 3);
		removeNumbers(cube6, 6, 3);
		removeNumbers(cube7, 0, 6);
		removeNumbers(cube8, 3, 6);
		removeNumbers(cube9, 6, 6);
		
		
	}
	
	private static void findNumbers(int number) {
		type = 1;
		while (type != 0) {
			type = number;
			Random rn = new Random();
			cube1 = rn.nextInt(6) + 1;
			type -= cube1;
			cube2 = rn.nextInt(6) + 1;
			type -= cube2;
			cube3 = rn.nextInt(6) + 1;
			type -= cube3;
			cube4 = rn.nextInt(6) + 1;
			type -= cube4;
			cube5 = rn.nextInt(6) + 1;
			type -= cube5;
			cube6 = rn.nextInt(6) + 1;
			type -= cube6;
			cube7 = rn.nextInt(6) + 1;
			type -= cube7;
			cube8 = rn.nextInt(6) + 1;
			type -= cube8;
			cube9 = rn.nextInt(6) + 1;
			type -= cube9;
		}
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	
	
	private static void removeNumbers(int cube, int x_1, int y_1)
	{
		cube -= 9;
		cube = cube * (-1);
		for (int i = 0; i < cube; i++)
		{
			boolean type = true;
			while (type)
			{
				type = false;

				
				int x = getRandomNumberInRange(x_1, x_1 + 2);
				int y = getRandomNumberInRange(y_1, y_1 + 2);
				if (Main.numbersSolution[x][y] == 0)
				{
					type = true;
				}
				Main.numbersSolution[x][y] = 0;
			}
		}
	}
	
}