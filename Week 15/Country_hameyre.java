/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 12/7/2023
 * Country_hameyre Class for final exam programming assignment.
 * Acts as a blueprint for Country objects containing a name,
 * population, and area.
**/

// used VSCode for this assignment - hence different indentations
// from when I use JGrasp

public class Country_hameyre implements Comparable {
    
    // private instance vars
    private String countryName;
    private int population;
    private int area;

    // constructor - takes in country name, population, and area
    public Country_hameyre(String countryName, int population, int area) {
        this.countryName = countryName;
        this.population = population;
        this.area = area;
    }

    /**
     * getCountryName accessor method, which returns
     * the country name
     * @return countryName - a String representing the country name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * getPopulation accessor method, which returns
     * the population
     * @return population - an int representing the population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * getArea accessor method, which returns
     * the area
     * @return area - an int representing the area
     */
    public int getArea() {
        return area;
    }

    /**
     * setCountryName mutator method, which sets
     * the country name for the country
     * @param countryName - a String representing country name to set
     * @return none (void)
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * setPopulation mutator method, which sets
     * the population for the country
     * @param population - an int representing population to set
     * @return none (void)
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * setArea mutator method, which sets
     * the area for the country
     * @param area - an int representing area to set
     * @return none (void)
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * overridden toString method, which returns the
     * country object as a formatted String representation
     * @return a String representing the country object
     */
    @Override public String toString() {
        return countryName + " " + population + " " + area;
    }

    /**
     * overridden equals method, which returns a bool
     * value representing whether the two objects are equal (true)
     * or not (false)
     * @param obj - an Object representing the object to compare to
     * @return true if objects are equal, false if not
     */
    @Override public boolean equals(Object obj) {
        // checking if compared object is a country
        boolean isCountry = obj instanceof Country_hameyre;

        // if it is a country, we cast the object to a Country object
        // and compare the countryName, population, and area and return
        // the result of our conditionals as a bool (all 3 true = true,
        // otherwise false)
        if (isCountry == true) {
            Country_hameyre otherCountry = (Country_hameyre) obj;
            return this.countryName.equals(otherCountry.countryName) && this.population == otherCountry.population && this.area == otherCountry.area;
        // otherwise, we simply return false
        } else {
            return false;
        }
    }

    /**
     * overridden compareTo method, which uses the Comparable interface and
     * returns an int representing whether the two objects are equal (0),
     * greater than (1), or less than (-1)
     * @param obj - an Object representing the object to compare to
     * @return 0 if objects are equal, 1 if greater than, -1 if less than
     */
    @Override public int compareTo(Object obj) {
        // checking if the compared object is a Country object
        boolean isCountry = obj instanceof Country_hameyre;

        // if it is a Country object, continue
        if (isCountry == true) {

            // cast to a Country object to compare
            Country_hameyre otherCountry = (Country_hameyre) obj;

            // calling equals method from countryName String to compare it
            // to other country's countryName
            if (this.countryName.equals(otherCountry.getCountryName())) {

                // if names are equal, we compare population
                if (this.population == otherCountry.getPopulation()) {
                    // if populations are equal, we compare area
                    if (this.area == otherCountry.getArea()) {
                        // if areas equal, return 0 - objects are identical
                        return 0;
                    } else {
                        // otherwise, if areas are not equal, we find the differences of areas
                        int result = this.area - otherCountry.getArea();
                        // then return the result of 1 or -1 depending on if our compared country has a smaller area (return 1)
                        // or a larger area (return -1), since like with our population if our current country has a smaller area
                        // the result will be less than 0, and vice versa
                        if (result > 0) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                // otherwise, if names are equal but populations are not, we find difference
                // of populations
                } else {
                    // then return a result of 1 or -1 depending on if our compared country
                    // has a smaller population (return 1) or a larger population (return -1),
                    // as compared smaller pop = our current country has a larger pop, and vice versa
                    int result = this.population - otherCountry.getPopulation();
                    if (result > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            // otherwise, if names are not equal, we compare names calling the String compareTo method
            } else {
                return this.countryName.compareTo(otherCountry.getCountryName());
            }

        // otherwise, return -1
        } else {
            return -1;
        }
    }


}
