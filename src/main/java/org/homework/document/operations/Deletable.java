package org.homework.document.operations;

public interface Deletable {
    void safeDelete();
    void restore();
    void delete();
}
