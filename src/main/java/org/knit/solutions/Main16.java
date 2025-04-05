package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_5.task16.CharacterFactory;
import org.knit.solutions.lab2_5.task16.FlyweightCharacter;

/*
Задача:
Реализуйте систему отображения символов текста на экране.

Каждый символ (Character) имеет внутреннее состояние (код символа) и внешнее состояние (координаты x, y и стиль).
Используйте Фабрику приспособленцев, чтобы повторно использовать объекты символов и уменьшить количество объектов, создаваемых в системе.
📌 Подсказка:
Внешнее состояние передается в метод render(), а внутреннее хранится внутри объектов, создаваемых фабрикой.
 */

@TaskDescription(taskNumber = 16, taskDescription = "Паттерн Приспособленец (Flyweight)")
public class Main16 {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        String text = "HELLO FLYWEIGHT";
        int x = 0;
        int y = 0;

        for (char c : text.toCharArray()) {
            FlyweightCharacter character = factory.getCharacter(c);

            character.render(x, y, "Bold");
            x += 10;
        }
    }
}
