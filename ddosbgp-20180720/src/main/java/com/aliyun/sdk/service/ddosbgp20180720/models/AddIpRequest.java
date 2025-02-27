// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpRequest} extends {@link RequestModel}
 *
 * <p>AddIpRequest</p>
 */
public class AddIpRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IpList")
    @Validation(required = true)
    private String ipList;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private AddIpRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ipList = builder.ipList;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<AddIpRequest, Builder> {
        private String instanceId; 
        private String ipList; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddIpRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ipList = request.ipList;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the resource group to which the Anti-DDoS Origin Enterprise instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
         * <p>
         * 
         * For more information about resource groups, see [Create a resource group](~~94485~~).
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the Anti-DDoS Origin Enterprise instance.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~118703~~) operation to query all regions supported by Anti-DDoS Origin.
         */
        public Builder ipList(String ipList) {
            this.putQueryParameter("IpList", ipList);
            this.ipList = ipList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
         * <p>
         * 
         * For more information about sample requests, see the **"Examples"** section of this topic.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public AddIpRequest build() {
            return new AddIpRequest(this);
        } 

    } 

}
