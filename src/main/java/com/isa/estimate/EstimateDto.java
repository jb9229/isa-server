package com.isa.estimate;

import lombok.Data;

/**
 * Created by test on 2016-02-13.
 */
public class EstimateDto {

    @Data
    public static class Response{

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

    @Data
    public static class Create {
        private String userName;
        private String date;
        private int amount;
        private String regidentType;
        private int floor;
        private int space;
        private String condition;

        private String cmAddress;
        private String cmAddressDetail;
        private String nmAddress;
        private String nmAddressDetail;

        private boolean bed;
        private String bedType;
        private boolean airconditioner;
        private String airconditionerType;
        private boolean drawer;
        private String drawerType;
        private boolean sofa;
        private String sofatType;
        private boolean tv;
        private String tvType;
        private boolean piano;
        private String pianoType;
        private boolean waterpurifier;
        private String waterpurifierType;
        private boolean bidet;
        private String bidetType;

        private String entrPhoto;
        private String lrPhoto;
        private String kchPhoto;
        private String rm1Photo;
        private String rm2Photo;
        private String rm3Photo;
        private String rm4Photo;
        private String rm5Photo;

        private String clientAsk;
    }
}
