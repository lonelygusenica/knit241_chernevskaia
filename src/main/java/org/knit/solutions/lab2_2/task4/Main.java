//2.4 Задача «Автозаправочная станция» 🚗⛽
//        📌 Описание:
//        На автозаправочной станции только 2 колонки. Если все заняты, машины ждут в очереди.
//        Когда колонка освобождается, следующий автомобиль из очереди начинает заправку.
//
//        🔹 Что нужно реализовать?
//        ✔ Использовать wait() и notify() для ожидания и освобождения заправки.
//        ✔ Поток "Машина" ждет, если все колонки заняты.
//        ✔ Поток "Машина" заправляется, затем освобождает колонку.
//
package org.knit.solutions.lab2_2.task4;

import org.knit.solutions.tasks_description;

@tasks_description(number = 4, name = "Автозаправочная станция")
public class Main {
    public static void main(String[] args) {
        int totalCars = 10;
        GasStation gasStation = new GasStation(totalCars);

        for (int i = 1; i <= totalCars; i++) {
            Car car = new Car("Car-" + i, gasStation);
            car.start();
        }
    }
}