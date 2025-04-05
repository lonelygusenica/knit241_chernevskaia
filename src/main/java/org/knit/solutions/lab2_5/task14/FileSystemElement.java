package org.knit.solutions.lab2_5.task14;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
