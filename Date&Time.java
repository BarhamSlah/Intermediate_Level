import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

      void main() {

        try {

            LocalDate localDate = LocalDate.now();  // for current Date
            LocalTime localTime = LocalTime.now();  // for current Time
            LocalDateTime localDateTime = LocalDateTime.now(); // for current Date&Time

            LocalDate localDate2 = LocalDate.of(2007, 11, 4);  // for manually Date
            LocalTime localTime2 = LocalTime.of(1, 51, 2);  // for manually Time
            LocalDateTime localDateTime2 = LocalDateTime.of(2025, 1, 12, 12, 37, 53);  // for manually Date&Time

            // It's up to you , how would you wanna display Date&Time
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy-MM-dd | HH-mm-ss");
            String dateFormatter = localDateTime.format(dateTimeFormatter);
            System.out.println(dateFormatter);


            if(localTime.isAfter(localTime2)){
                System.out.println(localTime +  " is after " + localTime2);
            } else if(localTime.isBefore(localTime2)){
                System.out.println(localTime + " is before " + localTime2);
            } else {
                System.out.println(localTime + " is equal to " + localTime2);
            }


            System.out.println(localDateTime);
            System.out.print(localTime);
            System.out.println(localDate);
            System.out.println(localDateTime2);
            System.out.print(localTime2);
            System.out.println(localDate2);

        // if you encounter invalid input
        }catch (DateTimeException e){
            System.out.println(e.getMessage());
        }

    }
