
public class Node {

	Node Next;
	Node Last;
	int Date;
	
	
	public Node(int entrada){
		
		this.Next=null;
		this.Last=null;
		this.Date=entrada;
	}
	
	
	public Node (Node Next_, Node Last_, int Date_){
		
		this.Next=Next_;
		this.Last=Last_;
		this.Date=Date_;
		
		
		
	}


	public Node getNext() {
		return Next;
	}


	public void setNext(Node next) {
		Next = next;
	}


	public Node getLast() {
		return Last;
	}


	public void setLast(Node last) {
		Last = last;
	}


	public int getDate() {
		return Date;
	}


	public void setDate(int date) {
		Date = date;
	}
	
}
