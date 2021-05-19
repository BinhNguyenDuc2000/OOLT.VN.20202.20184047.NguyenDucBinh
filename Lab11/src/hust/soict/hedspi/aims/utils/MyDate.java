package hust.soict.hedspi.aims.utils;
import java.util.Scanner;
import java.time.LocalDate;

public class MyDate {

	private int day;
	private int month;
	private int year;
	private static int displayType=3;
	public static void setDisplayType(int type) {
		displayType = type;
	}
	// Kiem tra mot string co phai la mot so
    public static boolean isNumeric(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            //System.out.println(e);
            return false;
        }
    }
	
	// Constructor
	public MyDate() {
		super();
		LocalDate lcDate = LocalDate.now();
		this.year=(lcDate.getYear());
		this.month=(lcDate.getMonthValue());
		this.day=(lcDate.getDayOfMonth());
		// System.out.println("The date setting has been completed");
		
	}
	
	public MyDate(int day, int month, int year) {
		super();
		if(this.setYear(year) && this.setMonth(month) && this.setDay(day)) {
					System.out.println("The date setting has been completed");
					System.out.println("===================================");
		}
		else{
			System.out.println("The date setting has not been completed\n"+
				"Reverting back to default date");
			MyDate tmpDate = new MyDate();
			this.year=(tmpDate.year);
			this.month=(tmpDate.month);
			this.day=(tmpDate.day);
			}
	}
	
	// Ham kiem tra nam va gan gia tri	
	public boolean Year(String year) {
		if (isNumeric(year)==true) {
			return this.setYear(Integer.parseInt(year));
		}
		else {
			System.out.println("The year was not valid");
			return false;
		}
	}
	
	// Ham kiem tra thang va gan gia tri	
	public boolean Month(String month) {
		if (isNumeric(month)==true) {
			return this.setMonth(Integer.parseInt(month));
		}
		switch (month){
        case "January":
        case "Jan.":
        case "Jan":
            return this.setMonth(1);
        case "February":
        case "Feb.":
        case "Feb":
            return this.setMonth(2);
        case "March":
        case "Mar.":
        case "Mar":
            return this.setMonth(3);
        case "April":
        case "Apr.":
        case "Apr":
            return this.setMonth(4);
        case "May":
        case "May.":
            return this.setMonth(5);
        case "June":
        case "Jun.":
        case "Jun":
            return this.setMonth(6);
        case "July":
        case "Jul.":
        case "Jul":
            return this.setMonth(7);
        case "August":
        case "Aug.":
        case "Aug":
            return this.setMonth(8);
        case "September":
        case "Sep.":
        case "Sep":
            return this.setMonth(9);
        case "October":
        case "Oct.":
        case "Oct":
            return this.setMonth(10);
        case "November":
        case "Nov.":
        case "Nov":
            return this.setMonth(11);
        case "December":
        case "Dec.":
        case "Dec":
            this.setMonth(12);
        default:
        	System.out.println("The month was not valid");
    		return false;
		}
	}
	
	// Ham kiem tra ngay va gan gia tri
	public boolean Day(String day) {
		if (isNumeric(day)==true) {
			return this.setDay(Integer.parseInt(day));
		}
		else {
			System.out.println("The day was wrong");
			return false;
		}
	}
	
	
	public MyDate(String date) {
		super();
		Scanner sc;
		String year,month,day;
		switch (displayType) {
		case 1:
		{
			sc = new Scanner(date).useDelimiter("/");
			year = sc.next();
			month = sc.next();
			day = sc.next();
			break;
		}
		case 2:
		{
			sc = new Scanner(date).useDelimiter("/");
			month = sc.next();
			day = sc.next();
			year = sc.next();
			break;
		}
		default:
			sc = new Scanner(date).useDelimiter("/");
			day = sc.next();
			month = sc.next();
			year = sc.next();
			break;
		}
		sc.close();
		if(this.Year(year) && this.Month(month) && this.Day(day)) {
			System.out.println("The date setting has been completed");
			System.out.println("===================================");
		}
		else{
			System.out.println("The date setting has not been completed\n"+
					"Reverting back to default date");
			MyDate tmpDate = new MyDate();
			this.year=(tmpDate.year);
			this.month=(tmpDate.month);
			this.day=(tmpDate.day);
		}
	}
	
	// Khoi dung tu cac string
	public MyDate(String day,String month,String year) {
		if(this.Year(year) && this.Month(month) && this.Day(day)) {
			System.out.println("The date setting has been completed");
			System.out.println("===================================");
		}
		else{
			System.out.println("The date setting has not been completed\n"+
					"Reverting back to default date");
			MyDate tmpDate = new MyDate();
			this.year=(tmpDate.year);
			this.month=(tmpDate.month);
			this.day=(tmpDate.day);
		}
	}
	
	// Getter and Setter
	public int getDay() {
		return day;
	}

	public boolean setDay(int day) {
		if (day<0 || day>31 ) {
			System.out.println("The day is not valid");
			return false;
		}
		if (day>0 && day <29){
            this.day = day;
            System.out.println("The day is valid");
            return true;
        }
        else 
        {
            // Neu la ngay 29
            if (day==29){
                // Thoa man neu thang do khong phai thang 2
                if (this.month!=2){
                    this.day = day;
                    System.out.println("The day is valid");
                    return true;
                }
                // Thoa man neu do la nam nhuan
                if (this.year%4==0){
                    if (!(this.year%100==0 && this.year%400!=0)){
                    	System.out.println("The day is valid");
                    	this.day = day;
                        return true;
                    }
                }
            }
            // Neu la ngay 30
            if (this.day==30){
                if (this.month!=2){
                	System.out.println("The day is valid");
                	this.day = day;
                    return true;
                }
            }
            // Neu ngay la 31
            if (day==31){
                switch (this.month){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    	System.out.println("The day is valid");
                    	this.day = day;
                    	return true;
                    default:
                    return false;
                }
            }
        System.out.println("The day is not valid");
        return false;
        }
		
	}
	
	public int getMonth() {
		return month;
	}

	public boolean setMonth(int month) {
		if (month<13 || month>0) {
			System.out.println("The month is valid");
			this.month = month;
			return true;
		}
		else {
			System.out.println("The month is not valid");
			return false;
		}
	}

	public int getYear() {
		return year;
	}

	public boolean setYear(int year) {
		if (year<0) {
			System.out.println("The year is not valid");
			return false;
		}
		System.out.println("The year is valid");
		this.year = year;
		return true;
	}
	// Ham chuyen doi tu so sang chu cua ngay,thang va nam
	public String dayString() {
		switch (day) {
		case 1:
		case 21:
			return (day +"st");
		case 2:
		case 22:
			return (day +"nd");
		case 3:
		case 23:
			return (day +"rd");
		default:
			return (day +"th");
		}
	}
	public String monthString() {
		switch (month) {
		case 1:
			return "January";
		case 2:
			return "Febuary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		default:
			return "December";
		}
	}
	
	// Ham in ngay ra man hinh
	public void print() {
//		switch (displayType) {
//		case 1:
//			System.out.println("Today is " + this.year 
//					+ "/" + this.month
//					+ "/" + this.day);
//			break;
//		case 2:
//			System.out.println("Today is " + this.month 
//					+ "/" + this.day
//					+ "/" + this.year);
//			break;
//		default:
//			System.out.println("Today is " + this.day 
//					+ "/" + this.month
//					+ "/" + this.year);
//		}
		System.out.println(this.monthString() + " " + this.dayString() + " " + year);
	}
	
	public String DateString() {
		switch (displayType) {
		case 1:
			return (year + "/" + month	+ "/" + day);
		case 2:
			return (month+ "/" + day + "/" + year);
		default:
			return (day	+ "/" + month+ "/" + year);
		}
	}
	public void printDateString() {
		System.out.println(DateString());
	}
	
	public void accept(Scanner sc) {
		System.out.println("Please enter the date:");
		MyDate date = new MyDate(sc.nextLine());
		this.year=(date.year);
		this.month=(date.month);
		this.day=(date.day);
	}
	


}
