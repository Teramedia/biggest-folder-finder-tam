import java.io.File;

public class Main {
    public static void main(String[] args) {
        //D:/TERAMEDIA/...
        String folderPath = "D:/TERAMEDIA/CLIPARTS";
        File file = new File(folderPath);

        long start = System.currentTimeMillis();
        System.out.println(getFoldersSize(file));
        long duration = (System.currentTimeMillis() - start)/1000;
        System.out.println(duration + "seconds");
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
