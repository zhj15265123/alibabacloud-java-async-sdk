// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppendInstancesToPrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>AppendInstancesToPrometheusGlobalViewRequest</p>
 */
public class AppendInstancesToPrometheusGlobalViewRequest extends Request {
    @Query
    @NameInMap("Clusters")
    @Validation(required = true)
    private String clusters;

    @Query
    @NameInMap("GlobalViewClusterId")
    @Validation(required = true)
    private String globalViewClusterId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AppendInstancesToPrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.clusters = builder.clusters;
        this.globalViewClusterId = builder.globalViewClusterId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppendInstancesToPrometheusGlobalViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public String getClusters() {
        return this.clusters;
    }

    /**
     * @return globalViewClusterId
     */
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AppendInstancesToPrometheusGlobalViewRequest, Builder> {
        private String clusters; 
        private String globalViewClusterId; 
        private String groupName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AppendInstancesToPrometheusGlobalViewRequest request) {
            super(request);
            this.clusters = request.clusters;
            this.globalViewClusterId = request.globalViewClusterId;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
        } 

        /**
         * Clusters.
         */
        public Builder clusters(String clusters) {
            this.putQueryParameter("Clusters", clusters);
            this.clusters = clusters;
            return this;
        }

        /**
         * GlobalViewClusterId.
         */
        public Builder globalViewClusterId(String globalViewClusterId) {
            this.putQueryParameter("GlobalViewClusterId", globalViewClusterId);
            this.globalViewClusterId = globalViewClusterId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
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
        public AppendInstancesToPrometheusGlobalViewRequest build() {
            return new AppendInstancesToPrometheusGlobalViewRequest(this);
        } 

    } 

}
