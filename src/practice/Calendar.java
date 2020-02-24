package practice;

public class Calendar {
    public static void main(String[] args) {
        CalendarPrint();
    }
    public static void CalendarPrint(){//(int year, String separator)
        for(int i=1; i<13; i++){
            for(int j=1; j<31; j++){
                System.out.println(i+"/"+j+"/"+"2020");//(..seperator+.year)
            }
        }
    }
}
