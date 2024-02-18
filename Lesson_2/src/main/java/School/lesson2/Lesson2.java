package School.lesson2;

public class Lesson2 {
    public static void main(String[] args){
        printThreeWords();
        
        checkSumSignV1();
        
        checkSumSignV2();
        
        printColor();
        
        compareNumbersV1();
        
        compareNumbersV2();
        }
    
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }
    
    public static void checkSumSignV1(){
        int a = 3;
        int b = 4;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    
    public static void checkSumSignV2(){
        int a = 3;
        int b = 4;
        int sum = a + b;
        System.out.println(sum >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }
    
    public static void printColor(){
        int value = 3;
        if (value < 0){
            System.out.println("Красный");
        } else {
            if (value <= 100){
                System.out.println("Желтый");
        }
            else {
                System.out.println("Зеленый");
            }
        }
    }
    
    public static void compareNumbersV1(){
        int a = 9999;
        int b = 4;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    
    public static void compareNumbersV2(){
        int a = 3;
        int b = 4;
        System.out.println(a >= b? " a >= b" : "a < b");
    }

}
