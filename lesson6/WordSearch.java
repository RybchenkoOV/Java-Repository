package lesson6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    /** Поиск текста в файле */
        System.out.println("Введите имя файла: ");
        String fName = scanner.nextLine();
        System.out.println("Введите текст: ");
        String searchText = scanner.nextLine();
        wordSearchFiles(fName, searchText);
    }

    static void wordSearchFiles(String fName, String searchText) {
        try {
            FileInputStream fis = new FileInputStream(fName);
            byte[] word = searchText.getBytes();
            int inputBytes;
            int lCnt = 0;
            while ((inputBytes = fis.read()) != -1) {
                if (inputBytes == word[lCnt]) {
                    lCnt++;
                }
                else {
                    lCnt = 0;
                    if (inputBytes == word[lCnt]) {
                        lCnt++;
                    }
                }
                if (lCnt == word.length) {
                    System.out.println("Совпадение найдено!");
                    fis.close();
                }
            }
        }
            catch(IOException ioException){
                System.out.println(ioException.getMessage());
            }
        }
}
