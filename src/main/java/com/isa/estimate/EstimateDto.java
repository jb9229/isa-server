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
}
