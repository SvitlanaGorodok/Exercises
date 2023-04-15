package other;

//реалізувати метод знаходження квадратного кореня, що вертає тільки цілу частину
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(sqrt(16));
        System.out.println(sqrt(5));
        System.out.println(sqrt(4));
        System.out.println(sqrt(1));
    }

    public static int sqrt(int number) {
        if (number == 1 || number == 0){
            return number;
        }
        for (int i = number/2; i > 1; i--) {
            if( i * i <= number){
                return i;
            }
        }
        return 0;
    }
}
