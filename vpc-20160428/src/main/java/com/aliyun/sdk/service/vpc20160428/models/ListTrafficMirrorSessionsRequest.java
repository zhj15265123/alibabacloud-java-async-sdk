// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrafficMirrorSessionsRequest} extends {@link RequestModel}
 *
 * <p>ListTrafficMirrorSessionsRequest</p>
 */
public class ListTrafficMirrorSessionsRequest extends Request {
    @Query
    @NameInMap("Enabled")
    private Boolean enabled;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Priority")
    private Integer priority;

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
    @NameInMap("TrafficMirrorFilterId")
    private String trafficMirrorFilterId;

    @Query
    @NameInMap("TrafficMirrorSessionIds")
    @Validation(maxLength = 128)
    private java.util.List < String > trafficMirrorSessionIds;

    @Query
    @NameInMap("TrafficMirrorSessionName")
    private String trafficMirrorSessionName;

    @Query
    @NameInMap("TrafficMirrorSourceId")
    private String trafficMirrorSourceId;

    @Query
    @NameInMap("TrafficMirrorTargetId")
    private String trafficMirrorTargetId;

    @Query
    @NameInMap("VirtualNetworkId")
    private Integer virtualNetworkId;

    private ListTrafficMirrorSessionsRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
        this.trafficMirrorSessionIds = builder.trafficMirrorSessionIds;
        this.trafficMirrorSessionName = builder.trafficMirrorSessionName;
        this.trafficMirrorSourceId = builder.trafficMirrorSourceId;
        this.trafficMirrorTargetId = builder.trafficMirrorTargetId;
        this.virtualNetworkId = builder.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficMirrorSessionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    /**
     * @return trafficMirrorSessionIds
     */
    public java.util.List < String > getTrafficMirrorSessionIds() {
        return this.trafficMirrorSessionIds;
    }

    /**
     * @return trafficMirrorSessionName
     */
    public String getTrafficMirrorSessionName() {
        return this.trafficMirrorSessionName;
    }

    /**
     * @return trafficMirrorSourceId
     */
    public String getTrafficMirrorSourceId() {
        return this.trafficMirrorSourceId;
    }

    /**
     * @return trafficMirrorTargetId
     */
    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    /**
     * @return virtualNetworkId
     */
    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    public static final class Builder extends Request.Builder<ListTrafficMirrorSessionsRequest, Builder> {
        private Boolean enabled; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMirrorFilterId; 
        private java.util.List < String > trafficMirrorSessionIds; 
        private String trafficMirrorSessionName; 
        private String trafficMirrorSourceId; 
        private String trafficMirrorTargetId; 
        private Integer virtualNetworkId; 

        private Builder() {
            super();
        } 

        private Builder(ListTrafficMirrorSessionsRequest request) {
            super(request);
            this.enabled = request.enabled;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMirrorFilterId = request.trafficMirrorFilterId;
            this.trafficMirrorSessionIds = request.trafficMirrorSessionIds;
            this.trafficMirrorSessionName = request.trafficMirrorSessionName;
            this.trafficMirrorSourceId = request.trafficMirrorSourceId;
            this.trafficMirrorTargetId = request.trafficMirrorTargetId;
            this.virtualNetworkId = request.virtualNetworkId;
        } 

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
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
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
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
         * TrafficMirrorFilterId.
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.putQueryParameter("TrafficMirrorFilterId", trafficMirrorFilterId);
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        /**
         * TrafficMirrorSessionIds.
         */
        public Builder trafficMirrorSessionIds(java.util.List < String > trafficMirrorSessionIds) {
            this.putQueryParameter("TrafficMirrorSessionIds", trafficMirrorSessionIds);
            this.trafficMirrorSessionIds = trafficMirrorSessionIds;
            return this;
        }

        /**
         * TrafficMirrorSessionName.
         */
        public Builder trafficMirrorSessionName(String trafficMirrorSessionName) {
            this.putQueryParameter("TrafficMirrorSessionName", trafficMirrorSessionName);
            this.trafficMirrorSessionName = trafficMirrorSessionName;
            return this;
        }

        /**
         * TrafficMirrorSourceId.
         */
        public Builder trafficMirrorSourceId(String trafficMirrorSourceId) {
            this.putQueryParameter("TrafficMirrorSourceId", trafficMirrorSourceId);
            this.trafficMirrorSourceId = trafficMirrorSourceId;
            return this;
        }

        /**
         * TrafficMirrorTargetId.
         */
        public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
            this.putQueryParameter("TrafficMirrorTargetId", trafficMirrorTargetId);
            this.trafficMirrorTargetId = trafficMirrorTargetId;
            return this;
        }

        /**
         * VirtualNetworkId.
         */
        public Builder virtualNetworkId(Integer virtualNetworkId) {
            this.putQueryParameter("VirtualNetworkId", virtualNetworkId);
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }

        @Override
        public ListTrafficMirrorSessionsRequest build() {
            return new ListTrafficMirrorSessionsRequest(this);
        } 

    } 

}
