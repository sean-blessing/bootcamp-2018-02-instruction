package subpackage2;

public class ClassC {
	ClassB cb = new ClassB();

	public ClassC(ClassB cb) {
		super();
		this.cb = cb;
		cb.varA = "test";
	}
	
	
}
