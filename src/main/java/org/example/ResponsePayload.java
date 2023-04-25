package org.example;

import java.util.*;

public class ResponsePayload {

    private Data data;

    public class Data{
        private ContentLayout contentLayout;
    }

    public class ContentLayout{
        private PageMetadata pageMetadata;
        private List<Module> modules;
        private List<Layout> layOuts;

        //constructor, getter, setter
    }

    public class PageMetadata{
        private Object athPage;

        //constructor, getter, setter
    }


    class Module {
        private String name;
        private String type;
        private int version;
        private String status;
        private Schedule schedule;
        private Configs configs;
        private long publishedDate;
        private String moduleId;
        private String module_id;
        private MatchedTrigger matchedTrigger;

        //constructor, getter, setter
    }

    class Schedule {
        private Object start;
        private Object end;
        private int priority;
        private boolean expEnabled;

        //constructor, getter, setter
    }

    class Configs {
        private String title;
        private TileOptions tileOptions;
        private Object spBeaconInfo;
        private List<Banner> banners;
        private List<Product> products;

        //constructor, getter, setter
    }

    class TileOptions{
        private String fulfillmentBadging;
        private String averageRatings;
        private String productFlags;

        //constructor, getter, setter
    }


    class Banner {
        private String title;
        private String description;
        private String planInfo;
        private String strikeString;
        private Object additionalInfo;
        private String showBanner;
        private String buttonTitle;
        private String bannerType;
        private String hasCloseButton;
        private String isOptInBanner;
        private Object optedInTitle;
        private Object optedInAdditionalInfo;
        private Object optedInButtonAnalyticsName;
        private Object optedInButtonTitle;
        private String buttonAnalyticsName;
        private ImageURL imageURL;
        private ButtonLink buttonLink;
        private String programType;
        private Object programSubType;
        private String isBelowMinimumPriceBanner;
        private String isOptedIn;
        private String isTrialEligible;
        private String freeDeliveryAvailable;

        //constructor, getter, setter
    }

    class ImageURL{
        private String title;
        private String src;
        private String alt;
        private String height;
        private String width;

        //constructor, getter, setter
    }

    class ButtonLink{
        private String linkText;
        private String title;
        private ClickThrough clickThrough;

        //constructor, getter, setter
    }

    class ClickThrough{
        private String value;
        //constructor, getter, setter
    }

    class Product{
        private String id;
        private String offerId;
        private int orderLimit;
        private int weightIncrement;
        private String fulfillmentType;
        private String availabilityStatus;
        private boolean showAtc;
        private boolean showOptions;
        private String canonicalUrl;
        private String name;
        private String usItemId;
        private String sellerId;
        private Object sellerName;
        private Object hasSellerBadge;
        private Object fulfillmentSpeed;
        private int averageRating;
        private Object unitQuantity;
        private Object type;
        private ImageInfo imageInfo;
        private PreOrder preOrder;
        private PriceInfo priceInfo;
        private Badges badge;
        private Object sponsoredProduct;

        //constructor, getter, setter
    }

    class ImageInfo{
        private String thumbnailUrl;

        //constructor, getter, setter
    }

    class PreOrder{
        private Object streetDate;
        private Object streetDateDisplayable;
        private Object streetDateType;
        private boolean isPreOrder;
        private Object preOrderMessage;
        private Object preOrderStreetDateMessage;

        //constructor, getter, setter
    }

    class PriceInfo{
        private PriceDisplayCodes priceDisplayCodes;
        private Object wasPrice;
        private UnitPrice unitPrice;
        private Object priceRange;
        private CurrentPrice currentPrice;
        private Object shipPrice;

        //constructor, getter, setter
    }

    class UnitPrice{
        private String priceString;

        //constructor, getter, setter
    }

    class CurrentPrice{
        private String priceString;
        private String priceDisplay;

        //constructor, getter, setter
    }

    class PriceDisplayCodes{
        private Object finalCostByWeight;
        private Object priceDisplayCondition;

        //constructor, getter, setter
    }

    class Badges{
        private Object flags;
        private List<Label> labels;
        private List<Tag> tags;

        //constructor, getter, setter
    }

    class Label{

    }

    class Tag{
        private String key;
        private String text;

        //constructor, getter, setter
    }


    class MatchedTrigger {
        private String pageType;
        private Object pageId;
        private String zone;
        private boolean inheritable;

        //constructor, getter, setter
    }

    class Layout {
        private String id;
        private LayoutDefinition layout;
        private Channel channel;
        private String version;
        private String status;

        //constructor, getter, setter
    }

    class LayoutDefinition {
        private String type;
        private String name;
        private Container container;

        //constructor, getter, setter
    }

    class Container {
        private String type;
        private String flow;
        private List<Content> content;

        //constructor, getter, setter
    }

    class Content{
        private String type;
        private String flow;
        private InnerContent innerContent;

        //constructor, getter, setter
    }

    class InnerContent{
        private String type;
        private String id;
        private List<Mapping> mapping;

        //constructor, getter, setter
    }

    class Mapping{
        private String type;
        private Options options;

        //constructor, getter, setter
    }


    class Options{
        private String refId;

        //constructor, getter, setter
    }

    class Channel {
        private String id;
        private String status;

        //constructor, getter, setter
    }

}
