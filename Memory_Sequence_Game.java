```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MemorySequenceGame {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Blue", "Green", "Yellow", "Purple", "Orange");
        List<String> gameSequence = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int round = 0;

        while (true) {
            System.out.println("Round " + (++round));
            gameSequence.add(colors.get((int) (Math.random() * colors.size())));
            for (String color : gameSequence) {
                System.out.println(color);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 50; i++) System.out.println();
            }

            for (int i = 0; i < gameSequence.size(); i++) {
                System.out.print("Color " + (i + 1) + ": ");
                String guess = scanner.nextLine();
                if (!guess.equalsIgnoreCase(gameSequence.get(i))) {
                    System.out.println("Game Over! You made it to round " + round);
                    return;
                }
            }
        }
    }
}
```