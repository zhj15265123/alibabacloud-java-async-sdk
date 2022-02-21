// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceResponseBody</p>
 */
public class DescribePriceResponseBody extends TeaModel {
    @NameInMap("Prices")
    private Prices prices;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalTradePrice")
    private Float totalTradePrice;

    private DescribePriceResponseBody(Builder builder) {
        this.prices = builder.prices;
        this.requestId = builder.requestId;
        this.totalTradePrice = builder.totalTradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return prices
     */
    public Prices getPrices() {
        return this.prices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalTradePrice
     */
    public Float getTotalTradePrice() {
        return this.totalTradePrice;
    }

    public static final class Builder {
        private Prices prices; 
        private String requestId; 
        private Float totalTradePrice; 

        /**
         * Prices.
         */
        public Builder prices(Prices prices) {
            this.prices = prices;
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
         * TotalTradePrice.
         */
        public Builder totalTradePrice(Float totalTradePrice) {
            this.totalTradePrice = totalTradePrice;
            return this;
        }

        public DescribePriceResponseBody build() {
            return new DescribePriceResponseBody(this);
        } 

    } 

    public static class PriceInfo extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("OriginalPrice")
        private Float originalPrice;

        @NameInMap("TradePrice")
        private Float tradePrice;

        private PriceInfo(Builder builder) {
            this.currency = builder.currency;
            this.nodeType = builder.nodeType;
            this.originalPrice = builder.originalPrice;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return originalPrice
         */
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return tradePrice
         */
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private String nodeType; 
            private Float originalPrice; 
            private Float tradePrice; 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(Float originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(Float tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
    public static class Prices extends TeaModel {
        @NameInMap("PriceInfo")
        private java.util.List < PriceInfo> priceInfo;

        private Prices(Builder builder) {
            this.priceInfo = builder.priceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prices create() {
            return builder().build();
        }

        /**
         * @return priceInfo
         */
        public java.util.List < PriceInfo> getPriceInfo() {
            return this.priceInfo;
        }

        public static final class Builder {
            private java.util.List < PriceInfo> priceInfo; 

            /**
             * PriceInfo.
             */
            public Builder priceInfo(java.util.List < PriceInfo> priceInfo) {
                this.priceInfo = priceInfo;
                return this;
            }

            public Prices build() {
                return new Prices(this);
            } 

        } 

    }
}
