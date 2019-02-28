package test;

import model.Bid;
import model.Job;
import model.SortTypeEnum;
import model.Transporter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static helper.BidComparatorHelper.getBidComparatorByBidPrice;
import static helper.BidComparatorHelper.getBidComparatorByTransporterRating;

public class BidComparatorHelperTest {

    public static Transporter generateRandomTransporter() {
        Transporter transporter = new Transporter();
        transporter.setId((long) (Math.random() * 1000));
        transporter.setName("Transporter no " + transporter.getId());
        transporter.setRating(Math.random() * 5);

        return transporter;
    }

    public static Bid generateRandomBid() {
        Bid bid = new Bid();
        bid.setId((long) (Math.random() * 1000));
        bid.setTransporter(generateRandomTransporter());
        bid.setPrice((int) (Math.random() * 1000*1000));
        return bid;
    }

    public static void bidComparatorByTransporterRating(){
        System.out.println("RUN SORT BID BY TRANSPORTER RATING");

        Job job = new Job();

        job.setBidList(Arrays.asList(generateRandomBid(), generateRandomBid(), generateRandomBid()));

//        System.out.println(job.getBidList());
        Collections.sort(job.getBidList(), getBidComparatorByTransporterRating(SortTypeEnum.ASCENDING));

//        System.out.println(job.getBidList());
        //make sure all rating is ascending
        for(int i = 1 ;i < job.getBidList().size(); i++) {
            Transporter current = job.getBidList().get(i).getTransporter();
            Transporter previous = job.getBidList().get(i-1).getTransporter();

            if(current.getRating() < previous.getRating()) {
                System.err.println("ERROR RATING NOT SORTED PROPERLY");
                return;
            }
        }


        Collections.sort(job.getBidList(), getBidComparatorByTransporterRating(SortTypeEnum.DESCENDING));

//        System.out.println(job.getBidList());
        //make sure all rating is ascending
        for(int i = 1 ;i < job.getBidList().size(); i++) {
            Transporter current = job.getBidList().get(i).getTransporter();
            Transporter previous = job.getBidList().get(i-1).getTransporter();

            if(current.getRating() > previous.getRating()) {
                System.err.println("ERROR RATING NOT SORTED PROPERLY");
                return;
            }
        }
    }

    public static void bidComparatorByBidPrice(){
        System.out.println("RUN SORT BID BY BID PRICE");

        Job job = new Job();

        job.setBidList(Arrays.asList(generateRandomBid(), generateRandomBid(), generateRandomBid()));

        Collections.sort(job.getBidList(), getBidComparatorByBidPrice(SortTypeEnum.ASCENDING));

        //make sure all price is ascending
        for(int i = 1 ;i < job.getBidList().size(); i++) {
            Bid current = job.getBidList().get(i);
            Bid previous = job.getBidList().get(i-1);

            if(current.getPrice() < previous.getPrice()) {
                System.err.println("ERROR PRICE NOT SORTED PROPERLY");
                return;
            }
        }


        Collections.sort(job.getBidList(), getBidComparatorByBidPrice(SortTypeEnum.DESCENDING));

        //make sure all rating is ascending
        for(int i = 1 ;i < job.getBidList().size(); i++) {
            Bid current = job.getBidList().get(i);
            Bid previous = job.getBidList().get(i-1);

            if(current.getPrice() > previous.getPrice()) {
                System.err.println("ERROR PRICE NOT SORTED PROPERLY");
                return;
            }
        }


    }

    public static void bidComparatorByTransporterName(){

    }

    public static void main(String[] args) {
//        bidComparatorByBidPrice();
        bidComparatorByTransporterRating();
    }

}
