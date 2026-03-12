package coms.beans;

public class Cricket {

	private int crno;
	private String crname;
	private String game;
	private int runs;
	
	public int getCrno() {
		return crno;
	}
	public void setCrno(int crno) {
		this.crno = crno;
		System.out.println("crno");
	}
	public String getCrname() {
		return crname;
	}
	public void setCrname(String crname) {
		this.crname = crname;
		System.out.println("crname");
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
		System.out.println("game");
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
		System.out.println("runs");
	}
}
