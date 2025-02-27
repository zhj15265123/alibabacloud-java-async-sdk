// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEciScalingConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEciScalingConfigurationsRequest</p>
 */
public class DescribeEciScalingConfigurationsRequest extends Request {
    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ScalingConfigurationIds")
    private java.util.List < String > scalingConfigurationIds;

    @Query
    @NameInMap("ScalingConfigurationNames")
    private java.util.List < String > scalingConfigurationNames;

    @Query
    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    private DescribeEciScalingConfigurationsRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingConfigurationIds = builder.scalingConfigurationIds;
        this.scalingConfigurationNames = builder.scalingConfigurationNames;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEciScalingConfigurationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scalingConfigurationIds
     */
    public java.util.List < String > getScalingConfigurationIds() {
        return this.scalingConfigurationIds;
    }

    /**
     * @return scalingConfigurationNames
     */
    public java.util.List < String > getScalingConfigurationNames() {
        return this.scalingConfigurationNames;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeEciScalingConfigurationsRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > scalingConfigurationIds; 
        private java.util.List < String > scalingConfigurationNames; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEciScalingConfigurationsRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingConfigurationIds = request.scalingConfigurationIds;
            this.scalingConfigurationNames = request.scalingConfigurationNames;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 50.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the scaling group. You can use the ID to query all scaling configurations in the scaling group.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The IDs of the scaling configurations that you want to query.
         * <p>
         * 
         * The IDs of active and inactive scaling configurations are displayed in the query results. You can differentiate between active and inactive scaling configurations based on the value of the LifecycleState parameter.
         */
        public Builder scalingConfigurationIds(java.util.List < String > scalingConfigurationIds) {
            this.putQueryParameter("ScalingConfigurationIds", scalingConfigurationIds);
            this.scalingConfigurationIds = scalingConfigurationIds;
            return this;
        }

        /**
         * The names of the scaling configurations that you want to query.
         * <p>
         * 
         * The names of inactive scaling configurations are not displayed in the query results, and no error is reported.
         */
        public Builder scalingConfigurationNames(java.util.List < String > scalingConfigurationNames) {
            this.putQueryParameter("ScalingConfigurationNames", scalingConfigurationNames);
            this.scalingConfigurationNames = scalingConfigurationNames;
            return this;
        }

        /**
         * The IDs of the scaling configurations that you want to query.
         * <p>
         * 
         * The IDs of active and inactive scaling configurations are displayed in the query results. You can differentiate between active and inactive scaling configurations based on the value of the `LifecycleState` parameter.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public DescribeEciScalingConfigurationsRequest build() {
            return new DescribeEciScalingConfigurationsRequest(this);
        } 

    } 

}
