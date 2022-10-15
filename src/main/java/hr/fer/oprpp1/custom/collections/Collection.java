package hr.fer.oprpp1.custom.collections;


/**
 * <b>Class Collection </b> represents some general collection of objects
 * @author filip fabris
 * @version 1.0.0
 */
public class Collection {

	protected Collection() {

	}

	/**
	 * The size of the Collection (the number of elements it contains).
	 * @return number of currently stored objects in this collections - <b>int</b>
	 */
	int size() {
		return 0;
	}

	/**
	 * @return Returns true if collection contains no objects and false otherwise
	 */
	boolean isEmpty() {
		return this.size() == 0;
	}

	/**
	 * @param value Adds the given object into this collection
	 */
	void add(Object value) {
	}

	/**
	 * @param value object to be checked if exists in colletion
	 * @return Returns true only if the collection contains given value
	 */
	boolean contains(Object value) {
		return false;
	}

	/**
	 * @param value object to be removed
	 * @return Returns true only if the collection contains given value
	 */
	boolean remove(Object value) {
		return false;
	}

	/**
	 * @return Allocates new array with size equals to the size of this collections, fills it with collection content and returns the array. This method never returns null.
	 * @throws UnsupportedOperationException default execption
	 */
	Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Method calls processor.process(.) for each element of this collection
	 * @param processor from Processor class
	 */
	void forEach(Processor processor) {
	}

	/**
	 * Method adds into the current collection all elements from the given collection
	 * @param other colletion from which elements will be added
	 */
	void addAll(Collection other) {

		class OtherProcess extends Processor {

			@Override
			public void process(Object value) {
				add(value);
			}
		}

		OtherProcess process = new OtherProcess();

		other.forEach(process);

	}

	/**
	 * Removes all elements from this collection
	 */
	void clear() {
	}

}
