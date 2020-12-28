package mc646;
import java.util.*;

public class FileList {
	ArrayList<File> recentList = new ArrayList<File>();
	
	public void addFile(File file) {
		if(recentList.size() > 15) {
			recentList.remove(recentList.size()-1);
		}
		this.recentList.add(0, file);
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
