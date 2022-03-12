package labs_examples.input_output.labs.exercise_2;

import java.io.*;
import java.sql.SQLOutput;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class exercise_02 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        PrintWriter outputStream = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("src/labs_examples/input_output/labs/exercise_2/bufferReaderExample.txt"));
            outputStream = new PrintWriter(new FileWriter("src/labs_examples/input_output/labs/exercise_2/bufferReaderExampleCopy.txt"));

            String l = "";
            while ((l = bufferedReader.readLine()) != null) {
                String newLString = l
                        .replace("a", "-")
                        .replace("e", "~");

                outputStream.println(newLString);
            }

        } catch (IOException exc) {
            System.out.println("An error occurred:" + exc.getMessage());
            exc.printStackTrace();

        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            outputStream.close();
        }


        BufferedReader bufferedReader2 = null;

        try {
            bufferedReader2 = new BufferedReader(new FileReader("src/labs_examples/input_output/labs/exercise_2/bufferReaderExampleCopy.txt"));

            String l2 = "";
            while ((l2 = bufferedReader2.readLine()) != null) {
                String newLString2 = l2
                        .replace("-", "a")
                        .replace("~", "e");

                System.out.println(newLString2);
            }
        } catch (IOException exc) {
            System.out.println("An error occurred:" + exc.getMessage());
            exc.printStackTrace();
        } finally {
            try {
                bufferedReader2.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
