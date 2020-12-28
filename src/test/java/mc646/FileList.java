package mc646;
import java.util.*;

public class FileList {
	ArrayList<File> recentList = new ArrayList<File>();
	
	public void addFile(File file) {
		this.recentList.add(0, file);
	}
	
	public Collection<File> getRecentList(){
		return this.recentList;
	}
	
	public Collection<String> getNameList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add(0, "u6v2.pdf");
		list.add(0, "u6v3.pdf");
		list.add(0, "u6v4.pdf");
		return list;
	}
	
	public Collection<String> getPathList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add(0, "C:\\Users\\ra139511\\Desktop\\u6v2.pdf");
		list.add(0, "C:\\Users\\ra139511\\Desktop\\u6v3.pdf");
		list.add(0, "C:\\Users\\ra139511\\Desktop\\u6v4.pdf");
		return list;
	}
}
