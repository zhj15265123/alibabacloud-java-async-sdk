// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterFromGrafanaRequest} extends {@link RequestModel}
 *
 * <p>ListClusterFromGrafanaRequest</p>
 */
public class ListClusterFromGrafanaRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListClusterFromGrafanaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterFromGrafanaRequest create() {
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

    public static final class Builder extends Request.Builder<ListClusterFromGrafanaRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterFromGrafanaRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public ListClusterFromGrafanaRequest build() {
            return new ListClusterFromGrafanaRequest(this);
        } 

    } 

}
