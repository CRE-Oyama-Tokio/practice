package quizgame;

import java.util.Arrays;

public class DragonKing extends Enemy{

	String[] quiz1 = { "1.エイジ･オブ･ウルトロン", "2.インフィニティ・ウォー", "3.エンドゲーム" };
	String[] quiz2 = { "1.トイ･ストーリー4", "2.アナと雪の女王", "3.アナと雪の女王2" };
	String[] quiz3 = { "1.アナと雪の女王", "2.千と千尋の神隠し", "3.劇場版「鬼滅の刃」無限列車編" };
	String[] quiz4 = { "1.ハウルの動く城", "2.君の名は", "3.もののけ姫" };
	String[] quiz5 = { "1.アベンジャーズ エンドゲーム", "2.アバター", "3.タイタニック" };
	String[] quiz6 = { "1.スカイウォーカーの夜明け", "2.フォースの覚醒", "3.最後のジェダイ"};
	String[] quiz7 = { "1.死の秘宝 PART1", "2.賢者の石", "3.死の秘宝 PART2" };

	public DragonKing(int hp, int ap, String name) {
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
		} else if (cnt == 6) {
			quiz6();
		} else if (cnt == 7) {
			quiz7();
		}
		cnt++;
		return cnt;
	}

	void quiz1() {
		setAnsNum(3);
		System.out.println("【第１問】");
		System.out.println("アベンジャーズシリーズで一番興行収入の高い作品は？");
		System.out.println(Arrays.toString(quiz1));

	}

	void quiz2() {
		setAnsNum(3);
		System.out.println("【第２問】");
		System.out.println("選択肢のうち世界で一番興行収入の高い作品は？");
		System.out.println(Arrays.toString(quiz2));

	}

	void quiz3() {
		setAnsNum(3);
		System.out.println("【第３問】");
		System.out.println("選択肢のうち日本で一番興行収入の高い作品は？");
		System.out.println(Arrays.toString(quiz3));

	}

	void quiz4() {
		setAnsNum(2);
		System.out.println("【第４問】");
		System.out.println("選択肢のうち日本で一番興行収入の高い作品は？");
		System.out.println(Arrays.toString(quiz4));

	}

	void quiz5() {
		setAnsNum(2);
		System.out.println("【第５問】");
		System.out.println("選択肢のうち世界で一番興行収入の高い作品は？");
		System.out.println(Arrays.toString(quiz5));

	}

	void quiz6() {
		setAnsNum(2);
		System.out.println("【第６問】");
		System.out.println("スターウォーズシリーズで一番興行収入の高い作品は？");
		System.out.println(Arrays.toString(quiz6));

	}

	void quiz7() {
		setAnsNum(1);
		System.out.println("【第７問】");
		System.out.println("ハリー・ポッターシリーズで一番興行収入の高い作品は？");
		System.out.println(Arrays.toString(quiz7));

	}

}
