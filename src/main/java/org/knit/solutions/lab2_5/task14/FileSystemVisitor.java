package org.knit.solutions.lab2_5.task14;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Folder folder);
    void visit(Link link);
}