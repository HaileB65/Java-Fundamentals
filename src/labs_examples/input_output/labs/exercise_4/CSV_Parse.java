package labs_examples.input_output.labs.exercise_4;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

public class CSV_Parse {
    public static void main(String[] args) {
        ArrayList<BasketballTeam> basketballTeams = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader("src/labs_examples/input_output/labs/exercise_4/student.csv"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/labs_examples/input_output/labs/exercise_4/student_copy.csv"))) {

            String line;

            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                basketballTeams.add(mapValuesToStudentObject(values));
                bw.write(line);
                bw.newLine();

            }



        }catch (FileNotFoundException exc){
            System.out.println("An error occurred" + exc.getMessage());
            exc.printStackTrace();
        }catch (IOException exc2){
            System.out.println("An error occurred" + exc2.getMessage());
            exc2.printStackTrace();
        }

        for(BasketballTeam basketballTeam : basketballTeams){
            System.out.println(basketballTeam.toString());
        }
    }

    private static BasketballTeam mapValuesToStudentObject(String[] values){
        BasketballTeam basketballTeam =new BasketballTeam();

        basketballTeam.setHeight(Double.parseDouble(values[0]));
        basketballTeam.setWeight(Double.parseDouble(values[1]));
        basketballTeam.setEyeColor(values[2]);

        return basketballTeam;

    }
}