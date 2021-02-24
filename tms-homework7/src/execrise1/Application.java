package execrise1;

import execrise1.operations.*;

import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Вас приветствет программа калькулятор.");
        run();
        System.out.println("Программа калькулятор завершена.");
    }

    public void run(){
        while (true){
            //выбор операции
            showOperations();
            Operation operation = selectOperation();
            if (operation == null){
                break;
            }

            //ввод чисел
            System.out.print("Введи число A: ");
            double a = scanner.nextDouble();
            System.out.print("Введи число B: ");
            double b = scanner.nextDouble();

            //выполнение
            System.out.println("Результат операции = " + operation.calculate(a, b));
            System.out.println();
        }
    }

    private Operation selectOperation(){
        int ch = scanner.nextInt();
        switch (ch){
            case 1:
                return new Addition();
            case 2:
                return new Subtract();
            case 3:
                return new Divide();
            case 4:
                return new Multiply();
            case 0:
                return null;
        }

        System.out.println("Операции под таким номером нет, введите ещё раз");
        return selectOperation();
    }

    private void showOperations(){
        System.out.println("Выберите операцию: ");
        System.out.println("1 - Сложить (A + B)");
        System.out.println("2 - Вычесть (A - B)");
        System.out.println("3 - Разделить (A / B)");
        System.out.println("4 - Умножить (A * B)");
        System.out.println("0 - Выход из программы");
    }
}
