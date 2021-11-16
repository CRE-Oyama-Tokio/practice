package quizgame;

import java.util.Arrays;

public class Slime extends Enemy {

	private int hp = 20;
	private int ap = 10;

	String[] quiz1 = { "1.孫悟空", "2.孫悟飯", "3.孫悟天" };
	String[] quiz2 = { "1.流川楓", "2.安西光義", "3.桜木花道" };
	String[] quiz3 = { "1.我妻善逸", "2.竈門炭治郎", "3.嘴平伊之助" };
	private int ansNum;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}

	public int getAnsNum() {
		return ansNum;
	}

	public void setAnsNum(int ansNum) {
		this.ansNum = ansNum;
	}

	public int quiz(int cnt) {

		if (cnt == 1) {
			System.out.println("スライムがあらわれた!!");
			System.out.println();
			setEhp(hp);
			setEap(ap);
			quiz1();
		} else if (cnt == 2) {
			quiz2();
		} else if (cnt == 3) {
			quiz3();
		}
		cnt++;
		return cnt;
	}

	void quiz1() {
		setAnsNum(1);
		System.out.println("ドラゴンボールの主人公は？");
		System.out.println("※数字で答える");
		System.out.println(Arrays.toString(quiz1));

	}

	void quiz2() {
		setAnsNum(3);
		System.out.println("スラムダンクの主人公は？");
		System.out.println("※数字で答える");
		System.out.println(Arrays.toString(quiz2));

	}

	void quiz3() {
		setAnsNum(2);
		System.out.println("鬼滅の刃の主人公は？");
		System.out.println("※数字で答える");
		System.out.println(Arrays.toString(quiz3));

	}

}