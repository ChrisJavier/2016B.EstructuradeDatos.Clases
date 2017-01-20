
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

	public void AddFirst(int dato){
		
		if(IsEmpty())
			System.out.println("La Lista esta vacia");
		
		Node Aux=header;
		Node New= new Node (null, null,0);
		
		New.setDato(dato);
		New.setNext(Aux);
		Aux.setNextLast(New);
		header=New;
		size++;
		
	}
	
public void AddLast(int dato){
		
		if(IsEmpty())
			System.out.println("La Lista esta vacia");
		
		Node Aux=trailer;
		Node New= new Node (null, null,0);
		
		New.setDato(dato);
		New.setNextLast(Aux);
		Aux.setNext(New);
		trailer=New;
		
		size++;
	}
	public Node Search(int dato){
		Node aux= new Node(null,null,0);
		Node Find=new Node(null,null,0);
		boolean encontrado=false;
		aux= header;
		while(aux !=null && encontrado!=true){
		
			if(aux.getDato()==dato){
				Find=aux;
				encontrado=true;
				return Find;
				}else{
				aux=aux.getNext();
				}
		}
			return null;
		}
			
	public int Searchs(int dato){
		Node aux= new Node(null,null,0);
		aux= header;
		if(IsEmpty()){
			System.out.println("La lista esta vacia");
			return -1;
		}
		
		for(int i=0;i<size;i++){
			
			if(aux.getDato()==dato){
				return i;
				}else{
				aux=aux.getNext();
				}
		}
			return -1;
		}
	public void CleanList(){
		
		header.setNext(null);
		size=0;
		System.out.println("La Lista esta vacia");
	}
	public void ListarAdelante(){
		if(!IsEmpty()){
			Node Aux= header;
			int i=0;
			while(i!=size){
				System.out.println(i +"-> "+ "["+Aux.getDato()+"]");
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
				System.out.println((size-i-1) +"-> "+ "["+Aux.getDato()+"]");
			Aux= Aux.getNextLast();
			i++;
			}
	}
	}
	
	public int SearchI(int dato)
	{
		if(IsEmpty()){
			System.out.println("La Lista esta vacia");
			return -1;
		}
			Node Aux= header;
		
			for(int i=0; i<size;i++){
				if(i==dato){
					return Aux.getDato();}
				Aux= Aux.getNextLast();
			}
			return -1;
	}
	
	public void InsertNewElementPerRefBefore(int dato,int ref){
		
		Node New= new Node(null,null,0);
		Node Aux=header;
		Node Aux1=new Node(null,null,0);
		
		for(int i=0;i<size;i++)
			if(Aux.getDato()==ref){
				New.setDato(dato);
				New.setNextLast(Aux.getNextLast());
				New.setNext(Aux);
				Aux1.setNext(New);
				Aux.setNextLast(New);
				size++;
				return;
			}else{
				Aux1=Aux;
				Aux=Aux.getNext();
				
			}
				
	}
	public void InsertNewElementPerRefLast(int dato,int ref){
		
		Node New= new Node(null,null,0);
		Node Aux=header;
		
		for(int i=0;i<size;i++)
			if(Aux.getDato()==ref){
				New.setDato(dato);
				New.setNext(Aux.getNext());
				New.setNextLast(Aux);
				Aux.getNext().setNextLast(New);
				Aux.setNext(New);
				size++;
				return;
			}else{

				Aux=Aux.getNext();
				
			}
				
	}
	
	public void EditNode(int dato, int ref)
	{
		Node Aux=Search(ref);
		Aux.setDato(dato);
	}
	
	public void Remove(int dato){
		
		Node aux= Search(dato);
		
		if(aux==null)
			System.out.println("no existe el dato");
		if(aux.getDato()==header.getDato()){
			header=header.getNext();
			aux.setNext(null);
			aux.setNextLast(null);
			size--;
			System.out.println("El elemento ha sido elimindado");
			return;
		}else if(aux==trailer){
			trailer=trailer.getNextLast();
			aux.setNextLast(null);
			aux.setNext(null);
			System.out.println("El elemento ha sido elimindado");
			size--;
			return;
		}else {
			Node Aux1= new Node(null,null,0);
			Node Aux2= new Node(null,null,0);
			Aux1=aux.getNextLast();
			Aux2=aux.getNext();
			aux.setNext(null);
			aux.setNextLast(null);
			Aux2.setNextLast(Aux1);
			Aux1.setNext(Aux2);
			size--;
		}
	
	}
	}
