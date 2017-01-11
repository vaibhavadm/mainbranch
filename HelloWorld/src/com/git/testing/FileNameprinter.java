import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
*@Vguddeti
*TODO:
*org.apache.commons.io.FileUtils
* for (File srcFile: srcDir.listFiles()) {
*        if (!srcFile.isDirectory()) {
*            FileUtils.copyFileToDirectory(srcFile, dstDir);
*       }
*    }
*/
public class FileNameprinter {
	static FileWriter f1 =null;
	public static void printFiles(File mainfolder, FileWriter f1) throws IOException {
		File[] listOfFiles = mainfolder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			String name = listOfFiles[i].getPath();
			if (listOfFiles[i].isFile() && name.contains("stage")) {
				f1.append(name);
				f1.append("\n");
			} else if (listOfFiles[i].isDirectory() && !listOfFiles[i].toString().contains("bin")) {
				printFiles(listOfFiles[i], f1);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File folder = new File("C://RTC_VG");
		f1 = new FileWriter("C://RTC_VG//AllFileSTAGE.CSV");
		printFiles(folder,f1);
		f1.close();
		System.out.println("Completed!");
	}
}
