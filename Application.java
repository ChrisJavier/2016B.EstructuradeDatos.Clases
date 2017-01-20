import java.io.LineNumberInputStream;

public class Application {

	public static SLinkedDoble ListDouble= new SLinkedDoble();
	
	
	
	public static void main(String args[]){
		
		ListDouble.addNode(1);
		ListDouble.addNode(2);
		ListDouble.addNode(3);
		ListDouble.ListarAdelante();
		System.out.println("\n");
		ListDouble.ListarAtras();
		
		ListDouble.Remove(1);
		
		System.out.println("\n");
		ListDouble.ListarAdelante();
		ListDouble.ListarAtras();
		ListDouble.CleanList();
		
		ListDouble.ListarAdelante();
		
	}
}
