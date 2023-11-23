package Tugas3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderExample{
    public static void main(String[] args) {
        String fileName = "File.txt"; // Ganti dengan nama file yang sesuai

        try {
            String isiFile = bacaFile(fileName);
            if (isiFile != null) {
                System.out.println("Isi file: " + isiFile);
            } else {
                System.out.println("File tidak ditemukan.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi exception yang tidak diketahui: " + e.getMessage());
        }
    }

    public static String bacaFile(String fileName) throws FileNotFoundException, IOException {
        BufferedReader reader = null;
        StringBuilder content = new StringBuilder();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Gagal menutup file: " + e.getMessage());
                }
            }
        }

        return content.toString();
    }
}