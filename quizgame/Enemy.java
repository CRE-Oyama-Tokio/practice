package quizgame;

public abstract class Enemy extends CharaStatus{


	private String name;
	private int ansNum;


	public int getAnsNum() {
		return ansNum;
	}

	public void setAnsNum(int ansNum) {
		this.ansNum = ansNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int quiz(int cnt);


}
