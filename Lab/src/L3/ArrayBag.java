package L3;

public class ArrayBag<T> implements BagInterface<T> {

    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[]) new Object[capacity];
        bag = tempBag;
        numberOfEntries = 0;
    }

    public int getCurrentSize() {
        return numberOfEntries;
    }

    public boolean isFull() {
        return numberOfEntries >= bag.length;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public boolean add(T newEntry) {
        if (isFull()) {
            return false;
        }
        bag[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
    }

    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T result = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries--;
        return result;
    }

    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
        if (index == -1) {
            return false;
        }
        removeEntry(index);
        return true;
    }

    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }

    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry.equals(bag[i])) {
                frequency++;
            }
        }
        return frequency;
    }

    public boolean contains(T anEntry) {
        return getIndexOf(anEntry) != -1;
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            result[i] = bag[i];
        }
        return result;
    }

    private int getIndexOf(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry.equals(bag[i])) {
                return i;
            }
        }
        return -1;
    }

    private void removeEntry(int index) {
        bag[index] = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries--;
    }
    public BagInterface<T> union(BagInterface<T> otherBag) {
        // Create a new bag to hold the union of this bag and otherBag
        BagInterface<T> unionBag = new ArrayBag<T>(this.getCurrentSize() + otherBag.getCurrentSize());

        // Add all elements from this bag to the union bag
        T[] contents = this.toArray();
        for (int i = 0; i < this.getCurrentSize(); i++) {
            unionBag.add(contents[i]);
        }

        // Add all elements from the other bag to the union bag
        contents = otherBag.toArray();
        for (int i = 0; i < otherBag.getCurrentSize(); i++) {
            unionBag.add(contents[i]);
        }

        return unionBag;
    }
    /**
     * Returns a new bag containing the intersection of this bag and another bag.
     * The intersection of two bags is a new bag that contains only the elements
     * that are in both bags. If an element appears n times in both bags, it will appear
     * min(n, m) times in the resulting bag, where m is the number of times the element
     * appears in this bag and n is the number of times it appears in the other bag.
     *
     * @param otherBag the other bag with which to compute the intersection
     * @return a new bag containing the intersection of this bag and another bag
     */
}