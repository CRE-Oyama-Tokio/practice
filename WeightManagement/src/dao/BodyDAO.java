package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import weightmanagement.BodyData;

public class BodyDAO {

	//データを表示する
	public void select()
			throws SQLException, ClassNotFoundException {



		try (Connection con = ConnectionManager.getConnection();
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery("SELECT * FROM physicalinfo WHERE insert_date = (SELECT MAX(insert_date) FROM physicalinfo)")) {

			while (res.next()) {
				System.out.println("身長  " + res.getDouble("height"));
				System.out.println("体重  "+res.getDouble("weight"));
				System.out.println("BMI  "+res.getDouble("bmi"));
				System.out.println("適正体重  "+res.getDouble("appropriate_weight"));
			}
		}
	}

	//入力されたデータを追加する
	public void insert(BodyData bodyData) throws SQLException, ClassNotFoundException {

		String sql = "INSERT INTO physicalinfo VALUES ($1,$2,$3,$4)";

		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			//DTOからデータの取り出し
			double height = bodyData.getHeight();
			double weight = bodyData.getWeight();
			double bmi = bodyData.getBmi();
			double appropriate_weight = bodyData.getAppropriateWeight();

			//プレースホルダーに値を設定
			pstmt.setDouble(1, height);
			pstmt.setDouble(2, weight);
			pstmt.setDouble(3, bmi);
			pstmt.setDouble(4, appropriate_weight);

			//SQLステートメント実行
			pstmt.executeUpdate();
		}

	}
}
