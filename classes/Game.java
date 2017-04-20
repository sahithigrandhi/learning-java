package edu.learningJava.classes;

import java.util.Scanner;

public class Game {
	int score;
	int level;
	String playerName;
	
	//CONSTUCTORS
	public Game(int score, int level, String playerName) {
		super();
		this.score = score;
		this.level = level;
		this.playerName = playerName;
	}
	public Game(String playerName) {
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
		System.out.println("  <<<<<MyGame>>>>>");
		System.out.println("-----------------------");
		System.out.println("PlayerName:"+playerName);
		System.out.println("  LEVEL:0    SCORE:0");
		System.out.println();
		System.out.println("*****CONTROL KEYS*****");
		System.out.println("U--->+2 D--->+1 B--->+10");
		System.out.println("    x----->EXIT");
		System.out.println("Do you want to START game");

		String startGame=sc.next();
		if(startGame.equals("YES"))
			playGame();
		else
			System.out.println("*****EXIT*****");
	}
	
	//PLAY GAME METHOD
	private void playGame(){
		score=0;
		int level=0;
		int finalScore=0;
		String input = "";
		do{
			System.out.println("Press your key");
			input=sc.next();
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
				System.out.println("    !!GAME OVER!! ");
				System.out.println("!!!!!CONGRATULATIONS!!!!!");
				System.out.println("  LEVEL:"+(level+1)+"    "+"SCORE:"+(finalScore+score));
				
				return;
			default:
				System.out.println("Invalid Entry");
				break;
			}
			if(score>=100){
				level++;
				finalScore+=score;
				System.out.println("LEVEL:"+level+"    "+"SCORE:"+finalScore);
				System.out.println("!!!!!CONGRATULATIONS!!!!!");
				System.out.println("YOU HAVE REACHED NEXT LEVEL");
				score=0;
			}
		}
		while(input!="X");
		
	}
}


