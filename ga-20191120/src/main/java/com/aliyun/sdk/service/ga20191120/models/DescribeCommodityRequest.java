// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommodityRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommodityRequest</p>
 */
public class DescribeCommodityRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("OrderType")
    @Validation(required = true)
    private String orderType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeCommodityRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommodityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCommodityRequest, Builder> {
        private String commodityCode; 
        private String orderType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommodityRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
        } 

        /**
         * The commodity code.
         * <p>
         * 
         * Examples for the China site (aliyun.com):
         * 
         * *   **ga_gapluspre_public_cn**: GA instance.
         * *   **ga_plusbwppre_public_cn**: basic bandwidth plan.
         * 
         * Examples for the international site (alibabacloud.com):
         * 
         * *   **ga_pluspre_public_intl**: GA instance.
         * *   **ga_bwppreintl_public_intl**: basic bandwidth plan.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * The type of the order. Valid values:
         * <p>
         * 
         * *   **BUY**: purchase
         * *   **RENEW**: renewal
         * *   **UPGRADE**: upgrade
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeCommodityRequest build() {
            return new DescribeCommodityRequest(this);
        } 

    } 

}
