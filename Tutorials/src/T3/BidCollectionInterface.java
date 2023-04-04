package T3;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * An ADT representing a collection of bids for installing air conditioning units.
 */
public interface BidCollectionInterface {

    /**
     * Adds a bid to this collection.
     * @param bid the bid to add
     */
    void addBid(BidInterface bid);

    /**
     * Returns the bid in this collection with the best yearly cost.
     * @return the bid with the best yearly cost
     * @throws NoSuchElementException if the collection is empty
     */
    BidInterface getBestYearlyCostBid() throws NoSuchElementException;

    /**
     * Returns the bid in this collection with the best initial cost.
     * The initial cost will be defined as the unit cost plus the installation cost.
     * @return the bid with the best initial cost
     * @throws NoSuchElementException if the collection is empty
     */
    BidInterface getBestInitialCostBid() throws NoSuchElementException;

    /**
     * Clears all of the items from this collection.
     */
    void clear();

    /**
     * Gets the number of items in this collection.
     * @return the number of items in the collection
     */
    int size();

    /**
     * Sees whether this collection is empty.
     * @return true if the collection is empty; false otherwise
     */
    boolean isEmpty();

    /**
     * Searches for bids with yearly operating costs within a specified range.
     * @param low the low end of the range (inclusive)
     * @param high the high end of the range (inclusive)
     * @return a list of bids with yearly operating costs in the specified range
     */
    List<BidInterface> searchByYearlyCost(double low, double high);

    /**
     * Searches for bids with SEER ratings within a specified range.
     * @param low the low end of the range (inclusive)
     * @param high the high end of the range (inclusive)
     * @return a list of bids with SEER ratings in the specified range
     */
    List<BidInterface> searchBySEER(double low, double high);

}