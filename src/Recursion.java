/**
 * Created by AZ$E on 23.07.2017.
 */
//задача 5 счет до 5
class Recursion {
    public static String recursion(int n) {

        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии
        return recursion(n - 1) + " " + n;
    }
    public static void main(String[] args) {
        System.out.println(recursion(5)); // вызов рекурсивной функции
    }
}
