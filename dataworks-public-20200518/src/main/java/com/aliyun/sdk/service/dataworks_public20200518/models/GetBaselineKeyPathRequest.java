// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBaselineKeyPathRequest} extends {@link RequestModel}
 *
 * <p>GetBaselineKeyPathRequest</p>
 */
public class GetBaselineKeyPathRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("BaselineId")
    @Validation(required = true)
    private Long baselineId;

    @Body
    @NameInMap("Bizdate")
    @Validation(required = true)
    private String bizdate;

    @Body
    @NameInMap("InGroupId")
    @Validation(required = true)
    private Integer inGroupId;

    private GetBaselineKeyPathRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.baselineId = builder.baselineId;
        this.bizdate = builder.bizdate;
        this.inGroupId = builder.inGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBaselineKeyPathRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return baselineId
     */
    public Long getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return bizdate
     */
    public String getBizdate() {
        return this.bizdate;
    }

    /**
     * @return inGroupId
     */
    public Integer getInGroupId() {
        return this.inGroupId;
    }

    public static final class Builder extends Request.Builder<GetBaselineKeyPathRequest, Builder> {
        private String regionId; 
        private Long baselineId; 
        private String bizdate; 
        private Integer inGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetBaselineKeyPathRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.baselineId = request.baselineId;
            this.bizdate = request.bizdate;
            this.inGroupId = request.inGroupId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the event.
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * The ID of the event.
         */
        public Builder inGroupId(Integer inGroupId) {
            this.putBodyParameter("InGroupId", inGroupId);
            this.inGroupId = inGroupId;
            return this;
        }

        @Override
        public GetBaselineKeyPathRequest build() {
            return new GetBaselineKeyPathRequest(this);
        } 

    } 

}
