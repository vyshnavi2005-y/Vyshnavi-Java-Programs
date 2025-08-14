import java.util.Scanner;
public class RomanNumberSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        int number = scanner.nextInt(); // You can change this to test other numbers (1-10)
        String roman;

        switch (number) {
            case 1:
                roman = "I";
                break;
            case 2:
                roman = "II";
                break;
            case 3:
                roman = "III";
                break;
            case 4:
                roman = "IV";
                break;
            case 5:
                roman = "V";
                break;
            case 6:
                roman = "VI";
                break;
            case 7:
                roman = "VII";
                break;
            case 8:
                roman = "VIII";
                break;
            case 9:
                roman = "IX";
                break;
            case 10:
                roman = "X";
                break;
            case 11:
                roman = "XI";
                break;
            default:
                roman = "Invalid number! Please enter a number between 1 and 10.";
        }

        System.out.println("Roman numeral for " + number + " is " + roman);
    }
}
