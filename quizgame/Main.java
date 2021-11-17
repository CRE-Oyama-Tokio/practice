package quizgame;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int cnt = 1;  //クイズのカウント
		int pap;  //プレイヤーのHP
		int ehp;  //敵のHP
		int php;  //プレイヤーの攻撃力
		int eap;  //敵の攻撃力
		String eName = null; //敵の名前

		//ルール説明
		System.out.println("【ルール説明】");
		System.out.println("敵が出すクイズに答えて攻撃しよう。");
		System.out.println("答えるときは選択肢の番号を半角で打ち込もう。");
		System.out.println("竜王を倒せたらプレイヤーの勝利。");

		Player player = new Player(20,10);
		Enemy slime = new Slime(20,10,"スライム");
		battle(player, slime);
		slime = null;
		cnt = 1;

		//レベルアップ1回目
		LevelUp(40, 25);
		player.setHp(40); //プレイヤーの体力に40をセット
		player.setAp(25); //プレイヤーの攻撃力に30をセット

		//キラーパンサー出現から戦闘まで
		Enemy killerPanther = new KillerPanther(75,20,"キラーパンサー");
		battle(player, killerPanther);
		killerPanther = null;
		cnt = 1;

		//レベルアップ2回目
		LevelUp(70, 35);
		player.setHp(70); //プレイヤーの体力に70をセット
		player.setAp(35); //プレイヤーの攻撃力に35をセット

		//ゴーレム出現から戦闘まで
		Enemy golem = new Golem(140,35,"ゴーレム");
		battle(player, golem);
		golem = null;
		cnt = 1;

		//レベルアップ3回目
		LevelUp(100, 50);
		player.setHp(100);//プレイヤーの体力に100をセット
		player.setAp(50);//プレイヤーの攻撃力に50をセット

		//竜王出現から戦闘まで
		Enemy dragonKing = new DragonKing(300, 50 , "竜王");
		battle(player, dragonKing);

		System.out.println("プレイヤーは勝利した。");
		System.out.println("G A M E C L E A R");
	}


	//戦闘を行うメソッド
	static void battle(Player player,Enemy enemy) {

		int cnt = 1;  //クイズのカウント
		int pap = player.getAp();  //プレイヤーのHP
		int ehp = enemy.getHp();  //敵のHP
		int php = player.getHp();  //プレイヤーの攻撃力
		int eap = enemy.getAp();  //敵の攻撃力
		String eName = enemy.getName();; //敵の名前

		while (true) {
			Line();
			if (cnt == 1) {
				System.out.println(eName + "があらわれた!!");
				System.out.println();
			}
			//ステータス表示
			System.out.println("プレイヤー");
			System.out.println("HP：" + php );
			System.out.println("攻撃力：" + pap);
			System.out.println();
			System.out.println(eName);
			System.out.println("HP：" + ehp);
			System.out.println("攻撃力：" + eap);
			System.out.println();
			enemy.quiz(cnt); //敵が出題
			Line();

			player.answer(); //プレイヤーが答えを選択する。
			int choice = player.getChoice();
			if (choice == enemy.getAnsNum()) {
				ehp -= pap;
				System.out.println("プレイヤーが" + eName + "を攻撃。");
				System.out.println(eName + "に" + pap + "のダメージ。");
				System.out.println(eName + "の残りHPは" + ehp);
				enemy.setHp(ehp);
				if (ehp == 0) {
					System.out.println();
					System.out.println(eName + "を倒した。");
					break;
				}
			} else {
				php -= eap;
				System.out.println(eName + "がプレイヤーを攻撃。" );
				System.out.println("プレイヤーに" + eap + "のダメージ。");
				System.out.println("プレイヤーの残りHPは" + php + "。");
				player.setHp(php);
				if (php == 0) {
					Lose();
				}
			}
			cnt++;
		}
	}

	//レベルアップ
	static void LevelUp(int hp, int ap) {
		Line();
		System.out.println("プレイヤーのレベルが上がった。");
		System.out.println("・体力の最大値が" + hp +"上がった。");
		System.out.println("・攻撃力の最大値が" + ap + "上がった。");
		System.out.println("プレイヤーは体力が回復した。");
		Line();
	}

	static void Line() {
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////");
		System.out.println();
	}

	//ゲームオーバー
	static void Lose() {
		System.out.println();
		System.out.println("プレイヤーは負けてしまった。");
		System.out.println("G A M E O V E R");
		System.exit(0);
	}


}
