import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String userInput;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter some text here please: ");
        userInput = input.next();
        System.out.printf("You entered %s ", userInput);
        if (StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a number.");
        }
            System.out.println(userInput + " is not a number"); {

        }


        System.out.println(StringUtils.swapCase(userInput));
        System.out.printf("\n " +StringUtils.reverse(userInput));



    }

}
