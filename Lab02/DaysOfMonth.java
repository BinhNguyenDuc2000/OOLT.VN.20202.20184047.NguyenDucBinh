import java.util.Scanner;
public class DaysOfMonth {
    // Kiem tra mot string co phai la mot so
    public static boolean isNumeric(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            System.out.println(e);
            return false;
        }
    }
    public static void main( String args[]){
        Scanner keyboard = new  Scanner(System.in);
        // Thuc hien kiem tra nam
        int iYear;
        for (;;){
            System.out.println("What year is today?");
            String buffer = keyboard.nextLine();
            if (isNumeric(buffer)){
                iYear=Integer.parseInt(buffer);
                if (iYear>0){
                    break;
                }
            }
            System.out.println("There was an error\nPlease Try again");
        }

        // Thuc hien kiem tra thang
        int iMonth;
        outer:
        for (;;){
            System.out.println("What month is today?");
            String buffer = keyboard.nextLine();
            if ( isNumeric(buffer)){
                iMonth=Integer.parseInt(buffer);
                if (iMonth>0 && iMonth<13){
                    break;
                }
            }
            switch (buffer){
                case "January":
                case "Jan.":
                case "Jan":
                    iMonth=1;
                    break outer;
                case "February":
                case "Feb.":
                case "Feb":
                    iMonth=2;
                    break outer;
                case "March":
                case "Mar.":
                case "Mar":
                    iMonth=3;
                    break outer;
                case "April":
                case "Apr.":
                case "Apr":
                    iMonth=4;
                    break outer;
                case "May":
                case "May.":
                    iMonth=5;
                    break outer;
                case "June":
                case "Jun.":
                case "Jun":
                    iMonth=6;
                    break outer;
                case "July":
                case "Jul.":
                case "Jul":
                    iMonth=7;
                    break outer;
                case "August":
                case "Aug.":
                case "Aug":
                    iMonth=8;
                    break outer;
                case "September":
                case "Sep.":
                case "Sep":
                    iMonth=9;
                    break outer;
                case "October":
                case "Oct.":
                case "Oct":
                    iMonth=10;
                    break outer;
                case "November":
                case "Nov.":
                case "Nov":
                    iMonth=11;
                    break outer;
                case "December":
                case "Dec.":
                case "Dec":
                    iMonth=12;
                    break outer;
                default:
                    break;
            }

            System.out.println("There was an error\nPlease Try again");
        } 
        // Kiem tra ngay
        int iDay;
        outer:
        for (;;){
            System.out.println("What day is today?");
            String buffer = keyboard.nextLine();
            if (isNumeric(buffer)){
                iDay=Integer.parseInt(buffer);
                if (iDay>0 && iDay <29){
                    break;
                }
                else 
                {
                    // Neu la ngay 29
                    if (iDay==29){
                        // Thoa man neu thang do khong phai thang 2
                        if (iMonth!=2){
                            break;
                        }
                        // Thoa man neu do la nam nhuan
                        if (iYear%4==0){
                            if (!(iYear%100==0 && iYear%400!=0)){
                                break;
                            }
                        }
                    }
                    // Neu la ngay 30
                    if (iDay==30){
                        if (iMonth!=2){
                            break;
                        }
                    }
                    // Neu ngay la 31
                    if (iDay==31){
                        switch (iMonth){
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                            break outer;
                            default:
                            break;
                        }
                    }
                }
            }
            System.out.println("There was an error\nPlease Try again");
        }

        System.out.println("Today is " +iDay + "/" + iMonth + "/" + iYear );
        System.exit(0);
    }
}
