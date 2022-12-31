/*
1656. Design an Ordered Stream

There is a stream of n (idKey, value) pairs arriving in an arbitrary order, where idKey is an integer between 1 and n and value is a string. No two pairs have the same id.

Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion. The concatenation of all the chunks should result in a list of the sorted values.

Implement the OrderedStream class:

    OrderedStream(int n) Constructs the stream to take n values.
    String[] insert(int idKey, String value) Inserts the pair (idKey, value) into the stream, then returns the largest possible chunk of currently inserted values that appear next in the order.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class OrderedStream {
  private Map<Integer, String> treeMap;
  
  public OrderedStream(int n) {
        this.treeMap = new TreeMap<Integer, String>();
  }
    
  public List<String> insert(int idKey, String value) {
    this.treeMap.put(idKey, value);
    List<String> list = new ArrayList<String>();

    // Se puede puede iterar con un for para devolver solo lo que esta a la derecha de la llave que se esta ingresando
    Iterator it = this.treeMap.keySet().iterator();
    while(it.hasNext()){
      Integer key = (Integer) it.next();
      list.add(this.treeMap.get(key));
    }

    return list;
  }

}