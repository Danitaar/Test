package Calculator;

import java.util.*;

public class Main {
    public static <K, V> K getKeyFromValue(Map<K, V> map, Object value) {//Возвращаем ключ по значению
        Set<K> keys = map.keySet();
        for (K key : keys) {
            if (map.get(key).equals(value)) {
                return key;
            }
        }
        return null;
    }

    public static String calc(String input) throws Exception {
        String inputString = input;
        String[] dataElements = inputString.split(" ");//Разделяем введенную строку по элементам через пробел.
        if (dataElements.length < 3) {//Если введено менее трех значений.
            throw new Exception("Строка не является математической операцией.");
        } else if (dataElements.length > 3) {//Если введено более трех значений - завершаем програму.
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            return inputString;
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите математическую операцию: ");
        String example = input.nextLine();//Считываем со сканера введенные данные.
        calc(example);

        String[] dataElements = example.split(" ");//Разделяем введенную строку по элементам через пробел.

        String operand1 = dataElements[0];//Определяем первый операнд.
        String operator = dataElements[1];//Определяем оператор.
        String operand2 = dataElements[2];//Определяем второй операнд.


        Map<String, Integer> roman = new HashMap<>();//Map римских чисел.
        roman.put("I", 1);
        roman.put("II", 2);
        roman.put("III", 3);
        roman.put("IV", 4);
        roman.put("V", 5);
        roman.put("VI", 6);
        roman.put("VII", 7);
        roman.put("VIII", 8);
        roman.put("IX", 9);
        roman.put("X", 10);
        roman.put("XI", 11);
        roman.put("XII", 12);
        roman.put("XIII", 13);
        roman.put("XIV", 14);
        roman.put("XV", 15);
        roman.put("XVI", 16);
        roman.put("XVII", 17);
        roman.put("XVIII", 18);
        roman.put("XIX", 19);
        roman.put("XX", 20);
        roman.put("XXI", 21);
        roman.put("XXII", 22);
        roman.put("XXIII", 23);
        roman.put("XXIV", 24);
        roman.put("XXV", 25);
        roman.put("XXVI", 26);
        roman.put("XXVII", 27);
        roman.put("XXVIII", 28);
        roman.put("XXIX", 29);
        roman.put("XXX", 30);
        roman.put("XXXI", 31);
        roman.put("XXXII", 32);
        roman.put("XXXIII", 33);
        roman.put("XXXIV", 34);
        roman.put("XXXV", 35);
        roman.put("XXXVI", 36);
        roman.put("XXXVII", 37);
        roman.put("XXXVIII", 38);
        roman.put("XXXIX", 39);
        roman.put("XL", 40);
        roman.put("XLI", 41);
        roman.put("XLII", 42);
        roman.put("XLIII", 43);
        roman.put("XLIV", 44);
        roman.put("XLV", 45);
        roman.put("XLVI", 46);
        roman.put("XLVII", 47);
        roman.put("XLVIII", 48);
        roman.put("XLIX", 49);
        roman.put("L", 50);
        roman.put("LI", 51);
        roman.put("LII", 52);
        roman.put("LIII", 53);
        roman.put("LIV", 54);
        roman.put("LV", 55);
        roman.put("LVI", 56);
        roman.put("LVII", 57);
        roman.put("LVIII", 58);
        roman.put("LIX", 59);
        roman.put("LX", 60);
        roman.put("LXI", 61);
        roman.put("LXII", 62);
        roman.put("LXIII", 63);
        roman.put("LXIV", 64);
        roman.put("LXV", 65);
        roman.put("LXVI", 66);
        roman.put("LXVII", 67);
        roman.put("LXVIII", 68);
        roman.put("LXIX", 69);
        roman.put("LXX", 70);
        roman.put("LXXI", 71);
        roman.put("LXXII", 72);
        roman.put("LXXIII", 73);
        roman.put("LXXIV", 74);
        roman.put("LXXV", 75);
        roman.put("LXXVI", 76);
        roman.put("LXXVII", 77);
        roman.put("LXXVIII", 78);
        roman.put("LXXIX", 79);
        roman.put("LXXX", 80);
        roman.put("LXXXI", 81);
        roman.put("LXXXII", 82);
        roman.put("LXXXIII", 83);
        roman.put("LXXXIV", 84);
        roman.put("LXXXV", 85);
        roman.put("LXXXVI", 86);
        roman.put("LXXXVII", 87);
        roman.put("LXXXVIII", 88);
        roman.put("LXXXIX", 89);
        roman.put("XC", 90);
        roman.put("XCI", 91);
        roman.put("XCII", 92);
        roman.put("XCIII", 93);
        roman.put("XCIV", 94);
        roman.put("XCV", 95);
        roman.put("XCVI", 96);
        roman.put("XCVII", 97);
        roman.put("XCVIII", 98);
        roman.put("XCIX", 99);
        roman.put("C", 100);

        List<String> arabian = List.of(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});//List для сверки разности операндов согласно плану задания.

        if (roman.containsKey(operand1) && arabian.contains(operand2)) {//Проверяем разность систем счисления.
            throw new Exception("Используются одновременно разные системы счисления.");
        } else if (arabian.contains(operand1) && roman.containsKey(operand2)) {//Проверяем разность систем счисления.
            throw new Exception("Используются одновременно разные системы счисления.");
        } else if (roman.containsKey(operand1) && roman.containsKey(operand2)) {//Проверяем римские ли числа были введены.
            int operand1Next = roman.get(operand1);//Присваиваем значение по ключу для первого операнда.
            int operand2Next = roman.get(operand2);//Присваиваем значение по ключу для второго операнда.
            if (operand1Next > 10 && operand2Next > 10) {//Проверяем выходят ли римские числа за рамки задания.
                throw new Exception("Калькулятор должен принимать на вход числа от I до X включительно, не более.");
            }
            if (operator.equals("+")) {//Определяем оператор и выводим результат математической операции согласно плану задания.
                int result = operand1Next + operand2Next;
                if (result < 1) {
                    throw new Exception("Результатом работы калькулятора с римскими числами могут быть только натуральные числа.");
                }
                System.out.println(getKeyFromValue(roman, result));
            } else if (operator.equals("-")) {
                int result = operand1Next - operand2Next;
                if (result < 1) {
                    throw new Exception("Результатом работы калькулятора с римскими числами могут быть только натуральные числа.");
                }
                System.out.println(getKeyFromValue(roman, result));
            } else if (operator.equals("*")) {
                int result = operand1Next * operand2Next;
                if (result < 1) {
                    throw new Exception("Результатом работы калькулятора с римскими числами могут быть только натуральные числа.");
                }
                System.out.println(getKeyFromValue(roman, result));
            } else if (operator.equals("/")) {
                int result = operand1Next / operand2Next;
                if (result < 1) {
                    throw new Exception("Результатом работы калькулятора с римскими числами могут быть только натуральные числа.");
                }
                System.out.println(getKeyFromValue(roman, result));
            } else {
                throw new Exception("Формат математической операции не удовлетворяет заданию - неверный оператор.");
            }
        } else {//Арабский калькулятор.
            int operand1NewValue = Integer.parseInt(operand1);//Конвертируем значение первого операнда в int.
            int operand2NewValue = Integer.parseInt(operand2);//Конвертируем значение второго операнда в int.
            if (operand1NewValue < 1 || operand1NewValue > 10 || operand2NewValue < 1 || operand2NewValue > 10) {//Подгоняем операнды под условие задания.
                throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            }
            if (operator.equals("+")) {//Определяем оператор и выводим результат математической операции согласно плану задания.
                System.out.println(operand1NewValue + operand2NewValue);
            } else if (operator.equals("-")) {
                System.out.println(operand1NewValue - operand2NewValue);
            } else if (operator.equals("*")) {
                System.out.println(operand1NewValue * operand2NewValue);
            } else if (operator.equals("/")) {
                System.out.println(operand1NewValue / operand2NewValue);
            } else {
                throw new Exception("Формат математической операции не удовлетворяет заданию - неверный оператор.");
            }
        }
    }
}