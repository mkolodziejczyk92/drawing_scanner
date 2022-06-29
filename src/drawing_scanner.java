import java.util.Scanner;

public class drawing_scanner {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        kindsOfShapes();

        playing();

        playingAgain();

    }

    private static void kindsOfShapes() {

        System.out.println("What shape do you want to draw?");
        System.out.println("[1] rectangle ");
        System.out.println("[2] chess board ");
        System.out.println("[3] empty rectangle");
        System.out.println("[4] triangle");
        System.out.println("[5] Christmas Tree");
        System.out.println("[6] X-man sign");
    }

    private static void playingAgain() {
        System.out.println("Do you want to draw again?");
        System.out.println("Enter [1] for YES or enter [2] for NO. Enter [9] if you need to remind a list of shapes.");
        int yesOrNo = loadingNumber();
        switch (yesOrNo) {
            case 1:
                playing();
                playingAgain();
                break;
            case 2:
                System.out.println("Thank You for playing! BB");
                break;
            case 9:
                kindsOfShapes();
                playing();
                playingAgain();
                break;

            default:
                System.out.println("Wrong number!");
                playingAgain();
        }
    }


    private static void playing() {
        int chosenNumber = chosenNumber();
        switch (chosenNumber) {
            case 1:
                paintingRectangleMethod();
                break;
            case 2:
                paintingChessBoardMethod();
                break;
            case 3:
                paintingEmptyRectangle();
                break;
            case 4:
                paintingTriangel();
                break;
            case 5:
                paintingChristmasTree();
                break;
            case 6:
                paintingXmanSign();
            case 9:
                kindsOfShapes();
                playing();
                break;
            default:
                System.out.println("Wrong number! Enter a number from 1 to 6!");
                playing();


        }
    }

    private static int chosenNumber() {
        System.out.println("Let's choose a number of shapes:");
        return scanner.nextInt();
    }

    static int loadingNumber() {

        return scanner.nextInt();
    }

    static char loadingCharacter() {

        return scanner.next().charAt(0);
    }

    private static void paintingXmanSign() {
        System.out.println("Enter a character:");
        char c = loadingCharacter();
        System.out.println("Enter a high of X-sign:");
        int a = loadingNumber();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }


    private static void paintingChristmasTree() {
        System.out.println("Enter a character:");
        char c = loadingCharacter();
        System.out.println("Enter a high of tree:");
        int a = loadingNumber();

        for (int i = 0; i < a; i++) {
            String result = "";
            for (int j = 0; j < a - 1 - i; j++) {
                result += " ";
            }
            int d = 1 + 2 * i;
            for (int j = 0; j < d; j++) {
                result += c;

            }
            System.out.println(result);

        }
    }


    private static void paintingTriangel() {
        System.out.println("Enter a character:");
        char c = loadingCharacter();
        System.out.println("Enter a length of side:");
        int a = loadingNumber();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(c + " ");
                if (i == j) {
                    break;
                }
            }
            System.out.println(" ");
        }
    }

    private static void paintingEmptyRectangle() {
        System.out.println("Enter a character:");
        char c = loadingCharacter();
        System.out.println("Enter a length of first side:");
        int a = loadingNumber();
        System.out.println("Enter a length of second side:");
        int b = loadingNumber();

        for (int i = 1; i <= a; i++) {
            System.out.println();
            for (int j = 1; j <= b; j++) {
                if (i > 1 && i < a && j > 1 && j < b) {
                    System.out.print("  ");
                } else {
                    System.out.print(c + " ");

                }
            }
        }
        System.out.println(" ");
    }


    private static void paintingChessBoardMethod() {
        System.out.println("Enter a first character:");
        char a = loadingCharacter();
        System.out.println("Enter a second character");
        char b = loadingCharacter();
        System.out.println("Enter a length of side:");
        int i = loadingNumber();
        for (int j = 0; j < i; j++) {
            System.out.println(" ");
            if (j % 2 == 0) {
                for (int k = 0; k < i; k++) {
                    if (k % 2 == 0) {
                        System.out.print(a + "  ");
                    } else {
                        System.out.print(b + "  ");
                    }
                }
            } else {
                for (int k = 0; k < i; k++) {
                    if (k % 2 != 0) {
                        System.out.print(a + "  ");
                    } else {
                        System.out.print(b + "  ");
                    }
                }


            }
        }
        System.out.println(" ");
    }

    private static void paintingRectangleMethod() {
        System.out.println("Enter a character:");
        char a = loadingCharacter();
        System.out.println("Enter a length of first side:");
        int b = loadingNumber();
        System.out.println("Enter a length of second side:");
        int c = loadingNumber();
        for (int i = 0; i < b; i++) {
            System.out.println();
            for (int j = 0; j < c; j++) {
                System.out.print(a + " ");
            }
        }
        System.out.println(" ");
    }
}

