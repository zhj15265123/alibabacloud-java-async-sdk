// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCmsInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListCmsInstancesRequest</p>
 */
public class ListCmsInstancesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TypeFilter")
    private String typeFilter;

    private ListCmsInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.typeFilter = builder.typeFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCmsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return typeFilter
     */
    public String getTypeFilter() {
        return this.typeFilter;
    }

    public static final class Builder extends Request.Builder<ListCmsInstancesRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String typeFilter; 

        private Builder() {
            super();
        } 

        private Builder(ListCmsInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.typeFilter = request.typeFilter;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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

        /**
         * TypeFilter.
         */
        public Builder typeFilter(String typeFilter) {
            this.putQueryParameter("TypeFilter", typeFilter);
            this.typeFilter = typeFilter;
            return this;
        }

        @Override
        public ListCmsInstancesRequest build() {
            return new ListCmsInstancesRequest(this);
        } 

    } 

}
