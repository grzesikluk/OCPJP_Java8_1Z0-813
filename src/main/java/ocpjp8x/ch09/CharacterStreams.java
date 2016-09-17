package ocpjp8x.ch09;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class CharacterStreams {



    @Test
    public void readingTextFiles() {
        String[] files = {"C:\\Users\\Lukasz\\IdeaProjects\\OCPJP_Java8_1Z0-813\\src\\main\\resources\\input.txt"};


        if(files.length == 0) {
            System.err.println("pass the name of the file(s) as argument");
            System.exit(-1);
        }
        // process each file passed as argument
        for(String file : files) {
            // try opening the file with FileReader
            try (FileReader inputFile = new FileReader(file)) {
                int ch = 0;
                // while there are characters to fetch, read, and print the
                // characters when EOF is reached, read() will return -1,
                // terminating the loop
                while( (ch = inputFile.read()) != -1) {
                    // ch is of type int - convert it back to char
                    // before printing
                    System.out.print( (char)ch );
                }
            } catch (FileNotFoundException fnfe) {
                // the passed file is not found ...
                System.err.printf("Cannot open the given file %s ", file);
            }
            catch(IOException ioe) {
                // some IO error occurred when reading the file ...
                System.err.printf("Error when processing file %s... skipping it", file);
            }
            // try-with-resources will automatically release FileReader object
        }

    }
}
