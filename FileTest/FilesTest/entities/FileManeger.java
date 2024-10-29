import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManeger {
	private String fileName;
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public File getFilePath() {
		return new File("/home/joao/Documentos/workspace/FileTest/FilesTest/out/",fileName + ".csv"); 
	}
	public void addFile() {
		File filePath = getFilePath();
		try {
			if (filePath.createNewFile()) {
				System.out.println("done");
			}else {
				System.out.println("Couldn't create file.");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addContent(String content) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(getFilePath(),true));
			writer.write(content);
			writer.newLine();
			writer.close();
			System.out.println("done writing");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}