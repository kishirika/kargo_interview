package model;

public enum JobStatusEnum {
    //display in marketplace
    SHOW,

    //transporter selected by shipper and on process
    ON_PROCESS,

    //job finished
    FINISHED,

    //No transporter selected until end of job posted
    EXPIRED,

    //shipper choose to close the job
    CLOSED

}
