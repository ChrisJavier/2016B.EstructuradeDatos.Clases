
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

public Node getNextA() {
	return adelante;
}


public void setNextA(Node adelante) {
	this.adelante = adelante;
}


public Node getNextAt() {
	return atras;
}


public void setNextAt(Node atras) {
	this.atras = atras;
}


public int getDato() {
	return dato;
}


public void setDato(int dato) {
	this.dato = dato;
}



}
