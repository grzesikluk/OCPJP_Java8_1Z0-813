package ocpjp8.appendixC;

/**
 * Created by Lukasz on 2016-09-17.
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class CreateFileVisitor extends SimpleFileVisitor<Path> {

    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws  IOException {
        if(exc != null) {
            System.out.println("Exception encountered "+exc.toString());
            throw exc;
        }

        new File(dir.toString()+"\\temp").mkdir();

        Path file = Paths.get(dir.toString()+"\\temp\\file1");
        Files.createFile(file);
        file = Paths.get(dir.toString()+"\\temp\\file2");
        Files.createFile(file);


        return FileVisitResult.TERMINATE;
    }
}