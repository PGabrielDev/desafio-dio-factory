package com.pggm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        File f = new File("roupa.bin");
        Path path = Paths.get(f.getPath());
        ReadArchive archive = FactoryArchive.createReadArchive(f.getName());
        archive.read();
    }
}