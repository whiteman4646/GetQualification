package dto;

public class Qualitb {
	private int id;
	private String sname;
	private String date;
	private String result;

	public Qualitb(){

	}

	public Qualitb(int id, String sname, String date, String result) {
		super();
		this.id = id;
		this.sname = sname;
		this.date = date;
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
