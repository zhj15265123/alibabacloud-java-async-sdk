// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourcePriceResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourcePriceResponseBody</p>
 */
public class GetResourcePriceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PriceModel")
    private PriceModel priceModel;

    @NameInMap("RequestId")
    private String requestId;

    private GetResourcePriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.priceModel = builder.priceModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcePriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return priceModel
     */
    public PriceModel getPriceModel() {
        return this.priceModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private PriceModel priceModel; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PriceModel.
         */
        public Builder priceModel(PriceModel priceModel) {
            this.priceModel = priceModel;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourcePriceResponseBody build() {
            return new GetResourcePriceResponseBody(this);
        } 

    } 

    public static class Promotions extends TeaModel {
        @NameInMap("OptionCode")
        private String optionCode;

        @NameInMap("PromotionDesc")
        private String promotionDesc;

        @NameInMap("PromotionId")
        private String promotionId;

        @NameInMap("PromotionName")
        private String promotionName;

        @NameInMap("Selected")
        private Boolean selected;

        private Promotions(Builder builder) {
            this.optionCode = builder.optionCode;
            this.promotionDesc = builder.promotionDesc;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Promotions create() {
            return builder().build();
        }

        /**
         * @return optionCode
         */
        public String getOptionCode() {
            return this.optionCode;
        }

        /**
         * @return promotionDesc
         */
        public String getPromotionDesc() {
            return this.promotionDesc;
        }

        /**
         * @return promotionId
         */
        public String getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String optionCode; 
            private String promotionDesc; 
            private String promotionId; 
            private String promotionName; 
            private Boolean selected; 

            /**
             * OptionCode.
             */
            public Builder optionCode(String optionCode) {
                this.optionCode = optionCode;
                return this;
            }

            /**
             * PromotionDesc.
             */
            public Builder promotionDesc(String promotionDesc) {
                this.promotionDesc = promotionDesc;
                return this;
            }

            /**
             * PromotionId.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public Promotions build() {
                return new Promotions(this);
            } 

        } 

    }
    public static class Price extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("DiscountPrice")
        private String discountPrice;

        @NameInMap("OriginalPrice")
        private String originalPrice;

        @NameInMap("Promotions")
        private java.util.List < Promotions> promotions;

        @NameInMap("TradePrice")
        private String tradePrice;

        private Price(Builder builder) {
            this.currency = builder.currency;
            this.discountPrice = builder.discountPrice;
            this.originalPrice = builder.originalPrice;
            this.promotions = builder.promotions;
            this.tradePrice = builder.tradePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Price create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return discountPrice
         */
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return originalPrice
         */
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return promotions
         */
        public java.util.List < Promotions> getPromotions() {
            return this.promotions;
        }

        /**
         * @return tradePrice
         */
        public String getTradePrice() {
            return this.tradePrice;
        }

        public static final class Builder {
            private String currency; 
            private String discountPrice; 
            private String originalPrice; 
            private java.util.List < Promotions> promotions; 
            private String tradePrice; 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(String discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * Promotions.
             */
            public Builder promotions(java.util.List < Promotions> promotions) {
                this.promotions = promotions;
                return this;
            }

            /**
             * TradePrice.
             */
            public Builder tradePrice(String tradePrice) {
                this.tradePrice = tradePrice;
                return this;
            }

            public Price build() {
                return new Price(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("RuleId")
        private Long ruleId;

        private Rules(Builder builder) {
            this.description = builder.description;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String description; 
            private Long ruleId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class PriceModel extends TeaModel {
        @NameInMap("Price")
        private Price price;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        private PriceModel(Builder builder) {
            this.price = builder.price;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceModel create() {
            return builder().build();
        }

        /**
         * @return price
         */
        public Price getPrice() {
            return this.price;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Price price; 
            private java.util.List < Rules> rules; 

            /**
             * Price.
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public PriceModel build() {
                return new PriceModel(this);
            } 

        } 

    }
}
