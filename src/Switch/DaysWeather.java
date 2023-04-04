package Switch;
import java.util.Scanner;
public class DaysWeather {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("what type of day is it?");
        String weather = input.next(System.in.toString());




            switch (weather) {
                case "sunny day":
                    System.out.println("Take your sunglasses");

                case "windy day":
                    System.out.println("Take your jacket");

                case " snowy day":
                    System.out.println("STAY AT Home");

                default:
                    System.out.println("eat");
            }
            }


        }

