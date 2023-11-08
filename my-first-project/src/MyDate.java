public class MyDate {

    private int day;
    private int month;
    private int year;

    void createDate(int d,int m,int y)
    {
        day=d;
        month=m;
        year=y;
    }

    void displayDate()
    {
        System.out.println("Date Is: "+day+"/"+month+"/"+year);
    }
}
