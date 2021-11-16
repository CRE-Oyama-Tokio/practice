package quizgame;

import java.util.Scanner;

public class Player {

	private int php;
	private int pap;
	private int choice;

	public int getPhp() {
		return php;
	}

	public void setPhp(int php) {
		this.php = php;
	}

	public int getPap() {
		return pap;
	}

	public void setPap(int pap) {
		this.pap = pap;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	void answer() {
		//答えを入力
		Scanner scan = new Scanner(System.in);
		int Choice = scan.nextInt();

		//答えをセットする
		setChoice(Choice);
	}

}
