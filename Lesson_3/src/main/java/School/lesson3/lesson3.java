package School.lesson3;

public class lesson3 {
    public static void main(String[] args) {
        System.out.println(getResolt(10, 4));
        printSignNumber(4);
        System.out.println(indentifySignNumber(10));
        printText("banan",2);
        System.out.println(indentifyLeapYear(2100));
        replaceNumbersInArray();
        fillInTheArray();
        multiplyNumbersInArray();
        fillInDiagonalTheArray();
        int[] arr = createArray(3, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static boolean getResolt(int a, int b) {
        return (a + b) >= 10 & (a + b) <= 20;
    }

    public static void printSignNumber(int a) {
        System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");
    }

    public static boolean indentifySignNumber(int a) {
        return a < 0;
    }

    public static void printText(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }

    public static boolean indentifyLeapYear(int year) {
        if (year % 4 == 0 & year % 100 != 0) {
            return true;
        } else {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void replaceNumbersInArray() {
        int[] arr = {1, 0, 1, 0, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillInTheArray() {
        int[] arr = new int[100];
        int value = 1;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value++;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void multiplyNumbersInArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillInDiagonalTheArray() {
        int[][] arr = new int[4][4];
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - 1 - i] = 1;
            arr[i][i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;

        }
        return arr;

    }
}
