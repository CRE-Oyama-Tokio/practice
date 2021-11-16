package quizgame;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int cnt = 1;
		int pap;
		int ehp;
		int php;
		int eap;
		Player pl = new Player();
		Slime slime = new Slime();
		pl.setPhp(20);
		pl.setPap(10);
		while (true) {
			//スライムが出題
			slime.quiz(cnt);

			//プレイヤーが答えを選択する。
			pl.answer();
			int choice = pl.getChoice();

			if (choice == slime.getAnsNum()) {
				pap = pl.getPap();
				ehp = slime.getEhp();
				ehp -= pap;
				System.out.println("スライムの残りHPは" + ehp);
				slime.setEhp(ehp);
			} else {
				php = pl.getPhp();
				eap = slime.getEap();
				php -= eap;
				System.out.println("残りHPは" + php);
				pl.setPhp(php);
			}
			cnt++;
		}
	}

}
