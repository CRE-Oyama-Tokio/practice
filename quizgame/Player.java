package quizgame;

import java.util.Scanner;

public class Player extends CharaStatus {

	//private int hp;
	//private int ap;
	private int choice;


	public Player (int hp, int ap) {
		setHp(hp);
		setAp(ap);
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}


	//答えを入力するメソッド
	void answer() {
		//答えを入力
		Scanner scan = new Scanner(System.in);
		int Choice = scan.nextInt();

		//答えをセットする
		setChoice(Choice);
	}

}
