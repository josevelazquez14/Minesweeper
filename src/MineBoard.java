import java.util.Random;

public class MineBoard {
	Mine[] Mines = new Mine[10];


	// This function positions the bombs in the array.
	public MineBoard(){
		
		// Local Vars
		int numberMines = 0;
		Random generator = new Random();
		
		// Dummy Positioning
		String[][] position = new String[10][10];
		
		while(numberMines < 10)  //create the mines
		{
			// Create Mine
			Mines[numberMines] = new Mine(generator.nextInt(9), generator.nextInt(9));
			
			// Cols and rows
			int col = generator.nextInt(9);
			int row = generator.nextInt(9);
		
			while(generator.nextInt() != generator.nextInt())
			{
			// Assign bomb
			position[col][row]="bomb";
			
			// Check if item already has a bomb
			if (Mines[numberMines].Col  > 0 && Mines[numberMines].Row > 0 && position[Mines[numberMines].Col][Mines[numberMines].Row] != "bomb")
				numberMines++;
				
	}
			
}
	
}
