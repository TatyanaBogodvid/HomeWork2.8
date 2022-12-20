package teacher;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*Учитель каждый урок начинает с того, чтобы задавать каждому ученику пример из таблицы умножения,
чтобы проверить знания. Учитель хочет, чтобы все вопросы для учеников были разными.
Всего в классе учатся 15 человек.
Напишите программу, которая будет выводить в консоль 15 уникальных и случайных задач из таблицы умножения
в столбец, то есть на одной строчке одно задание (от 2*2 до 9*9).
Задачи должны быть уникальными, то есть примеры по типу 2*9 и 9*2 считаются повтором.
 */

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Exercise> exercises = new HashSet<>();
        while (exercises.size() < 15){
            Exercise exercise = new Exercise(random.nextInt(8)+2, random.nextInt(8)+2);
            exercises.add(exercise);
            System.out.println(exercise);
        }
    }
}
