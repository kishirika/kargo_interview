package helper;

import model.Bid;
import model.SortTypeEnum;

import java.util.Comparator;

public class BidComparatorHelper {

    public static Comparator<Bid> getBidComparatorByTransporterRating(SortTypeEnum type){
        Comparator<Bid> comparator = (bid1, bid2) -> bid1.getTransporter().getRating().compareTo(bid2.getTransporter().getRating());
        if(type == SortTypeEnum.ASCENDING) {
            return comparator;
        } else {
            return comparator.reversed();
        }
    }

    public static Comparator<Bid> getBidComparatorByBidPrice(SortTypeEnum type){
        Comparator<Bid> comparator = (bid1, bid2) -> bid1.getPrice().compareTo(bid2.getPrice());
        if(type == SortTypeEnum.ASCENDING) {
            return comparator;
        } else {
            return comparator.reversed();
        }
    }

    public static Comparator<Bid> getBidComparatorByTransporterName(SortTypeEnum type){
        Comparator<Bid> comparator = (bid1, bid2) -> bid1.getTransporter().getName().compareTo(bid2.getTransporter().getName());
        if(type == SortTypeEnum.ASCENDING) {
            return comparator;
        } else {
            return comparator.reversed();
        }
    }
}
