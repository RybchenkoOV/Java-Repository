package lesson6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class GlueText {
    static int inputBytes;

    public static void main(String[] args) {

        /** Читаем первый файл */
        try {
            FileInputStream fis1 = new FileInputStream("file1.txt");
            while ((inputBytes = fis1.read()) != -1){
                glueMethod(); // склеиваем результат в общий файл
            }
            fis1.close();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        /** Читаем второй файл */
        try {

            FileInputStream fis2 = new FileInputStream("file2.txt");
            while ((inputBytes = fis2.read()) != -1){
                glueMethod(); // склеиваем результат в общий файл
            }
            fis2.close();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

    }
    /** Созлаем метод для склейки */
        private static void glueMethod() {
        try {
        FileOutputStream fosGlue = new FileOutputStream("GlueText.txt", true);
        PrintStream ps = new PrintStream(fosGlue);
        ps.append((char)inputBytes);
        ps.close();
        fosGlue.flush();
        fosGlue.close();
    } catch (IOException ioException) {
        System.out.println(ioException.getMessage());
    }
        }

}
