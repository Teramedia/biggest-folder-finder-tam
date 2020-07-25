import java.io.File;

public class Main {
    public static void main(String[] args) {
        //D:/TERAMEDIA/...
        String folderPath = "D:/TERAMEDIA/CLIPARTS";
        File file = new File(folderPath);
        System.out.println(getFoldersSize(file));


    }

    public static long getFoldersSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for (File file : files) {
            sum += getFoldersSize(file);
        }
        return sum;
    }
}
