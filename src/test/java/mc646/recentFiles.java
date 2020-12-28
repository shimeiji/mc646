package mc646;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class recentFiles {
	
	@Test
	public void testRecentFilesLifo() {
		
		File file = new File("u6.pdf", "C:\\Users\\ra139511\\Desktop\\u6.pdf");
		FileList recentList = new FileList();
		
		File file2 = new File("u6v2.pdf", "C:\\Users\\ra139511\\Desktop\\u6v2.pdf");
		
		recentList.addFile(file);
		recentList.addFile(file2);
		
		ArrayList<String> listNames = new ArrayList<String>();
		listNames.add(0, "u6.pdf");
		listNames.add(0, "u6v2.pdf");
		assertEquals(listNames, recentList.getNameList());
		
		ArrayList<String> listPaths = new ArrayList<String>();
		listPaths.add(0, "C:\\Users\\ra139511\\Desktop\\u6.pdf");
		listPaths.add(0, "C:\\Users\\ra139511\\Desktop\\u6v2.pdf");
		assertEquals(listPaths, recentList.getPathList());
		
		
	}

}
