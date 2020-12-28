package mc646;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class recentFiles {
	
	@Test
	public void testRecentFilesLimitSize3() {
		
		FileList recentList = new FileList();
		File file = new File("u6.pdf", "C:\\Users\\ra139511\\Desktop\\u6.pdf");
		File file2 = new File("u6v2.pdf", "C:\\Users\\ra139511\\Desktop\\u6v2.pdf");
		File file3 = new File("u6v3.pdf", "C:\\Users\\ra139511\\Desktop\\u6v3.pdf");
		File file4 = new File("u6v4.pdf", "C:\\Users\\ra139511\\Desktop\\u6v4.pdf");
		
		recentList.addFile(file);
		recentList.addFile(file2);
		recentList.addFile(file3);
		recentList.addFile(file4);
		
		
		ArrayList<String> listNames = new ArrayList<String>();
		listNames.add(0, "u6v2.pdf");
		listNames.add(0, "u6v3.pdf");
		listNames.add(0, "u6v4.pdf");
		assertEquals(listNames, recentList.getNameList());
		
		ArrayList<String> listPaths = new ArrayList<String>();
		listPaths.add(0, "C:\\Users\\ra139511\\Desktop\\u6v2.pdf");
		listPaths.add(0, "C:\\Users\\ra139511\\Desktop\\u6v3.pdf");
		listPaths.add(0, "C:\\Users\\ra139511\\Desktop\\u6v4.pdf");
		assertEquals(listPaths, recentList.getPathList());
		
		
	}

}
