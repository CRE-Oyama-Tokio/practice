package quizgame;

import java.util.Arrays;

public class KillerPanther extends Enemy{


	String[] quiz1 = { "1.ドウェイン・ジョンソン", "2.キアヌ・リーブス", "3.オーランド・ブルーム" };
	String[] quiz2 = { "1.ブルース・ウィリス", "2.ジョニー・デップ", "3.ジェイソン・ステイサム" };
	String[] quiz3 = { "1.トム・ハンクス", "2.トム・クルーズ", "3.トム・ホランド" };
	String[] quiz4 = {"1.イラジャ・ウッド", "トビー・マグワイア", "3.ダニエル・ラドクリフ"};

	public KillerPanther(int hp, int ap, String name) {
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
		} else if (cnt == 4) {
			quiz4();
		}
		cnt++;
		return cnt;
	}

	void quiz1() {
		setAnsNum(2);
		System.out.println("【第１問】");
		System.out.println("映画「マトリックス」の主演俳優は？");
		System.out.println(Arrays.toString(quiz1));

	}

	void quiz2() {
		setAnsNum(1);
		System.out.println("【第２問】");
		System.out.println("映画「ダイハード」の主演俳優は？");
		System.out.println(Arrays.toString(quiz2));

	}

	void quiz3() {
		setAnsNum(1);
		System.out.println("【第３問】");
		System.out.println("映画「フォレスト･ガンプ」の主演俳優は？");
		System.out.println(Arrays.toString(quiz3));

	}

	void quiz4() {
		setAnsNum(4);
		System.out.println("【第４問】");
		System.out.println("映画「ハリー・ポッター」の主演俳優は？");
		System.out.println(Arrays.toString(quiz4));

	}
}
