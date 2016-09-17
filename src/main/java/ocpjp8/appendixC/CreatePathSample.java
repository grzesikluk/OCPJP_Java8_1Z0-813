package ocpjp8.appendixC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Lukasz on 2016-09-17.
 */
public class CreatePathSample {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("C:\\Users\\Lukasz\\IdeaProjects\\OCPJP_Java8_1Z0-813\\src\\main\\resources"),
                new CreateFileVisitor());
    }
}
