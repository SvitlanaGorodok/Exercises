package other;

//реалізувати метод знаходження квадратного кореня, що вертає тільки цілу частину
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(sqrt(16));
        System.out.println(sqrt(5));
        System.out.println(sqrt(4));
        System.out.println(sqrt(0));
    }

    public static int sqrt(int number) {
        int low = 0;
        int high = number;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = mid * mid;
            if (result == number) {
                return mid;
            }
            if (result > number) {
                high = mid - 1;
            }
            if (result < number){
                low = mid + 1;
            }
        }
        return low - 1;
    }
}
