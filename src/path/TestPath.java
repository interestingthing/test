package path;

import org.junit.Test;

public class TestPath {

	
	
	@Test
	public void test123(){ 
		String path="F:\\Workspace_MyEclipse2017\\blog\\src\\main\\webapp\\upload\\2018\\05\\29\\11\\41\\58\\3e3dbedb-c368-40eb-86fd-86ca6b05955f";
		int indexOf = path.indexOf("\\upload");
		String substring = path.substring(indexOf);
		System.out.println(substring);
	}
}
