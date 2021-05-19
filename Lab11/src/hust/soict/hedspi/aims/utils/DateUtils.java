package hust.soict.hedspi.aims.utils;

public class DateUtils {
	public static int compareInt(int a,int b) {
		if (a<b) {
			return -1;
		}
		else {
			if (a==b) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}
	public static int compareDate(MyDate day1,MyDate day2) {
		if (compareInt(day1.getYear(),day2.getYear())!=0) {
			return compareInt(day1.getYear(), day2.getYear());
		}
		else {
			if (compareInt(day1.getMonth(),day2.getMonth())!=0) {
				return compareInt(day1.getMonth(), day2.getMonth());
			}
			else {
				if (compareInt(day1.getDay(),day2.getDay())!=0) {
					return compareInt(day1.getDay(), day2.getDay());
				}
				return 0;
			}
		}
	}
	// Sap xep thu tu tu nho den lon
	public static void sortDate(MyDate listDate[]) {
		for (int i=0;i< listDate.length-1;i++) {
			for (int j=i+1;j< listDate.length;j++) {
				if (compareDate(listDate[i], listDate[j])>0) {
					MyDate tmpDate = listDate[i];
					listDate[i] = listDate[j];
					listDate[j] = tmpDate;
				}
			}
		}
	}
	public static void printList(MyDate listDate[]) {
		for (int i=0;i< listDate.length;i++) {
			listDate[i].printDateString();
		}
	}
}
