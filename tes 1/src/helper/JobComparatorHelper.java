package helper;

import model.Job;
import model.SortTypeEnum;

import java.util.Comparator;

public class JobComparatorHelper {

    public static Comparator<Job> getJobComparatorByShipDate(SortTypeEnum type) {
        Comparator<Job> comparator = (job1, job2) -> job1.getShipDate().compareTo(job2.getShipDate());
        if(type == SortTypeEnum.ASCENDING) {
            return comparator;
        } else {
            return comparator.reversed();
        }
    }

    public static Comparator<Job> getJobComparatorByOrigin(SortTypeEnum type){
        Comparator<Job> comparator = (job1, job2) -> job1.getOrigin().compareTo(job2.getOrigin());
        if(type == SortTypeEnum.ASCENDING) {
            return comparator;
        } else {
            return comparator.reversed();
        }
    }

    public static Comparator<Job> getJobComparatorByDestination(SortTypeEnum type) {
        Comparator<Job> comparator = (job1, job2) -> job1.getDestination().compareTo(job2.getDestination());
        if(type == SortTypeEnum.ASCENDING) {
            return comparator;
        } else {
            return comparator.reversed();
        }
    }

    public static Comparator<Job> getJobComparatorByBudget(SortTypeEnum type) {
        Comparator<Job> comparator = (job1, job2) -> job1.getBudget() - job2.getBudget();
        if (type == SortTypeEnum.ASCENDING) {
            return comparator;
        } else {
            return comparator.reversed();
        }
    }
}
