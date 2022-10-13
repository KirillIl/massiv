import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.5 Массивы. 1 задача + 2 задача");
        //Объявите три массива:
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        //2.Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        double[] number1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < number1.length; i++) {
            if (i == number1.length - 1) {
                System.out.println(number1[i]);
                break;
            }
            System.out.print(number1[i] + ", ");
        }
        // 3.Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        // с помощью ключевого слова или сразу заполненный элементами.
        char[] number2 = {'b', 'o', 'x'};
        for (int i = 0; i < number2.length; i++) {
            if (i == number2.length - 1) {
                System.out.println(number2[i]);
                break;
            }
            System.out.print(number2[i] + ", ");
        }
        System.out.println();
        System.out.println("3 задача");
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
        // а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке,
        // а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //Если во втором задании в консоль у вас вывелся результат
        //1, 2, 3
        //1.57, 7.654, 9.986
        //*произвольные элементы третьего массива*
        //То в третьем задании результат должен быть
        // 3, 2, 1
        //9.986, 7.654, 1.57
        //*произвольные элементы третьего массива в обратном порядке*
        for ( int i = number.length - 1; i >= 0; i--){
            System.out.print(number[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for ( int i = number1.length - 1; i >= 0; i--){
            System.out.print(number1[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for ( int i = number2.length - 1; i >= 0; i--){
            System.out.print(number2[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("4 задача");
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0){
                number[i] +=1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}

