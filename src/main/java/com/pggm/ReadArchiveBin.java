package com.pggm;

import java.io.*;

public class ReadArchiveBin implements ReadArchive {

    private String nmArchive;

    public ReadArchiveBin(String nmArchive) {
        this.nmArchive = nmArchive;
    }

    @Override
    public void read() throws IOException {
        File f = new File(nmArchive);
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(f));

        int byteRead;
        byte[] buffer = new byte[1024];
        System.out.println("Lendo o arquivo");

        while ((byteRead = dataInputStream.read(buffer)) != -1) {
            String dados = new String(buffer, 0, byteRead);
            for (int i = 0; i < byteRead; i++) {
                System.out.print( (char)buffer[i] + " ");
            }
        }

    }
}
