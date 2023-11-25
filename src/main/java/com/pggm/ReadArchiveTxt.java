package com.pggm;

import java.io.*;

public class ReadArchiveTxt implements ReadArchive{

    private String nmArchive;

    public ReadArchiveTxt(String nmArchive) {
        this.nmArchive = nmArchive;
    }

    @Override
    public void read() throws IOException {
        File f = new File(nmArchive);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
        System.out.println("Lendo o arquivo");
        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            System.out.println(line);
        }



    }
}
