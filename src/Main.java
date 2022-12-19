import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
/*Задание 2
Создайте множество целых чисел. Заполните множество 20 случайными числами в диапазоне от 0 до 1000.
Пройдитесь по всем элементам множества и удалите из него все нечетные значения.
Выведите оставшиеся элементы в консоль.*/

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while(numbers.size() < 20){
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer number = iterator.next();
            if(number%2 == 1){
                iterator.remove();
            }
        }
        System.out.println(numbers);


    }
}
