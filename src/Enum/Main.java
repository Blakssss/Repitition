package Enum;

public class Main {
    void isRainbow(rainbow here){
        switch (here){
            case RED -> System.out.println("The rainbow is " + rainbow.RED);
            case BLUE -> System.out.println("The rainbow is " + rainbow.BLUE);
            case YELLOW -> System.out.println("The rainbow is " + rainbow.YELLOW);
        }
    }

    public static void main(String[] args) {
        rainbow no = rainbow.RED;
        new Main().isRainbow(rainbow.BLUE);

    }
}
