public class ChangeNumbers
{
	static int help;
	static int count_change;
	
	static int x_1;
	static int x_2;
	static int x_3;
	static int x_4;
	static int x_5;
	static int x_6;
	static int x_a;
	static int x_b;
	static int x_c;
	
	static int y_1;
	static int y_2;
	static int y_3;
	static int y_4;
	static int y_5;
	static int y_6;
	static int y_a;
	static int y_b;
	static int y_c;
	
	static boolean numberFits; 
		
		public static void ChangeNumbersLine(int y) {		//Funktion, die die Zahlen in den Quadraten tauscht,um die Zeile zu berichtigen.
			for (int x = 0; x < 9; x++) {		//Alle x-Koordinaten werden durchgegangen.
				if (x == 0 || x == 1 || x == 2) {
					x_1 = 3;
					x_2 = 4;
					x_3 = 5;
					x_4 = 6;
					x_5 = 7;
					x_6 = 8;
					x_a = 0;
					x_b = 1;
					x_c = 2;
				}
				if (x == 3 || x == 4 || x == 5) {
					x_1 = 0;
					x_2 = 1;
					x_3 = 2;
					x_4 = 6;
					x_5 = 7;
					x_6 = 8;
					x_a = 3;
					x_b = 4;
					x_c = 5;
				}
				if (x == 6 || x == 7 || x == 8) {
					x_1 = 0;
					x_2 = 1;
					x_3 = 2;
					x_4 = 3;
					x_5 = 4;
					x_6 = 5;
					x_a = 6;
					x_b = 7;
					x_c = 8;
				}
				
				//If-Abfrage, bei der eine Zahl mit allen anderen aus ihrer Zeile abgegleicht wid.
				if (Main.numbers[x][y] == Main.numbers[x_1][y] || Main.numbers[x][y] == Main.numbers[x_2][y] || Main.numbers[x][y] == Main.numbers[x_3][y] || Main.numbers[x][y] == Main.numbers[x_4][y] || Main.numbers[x][y] == Main.numbers[x_5][y] || Main.numbers[x][y] == Main.numbers[x_6][y])
					numberFits = false;
					if (y == 0 || y == 3 || y == 6) {
						ProofNumberLine(x, y, x_a, 1 + y);
						ProofNumberLine(x, y, x_a, 2 + y);
						ProofNumberLine(x, y, x_b, 1 + y);
						ProofNumberLine(x, y, x_b, 2 + y);
						ProofNumberLine(x, y, x_c, 1 + y);
						ProofNumberLine(x, y, x_c, 2 + y);
						//ProffNumberLine wird in einem bestimmten Schema aufgerufen.
					}
					if (y == 1 || y == 4 || y == 7) {
						ProofNumberLine(x, y, x_a, 1 + y);
						ProofNumberLine(x, y, x_a, -1 + y);
						ProofNumberLine(x, y, x_b, 1 + y);
						ProofNumberLine(x, y, x_b, -1 + y);
						ProofNumberLine(x, y, x_c, 1 + y);
						ProofNumberLine(x, y, x_c, -1 + y);
						//ProffNumberLine wird in einem bestimmten Schema aufgerufen.
					}
					if (y == 2 || y == 5 || y == 8) {
						ProofNumberLine(x, y, x_a, -2 + y);
						ProofNumberLine(x, y, x_a, -1 + y);
						ProofNumberLine(x, y, x_b, -2 + y);
						ProofNumberLine(x, y, x_b, -1 + y);
						ProofNumberLine(x, y, x_c, -2 + y);
						ProofNumberLine(x, y, x_c, -1 + y);
						//ProffNumberLine wird in einem bestimmten Schema aufgerufen.
					}
			}
		}
		
		private static void ProofNumberLine(int x, int y, int x_change, int y_change)		//Funktion, die die Zahlen, die sie bekommt mit deren Zeile abgleicht und bei keiner �bereinstimmung diese dann mit der Zahl, die nicht in die Zeile passt zu tauschen.
		{
			if (!numberFits)
			{
				
				//If-Abfrage, die kontrolliert,ob die Zahl �bereinstimmt.
				if (Main.numbers[x_change][y_change] != Main.numbers[x_1][y] && Main.numbers[x_change][y_change] != Main.numbers[x_2][y] && Main.numbers[x_change][y_change] != Main.numbers[x_3][y] && Main.numbers[x_change][y_change] != Main.numbers[x_4][y] && Main.numbers[x_change][y_change] != Main.numbers[x_5][y] && Main.numbers[x_change][y_change] != Main.numbers[x_6][y])
				{
					ChangeNumber(x, y, x_change, y_change);		//Die Zahlen werden getauscht.
					numberFits = true;
				}
			}
		}
		
