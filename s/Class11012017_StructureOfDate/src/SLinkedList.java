import java.awt.List;

/**lista enlazada simple*/
public class SLinkedList {

	protected Node Cabecera	;	//cabeza nodo de la lista
	protected Node Ultimo;
	protected long Tamanio; 	//numero de nodos en la lista
	/**contructor default este crea una lista vacia*/
	
	public SLinkedList(){
		
		Cabecera=null;
		Tamanio=0;
	}
	
	public long getSize(){
		return Tamanio;
	}
	 public boolean siVacio() {
	        return Cabecera== null;
	    }
	
	  public void addNode(String valor) {
		  
		  Node New = new Node(null);
	        if(siVacio()) {
	        New.setElement(valor);;
	  		  Cabecera=New;
	  		  
	        }
	        else {
	        	Node Aux = Cabecera;
	        	while(Aux.getNext() !=null){
	        		Aux=Aux.getNext();
	        	}
	            Aux.setNext(New);
	        }
	        Tamanio++;
	    }

	  public void RemoveElement(){
		   
		   if(Cabecera==null){
			   System.out.println("Error, la lista esta vacia");
		   
		   }
	   }
	  
	  
	  public void addFirst(String valor){
		  
		  Node New= new Node(null);
		  
		  New.setElement(valor);
		  if(siVacio()){
			  Cabecera=New;
		  }else{
			  New.setNext(Cabecera);
			  Cabecera= New;
			  	
		  }
	  }
	  
	  public void InsertarPorReferencia(String Ref, String valor){
		  
		  Node New= new Node(null);
		  New.setElement(valor);
		  if(!siVacio()){
			  
			  if(buscar(Ref)){
				  Node Aux =Cabecera;
				  while(Aux.getElement() !=Ref){
					  Aux=Aux.getNext();
				  }
				  Node Next= Aux.getNext();
				  Aux.setNext(New);
				  New.setNext(Next);
				  Tamanio++;
			  }
		  }
		 	
		}
	  public boolean buscar(String Ref){
			
		  Node Aux = Cabecera;
		  boolean encontrado= false;
		  while(Aux != null && encontrado!= true){
			  if(Ref==Aux.getElement()){
				  encontrado= true;
			  }else{
				  Aux=Aux.getNext();
			  }
		  }
	  return encontrado;
	  }
/*	  
	  public int getPosicion(String Ref) throws Exception{
		  if(buscar(Ref)){
			  Node Aux= Cabecera;
			  int cont=0;
			  while(Ref!= Aux.getElement()){
				  cont++;
				  Aux= Aux.getNext();
			  }
			  return cont;
		  }else{
			  throw new Exception("Valor inexistente en la lista");
		  }
	  }
	  
	  public void editarPorReferencia(String Ref, String valor){
		  if(buscar(Ref)){
			  Node Aux= Cabecera;
			  while(Aux.getElement() !=Ref){
				  Aux= Aux.getNext();
			  }
			  Aux.setElement(valor);
		  }
	  }
	  
	public void editarPorPosicion(int pos, String valor){
		if(pos>=0 && pos<Tamanio){
			if(pos==0){
				Cabecera.setElement(valor);
			}
		}else{
			Node Aux = Cabecera;
			for(int i=0;i<pos;i++)
				Aux= Aux.getNext();
				Aux.setElement(valor);
			}
		}
	public void removerPorReferencia(String Ref){
		
		if(buscar(Ref)){
			if(Cabecera.getElement()== Ref){
				Cabecera= Cabecera.getNext();
			}else{
				Node Aux = Cabecera;
				while(Aux.getNext().getElement() != Ref){
					Aux = Aux.getNext();
				}
			Node Next = Aux.getNext().getNext();
			Aux.setNext(Next);
			}
			Tamanio--;
		}
	}
	
	public void RemoverPorPosicion(int pos){
		
		if(pos>=0 && pos<Tamanio){
			if(pos==0){
				Cabecera= Cabecera.getNext();
			}
		}else{
			Node Aux= Cabecera;
			for(int i=0; i<pos-1;i++)
				Aux=Aux.getNext();
			Node Next = Aux.getNext();
			Aux.setNext(Next.getNext());
		}
		Tamanio--;
	}*/
	
	public void Eliminar(){
		Cabecera=null;
		Tamanio=0;
	}
	public void Listar(){
		if(!siVacio()){
			Node Aux= Cabecera;
			int i=0;
			while(Aux!=null){
				System.out.println(i + "-["+Aux.getElement()+"]"+"-> ");
			Aux= Aux.getNext();
			i++;
			}
		}
			
	}
	
	
}
