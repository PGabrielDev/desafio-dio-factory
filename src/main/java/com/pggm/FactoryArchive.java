package com.pggm;

public class FactoryArchive {

    static public ReadArchive createReadArchive(String nmArchive) {
        if ((nmArchive.endsWith(".txt")))
            return new ReadArchiveTxt(nmArchive);
        else
            return new ReadArchiveBin(nmArchive);

    }


}
