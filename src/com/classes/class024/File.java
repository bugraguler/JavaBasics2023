package com.classes.class024;

public abstract class File {
    abstract void open();

    final void edit() {
        System.out.println("edit");
    }

    protected void close() {
        System.out.println("close");
    }
}

class JavaFile extends File {
    void open() {
        System.out.println("java opens");
    }
}

class WordFile extends File {
    void open() {
        System.out.println("word opens");
    }
}

class PdfFile extends File {
    void open() {
        System.out.println("Pdf opens");
    }
}

class Tester {
    public static void main(String[] args) {
        File[] files = {new PdfFile(), new JavaFile(), new WordFile()};
        for (File file : files) {
            file.open();
            file.edit();
            file.close();
        }
       for(int i=0;i< files.length;i++){
           files[i].open();
           files[i].edit();
           files[i].close();
       }
    }
}