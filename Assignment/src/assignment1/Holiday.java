package assignment1;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public Holiday() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void displayHoliday() {
        System.out.println("Holiday: " + name);
        System.out.println("Date: " + day + " " + month);
    }
    public static void main(String[] args) {
		Holiday h=new Holiday("himanshu",05,"jan-2000");
	
		h.displayHoliday();
	}
}
