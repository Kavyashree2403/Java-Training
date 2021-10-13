package InheritanceExample;

public interface floatable {
	public void canfloat();
	public default void repair()
		{
		System.out.print("Reparing the floating");
		}
}
