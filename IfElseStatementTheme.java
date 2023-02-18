public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ������� ������������ �� ���� Java.");
        int age = 20;
        double height = 1.86;
        char gender = 'm';
        char firstLetterName = "Roma".charAt(0);
        if(age > 20) {
            System.out.println("������ ������!");
        } else {
            System.out.println("������ �������!");
        }
        if (gender != 'm') {
            System.out.println("���������� �� �������!");
        } else {
            System.out.println("���������� �� �������!");
        }
        if (height < 1.80) {
            System.out.println("���������!");
        } else {
            System.out.println("��������!");
        }
        if(firstLetterName == 'M') {
            System.out.println("���� ����� ����?");
        } else if (firstLetterName == 'I') {
            System.out.println("���� ����� �����?");
        } else if (firstLetterName == 'R') {
            System.out.println("����� ����!");
        }

        System.out.println("\n2. ����� min � max �����.");
        int a = 5;
        int b = 145;
        if (a != b) {
            if (a < b) {
                System.out.println("min = " + a + "\nmax = " + b);
            } else {
                System.out.println("min = " + b + "\nmax = " + a);
            }
        } else {
            System.out.println("�������� �����");
        }

        System.out.println("\n3. �������� �����.");
        int num = 4;
        System.out.println("�������� ����� " + num);
        if (num == 0) {
            System.out.println("����� = 0");
        } else if(num % 2 == 0) {
            System.out.println("����� ������!");
        } else {
            System.out.println("����� ��������!");
        }

        System.out.println("\n4. ����� ���������� ���� � ������.");
        int num1 = 123;
        int num2 = 223;
        System.out.println("�������� �����: " + num1 +  " " + num2);
        if (num1 / 100 != num2 / 100 && num1 / 10 % 10 != num2 / 10 % 10 &&
                num1 % 10 != num2 % 10) {
            System.out.println("������ ����� ���.");
        } else if (num1 / 100 == num2 / 100)  {
            System.out.println("����� " + num1 / 100);
        } else if (num1 / 10 % 10 == num2 / 10 % 10) {
            System.out.println("������� " + num1 /10 % 10);
        } else if (num1 % 10 == num2 % 10) {
                System.out.println("������� " + num1 % 10);
        }

        System.out.println("\n5.����������� ������� �� ��� ����");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("���� ��������� �����: " + symbol);
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("���� ������� �����: " + symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("���� �����: " + symbol);
        } else {
            System.out.println("�� �����, �� �����: " + symbol);
        }

        System.out.println("\n6.����� ������ � ����������� ������ ���������.");
        int deposit = 300_000;
        int interest = 0;
        int chargeInterest = 0;
        int sum = 0;
        if (deposit < 100_000) {
            interest = 5;
        } else if (deposit <= 300_000) {
            interest = 7;
        } else if (deposit > 300_000) {
            interest = 10;
        }
        System.out.println("����� ������ = " + deposit + "\n����������� ������� = " +
                    chargeInterest + "\n�������� ����� = " + sum);

        System.out.println("\n7. ����������� ������ �� ���������.");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyScore = 2;
        int programmingScore = 2;
        int averageScore = (historyScore + programmingScore) / 2;
        int averagePercent = (historyPercent + programmingPercent) / 2;
        if (historyPercent <= 73) {
            historyScore = 3;
        } else if (historyPercent <= 91) {
            historyScore = 4;
        } else {
            historyScore = 5;
        }
        if (programmingPercent <= 73) {
            programmingScore = 3;
        } else if (programmingPercent <= 91) {
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }
        System.out.println(historyScore + " = �������\n" + programmingScore +
                " = ����������������\n" + "������� ��� �� ��������� = " + averageScore +
                "\n������� ������� �� ��������� = " + averagePercent);

        System.out.println("\n8. ������ ������� �� ���.");
        int rent = 5_000;
        int sale = 13_000;
        int costPrice = 9_000;
        int profit = (sale - rent - costPrice) * 12;
        if (profit > 0) {
            System.out.println("������� �� ��� = +" + profit);
        } else {
            System.out.println("������� �� ��� = " + profit);
        }

        System.out.println("\n9. ������� ���������� �������.");
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
        if (sumCashDrop > sumCashAtm) {
            System.out.print("�������� � ��������� ��� ������� ����������");
        }  else {
            System.out.println("����� � ������ = " + sumCashDrop);
            if (banknoteDropHundred <= hundredsAtm) {
                count += banknoteDropHundred;
                System.out.print("����� = " + banknoteDropHundred);
            } else {
                banknoteDropTens = (banknoteDropHundred - hundredsAtm) * 10 + banknoteDropTens;
                System.out.print("����� = " + hundredsAtm);
                count += hundredsAtm;
            }
            if (banknoteDropTens <= tensAtm) {
                count += banknoteDropTens;
                System.out.print(" ������� = " + banknoteDropTens);
            } else {
                banknoteDropOnes = (banknoteDropTens - tensAtm) * 10 + banknoteDropOnes;
                System.out.print(" ������� = " + tensAtm);
                count += tensAtm;
            }
            if (banknoteDropOnes <= onesAtm) {
                count += banknoteDropOnes;
                System.out.print(" ������� = " + banknoteDropOnes);
            } else if (sumBanknoteDrop > sumBanknoteAtm) {
                System.out.print("�������� � ��������� ��� �������");
            }
                System.out.println("\n����� �������: " + count);
        }
    }
}