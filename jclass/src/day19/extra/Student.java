package day19.extra;

public class Student implements Comparable { // 총점 기준 정렬 클래스
	private String name;
	private int ban, no, java, db, web, jsp, spring, total;
	private double avg;
	
	public Student() {}
	public Student(String name, int ban, int no, 
						int java, int db, int web, int jsp, int spring) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.java = java;
		this.db = db;
		this.web = web;
		this.jsp = jsp;
		this.spring = spring;
		setTotal();
		setAvg();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java + db + web + jsp + spring;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total / 5.0;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (ban == ((Student)obj).getBan()) && (no == ((Student) obj).getNo());
	}
	
	@Override
	public String toString() {
		return ban + "반 - " + no + "번 ] " + name + " 학생 : \n\t\tjava : " + java + ", \n\t\tdb : " + db + 
				",\n\t\tweb : " + web + ",\n\t\tjsp : " + jsp + ",\n\t\tspring : " + spring + 
				",\n\t총점 : " + total + ",\n\t평균 : " + avg;
	}

	@Override
	public int compareTo(Object o) {
		return ((Student) o).getTotal() - total;
	}
}
