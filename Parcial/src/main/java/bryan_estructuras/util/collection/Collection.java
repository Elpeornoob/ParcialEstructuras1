package bryan_estructuras.util.collection;

import bryan_estructuras.util.iterable.Iterable;

public interface Collection<E> extends Iterable<E>{

    /**
     * Removes all elements from the collection. 
     * 
     * @return 'true' if the list was cleared successfully, otherwise 'false'.
     */
    public boolean clear();

    /**
     * Determines if the collection contains the specified element.
     * 
     * @param element the element to search for.
     * @return 'true' if the colletion contains the specified element, otherwise 'false'.
     */
    public boolean contains(E element);
    
    /**
     * Determines if the collection contains the specified elements in the array.
     * 
     * @param array the array containing elements to be searched for in this collection.
     * @return 'true' if the collection contains the specified elements in the array, otherwise 'false'.
     */
    public boolean contains(E[] array);

    /**
     * Determines if the collection contains the specified elements.
     * 
     * @param collection the collection containing elements to be searched for in this collection.
     * @return 'true' if the collection contains the specified elements, otherwise 'false'.
     */
    public boolean contains(Collection <E> collection) ;

    /**
     * Determines if the collection contains any element.
     * 
     * @return 'true' if the collection contains any element, otherwise 'false'.
     */
    public boolean isEmpty();

    /**
     * Redistributes the elements in the collection in reverse order.
     * 
     * @return 'true' if the collection was reversed successfully, otherwise 'false'.
     */
    public boolean reverse();

    /**
     * Gets the size of the collection.
     * 
     * @return the number of elements in this collection.
     */
    public int size();

}