package subpackage;

import subpackage2.ClassB;

public class ClassD {
	private ClassB cb = null;

	public ClassD(ClassB cb) {
		super();
		this.cb = cb;
		//cb.varA = "";  can't do this because varA is protected
	}
	
	
}
