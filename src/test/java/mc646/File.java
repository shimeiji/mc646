package mc646;

public class File {
	String fileName;
	String filePath;
	
	public File (String fileName, String filePath) {
		this.fileName = fileName;
		this.filePath = filePath;
	}
	
	public String getName() {
		return this.fileName;
	}
	
	public String getPath() {
		return this.filePath;
	}
}
