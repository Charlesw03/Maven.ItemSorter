package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    public int compare(Item object1, Item object2) {

        if (object1.getPrice() < object2.getPrice()) {
            return -1;
        }

        if(object1.getPrice() > object2.getPrice()){
            return 1;
        }
        return 0;

    }

}
