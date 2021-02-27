import java.util.Random;

public class App {
    public static void main(String[] args) {

        int number = 10;

        // Sprawdzamy do ktorego z przedzialow nalezy liczba:
        // P1 -> ( -INF, -25 )
        // P2 -> < -25, 0 >
        // P3 -> ( 0, 25 )
        // P4 -> < 25, INF )

        // Sposob 1 - 4 instrukcje if

        /*if (number < -25) {
            System.out.println("P1");
        }

        if (number >= -25 && number <= 0) {
            System.out.println("P2");
        }

        if (number > 0 && number < 25) {
            System.out.println("P3");
        }

        if (number >= 25) {
            System.out.println("P4");
        }*/


        // Sposob 2 - if ... esle if ... else
        if (number < -25) {
            System.out.println("P1");
        }
        else if (number <= 0) {
            System.out.println("P2");
        }
        else if (number < 25) {
            System.out.println("P3");
        }
        else {
            System.out.println("P4");
        }


    }
}
