package mc646;

import static org.junit.Assert.*;
import org.junit.Test;


public class recentFiles {
	
	@Test
	public void showRecentFiles() {
		
		File file = new File("u6.pdf", "C:\\Users\\ra139511\\Desktop\\u6.pdf");
		FileList recentList = new FileList();
		
		recentList.addFile(file);
		assertNotNull(recentList);
		assertEquals("u6.pdf", file.getName());
		assertEquals("C:\\Users\\ra139511\\Desktop\\u6.pdf", file.getPath());
		
	}

}
