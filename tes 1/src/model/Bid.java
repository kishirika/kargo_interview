package model;

public class Bid implements Comparable<Bid>{
    private Long id;

    private Transporter transporter;

    private String comment;

    private Integer price;

    private BidStatusEnum status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public void setTransporter(Transporter transporter) {
        this.transporter = transporter;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public BidStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BidStatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", transporter=" + transporter +
                ", comment='" + comment + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }

    @Override
    public int compareTo(Bid o) {
        if (id < o.getId()) {
            return -1;
        } else if (id == o.getId()) {
            return 0;
        } else {
            return 1;
        }
    }
}
