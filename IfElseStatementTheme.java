public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокласса на язык Java.");
        int age = 20;
        double height = 1.86;
        char gender = 'm';
        char firstLetterName = "Roma".charAt(0);
        if(age > 20) {
            System.out.println("Совсем старик!");
        } else {
            System.out.println("Совсем зеленый!");
        }
        if (gender != 'm') {
            System.out.println("Поздравляю вы женщина!");
        } else {
            System.out.println("Поздравляю вы мужчина!");
        }
        if (height < 1.80) {
            System.out.println("Коротышка!");
        } else {
            System.out.println("Небоскрёб!");
        }
        if(firstLetterName == 'M') {
            System.out.println("Тебя зовут Миша?");
        } else if (firstLetterName == 'I') {
            System.out.println("Тебя зовут Игорь?");
        } else if (firstLetterName == 'R') {
            System.out.println("Точно Рома!");
        }

        System.out.println("\n2. Поиск min и max числа.");
        int a = 5;
        int b = 145;
        if (a == b) {
            System.out.println("Значения равны");
        } else if (a > b) {
            System.out.println("max: " + a + "\nmin: " + b);
        } else {
            System.out.println("max: " + b + "\nmin: " + a);
        }

        System.out.println("\n3. Проверка числа.");
        int num = 4;
        System.out.println("Исходное число " + num);
        if (num == 0) {
            System.out.println("Число равно 0");
        } else {
            if(num % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
            if (num > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        int num1 = 123;
        int num2 = 444;
        System.out.println("Исходные числа: " + num1 +  " " + num2);
        int hundredsNum1 = num1 / 100;
        int hundredsNum2 = num2 / 100;
        byte notIdenticalNum = 3;
        if(hundredsNum2 == hundredsNum1) {
            System.out.println("Сотни " + hundredsNum1);
            notIdenticalNum -= 1;
        }
        int tensNum1 = num1 / 10 % 10;
        int tensNum2 = num2 / 10 % 10;
        if(tensNum2 == tensNum1) {
            System.out.println("Десятки " + tensNum2);
            notIdenticalNum -= 1;
        }
        int onesNum1 = num1 % 10;
        int onesNum2 = num2 % 10;
        if(onesNum2 == onesNum1) {
            System.out.println("Единицы " + onesNum2);
            notIdenticalNum -= 1;
        }
        if(notIdenticalNum == 3) {
            System.out.println("Нет одинаковых разрядов");
        }

                System.out.println("\n5.Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("маленькая буква: " + symbol);
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("большая буква: " + symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("число: " + symbol);
        } else {
            System.out.println("Ни буква, ни число: " + symbol);
        }

        System.out.println("\n6.Сумма вклада и начисленных банком процентов.");
        int deposit = 300_000;
        int interest = 0;
        if (deposit < 100_000) {
            interest = 5;
        } else if (deposit <= 300_000) {
            interest = 7;
        } else if (deposit > 300_000) {
            interest = 10;
        }
        int chargeInterest = deposit * interest / 100;
        int sum = deposit + chargeInterest;
        System.out.println("Сумма вклада = " + deposit + "\nНачисленный процент = " +
                chargeInterest + "\nИтоговая сумма = " + sum);

        System.out.println("\n7. Определение оценки по предметам.");
        int historyScore = 2;
        int historyPercent = 59;
        if (historyPercent <= 73) {
            historyScore = 3;
        } else if (historyPercent <= 91) {
            historyScore = 4;
        } else {
            historyScore = 5;
        }
        int programmingPercent = 91;
        int programmingScore = 2;
        if (programmingPercent <= 73) {
            programmingScore = 3;
        } else if (programmingPercent <= 91) {
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }
        int averageScore = (historyScore + programmingScore) / 2;
        int averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println(historyScore + " = История\n" + programmingScore +
                " = Программирование\n" + "Средний бал по предметам = " + averageScore +
                "\nСредний процент по предметам = " + averagePercent);

        System.out.println("\n8. Расчет прибыли за год.");
        int rent = 5_000;
        int sale = 13_000;
        int costPrice = 9_000;
        int profit = (sale - rent - costPrice) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год = +" + profit);
        } else {
            System.out.println("Прибыль за год = " + profit);
        }

        System.out.println("\n9. Подсчет количество банкнот.");
        int sumBanknoteAtm = 65;
        int hundredsAtm = 10;
        int tensAtm = 5;
        int onesAtm = 50;
        int sumCashAtm = hundredsAtm * 100 + tensAtm * 10 + onesAtm * 1;
        int sumCashDrop = 567;
        int banknoteDropHundred = sumCashDrop / 100;
        int banknoteDropTens = sumCashDrop % 100 / 10;
        int banknoteDropOnes = sumCashDrop % 10;
        int sumBanknoteDrop = banknoteDropOnes + banknoteDropTens + banknoteDropHundred;
        int count = 0;
        if (sumCashDrop <= sumCashAtm) {
            System.out.println("Сумма к выдаче = " + sumCashDrop);
            if (banknoteDropHundred <= hundredsAtm) {
                count += banknoteDropHundred;
                System.out.print("Сотни = " + banknoteDropHundred);
            } else {
                banknoteDropTens = (banknoteDropHundred - hundredsAtm) * 10 + banknoteDropTens;
                System.out.print("Сотни = " + hundredsAtm);
                count += hundredsAtm;
            }
            if (banknoteDropTens <= tensAtm) {
                count += banknoteDropTens;
                System.out.print(" Десятки = " + banknoteDropTens);
            } else {
                banknoteDropOnes = (banknoteDropTens - tensAtm) * 10 + banknoteDropOnes;
                System.out.print(" Десятки = " + tensAtm);
                count += tensAtm;
            }
            if (banknoteDropOnes <= onesAtm) {
                count += banknoteDropOnes;
                System.out.print(" Единицы = " + banknoteDropOnes);
            } else if (sumBanknoteDrop > sumBanknoteAtm) {
                System.out.print("Извините в банкомате нет столько наличности");
            }
            System.out.println("\nВсего банкнот: " + count);
        } else {
            System.out.print("Извините в банкомате нет столько наличности");
        }
    }
}