package weightmanagement;

import java.sql.SQLException;
import java.util.Scanner;

import dao.BodyDAO;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		System.out.println("身長を入力してください(単位：m)");
		System.out.println("入力例：1.7");
		double height = scanner.nextDouble();
		System.out.println("体重を入力してください(単位：kg)");
		System.out.println("入力例：62.5");
		double weight = scanner.nextDouble();

		//BMIと適正体重を計算
		double bmi = ((double)Math.round(weight / (height * height) *100)) / 100;  //BMI
		double appropriateWeight = ((double)Math.round((height * height) * 22 * 100)) / 100;  //適正体重


		System.out.println("標準のBMIが18.5～25未満に対して");
		System.out.println("あなたのBMIは" + bmi);
		System.out.println("あなたの適正体重は" + appropriateWeight);
		System.out.println();


		//DAOの作成
		BodyDAO dao = new BodyDAO();

		try {
			System.out.println("前回のデータ");
			dao.select();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			BodyData bodyData = new BodyData();
			bodyData.setHeight(height);
			bodyData.setWeight(weight);
			bodyData.setBmi(bmi);
			bodyData.setAppropriateWeight(appropriateWeight);
			dao.insert(bodyData);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

		}

	}
}



