public class CycleTheme {
    public static void main (String[] args) {
        System.out.println("1. Подсчет суммы четных и не четных");
        int i = -10;
        int sumEvenNum = 0;
        do {
            if(i % 2 == 0) {
                sumEvenNum += i;
            }
            i++;
        } while(i <= 21);
        i = -10;
        int sumOddNum = 0;
        do {
            if(i % 2 != 0) {
                sumOddNum += i;
            }
        i++;
        } while(i <= 21);
        System.out.println("Сумма четных X = " + sumEvenNum + "\nСумма нечетных чисел = Y" +
                sumOddNum);

        System.out.println("\n2.Вывод чисел в интервале(min и max) в интервале в порядке убывания ");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        if(num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if(num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }
        int minNum = 0;
        if(num1 < num2 && num1 < num3) {
            minNum = num1;
        } else if(num2 < num1 && num2 < num3) {
            minNum = num2;
        } else {
            minNum = num3;
        }
        for (i = 10; i >= minNum; i--) {
            System.out.print(i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и вывод суммы его чисел");
        int num = 1234;
        int numReverse = 0;
        int sumNum = 0;
        i =-0;
        System.out.print("3.1 Обратная последовательность: ");
        do {
            numReverse = num % 10;
            System.out.print(numReverse); 
            num = num / 10;
            sumNum += numReverse;
            i++;
        } while (i <= 3);
        System.out.println("\n3.2 Сумма чисел = " + sumNum);

        System.out.println("\n4. Вывод чисел в консоль в несколько строк");
        

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int count = 0;
        num = 3242592;
        int numCount = 0;
        int x = num;
        for(i = 0; i <= 6; i++) {
            numCount = x % 10;
            x /= 10;
            if(numCount == 2) {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.println("Число " + num + " содержит " + numCount + " четное количество двоек");
        } else {
            System.out.println("Число " + num + " содержит " + numCount +
                    " нечетное количество двоек");
        }

        System.out.println("\n6. Отображение фигур консоли.");
        char asterix = '*';
        for(i = 0; i <= 4; i++) {
            for(int j = 0; j <= 8; j++) {
                System.out.print(asterix);
            }
            System.out.println(asterix);
        }

        char octothorpe = '#';
        i = 0;
        int j = 5;
        while (i <= 4) {
            while (j != 0) {
                System.out.print(octothorpe);
                j--;
            }
            System.out.println();
            i++;
            j = 5 - i;
        }

        i = 0;
        j = 5;
        char dollarSign = '$';
        do {
            System.out.println(dollarSign);
            do {
                System.out.print(dollarSign);
                j--;
            } while (j <= 3 && j > 2);
            i++;
        } while (i <= 3);

        System.out.println("\n\n9. Определение является ли число счастливым");
        num = 123590;
        int sumNumHalf1 = 0;
        int sumNumHalf2 = 0;
        for(i = 6; i > 3; i--) {
            sumNumHalf2 = sumNumHalf2 + num % 10;
            num = num / 10;
        }
        for(i = 2; i >= 0; i--) {
            sumNumHalf1 = sumNumHalf1 + num % 10;
            num = num / 10;
        }
        if(sumNumHalf1 == sumNumHalf2) {
            System.out.println("Сумма цифр abc = " + sumNumHalf1 + ", Сумма цифр def = " +
            sumNumHalf2 + " \nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр abc = " + sumNumHalf1 + ", Сумма цифр def = " +
            sumNumHalf2 + " \nЧисло не является счастливым");
        }


    }
}
