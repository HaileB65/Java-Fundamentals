package labs_examples.input_output.labs.example_1;
import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("src/labs_examples/input_output/labs/example_1/example.txt"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src/labs_examples/input_output/labs/example_1/example_copy.txt"));

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while((bytesRead = bufferedInputStream.read(buffer)) != -1){
                System.out.print(new String(buffer));
                bufferedOutputStream.write(buffer);
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

        }



    }
}