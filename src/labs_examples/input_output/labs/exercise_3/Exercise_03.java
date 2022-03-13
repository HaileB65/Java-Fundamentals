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
    public static void main(String[] args) throws FileNotFoundException {

        try(BufferedInputStream byteStream1In = new BufferedInputStream(new FileInputStream("src/labs_examples/input_output/labs/exercise_3/example_2.txt"));
            BufferedOutputStream byteStream1Out = new BufferedOutputStream(new FileOutputStream("src/labs_examples/input_output/labs/exercise_3/example2_copy.txt"));
            InputStream byteStream2In = new FileInputStream("src/labs_examples/input_output/labs/exercise_3/u2BeautifulDayLyrics.txt");
            OutputStream byteStream2Out = new FileOutputStream("src/labs_examples/input_output/labs/exercise_3/u2BeautifulDayLyricsCopy.txt");
            BufferedReader characterStream1In = new BufferedReader(new FileReader("src/labs_examples/input_output/labs/exercise_3/example_3.txt"));
            PrintWriter characterStream1Out = new PrintWriter(new FileWriter("src/labs_examples/input_output/labs/exercise_3/example_3copy.txt"));
            BufferedReader characterStream2In = new BufferedReader(new FileReader("src/labs_examples/input_output/labs/exercise_3/example_4.txt"));
            PrintWriter characterStream2Out = new PrintWriter(new FileWriter("src/labs_examples/input_output/labs/exercise_3/example_4copy.txt"));
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/labs_examples/input_output/labs/exercise_3/example_5.txt"));
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/labs_examples/input_output/labs/exercise_3/example_5copy.txt"))) {


            byte[] buffer = new byte[5]; // reading byteSteam1In and writing to byteStreamIn1Out
            while((byteStream1In.read(buffer)) != -1){
                byteStream1Out.write(buffer);
            }
            System.out.println("finished writing to byteStream1Out");

            int c = 0; // // reading byteSteam2In and writing to byteStreamIn2Out
            while((c = byteStream2In.read()) != -1){
                byteStream2Out.write(c);
            }
            System.out.println("finished writing to byteStream2Out");

            String l = ""; // reading characterStream1In and writing to characterStream1Out
            while ((l = characterStream1In.readLine()) != null) {
                String newLString = l
                        .replace("a", "-")
                        .replace("e", "~");

                characterStream1Out.println(newLString);
            }
            System.out.println("finished writing to characterStream1Out");

            int r =0; // reading characterStream2In and writing to characterStream2Out
            while ((r = characterStream2In.read()) != -1) {
                characterStream2Out.write(r);
            }
            System.out.println("finished writing to characterStream2Out");

            int z = 0; // // reading dataInputStream and writing to dataOutputStream
            while((z = dataInputStream.read()) != -1){
                dataOutputStream.write(z);
            }
            System.out.println("finished writing to dataOutputStream");

        } catch(IOException exc){
            System.out.println("an error occurred");
            exc.printStackTrace();

        }



    }
}
