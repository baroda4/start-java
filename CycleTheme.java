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

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int count = 0;
        num = 3242592;
        int numOut = 0;
        for(i = 0; i <= 6; i++) {
            if(num % 10 == 2) {
                count++;
            }
        System.out.println(count);
        }
    }
}