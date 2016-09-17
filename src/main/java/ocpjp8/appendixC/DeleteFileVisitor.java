package ocpjp8.appendixC;

/**
 * Created by Lukasz on 2016-09-17.
 */
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
        System.out.println("Deleting file: "+file.toAbsolutePath());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws  IOException {
        if(exc != null) {
            System.out.println("Exception encountered "+exc.toString());
            throw exc;
        }
        System.out.println("Deleting directory: "+dir.toAbsolutePath());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}