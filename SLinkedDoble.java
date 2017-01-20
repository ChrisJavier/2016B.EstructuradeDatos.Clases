import javax.imageio.IIOException;

public class SLinkedDoble {
	
	protected int size=0;
	
	protected Node header, trailer;
	
	public SLinkedDoble()
	{
		size=0;
		header= new Node(null, null,0);
		trailer= new Node(null, null, 0);
		header.setNext(trailer);
	}

	public void addNode(int dato){
		
		Node New =  new Node(null,null,0);
		Node Last = new Node(null,null,0);
		if(IsEmpty()){
			New.setDato(dato);
			header=New;
		
		}else{
			Node Aux=header;
			while(Aux.getNext()!=null){
				Aux=Aux.getNext();
				if(Aux.getNext()!=null){
					
				}
			}
			if(size>=2){
				New.setDato(dato);
				New.setNextLast(Aux);
				Aux.setNext(New);
				trailer=New;
			}else{
				Last=trailer;
				Last.setDato(dato);
				Last.setNextLast(Aux);
				Aux.setNext(trailer);
				
				
			}
			
			
			
		}
		size++;
			
	}
	public int Size(){return size;}
	
	public boolean IsEmpty(){return (size==0);}
	
	public Node getFirst() throws IllegalStateException {
		if(IsEmpty()) throw new IllegalStateException("La lista esta vacia");
		return header.getNext();
	}
	
	public Node getLast() throws IllegalStateException{
		if(IsEmpty()) throw new IllegalStateException("La lista esta vacia");
		return trailer.getNextLast();
	}
	
	public Node getPrev(Node v) throws IllegalStateException{
		if(v==header) throw new IllegalStateException("no se puede mover mas alla de Atras de la lista");
		return v.getNextLast();
	}
	
	public void addBefore(Node v, Node z) throws IllegalStateException{
		Node u= v.getNextLast();
		z.setNextLast(u);
		z.setNext(v);
		v.setNextLast(z);
		u.setNext(z);
		size++;
	}
	public void addAfter(Node v, Node z){
		Node w=v.getNext();
		z.setNextLast(v);
		z.setNext(w);
		w.setNextLast(z);
		v.setNext(z);
		size++;
	}
	public void addFirst(Node v){
		addAfter(header, v);
	}
	public void addLast(Node v){
		addBefore(trailer, v);
	}
	public void Remove(Node v){
		Node u= v.getNextLast();
		Node w= v.getNext();
		
		w.setNextLast(u);
		u.setNext(w);
		v.setNextLast(null);
		v.setNext(null);
		size--;
	}
	public Node Search(int dato){
		Node aux= new Node(null,null,0);
		Node Find=null;
		boolean encontrado=false;
		aux= header;
		while(aux !=null && encontrado!=true)
		
			if(aux.getDato()==dato){
				Find=aux;
				encontrado=true;}else{
				aux.getNext();}
			
			return null;
		}
			
	public void CleanList(){
		
		header.setNext(null);
		size=0;
	}
	public void ListarAdelante(){
		if(!IsEmpty()){
			Node Aux= header;
			int i=0;
			while(Aux!=null){
				System.out.println(i + "-["+Aux.getDato()+"]"+"-> ");
			Aux= Aux.getNext();
			i++;
			}
		}}
	public void ListarAtras()
	{
		if(!IsEmpty()){
			Node Aux= trailer;
			int i=0;
			while(i!=size){
				System.out.println((size-i) + "-["+Aux.getDato()+"]"+"-> ");
			Aux= Aux.getNextLast();
			i++;
			}
	}
	}
		
	public void Remove(int dato){
		
		Node aux= Search(dato);
		Node aux1=null;
		
		if(aux==header){
			header=header.getNext();
			aux.setNext(null);
			aux.setNextLast(null);
			size--;
		}else if(aux==trailer){
			trailer=trailer.getNextLast();
			aux.setNext(null);
		}
	
	
	}
	}
