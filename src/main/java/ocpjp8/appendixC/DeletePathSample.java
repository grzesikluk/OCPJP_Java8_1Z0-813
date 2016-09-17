package ocpjp8.appendixC;

/**
 * Created by Lukasz on 2016-09-17.
 */
import java.io.IOException;
import java.nio.file.*;

public class DeletePathSample {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("C:\\Users\\Lukasz\\IdeaProjects\\OCPJP_Java8_1Z0-813\\src\\main\\resources\\temp"),
                new DeleteFileVisitor());
    }
}