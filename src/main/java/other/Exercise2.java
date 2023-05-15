package other;

import java.util.HashMap;
import java.util.Map;

//реалізувати свій пул стрінгів
public class Exercise2 {
    public static Map<Object, Object> stringPool = new HashMap<>();

    public static void main(String[] args) {
        Object string1 = createString("abc");
        Object string2 = createString("abc");
        Object string3 = createString("abc");
        System.out.println(stringPool);
    }

    public static Object createString(Object oldString){
        Object newString = stringPool.putIfAbsent(oldString, oldString);
        System.out.println(newString);
        return  newString == null ? oldString : newString;
    }

}
