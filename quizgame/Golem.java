package quizgame;

import java.util.Arrays;

public class Golem extends Enemy{

	String[] quiz1 = { "1.リリー・コリンズ", "2.アン・ハサウェイ", "3.レイチェル・マクアダムス" };
	String[] quiz2 = { "1.アンジェリーナ・ジョリー", "2.ナタリー・ポートマン", "3.スカーレット・ヨハンソン" };
	String[] quiz3 = { "1.エマ・ストーン", "2.エマ・ロバーツ", "3.エマ・ワトソン" };
	String[] quiz4 = { "1.アンジェリーナ・ジョリー", "2.ナタリー・ポートマン", "3.スカーレット・ヨハンソン" };
	String[] quiz5 = { "1.ミラ・ジョヴォビッチ", "2.キャメロン・ディアス", "3.キーラ・ナイトレイ" };

	public Golem(int hp, int ap, String name) {
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
		} else if (cnt == 5) {
			quiz5();
		}
		cnt++;
		return cnt;
	}

	void quiz1() {
		setAnsNum(2);
		System.out.println("【第１問】");
		System.out.println("映画「プラダを着た悪魔」の主演女優は？");
		System.out.println(Arrays.toString(quiz1));
	}

	void quiz2() {
		setAnsNum(1);
		System.out.println("【第２問】");
		System.out.println("映画「マレフィセント」の主演女優は？");
		System.out.println(Arrays.toString(quiz2));
	}

	void quiz3() {
		setAnsNum(3);
		System.out.println("【第３問】");
		System.out.println("映画「美女と野獣」の主演女優は？");
		System.out.println(Arrays.toString(quiz3));
	}

	void quiz4() {
		setAnsNum(1);
		System.out.println("【第４問】");
		System.out.println("映画「トゥームレイダー」の主演女優は？");
		System.out.println(Arrays.toString(quiz4));
	}

	void quiz5() {
		setAnsNum(1);
		System.out.println("【第５問】");
		System.out.println("映画「バイオハザード」の主演女優は？");
		System.out.println(Arrays.toString(quiz5));
	}

}
