package model;

import java.util.Date;
import java.util.List;

public class Job {
    private Long id;

    private String title;

    private String description;

    private String origin;

    private String destination;

    private Shipper shipper;

    private List<Bid> bidList;

    private Transporter transporter;

    private Date shipDate;

    private Integer budget;

    private JobStatusEnum status;

    private Date endJobPosted;

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", shipper=" + shipper +
                ", bidList=" + bidList +
                ", transporter=" + transporter +
                ", shipDate=" + shipDate +
                ", budget=" + budget +
                ", status=" + status +
                ", endJobPosted=" + endJobPosted +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    public List<Bid> getBidList() {
        return bidList;
    }

    public void setBidList(List<Bid> bidList) {
        this.bidList = bidList;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public void setTransporter(Transporter transporter) {
        this.transporter = transporter;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public JobStatusEnum getStatus() {
        return status;
    }

    public void setStatus(JobStatusEnum status) {
        this.status = status;
    }

    public Date getEndJobPosted() {
        return endJobPosted;
    }

    public void setEndJobPosted(Date endJobPosted) {
        this.endJobPosted = endJobPosted;
    }
}
