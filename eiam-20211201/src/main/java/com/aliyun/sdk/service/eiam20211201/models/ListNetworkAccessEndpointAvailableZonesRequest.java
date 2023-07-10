// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkAccessEndpointAvailableZonesRequest} extends {@link RequestModel}
 *
 * <p>ListNetworkAccessEndpointAvailableZonesRequest</p>
 */
public class ListNetworkAccessEndpointAvailableZonesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("NaeRegionId")
    @Validation(required = true)
    private String naeRegionId;

    private ListNetworkAccessEndpointAvailableZonesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.naeRegionId = builder.naeRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkAccessEndpointAvailableZonesRequest create() {
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
     * @return naeRegionId
     */
    public String getNaeRegionId() {
        return this.naeRegionId;
    }

    public static final class Builder extends Request.Builder<ListNetworkAccessEndpointAvailableZonesRequest, Builder> {
        private String regionId; 
        private String naeRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListNetworkAccessEndpointAvailableZonesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.naeRegionId = request.naeRegionId;
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
         * 专属网络端点支持的地域
         */
        public Builder naeRegionId(String naeRegionId) {
            this.putQueryParameter("NaeRegionId", naeRegionId);
            this.naeRegionId = naeRegionId;
            return this;
        }

        @Override
        public ListNetworkAccessEndpointAvailableZonesRequest build() {
            return new ListNetworkAccessEndpointAvailableZonesRequest(this);
        } 

    } 

}
