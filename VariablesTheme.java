public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte numCpu = 4;
        short lineCore = 5;
        int series = 3337;
        long productCode = 30800000000000513L;
        float ghzCpu = 1.80f;
        double randomAccessMemory = 8;
        char modify = 'u';
        boolean unlockedCpuMultiplier = false;
        System.out.println("Производитель процессора: intel " + "\nЛинейка: Core i" + lineCore +
            "\nСерия процессора: " + series + modify + "\nЧастота процессора: " + ghzCpu +
            "ghz " + "\nколичество ядер: " + numCpu + "\nОперативная память: " +
            randomAccessMemory + " GB"+ "\nРазблокированный множитель: " + unlockedCpuMultiplier +
            "\nКод продукта: " + productCode);

        System.out.println("\n2.Расчет стоимости товара со скидкой.");
        Short penPrice = 100;
        Short bookPrice = 200;
        int sumDiscount = (penPrice + bookPrice) * 11 / 100;;
        int discountPrice = penPrice + bookPrice - sumDiscount;
        System.out.println("сумма скидки = " + sumDiscount + " руб." +
            "\nвсего сумма со скидкой = " + discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    A   V     V   A\n" + "   J   A A   V   V   A A\n" + 
            "J  J  AAAAA   V V   AAAAA\n" + " JJ  A      A  V   A     A");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte numByte = 127;
        short numShort = 32_767;
        int numInt = 2_147_483_647;
        long numLong = 9_223_372_036_854_775_807l;
        System.out.println("byte: " + numByte + "\n" + "max: " + ++numByte + "\n" + "min: " + 
            --numByte + "\n" + "short: " + numShort + "\n" + "max: " + ++numShort + "\n" + 
            "min: " + --numShort + "\n" +  "int: " + numInt + "\n" + "max: " + ++numInt + "\n" +
            "min: " + --numInt + "\nlong: " + numLong + "\n" + "max: " + ++numLong + "\n" +
            "min: " + --numLong);

        System.out.println("\n5. Перестановка значений переменных:");
        int a = 2;
        int b = 5;

        System.out.println("5.1 С помощью третьей переменной Исходные значения a=2, b=5");
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + " b = " + b);

        System.out.println("5.2 С помощью арифметической операции Исходные данные a=5, b=2.");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " b = " + b);

        System.out.println("5.3 С помощью побитовой операции Исходные данные a=2, b=5:");
        b = b ^ a;
        a ^= b;
        b ^= a;
        System.out.println("a = " + a + " b = " + b);

        System.out.println("\n6. Вывод символов и их кодов.");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char lowbar = '_';
        System.out.println(hash + " " + (int) hash +"\n" + ampersand + " " + (int) ampersand + "\n" +
            at + " " +(int) at + "\n"+ caret + " " + (int) caret + "\n" + lowbar +" " +
            (int) lowbar);

        System.out.println("\n7. Вывод в консоль Дюка");
        char slash = '/';
        char backSlash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        lowbar = '_';
        System.out.println("    " + slash + backSlash + "   \n" + "   " + slash + "  " +
            backSlash + "\n  " + slash + lowbar + openParenthesis + " " + closeParenthesis + 
            backSlash + "\n " + slash + "      " + backSlash + "\n" + slash + lowbar + lowbar +
            lowbar + lowbar + slash + backSlash + lowbar + lowbar + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num / 10 % 10;
        int ones = num % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println(num + " содержит:\n" + hundreds + " сотня(ен)\n" + tens + 
            " десятка(ов)\n" + ones + " единиц(ы)\n" + "сумма чисел = " + sum + 
            "\nпроизведение чисел = " + product);

        System.out.println("\n9. Вывод времени");
        int numSec = 86399;
        int hour = numSec / 3600;
        int minutes = numSec % 3600 / 60;
        int sec = numSec % 60;
        System.out.println(hour + ":" + minutes + ":" + sec);
    }
}