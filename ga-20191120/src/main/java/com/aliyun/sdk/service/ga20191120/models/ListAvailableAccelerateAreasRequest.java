// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableAccelerateAreasRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableAccelerateAreasRequest</p>
 */
public class ListAvailableAccelerateAreasRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListAvailableAccelerateAreasRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableAccelerateAreasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListAvailableAccelerateAreasRequest, Builder> {
        private String acceleratorId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAvailableAccelerateAreasRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.regionId = response.regionId;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListAvailableAccelerateAreasRequest build() {
            return new ListAvailableAccelerateAreasRequest(this);
        } 

    } 

}
