package InheritanceExample;

public interface Artillery {
	public void canshoot();
	public default void repair()
		{
		System.out.print("Reparing the Artillery ");
		}
}
