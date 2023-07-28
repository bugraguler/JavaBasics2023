package com.classes.class024;

public abstract class FileClass {
    abstract void open();

    final void edit() {
        System.out.println("edit");
    }

    protected void close() {
        System.out.println("close");
    }
}

class JavaFile extends FileClass {
    void open() {
        System.out.println("java opens");
    }
}

class WordFile extends FileClass {
    void open() {
        System.out.println("word opens");
    }
}

class PdfFile extends FileClass {
    void open() {
        System.out.println("Pdf opens");
    }
}

class Tester {
    public static void main(String[] args) {
        FileClass[] files = {new PdfFile(), new JavaFile(), new WordFile()};
        for (FileClass fileS : files) {
            fileS.open();
            fileS.edit();
            fileS.close();
        }
       for(int i=0;i< files.length;i++){
           files[i].open();
           files[i].edit();
           files[i].close();
       }
    }
}