package qa.guru;

public class JavaHomework1 {
    public static void main(String[] args) {
        int intA = 220;
        int intB = 100;
        String apple = "apple";
        int costApple = 170;
        int bigInt = 2147483647;
        int varInt = 1000;
        double varDouble = 11.11;

        //Математические операторы
        System.out.println("1. Математические операторы:");
        System.out.println("intA + intB = " + (intA + intB));
        System.out.println("intA - intB = " + (intA - intB));
        System.out.println("intA * intB = " + (intA * intB));
        System.out.println("intA / intB = " + (intA / intB));
        System.out.println("intA % intB = " + (intA % intB));
        System.out.println("++intA = " + (++intA));
        System.out.println("++intB = " + (--intB));

        // Логические операторы
        System.out.println("2. Логические операторы:");
        if (apple.equals("orange") && (costApple == 170)) {
            System.out.println("Это апельсин за 220 рублей");
        }
            else if(apple.equals("apple") && (costApple == 150)){
            System.out.println("Это яблоко за " + costApple + " рублей");
            }
            else{
            System.out.println("Это яблоко за " + costApple + " рублей");
        }

        //Переполнения при вычислениях
        System.out.println("3. Пример переполнения:");
        bigInt = bigInt + 1;
        System.out.println("bigInt + 1 = " + bigInt);

        //Вычисления комбинаций типов данных (int и double)
        System.out.println("4. Вычисления комбинаций типов данных (int и double):");
        System.out.println("int + double = " + (varInt + varDouble));
        System.out.println("int - double = " + (varInt - varDouble));
        System.out.println("int * double = " + (varInt * varDouble));
        System.out.println("int / double = " + (varInt / varDouble));
        System.out.println("int % double = " + (varInt % varDouble));

    }

}
