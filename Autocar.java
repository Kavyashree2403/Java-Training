package InheritanceExample;

public class Autocar extends Car implements floatable,Artillery {
void Auto_start()
{
	System.out.println("Automatic");
}
public void canfloat()
	{
	System.out.println("Reparing the floating");
	}
public void canshoot()
{
	System.out.print("Reparing the shoot");
}
@Override
public void repair() {
	// TODO Auto-generated method stub
	Artillery.super.repair();
}
}
