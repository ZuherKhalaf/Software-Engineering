package Composite;

import java.util.List;

public interface FileSystemComponent {
    void showDetails();

    void add(FileSystemComponent component); // Default für Composite

    void remove(FileSystemComponent component);

    List<FileSystemComponent> getChildren(); // Default für Composite
}
