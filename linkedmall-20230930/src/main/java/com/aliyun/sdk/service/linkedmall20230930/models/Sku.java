// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Sku} extends {@link TeaModel}
 *
 * <p>Sku</p>
 */
public class Sku extends TeaModel {
    @NameInMap("canSell")
    private Boolean canSell;

    @NameInMap("divisionCode")
    private String divisionCode;

    @NameInMap("fuzzyQuantity")
    private String fuzzyQuantity;

    @NameInMap("markPrice")
    private Long markPrice;

    @NameInMap("picUrl")
    private String picUrl;

    @NameInMap("platformPrice")
    private Long platformPrice;

    @NameInMap("price")
    private Long price;

    @NameInMap("productId")
    private String productId;

    @NameInMap("quantity")
    private Long quantity;

    @NameInMap("shopId")
    private String shopId;

    @NameInMap("skuId")
    private String skuId;

    @NameInMap("skuSpecs")
    private java.util.List < SkuSpec > skuSpecs;

    @NameInMap("skuSpecsCode")
    private String skuSpecsCode;

    @NameInMap("skuStatus")
    private String skuStatus;

    @NameInMap("title")
    private String title;

    private Sku(Builder builder) {
        this.canSell = builder.canSell;
        this.divisionCode = builder.divisionCode;
        this.fuzzyQuantity = builder.fuzzyQuantity;
        this.markPrice = builder.markPrice;
        this.picUrl = builder.picUrl;
        this.platformPrice = builder.platformPrice;
        this.price = builder.price;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.shopId = builder.shopId;
        this.skuId = builder.skuId;
        this.skuSpecs = builder.skuSpecs;
        this.skuSpecsCode = builder.skuSpecsCode;
        this.skuStatus = builder.skuStatus;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Sku create() {
        return builder().build();
    }

    /**
     * @return canSell
     */
    public Boolean getCanSell() {
        return this.canSell;
    }

    /**
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return fuzzyQuantity
     */
    public String getFuzzyQuantity() {
        return this.fuzzyQuantity;
    }

    /**
     * @return markPrice
     */
    public Long getMarkPrice() {
        return this.markPrice;
    }

    /**
     * @return picUrl
     */
    public String getPicUrl() {
        return this.picUrl;
    }

    /**
     * @return platformPrice
     */
    public Long getPlatformPrice() {
        return this.platformPrice;
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return this.price;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return quantity
     */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return skuSpecs
     */
    public java.util.List < SkuSpec > getSkuSpecs() {
        return this.skuSpecs;
    }

    /**
     * @return skuSpecsCode
     */
    public String getSkuSpecsCode() {
        return this.skuSpecsCode;
    }

    /**
     * @return skuStatus
     */
    public String getSkuStatus() {
        return this.skuStatus;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private Boolean canSell; 
        private String divisionCode; 
        private String fuzzyQuantity; 
        private Long markPrice; 
        private String picUrl; 
        private Long platformPrice; 
        private Long price; 
        private String productId; 
        private Long quantity; 
        private String shopId; 
        private String skuId; 
        private java.util.List < SkuSpec > skuSpecs; 
        private String skuSpecsCode; 
        private String skuStatus; 
        private String title; 

        /**
         * canSell.
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * divisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * fuzzyQuantity.
         */
        public Builder fuzzyQuantity(String fuzzyQuantity) {
            this.fuzzyQuantity = fuzzyQuantity;
            return this;
        }

        /**
         * markPrice.
         */
        public Builder markPrice(Long markPrice) {
            this.markPrice = markPrice;
            return this;
        }

        /**
         * picUrl.
         */
        public Builder picUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        /**
         * platformPrice.
         */
        public Builder platformPrice(Long platformPrice) {
            this.platformPrice = platformPrice;
            return this;
        }

        /**
         * price.
         */
        public Builder price(Long price) {
            this.price = price;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * quantity.
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * shopId.
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * skuId.
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        /**
         * skuSpecs.
         */
        public Builder skuSpecs(java.util.List < SkuSpec > skuSpecs) {
            this.skuSpecs = skuSpecs;
            return this;
        }

        /**
         * skuSpecsCode.
         */
        public Builder skuSpecsCode(String skuSpecsCode) {
            this.skuSpecsCode = skuSpecsCode;
            return this;
        }

        /**
         * skuStatus.
         */
        public Builder skuStatus(String skuStatus) {
            this.skuStatus = skuStatus;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Sku build() {
            return new Sku(this);
        } 

    } 

}
