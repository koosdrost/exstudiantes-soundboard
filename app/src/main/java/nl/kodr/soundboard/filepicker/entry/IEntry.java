package nl.kodr.soundboard.filepicker.entry;

import nl.kodr.soundboard.filepicker.dir.Directory;

public interface IEntry extends Comparable<IEntry> {

    String getName();

    String getPath();

    long getSize();

    Directory getDirectory();

    boolean isDirectory();
}
