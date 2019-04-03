package jiujiu;

import java.util.List;

public class Clone implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 1;
	}

	
}
