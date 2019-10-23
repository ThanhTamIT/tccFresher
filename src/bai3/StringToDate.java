package bai3;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StringToDate {
    public static void main(String[] args) throws Exception {
        String stringDate = "21/10/2019";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        System.out.println(stringDate + "\t" + date1);
        getDate();
        compareDates();
        convertDateTimestamp();
        convertSimpleDate();
        betweenTwoTime();
    }
    public static void getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        // hiển thị thời gian hiện tại
        System.out.println("Thời gian hiện tại là " + date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Ngày đầu của tháng :" + dateFormat.format(cal.getTime()) );

        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Ngày cuối của tháng : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.DAY_OF_MONTH,100);
        System.out.println("Thời gian hiện tại sau 100 ngày là:"+dateFormat.format(cal.getTime()));
    }
    public static void compareDates() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date firstDate = sdf.parse("06/24/2017");
        Date secondDate = sdf.parse("06/30/2017");
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.setTime(firstDate);
        cal2.setTime(secondDate);

        if(cal1.after(cal2)){
            System.out.println("Date1 is after Date2");
        }

        if(cal1.before(cal2)){
            System.out.println("Date1 is before Date2");
        }

        if(cal1.equals(cal2)){
            System.out.println("Date1 is equal Date2");
        }
    }
    private static void convertDateTimestamp(){
        // lấy ngày giờ hiện tại
        Date now = new Date();
        System.out.println(now);

        // chuyển Date sang Timestamp
        Timestamp timestamp = new Timestamp(now.getTime());
        System.out.println(timestamp);

        // chuyển Timestamp sang Date
        Date last = new Date(timestamp.getTime());
        System.out.println(last);
    }
    private static void convertSimpleDate() throws ParseException {

        String date="2010/11/1 05:12:59";

        try {
            java.util.Date sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(date);
            String date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(sdf);
            String date2 = new SimpleDateFormat("MMM yyyy,dd HH:mm:ss").format(sdf);
            System.out.println(date1);
            System.out.println(date2);

        } catch (ParseException e) {
        }
    }

    private static void betweenTwoTime(){
        LocalDate now = LocalDate.now();
        LocalDate sixDaysBehind = now.minusDays(6);
//        Duration duration = Duration.between(now, sixDaysBehind);
//        long diff = Math.abs(duration.toMinutes());

        Period distance = Period.between(now, sixDaysBehind);

        System.out.println("Sự chênh lệch giữa 2 thời gian là " +
                Math.abs(distance.getYears()) + " năm " + Math.abs(distance.getMonths()) + " tháng và " +
                Math.abs(distance.getDays())+ " ngày.");
    }
}
