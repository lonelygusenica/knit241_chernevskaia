package org.knit.solutions.lab2_5.task14;

public class File implements FileSystemElement {
    private final String name;
    private final int size;
    private final boolean infected;

    public File(String name, int size, boolean infected) {
        this.name = name;
        this.size = size;
        this.infected = infected;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isInfected() {
        return infected;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
