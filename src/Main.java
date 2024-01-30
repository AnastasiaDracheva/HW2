import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

                     //task1
            int a = 3;
            int h = 4;
            int AH = a * h;
            int c = 2;
            int sqrt = AH / c;
            System.out.println("Square root is: " + sqrt);

                     //task2
            double Weight = 96.7;
            double Height = 1.93;
            double bmi = Weight / (Height * Height);
            System.out.println("BMI = " + bmi);

                      //task3
            double C = 40.6;
            double F = ((9/5)* C) + 32.0;
            System.out.println("F = " + F);

                      //task4
            short GO = 32767;
            GO++;
            short var10001 = GO++;
            System.out.println("GO = " + var10001);

                      //task5
            double klaus = 23.29;
            int klaus2 = (int)klaus;
            System.out.println("Klaus = " + klaus);
            System.out.println("Klaus2 = " + klaus2);

                      //task6
            int age = 13;
            boolean isAgeBigger = age <= 18;
            System.out.println("Age " + isAgeBigger);

                       //task7
            char y = 'a';
            char z = 'a' + 2;
            System.out.println(y);
            System.out.println(z);

                   //task8
            Scanner console = new Scanner(System.in);
            String name = console.nextLine();
            int number = console.nextInt();
            System.out.println("Name: " + name);
            System.out.println("Age: " + number);
        }
    }

}