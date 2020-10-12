package nl.kodr.soundboard.filepicker.dir;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Directory {

    private final File file;
    private final Directory parent;

    public Directory(File file, Directory parent) {
        this.file = file;
        this.parent = parent;
    }

    public String getPath() {
        return file.getAbsolutePath();
    }

    public String getTitle() {
        return file.getAbsolutePath();
    }

    public boolean canRead() {
        return file.canRead();
    }

    public Directory getParent() {
        return parent;
    }

    public boolean isRoot() {
        return parent == null;
    }

    public Set<File> getFiles() {
        if (file.listFiles().length == 0) {
            return new HashSet<>();
        }
        return new HashSet<>(Arrays.asList(file.listFiles()));
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Directory && getPath().equals(((Directory) o).getPath());
    }

    @Override
    public String toString() {
        return "Directory{file=" + file + ", parent=" + parent + '}';
    }
}
