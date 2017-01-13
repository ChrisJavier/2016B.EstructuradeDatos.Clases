/**Node de lista enlazadas simples de Strings**/
public class Node{
  private String Dato;    //nosotros asumimos que los elementos son Strings
  private Node Sig;
  
  /**Crea un  nodo con el siguiente elemento y sigiente nodo*/
  public Node(String s, Node n){
    Dato=s;
    Sig=n;
  }
public Node(String a){
	this.Dato=a;
}
  
  /** Retorna el elemento del nodo*/
  public String getElement(){
    return Dato;
  }
  public Node getNext(){
    return Sig;
  }
  //modifica los metodos
  /** envia elementos a este nodo*/
  public void setElement(String newElem){
    Dato=newElem;
  }
  /**envia el sigiente node a este nodo*/
  public void setNext(Node newNext){
    Sig=newNext;
  }
}
  