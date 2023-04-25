package org.example;

import java.util.*;

public class RequestPayload {

    private P13n p13n;
    private boolean enableWplusCashbackValue;
    private boolean enableWplusBannersPostCartLoadPageValue;
    private boolean enableWplusRetentionNudge;
    private boolean enableGenericWalmartCash;
    private boolean enableGenericPageContext;
    private String tenant;

    //Inner class
    public class P13n {
        private UserClientInfo userClientInfo;
        private UserReqInfo userReqInfo;

        public P13n(){

        }
        public P13n(UserClientInfo userClientInfo, UserReqInfo userReqInfo) {
            this.userClientInfo = userClientInfo;
            this.userReqInfo = userReqInfo;
        }

        public UserClientInfo getUserClientInfo() {
            return userClientInfo;
        }

        public void setUserClientInfo(UserClientInfo userClientInfo) {
            this.userClientInfo = userClientInfo;
        }

        public UserReqInfo getUserReqInfo() {
            return userReqInfo;
        }

        public void setUserReqInfo(UserReqInfo userReqInfo) {
            this.userReqInfo = userReqInfo;
        }
    }

    public class UserClientInfo{
        private String deviceType;
        private String callType;

        //constructor, getter, setter
    }

    public class UserReqInfo{
        private int preferredStoreId;
        private List<Long> storeIds;
        private CartContext cartContext;
        private List<String> requestType;

        //constructor, getter, setter
    }

    //the Object type is used for properties whose value can be either a null or a specific data type
    public class CartContext{
        private String cartIntent;
        private String slotType;
        private ThresholdInfo thresholdInfo;
        private Object slotExpirationTime;
        private Object slotExpirationTime_SC;
        private boolean isUnScheduledPickUp;
        private List<Item> items;
        private List<String> requestType;
        //constructor, getter, setter
    }

    public class ThresholdInfo{
        private int balanceToMinimumThreshold;
        private Object belowMinFee;
        private Object deliveryMinFee;

        //constructor, getter, setter
    }

    public class Item{
        private String id;
        private String availableQty;
        private String fulfillmentType;
        private double price;
        private Object wasPrice;
        private String fulfillmentGroup;
        private List<String> badges;

        //constructor, getter, setter
    }
}
