package Activities;


import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:\\Training_Workspace\\FST_Java\\File.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists at this path.");
            }
            FileDialog FileUtils;
            File fileUtil = FileUtils.getFile("C:\\Training_Workspace\\FST_Java\\newfile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
            File destDir = new File("resources");
            FileUtils.copyFileToDirectory(file, destDir);
            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
