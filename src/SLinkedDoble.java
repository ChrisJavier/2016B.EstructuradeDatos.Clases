import javax.imageio.IIOException;

public class SLinkedDoble {
	
	protected int size;
	
	protected Node header, trailer;
	
	public SLinkedDoble()
	{
		size=0;
		header= new Node(null, null,0);
		trailer= new Node(null, null, 0);
		header.setNextA(trailer);
	}

	public int Size(){return size;}
	
	public boolean IsEmpty(){return (size==0);}
	
	public Node getFirst() throws IllegalStateException {
		if(IsEmpty()) throw new IllegalStateException("La lista esta vacia");
		return header.getNextA();
	}
	
	public Node getLast() throws IllegalStateException{
		if(IsEmpty()) throw new IllegalStateException("La lista esta vacia");
		return trailer.getNextAt();
	}
	
	public Node getPrev(Node v) throws IllegalStateException{
		if(v==header) throw new IllegalStateException("no se puede mover mas alla de Atras de la lista");
		return v.getNextAt();
	}
	
	public void addBefore(Node v, Node z) throws IllegalStateException{
		Node u= v.getNextAt();
		z.setNextAt(u);
		z.setNextA(v);
		v.setNextAt(z);
		u.setNextA(z);
		size++;
	}
	public void addAfter(Node v, Node z){
		Node w=v.getNextA();
		z.setNextAt(v);
		z.setNextA(w);
		w.setNextAt(z);
		v.setNextA(z);
		size++;
	}
	public void addFirst(Node v){
		addAfter(header, v);
	}
	public void addLast(Node v){
		addBefore(trailer, v);
	}
	public void Remove(Node v){
		Node u= v.getNextAt();
		Node w= v.getNextA();
		
		w.setNextAt(u);
		u.setNextA(w);
		v.setNextAt(null);
		v.setNextA(null);
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
				aux.getNextA();}
			
			return null;
		}
			
	public void Remove(int dato){
		
		Node aux= Search(dato);
		Node aux1=null;
		
		if(aux==header){
			header=header.getNextA();
			aux.setNextA(null);
			aux.setNextAt(null);
			size--;
		}else if(aux==trailer){
			trailer=trailer.getNextAt();
			aux.setNextA(null);
		}
	
	
	}
	}
