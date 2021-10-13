package InheritanceExample;

public class Cartest {
public static void main (String []args) {
	Autocar ac=new Autocar();
	ac.Auto_start();
	ac.start();
	System.out.print("Number of wheels are ");
	System.out.println(ac.wheels);
	System.out.print("Number of windows are ");
	System.out.println(ac.windows);
	ac.canfloat();
	ac.canshoot();
}

}
