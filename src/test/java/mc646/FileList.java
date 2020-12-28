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
}
