package mcomix.listas.pilas;

/*
 * LinkedStack.java
 *
 */

public class LinkedStack {

  class Node {
    Object elem;
    Node Next;

    public Node(Object o) {
      elem = o;
      Next = null;
    }
  }

  Node end;
  int size;

  public LinkedStack() {
    end = null;
    size = 0;
  }

  public void push(Object o) {
    Node new_node = new Node(o);
    if (end == null)
      end = new_node;
    else {
      new_node.Next = end;
      end = new_node;
    }
    size++;
  }; // inserts an object onto the stack

  public Object pop() {
    if (end == null)
      return null;
    ;
    Object o = end.elem;
    end = end.Next;
    size--;
    return o;
  }// Gets the object from the stack

  public boolean isEmpty() {

    return (size == 0);
  }

  public int size() {

    return size;
  }

  public Object end() {

    if (end == null)
      return null;
    else
      return end.elem;
  }

} // class LinkedStack

