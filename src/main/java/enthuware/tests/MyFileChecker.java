package enthuware.tests;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Lukasz on 2016-09-28.
 */
 class MyFileChecker extends SimpleFileVisitor<Path> {
    private final PathMatcher matcher;
    private static int count;

    public MyFileChecker(){
        matcher = FileSystems.getDefault().getPathMatcher("glob:**.java");
    }

    void check(Path p){
        if(p != null && matcher.matches(p)){
            count++;
        }

    }
    public int getCount(){
        return count;
    }

    public FileVisitResult visitFile(Path p, BasicFileAttributes attr){
        check(p);
        return FileVisitResult.CONTINUE;
    }
}

class Path2 {
    public static void main(String[] args) throws IOException {
        MyFileChecker mfc = new MyFileChecker();
        Files.walkFileTree(Paths.get("C:\\Users\\Lukasz\\IdeaProjects\\OCPJP_Java8_1Z0-813\\src\\main\\resources\\pathtest"), mfc);
        System.out.println(mfc.getCount());
    }

}