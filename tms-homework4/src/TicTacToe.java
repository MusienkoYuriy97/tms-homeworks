import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String nameFirstGamer;
        String nameSecondGamer;
        char[][] field = new char[3][3];;
        int rowIndex;
        int columnIndex;
        int horizontalCheck;
        int verticalCheck;
        int diagonal_oneCheck;
        int diagonal_twoCheck;
        boolean flag;
        boolean reStart = true;



        while (reStart) {
            //Вывод игрального поля
            System.out.println();
            System.out.println("Вас приветствует игра - \"Крестики-Нолики\"");
            System.out.println("Игральное поле 3х3:");
            for (int i = 0; i < field.length; i++) {
                if (i == 0) {
                    System.out.println("\t1" + "\t2" + "\t3");
                }
                System.out.print(i + 1 + "\t");
                for (int j = 0; j < field.length; j++) {
                    field[i][j] = '.';
                    System.out.print(field[i][j] + "\t");
                }
                System.out.println();
            }

            //Создраем объект сканера, который нам пригодится по ходу игры
            Scanner scanner = new Scanner(System.in);

            //Ввод данных игроков
            System.out.println();
            System.out.print("Введите имя 1-го игрока: ");
            nameFirstGamer = scanner.nextLine();
            System.out.print("Введите имя 2-го игрока: ");
            nameSecondGamer = scanner.nextLine();
            System.out.println();
            System.out.println(nameFirstGamer + " вы ходите первым и ваш символ - Крестик");
            System.out.println(nameSecondGamer + " вы ходите вторым и ваш символ - Нолик");
            System.out.println();


            //Цикл где значение i означает какой сейчас ход, всегда ходов может быть 9 как и клеток в игральном поле
            for (int i = 1; i <= 9; i++) {
                if (i % 2 == 0) {
                    System.out.println(nameSecondGamer + " - ваш ход!");
                } else {
                    System.out.println(nameFirstGamer + " - ваш ход!");
                }

                //Ход игрока и проверка можно ли вообще ходить по таким значениям
                do {
                    flag = false;
                    System.out.print("Введи номер строки: ");
                    rowIndex = scanner.nextInt();
                    if (rowIndex > 3 || rowIndex < 1) {
                        System.out.println(" Введи ещё раз");
                        flag = true;
                        continue;
                    }
                    System.out.print("Введи номер столбца: ");
                    columnIndex = scanner.nextInt();
                    if (columnIndex > 3 || columnIndex < 1) {
                        System.out.println(" Введи ещё раз");
                        flag = true;
                        continue;
                    }

                    if (i % 2 == 0 && field[rowIndex - 1][columnIndex - 1] == '.') {
                        field[rowIndex - 1][columnIndex - 1] = 'O';
                    } else if (i % 2 != 0 && field[rowIndex - 1][columnIndex - 1] == '.') {
                        field[rowIndex - 1][columnIndex - 1] = 'X';
                    } else {
                        flag = true;
                        System.out.println();
                        System.out.println("Это поле занято, введи ещё раз");
                    }
                } while (flag);

                //Вывод игрального поля после хода игрока
                System.out.println();
                for (int j = 0; j < field.length; j++) {
                    if (j == 0) {
                        System.out.println("\t1" + "\t2" + "\t3");
                    }
                    System.out.print(j + 1 + "\t");
                    for (int k = 0; k < field.length; k++) {
                        System.out.print(field[j][k] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();

                //Вертикальная и горизонтальные проверки победителя
                horizontalCheck = 0;
                verticalCheck = 0;
                for (int j = 0; j < field.length; j++) {
                    horizontalCheck = 0;
                    verticalCheck = 0;
                    for (int k = 0; k < field.length - 1; k++) {
                        if (field[k][j] == field[k + 1][j] && field[k][j] != '.') {
                            verticalCheck++;
                        }
                        if (field[j][k] == field[j][k + 1] && field[j][k] != '.') {
                            horizontalCheck++;
                        }
                    }

                    if (horizontalCheck == 2 || verticalCheck == 2) {
                        break;
                    }
                }

                //Диагональные проверки победителя
                diagonal_oneCheck = 0;
                diagonal_twoCheck = 0;
                for (int j = 0; j < field.length - 1; j++) {
                    if (field[j][j] == field[j + 1][j + 1] && field[j][j] != '.') {
                        diagonal_oneCheck++;
                    }
                    if (field[field.length - 1 - j][j] == field[field.length - 1 - j - 1][j + 1] && field[field.length - 1 - j][j] != '.') {
                        diagonal_twoCheck++;
                    }
                }

                //определение победителя
                if (horizontalCheck == 2 || verticalCheck == 2 || diagonal_oneCheck == 2 || diagonal_twoCheck == 2) {
                    if (i % 2 == 0) {
                        System.out.println(nameSecondGamer + " - поздравляем вы ПОБЕДИЛИ!!!");
                        break;
                    } else {
                        System.out.println(nameFirstGamer + " - поздравляем вы ПОБЕДИЛИ!!!");
                        break;
                    }
                } else if (i == 9) {
                    System.out.println("Увы никто не выиграл - Ничья");
                }
            }

            //Выход или рестарт игры
            System.out.println();
            System.out.print("Сыграть ещё введите - 1; Для выхода из игры введите любое другое число: ");
            if (scanner.nextInt() == 1){
                reStart = true;
            }else {
                reStart = false;
            }
        }
    }
}
