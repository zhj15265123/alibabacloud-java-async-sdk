// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryClusterInfoRequest</p>
 */
public class QueryClusterInfoRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AclSwitch")
    private Boolean aclSwitch;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    private QueryClusterInfoRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.aclSwitch = builder.aclSwitch;
        this.clusterId = builder.clusterId;
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return aclSwitch
     */
    public Boolean getAclSwitch() {
        return this.aclSwitch;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<QueryClusterInfoRequest, Builder> {
        private String acceptLanguage; 
        private Boolean aclSwitch; 
        private String clusterId; 
        private String instanceId; 
        private String orderId; 
        private String regionId; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(QueryClusterInfoRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.aclSwitch = request.aclSwitch;
            this.clusterId = request.clusterId;
            this.instanceId = request.instanceId;
            this.orderId = request.orderId;
            this.regionId = request.regionId;
            this.requestPars = request.requestPars;
        } 

        /**
         * clusterNotFound
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * illegalRequest
         */
        public Builder aclSwitch(Boolean aclSwitch) {
            this.putQueryParameter("AclSwitch", aclSwitch);
            this.aclSwitch = aclSwitch;
            return this;
        }

        /**
         * duplicatedClusterAliasName
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * duplicated cluster alias name
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * mse-100-007
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * illegal request:%s
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * mse-200-021
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public QueryClusterInfoRequest build() {
            return new QueryClusterInfoRequest(this);
        } 

    } 

}
