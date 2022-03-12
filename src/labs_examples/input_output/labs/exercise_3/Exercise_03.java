package labs_examples.input_output.labs.exercise_3;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class Example3 {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("src/labs_examples/input_output/labs/example_1/example.txt"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src/labs_examples/input_output/labs/example_1/example_copy.txt"));
            inputStream = new FileInputStream("src/labs_examples/input_output/labs/exercise_3/u2BeautifulDayLyrics.txt");
            outputStream = new FileOutputStream("src/labs_examples/input_output/labs/exercise_3/u2BeautifulDayLyricsCopy.txt");

            byte[] buffer = new byte[5]; //for buffer stream

            while((bufferedInputStream.read(buffer)) != -1){
                System.out.print(new String(buffer));
                bufferedOutputStream.write(buffer);
            }
            System.out.println();

            System.out.println();
            System.out.println("2nd file");


            int c = 0; // for buffer stream 2
            while((c = inputStream.read()) != -1){
                outputStream.write(c);

            }

        } catch(IOException exc){
            System.out.println("an error occurred");
            exc.printStackTrace();

        } finally{

            try {
                bufferedInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                outputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }



    }
}
