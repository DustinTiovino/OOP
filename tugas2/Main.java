package Tugas2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String fileName = "kelompok.txt"; 

        try {
            String fileContent = bacaFile(fileName);

            if (fileContent != null) {
                System.out.println("Isi file:\n" + fileContent);
            } else {
                System.out.println("File tidak ditemukan.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan. Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file. Error: " + e.getMessage());
        }
    }

    public static String bacaFile(String fileName) throws FileNotFoundException, IOException {
        StringBuilder content = new StringBuilder();

    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }

        return content.toString();
    } catch (FileNotFoundException e) {
        // Tangani FileNotFoundException
        throw e;
    } catch (IOException e) {
        // Tangani IOException
        throw e;
    }
}
}