		public static void ChangeNumbersColumn(int x) {		//Funktion, die die Zahlen in den Quadraten tauscht,um die Spalte zu berichtigen.
			for (int y = 0; y < 9; y++) {		//Alle y-Koordinaten werden durchgegeangen.
				if (y == 0 || y == 1 || y == 2) {
					y_1 = 3;
					y_2 = 4;
					y_3 = 5;
					y_4 = 6;
					y_5 = 7;
					y_6 = 8;
					y_a = 0;
					y_b = 1;
					y_c = 2;
				}
				if (y == 3 || y == 4 || y == 5) {
					y_1 = 0;
					y_2 = 1;
					y_3 = 2;
					y_4 = 6;
					y_5 = 7;
					y_6 = 8;
					y_a = 3;
					y_b = 4;
					y_c = 5;
				}
				if (y == 6 || y == 7 || y == 8) {
					y_1 = 0;
					y_2 = 1;
					y_3 = 2;
					y_4 = 3;
					y_5 = 4;
					y_6 = 5;
					y_a = 6;
					y_b = 7;
					y_c = 8;
				}
				
				//If-Abfrage, bei der eine Zahl mit allen anderen aus ihrer Spalte abgegleicht wid.
				if (Main.numbers[x][y] == Main.numbers[x][y_1] || Main.numbers[x][y] == Main.numbers[x][y_2] || Main.numbers[x][y] == Main.numbers[x][y_3] || Main.numbers[x][y] == Main.numbers[x][y_4] || Main.numbers[x][y] == Main.numbers[x][y_5] || Main.numbers[x][y] == Main.numbers[x][y_6])
					numberFits = false;
					if (x == 0 || x == 3 || x == 6) {
						ProofNumberColumn(x, y, 1 + x, y_a);
						ProofNumberColumn(x, y, 2 + x, y_a);
						ProofNumberColumn(x, y, 1 + x, y_b);
						ProofNumberColumn(x, y, 2 + x, y_b);
						ProofNumberColumn(x, y, 1 + x, y_c);
						ProofNumberColumn(x, y, 2 + x, y_c);
						//ProffNumberolumn wird in einem bestimmten Schema aufgerufen.
					}
					if (x == 1 || x == 4 || x == 7) {
						ProofNumberColumn(x, y, 1 + x, y_a);
						ProofNumberColumn(x, y, -1 + x, y_a);
						ProofNumberColumn(x, y, 1 + x, y_b);
						ProofNumberColumn(x, y, -1 + x, y_b);
						ProofNumberColumn(x, y, 1 + x, y_c);
						ProofNumberColumn(x, y, -1 + x, y_c);
						//ProffNumberolumn wird in einem bestimmten Schema aufgerufen.
					}
					if (x == 2 || x == 5 || x == 8) {
						ProofNumberColumn(x, y, -2 + x, y_a);
						ProofNumberColumn(x, y, -1 + x, y_a);
						ProofNumberColumn(x, y, -2 + x, y_b);
						ProofNumberColumn(x, y, -1 + x, y_b);
						ProofNumberColumn(x, y, -2 + x, y_c);
						ProofNumberColumn(x, y, -1 + x, y_c);
						//ProffNumberolumn wird in einem bestimmten Schema aufgerufen.
					}
			}
		}
		
		private static void ProofNumberColumn(int x, int y, int x_change, int y_change)		//Funktion, die die Zahlen, die sie bekommt mit deren Spalte abgleicht und bei keiner �bereinstimmung diese dann mit der Zahl, die nicht in die Spalte passt zu tauschen.
		{
			if (!numberFits)
			{
				if (Main.numbers[x_change][y_change] != Main.numbers[x][y_1] && Main.numbers[x_change][y_change] != Main.numbers[x][y_2] && Main.numbers[x_change][y_change] != Main.numbers[x][y_3] && Main.numbers[x_change][y_change] != Main.numbers[x][y_4] && Main.numbers[x_change][y_change] != Main.numbers[x][y_5] && Main.numbers[x_change][y_change] != Main.numbers[x][y_6])
				{
					ChangeNumber(x, y, x_change, y_change);		//Die Zahlen werden getauscht.
					numberFits = true;
				}
			}
		}
		
		

		
		private static void ChangeNumber(int x, int y, int x_change, int y_change) {		//Funktion, die die Zahlen tauscht.
			help = 0;
			help = Main.numbers[x][y];			//Hilfsvariable help wird angelegt, um die Zahl zu speichern.
			Main.numbers[x][y] = Main.numbers[x_change][y_change];
			Main.numbers[x_change][y_change] = help;
			count_change++;
		}
}
