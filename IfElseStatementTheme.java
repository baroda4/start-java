public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокласса на язык Java.");
        int age = 20;
        double height = 1.86;
        char gender = 'm';
        char firstLetter = 'R';
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
        if(firstLetter == 'M') {
            System.out.println("Тебя зовут Миша?");
        } else if (firstLetter == 'I') {
            System.out.println("Тебя зовут Игорь?");
        } else if (firstLetter == 'R') {
            System.out.println("Точно Рома!");
        }

        System.out.println("\n2. Поиск min и max числа.");
        int a = 5;
        int b = 145;
        if (a != b) {
            if (a < b) {
                System.out.println("min = " + a + "\nmax = " + b);
            } else {
                System.out.println("min = " + b + "\nmax = " + a);
            }
        } else {
            System.out.println("Значения равны");
        }

        System.out.println("\n3. Проверка числа.");
        int num = 4;
        System.out.println("Исходное число " + num);
        if (num == 0) {
            System.out.println("Число = 0");
        } else if(num % 2 == 0) {
            System.out.println("Число четное!");
        } else {
            System.out.println("Число нечетное!");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        int num1 = 123;
        int num2 = 223;
        System.out.println("Исходные числа: " + num1 +  " " + num2);
        if (num1 / 100 != num2 / 100 && num1 / 10 % 10 != num2 / 10 % 10 && num1 % 10 != num2 % 10){
            System.out.println("Равных чисел нет.");
        } else {
            if (num1 / 100 == num2 / 100) {
                System.out.println("Сотки " + num1 / 100);
            }
            if (num1 / 10 % 10 == num2 / 10 % 10) {
                System.out.println("Десятки " + num1 /10 % 10);
            }
            if (num1 % 10 == num2 % 10) {
                System.out.println("Единицы " + num1 % 10);
            }
        }

        System.out.println("\n5.Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Если маленькая буква: " + symbol);
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Если большая буква: " + symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Если число: " + symbol);
        } else {
            System.out.println("Ни буква, ни число: " + symbol);
        }

        System.out.println("\n6.Сумма вклада и начисленных банком процентов.");
        int deposit = 300_000;
        int interest = 0;
        int chargeInterest = 0;
        int sum = 0;
        if (deposit < 100_000) {
            interest = 5;
            chargeInterest = deposit / 100 * interest;
            sum = deposit + chargeInterest;
            System.out.println("Сумма вклада = " + deposit + "\nНачисленный процент = " +
                    chargeInterest + "\nИтоговая сумма = " + sum);
        } else if (deposit <= 300_000) {
            interest = 7;
            chargeInterest = deposit / 100 * interest;
            sum = deposit + chargeInterest;
            System.out.println("Сумма вклада = " + deposit + "\nНачисленный процент = " +
                    chargeInterest + "\nИтоговая сумма = " + sum);
        } else if (deposit > 300_000) {
            interest = 10;
            chargeInterest = deposit / 100 * interest;
            sum = deposit + chargeInterest;
            System.out.println("Сумма вклада = " + deposit + "\nНачисленный процент = " +
                    chargeInterest + "\nИтоговая сумма = " + sum);
        }

        System.out.println("\n7. Определение оценки по предметам.");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyScore = 0;
        int programmingScore = 0;
        int averageScore = (historyScore + programmingScore) / 2;
        int averagePercent = (historyPercent + programmingPercent) / 2;
        if (historyPercent <= 60) {
            historyScore = 2;
        } else if (historyPercent <= 73) {
            historyScore = 3;
        } else if (historyPercent <= 91) {
            historyScore = 4;
        } else {
            historyScore = 5;
        }
        if (programmingPercent <= 60) {
            programmingScore = 2;
        } else if (programmingPercent <= 73) {
            programmingScore = 3;
        } else if (programmingPercent <= 91) {
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }

        averageScore = (historyScore + programmingScore) / 2;
        averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println(historyScore + " = История\n" + programmingScore +
                " = Программирование\n" + "Средний бал по предметам = " + averageScore +
                "\nСредний процент по предметам = " + averagePercent);

        System.out.println("\n8. Расчет прибыли за год.");
        int rent = 5_000;
        int sale = 13_000;
        int costPrice = 9_000;
        int profit = sale * 12 - rent * 12 - costPrice * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год = +" + profit);
        } else {
            System.out.println("Прибыль за год = " + profit);
        }

        System.out.println("\n9. Подсчет количество банкнот.");
        int sumBanknoteAtm = 65;
        int sumCashAtm = 10 * 100 + 5 * 10 + 50 * 1;
        int sumCashDrop = 567;
        int banknoteDropHundred = sumCashDrop / 100;
        int banknoteDropTens = sumCashDrop % 100 / 10;
        int banknoteDropOnes = sumCashDrop % 10;
        int sumBanknoteDrop = banknoteDropOnes + banknoteDropTens + banknoteDropHundred;
        int count = 0;
        if (sumCashDrop > sumCashAtm) {
            System.out.print("Извините в банкомате нет столько наличности");
        } else if (sumBanknoteDrop > sumBanknoteAtm) {
            System.out.print("Извините в банкомате нет банкнот");
        } else {
            if (banknoteDropHundred <= 10) {
                count += banknoteDropHundred;
                System.out.print("Сотни = " + banknoteDropHundred);
            } else {
                banknoteDropTens = (banknoteDropHundred - 10) * 10 + banknoteDropTens;
                System.out.print("Сотни = 10");
                count += 10;
            }
            if (banknoteDropTens <= 5) {
                count += banknoteDropTens;
                System.out.print(" Десятки = " + banknoteDropTens);
            } else {
                banknoteDropOnes = (banknoteDropTens - 5) * 10 + banknoteDropOnes;
                System.out.print(" Десятки = 5");
                count += 5;
            }
            if (banknoteDropOnes <= 50) {
                count += banknoteDropOnes;
                System.out.print(" Единицы = " + banknoteDropOnes);
            } else {
                System.out.print("Извините нет банкнот");
            }
                System.out.println("\nВсего банкнот: " + count + "\nСумма к выдаче = " +
                        sumCashDrop);
        }
    }
}