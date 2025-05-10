package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_5.task14.*;

/*
Задача:
Создайте систему управления файловыми объектами.
Есть три типа файловых объектов:

Файлы,
Папки,
Ссылки (ярлыки).
Требуется реализовать два посетителя:

Сканер вирусов, который проверяет каждый файл на наличие вирусов.
Анализатор размера, который подсчитывает общий размер файлов (ссылки не учитываются).
📌 Подсказка:
Каждый файл, папка и ссылка должны реализовывать интерфейс FileSystemElement. В accept() методе вызывается соответствующий метод визитера.
 */

@TaskDescription(taskNumber = 14, taskDescription = "Паттерн Визитер (Visitor)")
public class Main14{
    public static void main(String[] args) {
            File file1 = new File("file1.txt", 100, false);
            File file2 = new File("file2.txt", 200, true);

            Folder folder1 = new Folder("folder1");
            folder1.addElement(file1);
            folder1.addElement(file2);

            Link link1 = new Link("link1", file1);

            Folder root = new Folder("root");
            root.addElement(folder1);
            root.addElement(link1);

            System.out.println("=== Сканер вирусов ===");
            VirusScanner virusScanner = new VirusScanner();
            root.accept(virusScanner);

            SizeAnalyzer sizeAnalyzer = new SizeAnalyzer();
            root.accept(sizeAnalyzer);
            System.out.println("Общий размер файлов: " + sizeAnalyzer.getTotalSize());
        }
    }

