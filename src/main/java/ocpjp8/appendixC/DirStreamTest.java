package ocpjp8.appendixC;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Lukasz on 2016-09-17.
 */
public class DirStreamTest {

    @Test
    public void test1() {
        Path path = Paths.get("C:\\Users\\Lukasz\\IdeaProjects\\OCPJP_Java8_1Z0-813\\src\\main\\resources");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for(Path element: stream) {
                System.out.println(element.getFileName()+"\t"+Files.isDirectory(element));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*Remember for the exam that the DirectoryStream process traverses only a single
directory and does not visit any subdirectories that it encounters.
This distinguishes it from the FileVisitor process that you will see in the next section.*/

    /*
    Since DirectoryStream does not inherit java.util.stream.Stream, we cannot apply any stream-based methods.
    For example, the following does not compile:
    * */
    @Test
    public void test2() throws Exception{
        Path path = Paths.get("/user/home");
//        DirectoryStream<Path> stream = Files.newDirectoryStream(path)
//                .filter(p -> p.getFileName().startsWith("zoo"))          // DOES NOT COMPILE
//                .forEach(System.out::println);
    }


    /*While the DirectoryStream interface is used to visit the contents of a single directory, the FileVisitor<T>
    interface is used to visit an entire directory tree.*/



}
