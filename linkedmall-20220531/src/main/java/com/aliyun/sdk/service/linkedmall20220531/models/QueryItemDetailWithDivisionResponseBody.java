// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryItemDetailWithDivisionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryItemDetailWithDivisionResponseBody</p>
 */
public class QueryItemDetailWithDivisionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryItemDetailWithDivisionResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemDetailWithDivisionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryItemDetailWithDivisionResponseBody build() {
            return new QueryItemDetailWithDivisionResponseBody(this);
        } 

    } 

    public static class SkuModels extends TeaModel {
        @NameInMap("CanNotBeSoldCode")
        private String canNotBeSoldCode;

        @NameInMap("CanNotBeSoldMassage")
        private String canNotBeSoldMassage;

        @NameInMap("CustomizedAttributeMap")
        private java.util.Map < String, String > customizedAttributeMap;

        @NameInMap("DistributionMallId")
        private String distributionMallId;

        @NameInMap("ExtJson")
        private String extJson;

        @NameInMap("HasQuantity")
        private Boolean hasQuantity;

        @NameInMap("InvoiceType")
        private Integer invoiceType;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("LmSkuAttributeMap")
        private java.util.Map < String, String > lmSkuAttributeMap;

        @NameInMap("PriceCent")
        private Long priceCent;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("ReservePrice")
        private Long reservePrice;

        @NameInMap("SimpleQuantity")
        private String simpleQuantity;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("SkuPicUrl")
        private String skuPicUrl;

        @NameInMap("SkuPvs")
        private String skuPvs;

        @NameInMap("SkuTitle")
        private String skuTitle;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SupplierPrice")
        private Long supplierPrice;

        private SkuModels(Builder builder) {
            this.canNotBeSoldCode = builder.canNotBeSoldCode;
            this.canNotBeSoldMassage = builder.canNotBeSoldMassage;
            this.customizedAttributeMap = builder.customizedAttributeMap;
            this.distributionMallId = builder.distributionMallId;
            this.extJson = builder.extJson;
            this.hasQuantity = builder.hasQuantity;
            this.invoiceType = builder.invoiceType;
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.lmSkuAttributeMap = builder.lmSkuAttributeMap;
            this.priceCent = builder.priceCent;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.simpleQuantity = builder.simpleQuantity;
            this.skuId = builder.skuId;
            this.skuPicUrl = builder.skuPicUrl;
            this.skuPvs = builder.skuPvs;
            this.skuTitle = builder.skuTitle;
            this.status = builder.status;
            this.supplierPrice = builder.supplierPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuModels create() {
            return builder().build();
        }

        /**
         * @return canNotBeSoldCode
         */
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        /**
         * @return canNotBeSoldMassage
         */
        public String getCanNotBeSoldMassage() {
            return this.canNotBeSoldMassage;
        }

        /**
         * @return customizedAttributeMap
         */
        public java.util.Map < String, String > getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        /**
         * @return distributionMallId
         */
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        /**
         * @return extJson
         */
        public String getExtJson() {
            return this.extJson;
        }

        /**
         * @return hasQuantity
         */
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        /**
         * @return invoiceType
         */
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return lmSkuAttributeMap
         */
        public java.util.Map < String, String > getLmSkuAttributeMap() {
            return this.lmSkuAttributeMap;
        }

        /**
         * @return priceCent
         */
        public Long getPriceCent() {
            return this.priceCent;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return reservePrice
         */
        public Long getReservePrice() {
            return this.reservePrice;
        }

        /**
         * @return simpleQuantity
         */
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuPicUrl
         */
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        /**
         * @return skuPvs
         */
        public String getSkuPvs() {
            return this.skuPvs;
        }

        /**
         * @return skuTitle
         */
        public String getSkuTitle() {
            return this.skuTitle;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return supplierPrice
         */
        public Long getSupplierPrice() {
            return this.supplierPrice;
        }

        public static final class Builder {
            private String canNotBeSoldCode; 
            private String canNotBeSoldMassage; 
            private java.util.Map < String, String > customizedAttributeMap; 
            private String distributionMallId; 
            private String extJson; 
            private Boolean hasQuantity; 
            private Integer invoiceType; 
            private Long itemId; 
            private String lmItemId; 
            private java.util.Map < String, String > lmSkuAttributeMap; 
            private Long priceCent; 
            private Integer quantity; 
            private Long reservePrice; 
            private String simpleQuantity; 
            private Long skuId; 
            private String skuPicUrl; 
            private String skuPvs; 
            private String skuTitle; 
            private Integer status; 
            private Long supplierPrice; 

            /**
             * CanNotBeSoldCode.
             */
            public Builder canNotBeSoldCode(String canNotBeSoldCode) {
                this.canNotBeSoldCode = canNotBeSoldCode;
                return this;
            }

            /**
             * CanNotBeSoldMassage.
             */
            public Builder canNotBeSoldMassage(String canNotBeSoldMassage) {
                this.canNotBeSoldMassage = canNotBeSoldMassage;
                return this;
            }

            /**
             * CustomizedAttributeMap.
             */
            public Builder customizedAttributeMap(java.util.Map < String, String > customizedAttributeMap) {
                this.customizedAttributeMap = customizedAttributeMap;
                return this;
            }

            /**
             * DistributionMallId.
             */
            public Builder distributionMallId(String distributionMallId) {
                this.distributionMallId = distributionMallId;
                return this;
            }

            /**
             * ExtJson.
             */
            public Builder extJson(String extJson) {
                this.extJson = extJson;
                return this;
            }

            /**
             * HasQuantity.
             */
            public Builder hasQuantity(Boolean hasQuantity) {
                this.hasQuantity = hasQuantity;
                return this;
            }

            /**
             * InvoiceType.
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * LmSkuAttributeMap.
             */
            public Builder lmSkuAttributeMap(java.util.Map < String, String > lmSkuAttributeMap) {
                this.lmSkuAttributeMap = lmSkuAttributeMap;
                return this;
            }

            /**
             * PriceCent.
             */
            public Builder priceCent(Long priceCent) {
                this.priceCent = priceCent;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * ReservePrice.
             */
            public Builder reservePrice(Long reservePrice) {
                this.reservePrice = reservePrice;
                return this;
            }

            /**
             * SimpleQuantity.
             */
            public Builder simpleQuantity(String simpleQuantity) {
                this.simpleQuantity = simpleQuantity;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * SkuPicUrl.
             */
            public Builder skuPicUrl(String skuPicUrl) {
                this.skuPicUrl = skuPicUrl;
                return this;
            }

            /**
             * SkuPvs.
             */
            public Builder skuPvs(String skuPvs) {
                this.skuPvs = skuPvs;
                return this;
            }

            /**
             * SkuTitle.
             */
            public Builder skuTitle(String skuTitle) {
                this.skuTitle = skuTitle;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SupplierPrice.
             */
            public Builder supplierPrice(Long supplierPrice) {
                this.supplierPrice = supplierPrice;
                return this;
            }

            public SkuModels build() {
                return new SkuModels(this);
            } 

        } 

    }
    public static class Values extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Text")
        private String text;

        private Values(Builder builder) {
            this.id = builder.id;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long id; 
            private String text; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class SkuPropertys extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Text")
        private String text;

        @NameInMap("Values")
        private java.util.List < Values> values;

        private SkuPropertys(Builder builder) {
            this.id = builder.id;
            this.text = builder.text;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuPropertys create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return values
         */
        public java.util.List < Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private Long id; 
            private String text; 
            private java.util.List < Values> values; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List < Values> values) {
                this.values = values;
                return this;
            }

            public SkuPropertys build() {
                return new SkuPropertys(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("CanNotBeSoldCode")
        private String canNotBeSoldCode;

        @NameInMap("CanNotBeSoldMassage")
        private String canNotBeSoldMassage;

        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("CategoryIds")
        private java.util.List < Long > categoryIds;

        @NameInMap("City")
        private String city;

        @NameInMap("Current")
        private String current;

        @NameInMap("CustomizedAttributeMap")
        private java.util.Map < String, String > customizedAttributeMap;

        @NameInMap("DescOption")
        private String descOption;

        @NameInMap("DescPath")
        private String descPath;

        @NameInMap("DistributionMallId")
        private String distributionMallId;

        @NameInMap("Features")
        private java.util.Map < String, String > features;

        @NameInMap("FirstPicUrl")
        private String firstPicUrl;

        @NameInMap("HasQuantity")
        private Boolean hasQuantity;

        @NameInMap("IforestProps")
        private java.util.List < java.util.Map<String, String>> iforestProps;

        @NameInMap("InvoiceType")
        private Integer invoiceType;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("ItemImages")
        private java.util.List < String > itemImages;

        @NameInMap("ItemTitle")
        private String itemTitle;

        @NameInMap("ItemTotalSimpleValue")
        private String itemTotalSimpleValue;

        @NameInMap("ItemTotalValue")
        private Integer itemTotalValue;

        @NameInMap("LmItemAttributeMap")
        private java.util.Map < String, String > lmItemAttributeMap;

        @NameInMap("LmItemCategory")
        private String lmItemCategory;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("MainPicUrl")
        private String mainPicUrl;

        @NameInMap("MinPrice")
        private Long minPrice;

        @NameInMap("Properties")
        private java.util.Map < String, java.util.List<String>> properties;

        @NameInMap("Prov")
        private String prov;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("ReservePrice")
        private Long reservePrice;

        @NameInMap("SecuredTransactions")
        private Integer securedTransactions;

        @NameInMap("SellerPayPostfee")
        private Boolean sellerPayPostfee;

        @NameInMap("SimpleQuantity")
        private String simpleQuantity;

        @NameInMap("SkuModels")
        private java.util.List < SkuModels> skuModels;

        @NameInMap("SkuPropertys")
        private java.util.List < SkuPropertys> skuPropertys;

        @NameInMap("ThirdPartyItemId")
        private String thirdPartyItemId;

        @NameInMap("ThirdPartyName")
        private String thirdPartyName;

        @NameInMap("UserType")
        private Integer userType;

        @NameInMap("VideoPicUrl")
        private String videoPicUrl;

        @NameInMap("VideoUrl")
        private String videoUrl;

        @NameInMap("VirtualItemType")
        private String virtualItemType;

        private Model(Builder builder) {
            this.canNotBeSoldCode = builder.canNotBeSoldCode;
            this.canNotBeSoldMassage = builder.canNotBeSoldMassage;
            this.canSell = builder.canSell;
            this.categoryId = builder.categoryId;
            this.categoryIds = builder.categoryIds;
            this.city = builder.city;
            this.current = builder.current;
            this.customizedAttributeMap = builder.customizedAttributeMap;
            this.descOption = builder.descOption;
            this.descPath = builder.descPath;
            this.distributionMallId = builder.distributionMallId;
            this.features = builder.features;
            this.firstPicUrl = builder.firstPicUrl;
            this.hasQuantity = builder.hasQuantity;
            this.iforestProps = builder.iforestProps;
            this.invoiceType = builder.invoiceType;
            this.itemId = builder.itemId;
            this.itemImages = builder.itemImages;
            this.itemTitle = builder.itemTitle;
            this.itemTotalSimpleValue = builder.itemTotalSimpleValue;
            this.itemTotalValue = builder.itemTotalValue;
            this.lmItemAttributeMap = builder.lmItemAttributeMap;
            this.lmItemCategory = builder.lmItemCategory;
            this.lmItemId = builder.lmItemId;
            this.mainPicUrl = builder.mainPicUrl;
            this.minPrice = builder.minPrice;
            this.properties = builder.properties;
            this.prov = builder.prov;
            this.quantity = builder.quantity;
            this.reservePrice = builder.reservePrice;
            this.securedTransactions = builder.securedTransactions;
            this.sellerPayPostfee = builder.sellerPayPostfee;
            this.simpleQuantity = builder.simpleQuantity;
            this.skuModels = builder.skuModels;
            this.skuPropertys = builder.skuPropertys;
            this.thirdPartyItemId = builder.thirdPartyItemId;
            this.thirdPartyName = builder.thirdPartyName;
            this.userType = builder.userType;
            this.videoPicUrl = builder.videoPicUrl;
            this.videoUrl = builder.videoUrl;
            this.virtualItemType = builder.virtualItemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return canNotBeSoldCode
         */
        public String getCanNotBeSoldCode() {
            return this.canNotBeSoldCode;
        }

        /**
         * @return canNotBeSoldMassage
         */
        public String getCanNotBeSoldMassage() {
            return this.canNotBeSoldMassage;
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryIds
         */
        public java.util.List < Long > getCategoryIds() {
            return this.categoryIds;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return current
         */
        public String getCurrent() {
            return this.current;
        }

        /**
         * @return customizedAttributeMap
         */
        public java.util.Map < String, String > getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        /**
         * @return descOption
         */
        public String getDescOption() {
            return this.descOption;
        }

        /**
         * @return descPath
         */
        public String getDescPath() {
            return this.descPath;
        }

        /**
         * @return distributionMallId
         */
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        /**
         * @return features
         */
        public java.util.Map < String, String > getFeatures() {
            return this.features;
        }

        /**
         * @return firstPicUrl
         */
        public String getFirstPicUrl() {
            return this.firstPicUrl;
        }

        /**
         * @return hasQuantity
         */
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        /**
         * @return iforestProps
         */
        public java.util.List < java.util.Map<String, String>> getIforestProps() {
            return this.iforestProps;
        }

        /**
         * @return invoiceType
         */
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemImages
         */
        public java.util.List < String > getItemImages() {
            return this.itemImages;
        }

        /**
         * @return itemTitle
         */
        public String getItemTitle() {
            return this.itemTitle;
        }

        /**
         * @return itemTotalSimpleValue
         */
        public String getItemTotalSimpleValue() {
            return this.itemTotalSimpleValue;
        }

        /**
         * @return itemTotalValue
         */
        public Integer getItemTotalValue() {
            return this.itemTotalValue;
        }

        /**
         * @return lmItemAttributeMap
         */
        public java.util.Map < String, String > getLmItemAttributeMap() {
            return this.lmItemAttributeMap;
        }

        /**
         * @return lmItemCategory
         */
        public String getLmItemCategory() {
            return this.lmItemCategory;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return mainPicUrl
         */
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        /**
         * @return minPrice
         */
        public Long getMinPrice() {
            return this.minPrice;
        }

        /**
         * @return properties
         */
        public java.util.Map < String, java.util.List<String>> getProperties() {
            return this.properties;
        }

        /**
         * @return prov
         */
        public String getProv() {
            return this.prov;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return reservePrice
         */
        public Long getReservePrice() {
            return this.reservePrice;
        }

        /**
         * @return securedTransactions
         */
        public Integer getSecuredTransactions() {
            return this.securedTransactions;
        }

        /**
         * @return sellerPayPostfee
         */
        public Boolean getSellerPayPostfee() {
            return this.sellerPayPostfee;
        }

        /**
         * @return simpleQuantity
         */
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        /**
         * @return skuModels
         */
        public java.util.List < SkuModels> getSkuModels() {
            return this.skuModels;
        }

        /**
         * @return skuPropertys
         */
        public java.util.List < SkuPropertys> getSkuPropertys() {
            return this.skuPropertys;
        }

        /**
         * @return thirdPartyItemId
         */
        public String getThirdPartyItemId() {
            return this.thirdPartyItemId;
        }

        /**
         * @return thirdPartyName
         */
        public String getThirdPartyName() {
            return this.thirdPartyName;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        /**
         * @return videoPicUrl
         */
        public String getVideoPicUrl() {
            return this.videoPicUrl;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        /**
         * @return virtualItemType
         */
        public String getVirtualItemType() {
            return this.virtualItemType;
        }

        public static final class Builder {
            private String canNotBeSoldCode; 
            private String canNotBeSoldMassage; 
            private Boolean canSell; 
            private Long categoryId; 
            private java.util.List < Long > categoryIds; 
            private String city; 
            private String current; 
            private java.util.Map < String, String > customizedAttributeMap; 
            private String descOption; 
            private String descPath; 
            private String distributionMallId; 
            private java.util.Map < String, String > features; 
            private String firstPicUrl; 
            private Boolean hasQuantity; 
            private java.util.List < java.util.Map<String, String>> iforestProps; 
            private Integer invoiceType; 
            private Long itemId; 
            private java.util.List < String > itemImages; 
            private String itemTitle; 
            private String itemTotalSimpleValue; 
            private Integer itemTotalValue; 
            private java.util.Map < String, String > lmItemAttributeMap; 
            private String lmItemCategory; 
            private String lmItemId; 
            private String mainPicUrl; 
            private Long minPrice; 
            private java.util.Map < String, java.util.List<String>> properties; 
            private String prov; 
            private Integer quantity; 
            private Long reservePrice; 
            private Integer securedTransactions; 
            private Boolean sellerPayPostfee; 
            private String simpleQuantity; 
            private java.util.List < SkuModels> skuModels; 
            private java.util.List < SkuPropertys> skuPropertys; 
            private String thirdPartyItemId; 
            private String thirdPartyName; 
            private Integer userType; 
            private String videoPicUrl; 
            private String videoUrl; 
            private String virtualItemType; 

            /**
             * CanNotBeSoldCode.
             */
            public Builder canNotBeSoldCode(String canNotBeSoldCode) {
                this.canNotBeSoldCode = canNotBeSoldCode;
                return this;
            }

            /**
             * CanNotBeSoldMassage.
             */
            public Builder canNotBeSoldMassage(String canNotBeSoldMassage) {
                this.canNotBeSoldMassage = canNotBeSoldMassage;
                return this;
            }

            /**
             * CanSell.
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryIds.
             */
            public Builder categoryIds(java.util.List < Long > categoryIds) {
                this.categoryIds = categoryIds;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Current.
             */
            public Builder current(String current) {
                this.current = current;
                return this;
            }

            /**
             * CustomizedAttributeMap.
             */
            public Builder customizedAttributeMap(java.util.Map < String, String > customizedAttributeMap) {
                this.customizedAttributeMap = customizedAttributeMap;
                return this;
            }

            /**
             * DescOption.
             */
            public Builder descOption(String descOption) {
                this.descOption = descOption;
                return this;
            }

            /**
             * DescPath.
             */
            public Builder descPath(String descPath) {
                this.descPath = descPath;
                return this;
            }

            /**
             * DistributionMallId.
             */
            public Builder distributionMallId(String distributionMallId) {
                this.distributionMallId = distributionMallId;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(java.util.Map < String, String > features) {
                this.features = features;
                return this;
            }

            /**
             * FirstPicUrl.
             */
            public Builder firstPicUrl(String firstPicUrl) {
                this.firstPicUrl = firstPicUrl;
                return this;
            }

            /**
             * HasQuantity.
             */
            public Builder hasQuantity(Boolean hasQuantity) {
                this.hasQuantity = hasQuantity;
                return this;
            }

            /**
             * IforestProps.
             */
            public Builder iforestProps(java.util.List < java.util.Map<String, String>> iforestProps) {
                this.iforestProps = iforestProps;
                return this;
            }

            /**
             * InvoiceType.
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemImages.
             */
            public Builder itemImages(java.util.List < String > itemImages) {
                this.itemImages = itemImages;
                return this;
            }

            /**
             * ItemTitle.
             */
            public Builder itemTitle(String itemTitle) {
                this.itemTitle = itemTitle;
                return this;
            }

            /**
             * ItemTotalSimpleValue.
             */
            public Builder itemTotalSimpleValue(String itemTotalSimpleValue) {
                this.itemTotalSimpleValue = itemTotalSimpleValue;
                return this;
            }

            /**
             * ItemTotalValue.
             */
            public Builder itemTotalValue(Integer itemTotalValue) {
                this.itemTotalValue = itemTotalValue;
                return this;
            }

            /**
             * LmItemAttributeMap.
             */
            public Builder lmItemAttributeMap(java.util.Map < String, String > lmItemAttributeMap) {
                this.lmItemAttributeMap = lmItemAttributeMap;
                return this;
            }

            /**
             * LmItemCategory.
             */
            public Builder lmItemCategory(String lmItemCategory) {
                this.lmItemCategory = lmItemCategory;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * MainPicUrl.
             */
            public Builder mainPicUrl(String mainPicUrl) {
                this.mainPicUrl = mainPicUrl;
                return this;
            }

            /**
             * MinPrice.
             */
            public Builder minPrice(Long minPrice) {
                this.minPrice = minPrice;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map < String, java.util.List<String>> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * Prov.
             */
            public Builder prov(String prov) {
                this.prov = prov;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * ReservePrice.
             */
            public Builder reservePrice(Long reservePrice) {
                this.reservePrice = reservePrice;
                return this;
            }

            /**
             * SecuredTransactions.
             */
            public Builder securedTransactions(Integer securedTransactions) {
                this.securedTransactions = securedTransactions;
                return this;
            }

            /**
             * SellerPayPostfee.
             */
            public Builder sellerPayPostfee(Boolean sellerPayPostfee) {
                this.sellerPayPostfee = sellerPayPostfee;
                return this;
            }

            /**
             * SimpleQuantity.
             */
            public Builder simpleQuantity(String simpleQuantity) {
                this.simpleQuantity = simpleQuantity;
                return this;
            }

            /**
             * sku list
             */
            public Builder skuModels(java.util.List < SkuModels> skuModels) {
                this.skuModels = skuModels;
                return this;
            }

            /**
             * SkuPropertys.
             */
            public Builder skuPropertys(java.util.List < SkuPropertys> skuPropertys) {
                this.skuPropertys = skuPropertys;
                return this;
            }

            /**
             * ThirdPartyItemId.
             */
            public Builder thirdPartyItemId(String thirdPartyItemId) {
                this.thirdPartyItemId = thirdPartyItemId;
                return this;
            }

            /**
             * ThirdPartyName.
             */
            public Builder thirdPartyName(String thirdPartyName) {
                this.thirdPartyName = thirdPartyName;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            /**
             * VideoPicUrl.
             */
            public Builder videoPicUrl(String videoPicUrl) {
                this.videoPicUrl = videoPicUrl;
                return this;
            }

            /**
             * VideoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            /**
             * VirtualItemType.
             */
            public Builder virtualItemType(String virtualItemType) {
                this.virtualItemType = virtualItemType;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
