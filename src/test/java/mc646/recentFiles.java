package mc646;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class recentFiles {
	
	@Test
	public void showRecentFiles() {
		
		File file = new File("u6.pdf", "C:\\Users\\ra139511\\Desktop\\u6.pdf");
		FileList recentList = new FileList();
		
		File file2 = new File("u6v2.pdf", "C:\\Users\\ra139511\\Desktop\\u6.pdf");
		
		recentList.addFile(file);
		recentList.addFile(file2);
		
		assertNotNull(recentList);
		assertEquals("u6.pdf", file.getName());
		assertEquals("C:\\Users\\ra139511\\Desktop\\u6.pdf", file.getPath());
		
		ArrayList<String> listNames = new ArrayList<String>();
		listNames.add("u6.pdf");
		listNames.add("test.pdf");
		assertEquals(listNames, recentList.getNameList());
		
		ArrayList<String> listPaths = new ArrayList<String>();
		listPaths.add("C:\\Users\\ra139511\\Desktop\\u6.pdf");
		listPaths.add("C:\\Users\\ra139511\\Desktop\\u6v2.pdf");
		assertEquals(listPaths, recentList.getNameList());
		
		
	}

}
