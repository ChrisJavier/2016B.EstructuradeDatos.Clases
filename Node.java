
public class Node {
 Node adelante;
 Node atras;
 int dato;
 
 
 public Node(int entrada){
	 
	 this.dato=entrada;
	 this.adelante=atras=null;
	 
 }

 public Node (Node adelante_, Node atras_, int dato)
 {
	 this.adelante=adelante_;
	 this.atras=atras_;
	 this.dato=dato;
 }

public Node getNext() {
	return adelante;
}


public void setNext(Node adelante) {
	this.adelante = adelante;
}


public Node getNextLast() {
	return atras;
}


public void setNextLast(Node atras) {
	this.atras = atras;
}


public int getDato() {
	return dato;
}


public void setDato(int dato) {
	this.dato = dato;
}



}
