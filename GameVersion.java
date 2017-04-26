import java.util.Scanner;

public class GameVersion {
	public static void main(String[] args) {
		GameVersion g=new GameVersion("sahithi");
		g.startGame();
	}

	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_BLUE = "\u001B[34m";
	private static final String ANSI_MAGENTA = "\u001B[35m";


	int score;
	int level;
	String playerName;

	//CONSTUCTORS
	public GameVersion(int score, int level, String playerName) {
		super();
		this.score = score;
		this.level = level;
		this.playerName = playerName;
	}
	public GameVersion(String playerName) {
		super();
		this.playerName = playerName;
	}

	//GETTER OR ACCESSOR METHODS
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getLevel() {
		return level;
	}

	//SETTER OR MUTATOR METHODS
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	Scanner sc=new Scanner(System.in);

	//START GAME METHOD
	public void startGame(){
		System.out.println(ANSI_RED+"  <<<<<MyGame>>>>>");
		System.out.println("-----------------------"+ANSI_RESET);
		System.out.println(ANSI_GREEN+"PlayerName:"+playerName);
		System.out.println("  LEVEL:0    SCORE:0"+ANSI_RESET);
		System.out.println();
		System.out.println(ANSI_BLUE+"*****CONTROL KEYS*****");
		System.out.println("U--->+2 D--->+1 B--->+10");
		System.out.println("    x----->EXIT"+ANSI_RESET);
		System.out.println(ANSI_RED+"Do you want to START game"+ANSI_RESET);

		String startGame=sc.next();
		if(startGame.equals("YES"))
			playGame();
		else
			System.out.println(ANSI_RED+"*****EXIT*****"+ANSI_RESET);
	}

	//PLAY GAME METHOD
	private void playGame(){

		score=0;
		int level=0;
		int finalScore=0;
		String input = "";
		

		while(input!="X"){
			System.out.print(ANSI_MAGENTA+"choice:"+ANSI_RESET);

			input=sc.next();
			
			System.out.print("\033[1A");//puts back cursor IN PREVIOUS line at start		
			System.out.print("\033[8C");//moves right by 8 letters(starts from 0)
			System.out.print("\b ");//delete one char
			System.out.print("\033[8D");//moves cursor 1 position back


			switch(input){
			case "U":
				score+=2;
				break;
			case "D":
				score+=1;
				break;
			case "B":
				score+=10;
				break;
			case "X":

				System.out.println(ANSI_RED+"    !!GAME OVER!! "+ANSI_RESET);
				System.out.println(ANSI_MAGENTA+"!!!!!CONGRATULATIONS!!!!!"+ANSI_RESET);
				System.out.println(ANSI_BLUE+"  LEVEL:"+(level+1)+"    "+"SCORE:"+(finalScore+score)+ANSI_RESET);

				return;

			default:
				System.out.println(ANSI_RED+"Invalid Entry"+ANSI_RED);
				break;
			}
			if(score>=100){
				level++;
				finalScore+=score;
				System.out.println("LEVEL:"+level+"    "+"SCORE:"+finalScore);
				System.out.println(ANSI_MAGENTA+"!!!!!CONGRATULATIONS!!!!!"+ANSI_RESET);
				System.out.println(ANSI_YELLOW+"YOU HAVE REACHED NEXT LEVEL"+ANSI_RESET);
				System.out.println(ANSI_GREEN+"DO YOU WANT TO PLAY NEXT LEVEL??"+ANSI_RESET);
				score=0;
				String decision=sc.next();

				if(decision.equals("YES"))
					continue;

				else{
					System.out.println(ANSI_RED+"    !!GAME OVER!! "+ANSI_RESET);
					System.out.println(ANSI_MAGENTA+"!!!!!CONGRATULATIONS!!!!!"+ANSI_RESET);
					System.out.println("  LEVEL:"+(level)+"    "+"SCORE:"+(finalScore+score));

					return;
				}

			}
		}

	}
}









