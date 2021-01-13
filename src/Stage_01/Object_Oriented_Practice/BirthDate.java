package Stage_01.Object_Oriented_Practice;

public class BirthDate {

	private int day;
	private int month;
	private int year;

	public BirthDate(int d, int m, int y) {
		year = y;
		month = m;
		day = d;
	}

	public int getDay() {
		// Âß¼­ÅÐ¶Ï
		return day;
	}

	public void setDay(int day) {
		// Âß¼­ÅÐ¶Ï
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void display() {
		System.out.println(day + "-" + month + "-" + year);
	}

}
