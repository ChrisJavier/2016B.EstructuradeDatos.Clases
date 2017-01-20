import java.util.Scanner;

public class Application {

	public static SLinkedDoble ListDouble= new SLinkedDoble();
	
	
	
	public static void main(String args[]){
		
		int op=0;
		Scanner scann=new Scanner(System.in);
		int dato;
		
		
		System.out.println("*****************************Lista Enlasado Doble**************************");
		do{
		
			System.out.println("\n[1]-> Añadir Dato\n[2]-> Buscar Dato\n[3]-> Eliminar Dato \n[4]-> Limpiar Lista\n[5]-> Imprimir Lista\n[6]-> Insertar Dato\n[0]-> Salir\nElija una opcion---->");
			op=scann.nextInt();
			switch(op){
			case 1:
				System.out.println("Ingrese un dato ->");
				dato=scann.nextInt();
				ListDouble.addNode(dato);
				ListDouble.ListarAdelante();
				break;
			case 2:
				
				System.out.println("Desea buscar!!!\n[1]->Referencia\n[2]->Indice\nElija una opcion ->");
				op=scann.nextInt();
				if(op==1){
					ListDouble.ListarAdelante();
					System.out.println("Ingrese una Referencia ->");
					dato=scann.nextInt();
					System.out.println("El dato->  "+dato+ "  esta en la posicion "+(ListDouble.Searchs(dato)!=-1 ? ListDouble.Searchs(dato):"No existe ")+" de la lista");
					ListDouble.ListarAdelante();
				}else{
					ListDouble.ListarAdelante();
					System.out.println("Ingrese un Indice ->");
					dato=scann.nextInt();
					System.out.println("La posicion "+dato+ " tiene el dato "+(ListDouble.SearchI(dato)!=-1 ? ListDouble.SearchI(dato):"No existe")+" de la lista");
					ListDouble.ListarAdelante();
				}
			
				break;
			case 3:
				ListDouble.ListarAdelante();
				System.out.println("Ingrese una Referencia ->");
				dato=scann.nextInt();
				ListDouble.Remove(dato);
				ListDouble.ListarAdelante();
				break;
			case 4:
				ListDouble.CleanList();
				break;
			case 5:
				System.out.println("!!Desea imprimir\n[1]-> Ascendente\n[2]-> Desendente\nElija una opcion ->");
				op=scann.nextInt();
				if(op==1){
					ListDouble.ListarAdelante();	
				}else{
					ListDouble.ListarAtras();
				}
				break;
			case 6:
				int ref=0;
				System.out.println("!!Desea Insertar un dato\n[1]-> Antes\n[2]-> Despues\n[3]-> Aniadir al Principio\n[4]-> Aniadir al Final\nElija una opcion ->");
				op=scann.nextInt();
				ListDouble.ListarAdelante();
				System.out.println("Ingrese una Referencia de un dato->");
				ref=scann.nextInt();
				System.out.println("Ingrese un Dato ->");
				dato=scann.nextInt();
				
				if(op==1){
					ListDouble.InsertNewElementPerRefBefore(dato, ref);	
				}else if(op==2){
					ListDouble.InsertNewElementPerRefLast(dato, ref);	
				}else if(op==3){
					ListDouble.AddFirst(dato);
				}else{
					ListDouble.AddLast(dato);
				}
				ListDouble.ListarAdelante();
				break;
			}
		}while(op!=0);
		
		
/*		
		ListDouble.addNode(1);
		ListDouble.addNode(2);
		ListDouble.addNode(3);
		ListDouble.ListarAdelante();
		System.out.println("\n");
		ListDouble.ListarAtras();
		ListDouble.EditNode(6, 2);
		//ListDouble.InsertNewElementPerRefLast(5, 2);
		//ListDouble.InsertNewElementPerRefBefore(5, 2);
		//ListDouble.Remove(1);
		
		System.out.println("\n");
		ListDouble.ListarAdelante();
		//ListDouble.ListarAtras();
		//ListDouble.CleanList();
		
		//ListDouble.ListarAdelante();
*/		
	}
}
