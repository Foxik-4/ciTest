package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NoDupLine {
    String filename;
    HashSet<String> data = new HashSet<>();
    ArrayList<String> index = new ArrayList<>();
    public NoDupLine(String fileName) {
        this.filename = fileName;
        //File file = new File("_fileName_.txt");
        // vytvori instanci pro soubor _fileName_
    }

    public void read() throws IOException {
        data = new HashSet<String>(Files.readAllLines(Paths.get(filename)));
        index = new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        // načte soubor fileName do paměti, skončí výjimkou pokud soubor nejde načíst
    }

    public void save() throws IOException {
        Files.writeString(Paths.get(filename), String.join("\n", data));
        // zapíše obsah paměti do souboru, skončí výjimkou pokud soubor nejde uložit
        // pokud soubor již existuje, přepíše jej
    }

    public void addLine(String str) {
        if(!data.contains(str)) {
            data.add(str);
            index.add(str);
        }
        // přidá řádek str do paměti pokud tam ještě není,
        // duplicitní řádky ignoruje.
    }

    public String toString() {
        return String.join("\n", index);
        // vrátí řetězec obsahující všechny řádky
    }


}
