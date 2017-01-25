
public class SLinkedListCircule {

	
	protected int size;
	protected Node Header, Trailer;
	
	
	public SLinkedListCircule(){
		size=0;
		Header=new Node(null,null,0);
		Trailer=new Node(null,null,0);
		Header.setNext(Trailer);
		
	}
	public void addNode(int dato){
		
		Node New =  new Node(null,null,0);
		Node Last = new Node(null,null,0);
		if(IsEmpty()){
			New.setDate(dato);
			New.setLast(Trailer);
			New.setNext(Trailer);
			Trailer.setNext(New);
			Trailer.setLast(New);
			Header=New;
			
		}else{
			Node Aux=Header;
			while(Aux.getNext()!=Header){
				Aux=Aux.getNext();
			}
     		if(size==1){
				Aux.setDate(dato);
				
			}else{
				Last.setDate(dato);
				Last.setLast(Aux);
				Last.setNext(Header);
				Aux.setNext(Last);
				Trailer=Last;
				
		}
		}
		size++;
		}
	public int Size(){return size;}
	
	public boolean IsEmpty(){return (size==0);}
	
	public void addBefore(Node v, Node z) throws IllegalStateException{
		Node u= v.getLast();
		z.setLast(u);
		z.setNext(v);
		v.setLast(z);
		u.setNext(z);
		size++;
		
	}
	public void addAfter(Node v, Node z){
		Node w=v.getNext();
		z.setLast(v);
		z.setNext(w);
		w.setLast(z);
		v.setNext(z);
		size++;
	}
	
	public void addFirst(Node v){
		addAfter(Header, v);
	}
	public void addLast(Node v){
		addBefore(Trailer, v);
	}

	public void AddFirst(int dato){
		
		if(IsEmpty())
			System.out.println("La Lista esta vacia");
		
		Node Aux=Header;
		Node New= new Node (null, null,0);
		
		New.setDate(dato);
		New.setNext(Aux);
		New.setLast(Trailer);
		Aux.setLast(New);
		Header=New;
		size++;
		
	}
public void AddLast(int dato){
		
		if(IsEmpty())
			System.out.println("La Lista esta vacia");
		
		Node Aux=Trailer;
		Node New= new Node (null, null,0);
		
		New.setDate(dato);
		New.setLast(Aux);
		New.setNext(Header);
		Aux.setNext(New);
		Trailer=New;
		
		size++;
	}
	public Node Search(int dato){
		Node aux= new Node(null,null,0);
		Node Find=new Node(null,null,0);
		boolean encontrado=false;
		aux= Header.getNext();
		while(aux!=Header && encontrado!=true){
				int n=aux.getDate();
			if(n==dato){
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
		aux= Header;
		if(IsEmpty()){
			System.out.println("La lista esta vacia");
			return -1;
		}
		
		for(int i=0;i<size;i++){
			
			if(aux.getDate()==dato){
				return i;
				}else{
				aux=aux.getNext();
				}
		}
			return -1;
		}
	public void CleanList(){
		
		Header.setNext(null);
		Header.setLast(null);
		size=0;
		System.out.println("La Lista esta vacia");
	}
	public void ListarAdelante(){
		if(!IsEmpty()){
			Node Aux= Header;
			int i=0;
			while(i!=size){
				System.out.println(i +"-> "+ "["+Aux.getDate()+"]");
			Aux= Aux.getNext();
			i++;
			}
		}}
	public void ListarAtras()
	{
		if(!IsEmpty()){
			Node Aux= Trailer;
			int i=0;
			while(i!=size){
				System.out.println((size-i-1) +"-> "+ "["+Aux.getDate()+"]");
			Aux= Aux.getLast();
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
			Node Aux= Header;
		
			for(int i=0; i<size;i++){
				if(i==dato){
					return Aux.getDate();}
				Aux= Aux.getLast();
			}
			return -1;
	}
	
	public void InsertNewElementPerRefBefore(int dato,int ref){
		
		Node New= new Node(null,null,0);
		Node Aux=Header;
		Node Aux1=new Node(null,null,0);
		
		for(int i=0;i<size;i++)
			if(Aux.getDate()==ref){
				New.setDate(dato);
				New.setLast(Aux.getLast());
				New.setNext(Aux);
				Aux1.setNext(New);
				Aux.setLast(New);
				size++;
				return;
			}else{
				Aux1=Aux;
				Aux=Aux.getNext();
				
			}
				
	}
	public void InsertNewElementPerRefLast(int dato,int ref){
		
		Node New= new Node(null,null,0);
		Node Aux=Header;
		
		for(int i=0;i<size;i++)
			if(Aux.getDate()==ref){
				New.setDate(dato);
				New.setNext(Aux.getNext());
				New.setLast(Aux);
				Aux.getNext().setLast(New);
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
		Aux.setDate(dato);
	}
	
	public void Remove(int dato){
		
		Node aux= Search(dato);
		
		if(aux==null)
			System.out.println("no existe el dato");
		if(aux.getDate()==Header.getDate()){
			Header=Header.getNext();
			Header.setLast(Trailer);
			aux.setNext(null);
			aux.setLast(null);
			size--;
			System.out.println("El elemento ha sido elimindado");
			return;
		}else if(aux==Trailer){
			Trailer=Trailer.getLast();
			Trailer.setNext(Header);
			aux.setLast(null);
			aux.setNext(null);
			System.out.println("El elemento ha sido elimindado");
			size--;
			return;
		}else {
			Node Aux1= new Node(null,null,0);
			Node Aux2= new Node(null,null,0);
			Aux1=aux.getLast();
			Aux2=aux.getNext();
			aux.setNext(null);
			aux.setLast(null);
			Aux2.setLast(Aux1);
			Aux1.setNext(Aux2);
			System.out.println("El elemento ha sido elimindado");
			size--;
		}
	
	}
	
	
}
