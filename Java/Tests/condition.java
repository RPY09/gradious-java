import java.util.Scanner;
public class condition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // absolute(sc);
        // cartesian(sc);
        // year(sc);
        // vowel(sc);
        // age(sc);
        // ticket(sc);
        // traffic(sc);
        // income(sc);
        // electric(sc);
        // battery(sc);
        // season(sc);
        // employee(sc);
        // monkey(sc);
        // small(sc);
        // large(sc);
        // middel(sc);
        // ascend(sc);
    }
    static void absolute(Scanner sc){
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("The absoulte value is:"+n*-1);
        }
        else{
            System.out.println("The absoulte value is:"+n);
        }
    }
    static void cartesian(Scanner sc){
        System.out.println("Enter X coordinates: ");
        int x=sc.nextInt();
        System.out.println("Enter Y coordinate: ");
        int y=sc.nextInt();
        if(x>0&&y>0){
            System.out.println("The points ("+ x + " , "+ y+") lies in 1st Quadrant of Cartesian plane");
        }
        else if(x<0&&y>0){
            System.out.println("The points("+ x + " , "+ y+") lies in 2nd Quadrant of Cartesian plane");
        }else if(x<0&&y<0){
            System.out.println("The points("+ x + " , "+ y+") lies in 3rd Quadrant of Cartesian plane");
        }else if(x>0&&y<0){
            System.out.println("The points("+ x + " , "+ y+") lies in 4th Quadrant of Cartesian plane");
        }
        else{
            System.out.println("The points ("+ x + " , "+ y+")lies at Origin of the Cartesian plane");
        }
    }
    static void year(Scanner sc){
        System.out.println("Enter a Year: ");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("The year "+year+" is a Leap Year..! ");
        }
        else {
            System.out.println("The year "+year+" is NOT a Leap Year..! ");
        }
    }
    static void vowel(Scanner sc){
        System.out.println("Enter a character:");
        String letter = sc.nextLine().toLowerCase();
        if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
            System.out.println("The letter " + letter + " is a Vowel letter");
        }
        else{
            System.out.println("The letter "+letter+" is NOT a Vowel letter");
        }
    }
    static void age(Scanner sc){
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        if(age>0&&age<=12){
            System.out.println("child");
        }
         else if(age>=13&&age<=17){
            System.out.println("Teen");
        } else if(age>=18&&age<=60){
            System.out.println("Adult");
        }
         else if(age>60){
            System.out.println("Senior");
        }
        else{
            System.out.println("invalid age");
        }
    }
    static void ticket(Scanner sc){
        System.out.println("Enter number of child/s :");
        int child = sc.nextInt();
        System.out.println("Enter number of adult/s:");
        int adult = sc.nextInt();
        System.out.println("Enter number of Senior/s:");
        int Senior = sc.nextInt();
        System.out.println("Enter Ticket amount:");
        int tickets = sc.nextInt();

        double childTotal = 0, adultTotal = 0, seniorTotal = 0;

        if(child >= 0){
            childTotal = (tickets * 0.5) * child;
            System.out.println("Ticket price for " + child + " child/s are: " + childTotal);
        }
        if(adult >= 0){
            adultTotal = adult * tickets;
            System.out.println("Ticket price for " + adult + " adult/s are: " + adultTotal);
        }
        if(Senior >= 0){
            seniorTotal = (tickets * 0.95) * Senior;
            System.out.println("Ticket price for " + Senior + " senior/s are: " + seniorTotal);
        } else {
            System.out.println("Invalid number of members");
        }

        double total = childTotal + adultTotal + seniorTotal;
        System.out.println("Total ticket price for " + child + " children/s, " + adult + " adult/s, " + Senior + " senior/s is: " + total);
    }

    static void traffic(Scanner sc){
        System.out.println("Enter Signal(RED || YELLOW || GREEN):");
        String colo=sc.nextLine();
        if(colo.equalsIgnoreCase("red")){
            System.out.println("STOP..");
        }
        else if(colo.equalsIgnoreCase("yellow")){
            System.out.println("WAIT..");
        }
        else if(colo.equalsIgnoreCase("green")){
            System.out.println("GOO..!");
        }
        else{
            System.out.println("Not a signal");
        }
    }
    static void income(Scanner sc){
        System.out.println("Enter Your income: ");
        double income=sc.nextInt();
        double tax=0;
       if (income <= 300000) {
        tax = 0;
    } else if (income <= 600000) {
        tax = (income - 300000) * 0.05;
    } else if (income <= 900000) {
        tax = (300000 * 0.05) + (income - 600000) * 0.10;
    } else if (income <= 1200000) {
        tax = (300000 * 0.05) + (300000 * 0.10) + (income - 900000) * 0.15;
    } else if (income <= 1500000) {
        tax = (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (income - 1200000) * 0.20;
    } else {
        tax = (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (300000 * 0.20) + (income - 1500000) * 0.30;
    }
    System.out.println("Tax Amount : " + tax);
    }

    static void electric(Scanner sc){
        System.out.println("Enter Electric unit: ");
        double elec=sc.nextInt();
        double amount=0;
        if(elec<=100){
            amount=elec*3;
            System.out.println(amount+" rs");
        }
        else if(elec<=200){
            amount=(100*3)+(elec-100)*4;
            System.out.println(amount+" rs");
        }
        else if(elec<=300){
            amount=(100*3)+(100*4)+(elec-200)*5;
            System.out.println(amount+" rs");
        }
        else{
            amount=(100*3)+(100*4)+(100*5)+(elec-300)*6;
            System.out.println(amount+" rs");
        }
    }

    static void battery(Scanner sc){
        System.out.println("Enter Battery Percentage: ");
        int battery=sc.nextInt();
        if(battery>=0 && battery<=100){
            switch (battery/25) {
                case 0:
                    System.out.println("Low battery");
                    break;
                case 1:
                    System.out.println("medium level");
                    break;
                case 2:
                    System.out.println("avarage level");
                    break;
                case 3:
                System.out.println("High battery");
            }
        }
        else{
            System.out.println("invalid percentage");
        }
    }

    static void season(Scanner sc){
        System.out.println("Enter month number:");
        int month=sc.nextInt();
          switch (month){
            case 1: case 2: case 12:
                System.out.println( "winter season");
                break;
            case 3: case 4: case 5:
                System.out.println( "summer season");
                break;
            case 6: case 7: case 8: case 9:
                System.out.println( "monsoon season");
                break;
            case 10: case 11:
                System.out.println( "autumn season");
                break;
        }

    }

    static void employee(Scanner sc){
        System.out.println("Is this a Weekday(True || False ):");
        boolean week=sc.nextBoolean();
        boolean vac = false;
        if(!week){
            System.out.println("Is this is a Vaction(True || False): ");
            vac=sc.nextBoolean();
        }
        if(!week || vac){
            System.out.println("You can take rest..!");
        }
        else{
            System.out.println("You can't  take rest..");
        }

    }

    static void monkey(Scanner sc){
        System.out.println("Is monkey1 is laughing(True || False):");
        boolean mon1=sc.nextBoolean();
        System.out.println("Is monkey2 is laughing(True || False):");
        boolean mon2=sc.nextBoolean();
        if((mon1 && mon2)||(!mon1 && !mon2)){
            System.out.println("We are in trouble..!");
        }
        else{
            System.out.println("We are safe..!");

        }
    }

    static void small(Scanner sc){
        System.out.println("Enter a number1: ");
        int num1=sc.nextInt();
        System.out.println("Enter a number2: ");
        int num2=sc.nextInt();
        System.out.println("Enter a number3: ");
        int num3=sc.nextInt();
        System.out.println("Enter a number4: ");
        int num4=sc.nextInt();
        if(num1<num2&&num1<num3&&num1<num4){
            System.out.println(num1+" is small");
        }
        else if(num2<num1&&num2<num3&&num2<num4){
            System.out.println(num2+" is small");
        }
        else if(num3<num2&&num3<num1&&num3<num4){
            System.out.println(num3+" is small");
        }
        else if(num4<num2&&num4<num3&&num4<num1){
            System.out.println(num4+" is small");
        }
    }
    static void large(Scanner sc){
        System.out.println("Enter a number1: ");
        int num1=sc.nextInt();
        System.out.println("Enter a number2: ");
        int num2=sc.nextInt();
        System.out.println("Enter a number3: ");
        int num3=sc.nextInt();
        System.out.println("Enter a number4: ");
        int num4=sc.nextInt();
        System.out.println("Enter a number5: ");
        int num5=sc.nextInt();

        int large=num1;
        if(num2>large){
            large=num2;
        }
        if(num3>large){
            large=num3;
        }
        if(num4>large){
            large=num4;
        }
        if(num5>large){
            large=num5;
        }
        System.out.println(large+" is largest number");
    }

    static void middel(Scanner sc){
         System.out.println("Enter a number1: ");
        int num1=sc.nextInt();
        System.out.println("Enter a number2: ");
        int num2=sc.nextInt();
        System.out.println("Enter a number3: ");
        int num3=sc.nextInt();
        if(num1>num2&&num1<num3 ||num1<num2&&num1>num3){
            System.out.println(num1+" is middle number");
        }
        else if(num2>num1&&num2<num3 || num2<num1&&num2>num3){
            System.out.println(num2+" is middle number");
        }
        else if(num3>num2&&num3<num1 || num3<num2&&num3>num1){
            System.out.println(num3+" is middle number");
        }
    }

    static void ascend(Scanner sc){
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int[] arr = {num1, num2, num3};
        java.util.Arrays.sort(arr);

        System.out.println("Numbers in ascending order:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
    
}
