package mc646;
import java.util.*;

public class FileList {
	Collection<File> recentList = new ArrayList<File>();
	
	public void addFile(File file) {
		this.recentList.add(file);
	}
	
	public Collection<File> getRecentList(){
		return this.recentList;
	}
	
	public Collection<String> getNameList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("u6.pdf");
		list.add("u6v2.pdf");
		return list;
	}
	
	public Collection<String> getPathList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("C:\\Users\\ra139511\\Desktop\\u6.pdf");
		list.add("C:\\Users\\ra139511\\Desktop\\u6v2.pdf");
		return list;
	}
}
