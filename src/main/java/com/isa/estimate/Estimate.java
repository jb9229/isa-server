package com.isa.estimate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by test on 2016-01-31.
 */
@Entity
@Getter
@Setter
public class Estimate {
    @Id
    @GeneratedValue
    private Long id;

    private String userName;
    private String date;
    private String cmAddress;
    private String cmAddressDetail;
    private String nmAddress;
    private String nmAddressDetail;
    private boolean bed;
    private String bedType;
    private String entrPhoto;
    private String lrPhoto;
    private String kchPhoto;
    private String rm1Photo;
    private String rm2Photo;
    private String rm3Photo;
    private String rm4Photo;
    private String rm5Photo;
}
