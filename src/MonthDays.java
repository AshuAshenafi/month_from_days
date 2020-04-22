import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int month = 0;
        String month_name;
        boolean cont = true;

        do{
            System.out.print("\nEnter number of days: ");
            month = keyboard.nextInt();
            keyboard.nextLine();
            if(month < 0){
                System.out.println("Invalid Input (negative number).");
            }
            else if(month < 28  || month > 31){
                System.out.printf("No month has exactly %d days.", month );
            }
            else{
                cont = false;
            }

        }while(cont == true);

            switch(month){
                case 28:
                case 29:
                    month_name = "February";
                    break;
                case 30:
                    month_name = "September April June November";
                    break;
                default:
                    month_name = "January March May July August October";
            }
        System.out.println(month_name);

    }
}
