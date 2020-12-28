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
		for (File e : recentList) {
			list.add(e.getName());
		}
		return list;
	}
	
	public Collection<String> getPathList(){
		ArrayList<String> list = new ArrayList<String>();
		for (File e : recentList) {
			list.add(e.getPath());
		}
		return list;
	}
}
