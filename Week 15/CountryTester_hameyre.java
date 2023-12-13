/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 12/7/2023
 * CountryTester_hameyre Class used for testing the
 * Country_hameyre Class - final exam programming assignment.
**/

// used VSCode for this assignment - hence different indentations
// from when I use JGrasp

// imports
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;

public class CountryTester_hameyre {

    public static void main(String[] args) {
        LinkedList<Country_hameyre> countries = new LinkedList<Country_hameyre>();
        HashSet<Country_hameyre> countriesHashSet = new HashSet<Country_hameyre>();
        TreeSet<Country_hameyre> countriesTreeSet = new TreeSet<Country_hameyre>();

        // numbers not accurate for simplicity's sake - adding to linkedlist
        countries.add(new Country_hameyre("Canada", 10, 900));
        countries.add(new Country_hameyre("USA", 15, 800));
        countries.add(new Country_hameyre("Russia", 20, 700));
        countries.add(new Country_hameyre("China", 25, 600));
        countries.add(new Country_hameyre("Japan", 30, 500));
        countries.add(new Country_hameyre("India", 35, 400));
        countries.add(new Country_hameyre("Germany", 40, 300));
        countries.add(new Country_hameyre("UK", 45, 200));
        countries.add(new Country_hameyre("France", 50, 100));
        countries.add(new Country_hameyre("Spain", 55, 50));

        // get largest country by area, largest country by population
        Country_hameyre largestCountryByArea = countries.getFirst();
        Country_hameyre largestCountryByPopulation = countries.getFirst();
        // iterate over countries, check area and population and assign to largest countries above
        // when necessary
        for (Country_hameyre country : countries) {
            if (country.getArea() > largestCountryByArea.getArea()) {
                largestCountryByArea = country;
            }
            if (country.getPopulation() > largestCountryByPopulation.getPopulation()) {
                largestCountryByPopulation = country;
            }
        }

        // print out largest country by area, largest country by population
        System.out.println();
        System.out.println("Largest country by area: " + largestCountryByArea.getCountryName()); // should be canada
        System.out.println("Largest country by population: " + largestCountryByPopulation.getCountryName()); // should be spain


        // add all countries to hashset - again numbers not accurate for simplicity's sake
        countriesHashSet.add(new Country_hameyre("Canada", 10, 900));
        countriesHashSet.add(new Country_hameyre("USA", 15, 800));
        countriesHashSet.add(new Country_hameyre("Russia", 20, 700));
        countriesHashSet.add(new Country_hameyre("China", 25, 600));
        countriesHashSet.add(new Country_hameyre("Japan", 30, 500));
        countriesHashSet.add(new Country_hameyre("India", 35, 400));
        countriesHashSet.add(new Country_hameyre("Germany", 40, 300));
        countriesHashSet.add(new Country_hameyre("UK", 45, 200));
        countriesHashSet.add(new Country_hameyre("France", 50, 100));
        countriesHashSet.add(new Country_hameyre("Spain", 55, 50));

        // get country with second largest population in hashset
        Country_hameyre secondLargestCountryByPopulation = countries.getFirst();
        // iterating over hashset, checking population and assigning to secondLargestCountryByPopulation if
        // our population is greater than our current pop but not equal to our largest pop (which we already found)
        for (Country_hameyre country : countriesHashSet) {
            if (country.getPopulation() > secondLargestCountryByPopulation.getPopulation() && country.getPopulation() != largestCountryByPopulation.getPopulation()) {
                secondLargestCountryByPopulation = country;
            }
        }

        // remove from our hashset
        countriesHashSet.remove(secondLargestCountryByPopulation); // should remove france

        // print out all remaining countries in hashset - should be all countries except france (9 total)
        System.out.println();
        System.out.println("=== PRINTING REMAINING COUNTRIES IN HASHSET ===");
        // iterating over hashset and printing countries
        for (Country_hameyre country : countriesHashSet) {
            System.out.println(country.toString());
        }

        // add all countries to treeset - again numbers not accurate for simplicity's sake
        countriesTreeSet.add(new Country_hameyre("Canada", 10, 900));
        countriesTreeSet.add(new Country_hameyre("USA", 15, 800));
        countriesTreeSet.add(new Country_hameyre("Russia", 20, 700));
        countriesTreeSet.add(new Country_hameyre("China", 25, 600));
        countriesTreeSet.add(new Country_hameyre("Japan", 30, 500));
        countriesTreeSet.add(new Country_hameyre("India", 35, 400));
        countriesTreeSet.add(new Country_hameyre("Germany", 40, 300));
        countriesTreeSet.add(new Country_hameyre("UK", 45, 200));
        countriesTreeSet.add(new Country_hameyre("France", 50, 100));
        countriesTreeSet.add(new Country_hameyre("Spain", 55, 50));

        // two extra copies of spain to demonstrate population / area sorting - this will result in Spain 50 50 first (same name, lower pop),
        // followed by Spain 55 45 (same name, same pop, lower area), then lastly Spain 55 50 (same name, same pop, higher area)
        countriesTreeSet.add(new Country_hameyre("Spain", 50, 50));
        countriesTreeSet.add(new Country_hameyre("Spain", 55, 45));


        // printing sorted countries in treeset (will be sorted by name, but logic in country class
        // allows it to sort by country => population => area for the three Spain copies)
        System.out.println();
        System.out.println("=== PRINTING SORTED COUNTRIES IN TREESET ===");
        // iterating over treeset and printing countries
        for (Country_hameyre country : countriesTreeSet) {
            System.out.println(country.toString());
        }
        System.out.println();
        // should be in order Canada, China, France, Germany, India, Japan, Russia, Spain (3x), UK, USA

    }

}
