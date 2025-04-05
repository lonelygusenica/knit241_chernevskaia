package org.knit.solutions;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_3.task10.Runner;

/*
📌 Описание
Группа спортсменов участвует в забеге. Однако перед началом гонки все должны собраться на старте. Как только все участники будут готовы, забег начнётся одновременно. Используйте CyclicBarrier, чтобы синхронизировать запуск гонки.

Каждый бегун стартует одновременно, затем бежит разное время (симулируется Thread.sleep), после чего финиширует. Как только все бегуны завершат дистанцию, программа выводит сообщение о завершении гонки.

🎯 Требования к задаче:
Создать CyclicBarrier для синхронизации начала забега.
Реализовать класс Runner, который будет выполнять следующую логику в потоке:
Ожидание старта (использование barrier.await()).
Симуляция бега (Thread.sleep(randomTime)).
Вывод сообщения о финише.
После финиша всех участников программа должна сообщить, что гонка завершена.
Количество бегунов передаётся в аргументах командной строки или задаётся константой.
🔧 Подсказка
Используйте Executors.newFixedThreadPool() для управления потоками.
Для генерации случайного времени забега можно использовать ThreadLocalRandom.current().nextInt(500, 3000).
🔹 Дополнительное задание (по желанию):

Добавить ещё одну CyclicBarrier, чтобы дождаться всех бегунов на финише перед выводом финального сообщения.
Добавить возможность прерывания гонки (например, если один из бегунов "травмируется" и не может продолжить).
 */

@TaskDescription(taskNumber = 10, taskDescription = "Гонка бегунов с использованием CyclicBarrier")

public class Main10 {

    public static final int DEFAULT_NUM_RUNNERS = 5;
    public static AtomicBoolean raceInterrupted = new AtomicBoolean(false);

    public static void main(String[] args) throws InterruptedException {
        int numRunners = DEFAULT_NUM_RUNNERS;
        if (args.length > 0) {
            try {
                numRunners = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный аргумент. Используется значение по умолчанию: " + DEFAULT_NUM_RUNNERS);
            }
        }

        CyclicBarrier startBarrier = new CyclicBarrier(numRunners, () ->
                System.out.println("Все участники готовы. Начинаем забег!")
        );

        CyclicBarrier finishBarrier = new CyclicBarrier(numRunners, () ->
                System.out.println("Все бегуны финишировали. Забег завершён!")
        );

        ExecutorService executor = Executors.newFixedThreadPool(numRunners);
        for (int i = 0; i < numRunners; i++) {
            executor.submit(new Runner("Бегун-" + (i + 1), startBarrier, finishBarrier, raceInterrupted));
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        if (raceInterrupted.get()) {
            System.out.println("Забег был прерван из-за травмы одного из бегунов.");
        }
    }
}
