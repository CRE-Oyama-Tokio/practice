package quizgame;

import java.util.Arrays;

public class Slime extends Enemy {

	String[] quiz1 = { "1.孫悟空", "2.孫悟飯", "3.孫悟天" };
	String[] quiz2 = { "1.流川楓", "2.安西光義", "3.桜木花道" };
	String[] quiz3 = { "1.我妻善逸", "2.竈門炭治郎", "3.嘴平伊之助" };

	public Slime(int hp, int ap, String name) {
		setHp(hp);
		setAp(ap);
		setName(name);
	}

	//クイズ出題
	@Override
	public int quiz(int cnt) {

		if (cnt == 1) {
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
		System.out.println("【第１問】");
		System.out.println("ドラゴンボールの主人公は？");
		System.out.println("※数字で答える");
		System.out.println(Arrays.toString(quiz1));

	}

	void quiz2() {
		setAnsNum(3);
		System.out.println("【第２問】");
		System.out.println("スラムダンクの主人公は？");
		System.out.println("※数字で答える");
		System.out.println(Arrays.toString(quiz2));

	}

	void quiz3() {
		setAnsNum(2);
		System.out.println("【第３問】");
		System.out.println("鬼滅の刃の主人公は？");
		System.out.println("※数字で答える");
		System.out.println(Arrays.toString(quiz3));

	}

}