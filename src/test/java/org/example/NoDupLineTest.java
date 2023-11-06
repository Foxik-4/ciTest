package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;
class NoDupLineTest {

    @TempDir
    private Path tmp;

    @Test
    public void read() throws IOException {
        NoDupLine ndl = new NoDupLine("nonexistant");

        assertThrows(IOException.class, () -> ndl.read());
    }

    @Test
    void save() {
    }

    @Test
    void addLine() throws IOException {
        NoDupLine ndl = new NoDupLine("name");

        ndl.addLine("r1");
        ndl.addLine("r2");
        ndl.addLine("r2");

        assertEquals("r1\nr2", ndl.toString());
    }

    @Test
    void testToString() {
    }

    @Test
    void writeSaveRead(){
        File f= new File("tmphistory44.txt");
        NoDupLine dp = new NoDupLine("tmphistory44.txt");
        dp.addLine("a");
        dp.addLine("b");
        dp.addLine("c");
        try {
            dp.save();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        NoDupLine dp2 = new NoDupLine("history44.txt");
        try {
            dp2.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals("a\nb\nc", dp2.toString());
    }
}