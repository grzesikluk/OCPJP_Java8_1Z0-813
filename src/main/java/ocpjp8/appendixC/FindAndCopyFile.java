package ocpjp8.appendixC;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


//CONTINUE	Continue to the next item in the file walk.
//TERMINATE	Immediately terminate the file walk.
//SKIP_SUBTREE	Used by the preVisitDirectory() method to indicate that the current directory
// and its descendants should be skipped.
//SKIP_SIBLINGS	Used by the preVisitDirectory() and postVisitDirectory() methods to indicate that all
// remaining unvisited siblings should be skipped. If used in preVisitDirectory(), then the directory entries are also skipped.


public class FindAndCopyFile implements FileVisitor<Path> {
    public FileVisitResult preVisitDirectory(Path dir,
                                             BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().equals("Zoo.txt")) {
            Files.copy(file, Paths.get("Zoo2.txt"));
            return FileVisitResult.TERMINATE;
        } else {
            return FileVisitResult.CONTINUE;
        }
    }

    public FileVisitResult visitFileFailed(Path file,
                                           IOException exc) throws IOException {
        return FileVisitResult.TERMINATE;
    }

    public FileVisitResult postVisitDirectory(Path dir,
                                              IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}
