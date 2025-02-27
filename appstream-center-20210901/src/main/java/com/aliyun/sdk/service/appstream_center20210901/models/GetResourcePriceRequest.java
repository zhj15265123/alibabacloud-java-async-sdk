// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourcePriceRequest} extends {@link RequestModel}
 *
 * <p>GetResourcePriceRequest</p>
 */
public class GetResourcePriceRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(required = true)
    private Long amount;

    @Query
    @NameInMap("BizRegionId")
    @Validation(required = true)
    private String bizRegionId;

    @Query
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Query
    @NameInMap("NodeInstanceType")
    @Validation(required = true)
    private String nodeInstanceType;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private Long period;

    @Query
    @NameInMap("PeriodUnit")
    @Validation(required = true)
    private String periodUnit;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    private GetResourcePriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.nodeInstanceType = builder.nodeInstanceType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return nodeInstanceType
     */
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<GetResourcePriceRequest, Builder> {
        private Long amount; 
        private String bizRegionId; 
        private String chargeType; 
        private String nodeInstanceType; 
        private Long period; 
        private String periodUnit; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(GetResourcePriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.nodeInstanceType = request.nodeInstanceType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.productType = request.productType;
        } 

        /**
         * Amount.
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * NodeInstanceType.
         */
        public Builder nodeInstanceType(String nodeInstanceType) {
            this.putQueryParameter("NodeInstanceType", nodeInstanceType);
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public GetResourcePriceRequest build() {
            return new GetResourcePriceRequest(this);
        } 

    } 

}
