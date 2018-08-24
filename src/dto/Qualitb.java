package dto;

public class Qualitb {
	private int id;
	private String qname;
	private int sid;
	private String date;
	private String result;


	public Qualitb(int id, String qname, int sid, String date, String result) {
		this.id = id;
		this.qname = qname;
		this.sid = sid;
		this.date = date;
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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