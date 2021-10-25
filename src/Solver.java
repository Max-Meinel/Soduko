public class Solver {
	
	//Neuer Solver
	//static int[][] solutions = new int[9][9][9];	//Array f�r die alle noch m�glichen Zahlenkombinationen
	
	//Funktion: M�gliche Zahlen finden in Quadrat, Zeile und Spalte
	//Erstes Feld (0,0) anschauen und alle schon vorhandenen Zahlen im eigenen Quadrat, Zeile und Spalte rausschmmei�en, Ergebnis im Array in der dritten Dimension abspeichern
	//F�r alle Felder durchf�hren (Schleife)
	//Ergebnis ist eine Liste mit den maximalen M�glichkeiten an Zahlen f�r alle Felder
	
	//Funktion: Gibt es ein Feld in dem nur noch eine Zahl zul�ssig ist (Nackter Einser)
	//Wenn ja, dann wird dieses Feld mit dieser Zahl gef�llt
	//Anschllie�end Funktion "M�gliche Zahlen" durchf�hren. Dabei jedoch darauf achten, dass nur Zalen weggenommmen werden
	//Wenn es keine M�glichkeit gibt, dann wieder ganz von vorne anfangen (Prepare Solution)
	//Zum Test kann erstmal nur ganz wenige Felder wegnehmen
	
	//Sp�tere Funktion: (Versteckter Einser)
	
	static int x_1;
	static int x_2;
	static int x_3;
	static int x_4;
	static int x_5;
	static int x_6;
	
	static int y_1;
	static int y_2;
	static int y_3;
	static int y_4;
	static int y_5;
	static int y_6;
	
	static int index;
	
	static int[][][] possibleNumbers = new int[9][9][9];
	
		
	public static void SolveGrid() {	//F�llt die L�cken mit Ziffern, die es in dem jeweiligen Quadrat noch nicht gibt
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				for (int k = 0; k < 9; k++)
					possibleNumbers[i][j][k] = 1;
		
		for (int h = 0; h < 20; h++) {
			for (int x = 0; x < 9; x++)
				for (int y = 0; y < 9; y++)
					if  (Main.numbersSolution[x][y] == 0) {
						CheckLine(x, y);
						CheckColumn(x, y);
						CheckSquare(x, y);
						/*
						System.out.print("[" + x + "]" + "[" + y + "]" + ": ");
						for (int i = 0; i < 9; i++) {
							System.out.print(possibleNumbers[x][y][i] + " ");
						}
						System.out.println();
						*/
						ProofPossibleNumbers();
						
					}
		
		
		}
		

		


		
		
		
		
		
	}
	
	public static void CheckLine(int x, int y) {
		if (x == 0 || x == 1 || x == 2) {
			x_1 = 3;
			x_2 = 4;
			x_3 = 5;
			x_4 = 6;
			x_5 = 7;
			x_6 = 8;
		}
		if (x == 3 || x == 4 || x == 5) {
			x_1 = 0;
			x_2 = 1;
			x_3 = 2;
			x_4 = 6;
			x_5 = 7;
			x_6 = 8;
		}
		if (x == 6 || x == 7 || x == 8) {
			x_1 = 0;
			x_2 = 1;
			x_3 = 2;
			x_4 = 3;
			x_5 = 4;
			x_6 = 5;
		}
				
		if (Main.numbersSolution[x_1][y] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x_1][y] - 1] = 0;
		}
		if (Main.numbersSolution[x_2][y] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x_2][y] - 1] = 0;
		}
		if (Main.numbersSolution[x_3][y] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x_3][y] - 1] = 0;
		}
		if (Main.numbersSolution[x_4][y] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x_4][y] - 1] = 0;
		}
		if (Main.numbersSolution[x_5][y] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x_5][y] - 1] = 0;
		}
		if (Main.numbersSolution[x_6][y] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x_6][y] - 1] = 0;
		}	
	}
	
	static void CheckColumn(int x, int y) {
		if (y == 0 || y == 1 || y == 2) {
			y_1 = 3;
			y_2 = 4;
			y_3 = 5;
			y_4 = 6;
			y_5 = 7;
			y_6 = 8;
		}
		if (y == 3 || y == 4 || y == 5) {
			y_1 = 0;
			y_2 = 1;
			y_3 = 2;
			y_4 = 6;
			y_5 = 7;
			y_6 = 8;
		}
		if (y == 6 || y == 7 || y == 8) {
			y_1 = 0;
			y_2 = 1;
			y_3 = 2;
			y_4 = 3;
			y_5 = 4;
			y_6 = 5;
		}
		
		if (Main.numbersSolution[x][y_1] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x][y_1] - 1] = 0;
		}
		if (Main.numbersSolution[x][y_2] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x][y_2] - 1] = 0;
		}
		if (Main.numbersSolution[x][y_3] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x][y_3] - 1] = 0;
		}
		if (Main.numbersSolution[x][y_4] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x][y_4] - 1] = 0;
		}
		if (Main.numbersSolution[x][y_5] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x][y_5] - 1] = 0;
		}
		if (Main.numbersSolution[x][y_6] != 0) {
			possibleNumbers[x][y][Main.numbersSolution[x][y_6] - 1] = 0;
		}
	}
	
	static void CheckSquare(int x, int y) {
		if (x == 0 && y == 0 || x == 0 && y == 1 || x == 0 && y == 2 || x == 1 && y == 0 || x == 1 && y == 1 || x == 1 && y == 2 || x == 2 && y == 0 || x == 2 && y == 1 || x == 2 && y == 2) {
			for (int x1 = 0; x1 < 3; x1++ ) {
				for (int y1 = 0; y1 < 3; y1++) {
					if (Main.numbersSolution[x1][y1] != 0) {
						possibleNumbers[x][y][Main.numbersSolution[x1][y1] - 1] = 0;
					}
				}
			}
		}
		if (x == 3 && y == 0 || x == 3 && y == 1 || x == 3 && y == 2 || x == 4 && y == 0 || x == 4 && y == 1 || x == 4 && y == 2 || x == 5 && y == 0 || x == 5 && y == 1 || x == 5 && y == 2) {
			for (int x1 = 3; x1 < 6; x1++ ) {
				for (int y1 = 0; y1 < 3; y1++) {
					if (Main.numbersSolution[x1][y1] != 0) {
						possibleNumbers[x][y][Main.numbersSolution[x1][y1] - 1] = 0;
					}
				}
			}
		}
		if (x == 6 && y == 0 || x == 6 && y == 1 || x == 6 && y == 2 || x == 7 && y == 0 || x == 7 && y == 1 || x == 7 && y == 2 || x == 8 && y == 0 || x == 8 && y == 1 || x == 8 && y == 2) {
			for (int x1 = 6; x1 < 9; x1++ ) {
				for (int y1 = 0; y1 < 3; y1++) {
					if (Main.numbersSolution[x1][y1] != 0) {
						possibleNumbers[x][y][Main.numbersSolution[x1][y1] - 1] = 0;
					}
				}
			}
		}
		if (x == 0 && y == 3 || x == 0 && y == 4 || x == 0 && y == 5 || x == 1 && y == 3 || x == 1 && y == 4 || x == 1 && y == 5 || x == 2 && y == 3 || x == 2 && y == 4 || x == 2 && y == 5) {
			for (int x1 = 0; x1 < 3; x1++ ) {
				for (int y1 = 3; y1 < 6; y1++) {
					if (Main.numbersSolution[x1][y1] != 0) {
						possibleNumbers[x][y][Main.numbersSolution[x1][y1] - 1] = 0;
					}
				}
			}
		}
		if (x == 3 && y == 3 || x == 3 && y == 4 || x == 3 && y == 5 || x == 4 && y == 3 || x == 4 && y == 4 || x == 4 && y == 5 || x == 5 && y == 3 || x == 5 && y == 4 || x == 5 && y == 5) {
			for (int x1 = 3; x1 < 6; x1++ ) {
				for (int y1 = 3; y1 < 6; y1++) {
					if (Main.numbersSolution[x1][y1] != 0) {
						possibleNumbers[x][y][Main.numbersSolution[x1][y1] - 1] = 0;
					}
				}
			}
		}
		if (x == 6 && y == 3 || x == 6 && y == 4 || x == 6 && y == 5 || x == 7 && y == 3 || x == 7 && y == 4 || x == 7 && y == 5 || x == 8 && y == 3 || x == 8 && y == 4 || x == 8 && y == 5) {
			for (int x1 = 6; x1 < 9; x1++ ) {
				for (int y1 = 3; y1 < 6; y1++) {
					if (Main.numbersSolution[x1][y1] != 0) {
						possibleNumbers[x][y][Main.numbersSolution[x1][y1] - 1] = 0;
					}
				}
			}
		}
		if (x == 0 && y == 6 || x == 0 && y == 7 || x == 0 && y == 8 || x == 1 && y == 6 || x == 1 && y == 7 || x == 1 && y == 8 || x == 2 && y == 6 || x == 2 && y == 7 || x == 2 && y == 8) {
			for (int x1 = 0; x1 < 3; x1++ ) {
				for (int y1 = 6; y1 < 9; y1++) {
					if (Main.numbersSolution[x1][y1] != 0) {
						possibleNumbers[x][y][Main.numbersSolution[x1][y1] - 1] = 0;
					}
				}
			}
		}
		if (x == 3 && y == 6 || x == 3 && y == 7 || x == 3 && y == 8 || x == 4 && y == 6 || x == 4 && y == 7 || x == 4 && y == 8 || x == 5 && y == 6 || x == 5 && y == 7 || x == 5 && y == 8) {
			for (int x1 = 3; x1 < 6; x1++ ) {
				for (int y1 = 6; y1 < 9; y1++) {
					if (Main.numbersSolution[x1][y1] != 0) {
						possibleNumbers[x][y][Main.numbersSolution[x1][y1] - 1] = 0;
					}
				}
			}
		}
		if (x == 6 && y == 6 || x == 6 && y == 7 || x == 6 && y == 8 || x == 7 && y == 6 || x == 7 && y == 7 || x == 7 && y == 8 || x == 8 && y == 6 || x == 8 && y == 7 || x == 8 && y == 8) {
			for (int x1 = 6; x1 < 9; x1++ ) {
				for (int y1 = 6; y1 < 9; y1++) {
					if (Main.numbersSolution[x1][y1] != 0) {
						possibleNumbers[x][y][Main.numbersSolution[x1][y1] - 1] = 0;
					}
				}
			}
		}
	}
	
	static void ProofPossibleNumbers() {
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				int replace = 0;
				for (int z = 0; z < 9; z++) {
					if (possibleNumbers[x][y][z] == 1) {
						replace += 1;
						index = z + 1;
					}
				}
				if (replace == 1) {
					Main.numbersSolution[x][y] = index;
				}
			}
		}
	}
}
