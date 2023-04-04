package T3;

/**
 * An ADT representing a single bid for installing an air conditioning unit.
 */
public interface BidInterface {

    /**
     * Returns the name of the company making this bid.
     * @return the name of the company
     */
    String getCompanyName();

    /**
     * Returns the description of the air conditioner that this bid is for.
     * @return the description of the AC
     */
    String getAcDescription();

    /**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * @return the AC capacity in tons
     */
    double getAcCapacity();

    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     * @return the AC SEER
     */
    double getAcSEER();

    /**
     * Returns the cost of this bid's AC.
     * @return the AC cost
     */
    double getAcCost();

    /**
     * Returns the cost of installing this bid's AC.
     * @return the installation cost
     */
    double getInstallationCost();

    /**
     * Returns the yearly cost of operating this bid's AC.
     * @return the yearly operating cost
     */
    double getYearlyOperatingCost();

}