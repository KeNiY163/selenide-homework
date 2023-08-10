import static java.lang.Integer.MAX_VALUE;

public class JavaExercisesOne {
    public static void main(String[] args) {

        /*

        0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой

        1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)

        2) попробовать вычисления комбинаций типов данных (int и double)

        */

        // 0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой

        byte a  = -128; // от -128 до 127
        int b = MAX_VALUE; // от -2147483648 до 2147483647
        short c = -32768; // от -32768 до 32767
        char d = 97; // 0 до 65535
        long i = 9223372036854775807L; // от -9223372036854775808 до 9223372036854775807
        float f = 2.2222F; // от 2-149 до (2-2-23)*2127
        double g = 123.4875568456D; // от 2-1074 до (2-2-52)*21023

        // ---- //

        // 1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)

        int oneVar = 100;
        int twoVar = 200;

        a -= 1;
        b += 1;
        c -= 1;
        i += 1;

        System.out.println("Переполнение при вычислениях: \n\n"
                                                            + "byte: " + a + "\n"
                                                            + "int: " + b + "\n"
                                                            + "short: " + c + "\n"
                                                            + "long: " + i + "\n");

        // Математические операции

        System.out.println("Математические операции над числами:" +
                "\n");
        System.out.println("Сложение: " + (oneVar + twoVar));
        System.out.println("Вычитание: " + (oneVar - twoVar));
        System.out.println("Умножение: " + (oneVar * twoVar));
        System.out.println("Деление: " + (twoVar / oneVar));
        System.out.println("Остаток от деления: " + (oneVar % twoVar) + "\n");

        oneVar++;
        twoVar--;

        System.out.println("Increment: " + oneVar);
        System.out.println("Decrement: " +  twoVar + "\n");

        // Сравнение


        System.out.println("Сравнение переменных:" +
                "\n");

        System.out.println("onevar == twovar: " + (oneVar == twoVar));
        System.out.println("onevar > twovar: " + (oneVar > twoVar));
        System.out.println("onevar < twovar: " + (oneVar < twoVar));
        System.out.println("onevar != twovar: " + (oneVar != twoVar));
        System.out.println("onevar >= twovar: " + (oneVar >= twoVar));
        System.out.println("onevar <= twovar: " + (oneVar <= twoVar) + "\n");

        // Логические операторы

        boolean trueVar = true;
        boolean falseVar = false;

        System.out.println("Логические операторы:" +
                "\n");

        System.out.println("trueVar && falseVar: " + (trueVar && falseVar));
        System.out.println("trueVar || falseVar: " + (trueVar || falseVar));
        System.out.println("!trueVar: " + (!trueVar) + "\n");

        // 2) попробовать вычисления комбинаций типов данных (int и double)

        int intVar = 123;
        double doubleVar = 123.456;

        System.out.println("Комбинации чисел int и dooble:" +
                "\n");

        System.out.println("intVar * doubleVar: " + (intVar * doubleVar));
        System.out.println("intVar / doubleVar: " + (intVar / doubleVar));
        System.out.println("intVar - doubleVar: " + (intVar - doubleVar));
        System.out.println("intVar + doubleVar: " + (intVar + doubleVar));
        System.out.println("intVar == doubleVar: " + (intVar == doubleVar));

    }
}
