// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCenRouteMapRequest} extends {@link RequestModel}
 *
 * <p>ModifyCenRouteMapRequest</p>
 */
public class ModifyCenRouteMapRequest extends Request {
    @Query
    @NameInMap("AsPathMatchMode")
    private String asPathMatchMode;

    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("CenRegionId")
    @Validation(required = true)
    private String cenRegionId;

    @Query
    @NameInMap("CidrMatchMode")
    private String cidrMatchMode;

    @Query
    @NameInMap("CommunityMatchMode")
    private String communityMatchMode;

    @Query
    @NameInMap("CommunityOperateMode")
    private String communityOperateMode;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DestinationChildInstanceTypes")
    private java.util.List < String > destinationChildInstanceTypes;

    @Query
    @NameInMap("DestinationCidrBlocks")
    private java.util.List < String > destinationCidrBlocks;

    @Query
    @NameInMap("DestinationInstanceIds")
    private java.util.List < String > destinationInstanceIds;

    @Query
    @NameInMap("DestinationInstanceIdsReverseMatch")
    private Boolean destinationInstanceIdsReverseMatch;

    @Query
    @NameInMap("DestinationRouteTableIds")
    private java.util.List < String > destinationRouteTableIds;

    @Query
    @NameInMap("MapResult")
    @Validation(required = true)
    private String mapResult;

    @Query
    @NameInMap("MatchAddressType")
    private String matchAddressType;

    @Query
    @NameInMap("MatchAsns")
    private java.util.List < Integer > matchAsns;

    @Query
    @NameInMap("MatchCommunitySet")
    private java.util.List < String > matchCommunitySet;

    @Query
    @NameInMap("NextPriority")
    @Validation(maximum = 1000, minimum = 1)
    private Integer nextPriority;

    @Query
    @NameInMap("OperateCommunitySet")
    private java.util.List < String > operateCommunitySet;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Preference")
    @Validation(maximum = 100, minimum = 1)
    private Integer preference;

    @Query
    @NameInMap("PrependAsPath")
    private java.util.List < Long > prependAsPath;

    @Query
    @NameInMap("Priority")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer priority;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteMapId")
    @Validation(required = true)
    private String routeMapId;

    @Query
    @NameInMap("RouteTypes")
    private java.util.List < String > routeTypes;

    @Query
    @NameInMap("SourceChildInstanceTypes")
    private java.util.List < String > sourceChildInstanceTypes;

    @Query
    @NameInMap("SourceInstanceIds")
    private java.util.List < String > sourceInstanceIds;

    @Query
    @NameInMap("SourceInstanceIdsReverseMatch")
    private Boolean sourceInstanceIdsReverseMatch;

    @Query
    @NameInMap("SourceRegionIds")
    private java.util.List < String > sourceRegionIds;

    @Query
    @NameInMap("SourceRouteTableIds")
    private java.util.List < String > sourceRouteTableIds;

    private ModifyCenRouteMapRequest(Builder builder) {
        super(builder);
        this.asPathMatchMode = builder.asPathMatchMode;
        this.cenId = builder.cenId;
        this.cenRegionId = builder.cenRegionId;
        this.cidrMatchMode = builder.cidrMatchMode;
        this.communityMatchMode = builder.communityMatchMode;
        this.communityOperateMode = builder.communityOperateMode;
        this.description = builder.description;
        this.destinationChildInstanceTypes = builder.destinationChildInstanceTypes;
        this.destinationCidrBlocks = builder.destinationCidrBlocks;
        this.destinationInstanceIds = builder.destinationInstanceIds;
        this.destinationInstanceIdsReverseMatch = builder.destinationInstanceIdsReverseMatch;
        this.destinationRouteTableIds = builder.destinationRouteTableIds;
        this.mapResult = builder.mapResult;
        this.matchAddressType = builder.matchAddressType;
        this.matchAsns = builder.matchAsns;
        this.matchCommunitySet = builder.matchCommunitySet;
        this.nextPriority = builder.nextPriority;
        this.operateCommunitySet = builder.operateCommunitySet;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.preference = builder.preference;
        this.prependAsPath = builder.prependAsPath;
        this.priority = builder.priority;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeMapId = builder.routeMapId;
        this.routeTypes = builder.routeTypes;
        this.sourceChildInstanceTypes = builder.sourceChildInstanceTypes;
        this.sourceInstanceIds = builder.sourceInstanceIds;
        this.sourceInstanceIdsReverseMatch = builder.sourceInstanceIdsReverseMatch;
        this.sourceRegionIds = builder.sourceRegionIds;
        this.sourceRouteTableIds = builder.sourceRouteTableIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCenRouteMapRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asPathMatchMode
     */
    public String getAsPathMatchMode() {
        return this.asPathMatchMode;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return cenRegionId
     */
    public String getCenRegionId() {
        return this.cenRegionId;
    }

    /**
     * @return cidrMatchMode
     */
    public String getCidrMatchMode() {
        return this.cidrMatchMode;
    }

    /**
     * @return communityMatchMode
     */
    public String getCommunityMatchMode() {
        return this.communityMatchMode;
    }

    /**
     * @return communityOperateMode
     */
    public String getCommunityOperateMode() {
        return this.communityOperateMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationChildInstanceTypes
     */
    public java.util.List < String > getDestinationChildInstanceTypes() {
        return this.destinationChildInstanceTypes;
    }

    /**
     * @return destinationCidrBlocks
     */
    public java.util.List < String > getDestinationCidrBlocks() {
        return this.destinationCidrBlocks;
    }

    /**
     * @return destinationInstanceIds
     */
    public java.util.List < String > getDestinationInstanceIds() {
        return this.destinationInstanceIds;
    }

    /**
     * @return destinationInstanceIdsReverseMatch
     */
    public Boolean getDestinationInstanceIdsReverseMatch() {
        return this.destinationInstanceIdsReverseMatch;
    }

    /**
     * @return destinationRouteTableIds
     */
    public java.util.List < String > getDestinationRouteTableIds() {
        return this.destinationRouteTableIds;
    }

    /**
     * @return mapResult
     */
    public String getMapResult() {
        return this.mapResult;
    }

    /**
     * @return matchAddressType
     */
    public String getMatchAddressType() {
        return this.matchAddressType;
    }

    /**
     * @return matchAsns
     */
    public java.util.List < Integer > getMatchAsns() {
        return this.matchAsns;
    }

    /**
     * @return matchCommunitySet
     */
    public java.util.List < String > getMatchCommunitySet() {
        return this.matchCommunitySet;
    }

    /**
     * @return nextPriority
     */
    public Integer getNextPriority() {
        return this.nextPriority;
    }

    /**
     * @return operateCommunitySet
     */
    public java.util.List < String > getOperateCommunitySet() {
        return this.operateCommunitySet;
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
     * @return preference
     */
    public Integer getPreference() {
        return this.preference;
    }

    /**
     * @return prependAsPath
     */
    public java.util.List < Long > getPrependAsPath() {
        return this.prependAsPath;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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
     * @return routeMapId
     */
    public String getRouteMapId() {
        return this.routeMapId;
    }

    /**
     * @return routeTypes
     */
    public java.util.List < String > getRouteTypes() {
        return this.routeTypes;
    }

    /**
     * @return sourceChildInstanceTypes
     */
    public java.util.List < String > getSourceChildInstanceTypes() {
        return this.sourceChildInstanceTypes;
    }

    /**
     * @return sourceInstanceIds
     */
    public java.util.List < String > getSourceInstanceIds() {
        return this.sourceInstanceIds;
    }

    /**
     * @return sourceInstanceIdsReverseMatch
     */
    public Boolean getSourceInstanceIdsReverseMatch() {
        return this.sourceInstanceIdsReverseMatch;
    }

    /**
     * @return sourceRegionIds
     */
    public java.util.List < String > getSourceRegionIds() {
        return this.sourceRegionIds;
    }

    /**
     * @return sourceRouteTableIds
     */
    public java.util.List < String > getSourceRouteTableIds() {
        return this.sourceRouteTableIds;
    }

    public static final class Builder extends Request.Builder<ModifyCenRouteMapRequest, Builder> {
        private String asPathMatchMode; 
        private String cenId; 
        private String cenRegionId; 
        private String cidrMatchMode; 
        private String communityMatchMode; 
        private String communityOperateMode; 
        private String description; 
        private java.util.List < String > destinationChildInstanceTypes; 
        private java.util.List < String > destinationCidrBlocks; 
        private java.util.List < String > destinationInstanceIds; 
        private Boolean destinationInstanceIdsReverseMatch; 
        private java.util.List < String > destinationRouteTableIds; 
        private String mapResult; 
        private String matchAddressType; 
        private java.util.List < Integer > matchAsns; 
        private java.util.List < String > matchCommunitySet; 
        private Integer nextPriority; 
        private java.util.List < String > operateCommunitySet; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer preference; 
        private java.util.List < Long > prependAsPath; 
        private Integer priority; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeMapId; 
        private java.util.List < String > routeTypes; 
        private java.util.List < String > sourceChildInstanceTypes; 
        private java.util.List < String > sourceInstanceIds; 
        private Boolean sourceInstanceIdsReverseMatch; 
        private java.util.List < String > sourceRegionIds; 
        private java.util.List < String > sourceRouteTableIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCenRouteMapRequest request) {
            super(request);
            this.asPathMatchMode = request.asPathMatchMode;
            this.cenId = request.cenId;
            this.cenRegionId = request.cenRegionId;
            this.cidrMatchMode = request.cidrMatchMode;
            this.communityMatchMode = request.communityMatchMode;
            this.communityOperateMode = request.communityOperateMode;
            this.description = request.description;
            this.destinationChildInstanceTypes = request.destinationChildInstanceTypes;
            this.destinationCidrBlocks = request.destinationCidrBlocks;
            this.destinationInstanceIds = request.destinationInstanceIds;
            this.destinationInstanceIdsReverseMatch = request.destinationInstanceIdsReverseMatch;
            this.destinationRouteTableIds = request.destinationRouteTableIds;
            this.mapResult = request.mapResult;
            this.matchAddressType = request.matchAddressType;
            this.matchAsns = request.matchAsns;
            this.matchCommunitySet = request.matchCommunitySet;
            this.nextPriority = request.nextPriority;
            this.operateCommunitySet = request.operateCommunitySet;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.preference = request.preference;
            this.prependAsPath = request.prependAsPath;
            this.priority = request.priority;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeMapId = request.routeMapId;
            this.routeTypes = request.routeTypes;
            this.sourceChildInstanceTypes = request.sourceChildInstanceTypes;
            this.sourceInstanceIds = request.sourceInstanceIds;
            this.sourceInstanceIdsReverseMatch = request.sourceInstanceIdsReverseMatch;
            this.sourceRegionIds = request.sourceRegionIds;
            this.sourceRouteTableIds = request.sourceRouteTableIds;
        } 

        /**
         * The AS paths against which routes are matched.
         * <p>
         * 
         * > Only the AS-SEQUENCE parameter is supported. The AS-SET, AS-CONFED-SEQUENCE, and AS-CONFED-SET parameters are not supported. In other words, only the AS number list is supported. Sets and sub-lists are not supported.
         */
        public Builder asPathMatchMode(String asPathMatchMode) {
            this.putQueryParameter("AsPathMatchMode", asPathMatchMode);
            this.asPathMatchMode = asPathMatchMode;
            return this;
        }

        /**
         * The ID of the routing policy.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * 22
         */
        public Builder cenRegionId(String cenRegionId) {
            this.putQueryParameter("CenRegionId", cenRegionId);
            this.cenRegionId = cenRegionId;
            return this;
        }

        /**
         * vtb-adfg53c322v****
         */
        public Builder cidrMatchMode(String cidrMatchMode) {
            this.putQueryParameter("CidrMatchMode", cidrMatchMode);
            this.cidrMatchMode = cidrMatchMode;
            return this;
        }

        /**
         * The description of the routing policy.
         * <p>
         * 
         * The description cannot start with `http://` or `https://`. It must start with a letter and can contain letters, digits, hyphens (-), periods (.), and underscores (\_).
         */
        public Builder communityMatchMode(String communityMatchMode) {
            this.putQueryParameter("CommunityMatchMode", communityMatchMode);
            this.communityMatchMode = communityMatchMode;
            return this;
        }

        /**
         * The match method that is used to match routes against the AS paths. Valid values:
         * <p>
         * 
         * *   **Include**: fuzzy match. A route meets the match condition if the AS path of the route overlaps with the AS paths specified in the match condition.
         * *   **Complete**: exact match. A route is a match only if the AS path of the route is the same as an AS path specified in the match condition.
         */
        public Builder communityOperateMode(String communityOperateMode) {
            this.putQueryParameter("CommunityOperateMode", communityOperateMode);
            this.communityOperateMode = communityOperateMode;
            return this;
        }

        /**
         * cn-beijing
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * VPC
         */
        public Builder destinationChildInstanceTypes(java.util.List < String > destinationChildInstanceTypes) {
            this.putQueryParameter("DestinationChildInstanceTypes", destinationChildInstanceTypes);
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder destinationCidrBlocks(java.util.List < String > destinationCidrBlocks) {
            this.putQueryParameter("DestinationCidrBlocks", destinationCidrBlocks);
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }

        /**
         * vtb-acdbvtbr342cd****
         */
        public Builder destinationInstanceIds(java.util.List < String > destinationInstanceIds) {
            this.putQueryParameter("DestinationInstanceIds", destinationInstanceIds);
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }

        /**
         * System
         */
        public Builder destinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.putQueryParameter("DestinationInstanceIdsReverseMatch", destinationInstanceIdsReverseMatch);
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }

        /**
         * The IDs of the destination network instances to which the routes belong. The following network instance types are supported:
         * <p>
         * 
         * *   VPC
         * *   VBR
         * *   CCN instance
         * *   SAG instance
         * *   The ID of the IPsec-VPN connection.
         * 
         * You can enter at most 32 IDs.
         * 
         * > The destination instance IDs take effect only when Direction is set to Export from Regional Gateway and the destination instances are deployed in the current region.
         */
        public Builder destinationRouteTableIds(java.util.List < String > destinationRouteTableIds) {
            this.putQueryParameter("DestinationRouteTableIds", destinationRouteTableIds);
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }

        /**
         * Specifies whether to exclude the destination network instance IDs. Valid values:
         * <p>
         * 
         * *   **false** (default value): A route is a match if its destination network instance ID is in the list specified by **DestinationInstanceIds.N**.
         * *   **true**: A route meets the match condition if its destination network instance ID is not in the list specified by **DestinationInstanceIds.N**.
         */
        public Builder mapResult(String mapResult) {
            this.putQueryParameter("MapResult", mapResult);
            this.mapResult = mapResult;
            return this;
        }

        /**
         * cn-beijing
         */
        public Builder matchAddressType(String matchAddressType) {
            this.putQueryParameter("MatchAddressType", matchAddressType);
            this.matchAddressType = matchAddressType;
            return this;
        }

        /**
         * The ID of the CEN instance.
         */
        public Builder matchAsns(java.util.List < Integer > matchAsns) {
            this.putQueryParameter("MatchAsns", matchAsns);
            this.matchAsns = matchAsns;
            return this;
        }

        /**
         * The ID of the routing policy.
         */
        public Builder matchCommunitySet(java.util.List < String > matchCommunitySet) {
            this.putQueryParameter("MatchCommunitySet", matchCommunitySet);
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }

        /**
         * 10.10.10.0/24
         */
        public Builder nextPriority(Integer nextPriority) {
            this.putQueryParameter("NextPriority", nextPriority);
            this.nextPriority = nextPriority;
            return this;
        }

        /**
         * The action to be performed on a route that meets all match conditions. Valid values:
         * <p>
         * 
         * *   **Permit**: the route is permitted.
         * *   **Deny**: the route is denied.
         */
        public Builder operateCommunitySet(java.util.List < String > operateCommunitySet) {
            this.putQueryParameter("OperateCommunitySet", operateCommunitySet);
            this.operateCommunitySet = operateCommunitySet;
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
         * The community against which routes are matched.
         * <p>
         * 
         * Specify the community in the format of n:m. Valid values of n and m: **1** to **65535**. Each community must comply with the RFC 1997 standard. The RFC 8092 standard that defines BGP large communities is not supported.
         * 
         * You can specify at most 32 communities.
         * 
         * **
         * 
         * **If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.
         */
        public Builder preference(Integer preference) {
            this.putQueryParameter("Preference", preference);
            this.preference = preference;
            return this;
        }

        /**
         * The match method that is used to match routes against the prefix list. Valid values:
         * <p>
         * 
         * *   **Include**: fuzzy match. A route is a match if the route prefix is included in the match conditions.
         * 
         * For example, if you set the match condition to 10.10.0.0/16 and fuzzy match is enabled, the route whose prefix is 10.10.1.0/24 is a match.
         * 
         * *   **Complete**: exact match. A route is a match only if the route prefix is the same as the prefix specified in the match condition.
         * 
         * For example, if you set the match condition to 10.10.0.0/16 and exact match is enabled, a route is a match only if the prefix is 10.10.0.0/16.
         */
        public Builder prependAsPath(java.util.List < Long > prependAsPath) {
            this.putQueryParameter("PrependAsPath", prependAsPath);
            this.prependAsPath = prependAsPath;
            return this;
        }

        /**
         * VPC
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
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
         * vpc-avcdsg34ds****
         */
        public Builder routeMapId(String routeMapId) {
            this.putQueryParameter("RouteMapId", routeMapId);
            this.routeMapId = routeMapId;
            return this;
        }

        /**
         * Modifies a routing policy of a Cloud Enterprise Network (CEN) instance.
         */
        public Builder routeTypes(java.util.List < String > routeTypes) {
            this.putQueryParameter("RouteTypes", routeTypes);
            this.routeTypes = routeTypes;
            return this;
        }

        /**
         * The AS paths that are prepended by using an action statement when regional gateways receive or advertise routes.
         * <p>
         * 
         * The AS paths vary based on the direction in which the routing policy is applied:
         * 
         * *   If AS paths are prepended to a routing policy that is applied in the inbound direction, you must specify source network instance IDs and the source region in the match condition. In addition, the source region must be the same as the region where the routing policy is applied.
         * *   If AS paths are prepended to a routing policy that is applied in the outbound direction, you must specify destination network instance IDs in the match condition.
         * 
         * This parameter specifies the action to be performed when a route meets the match condition.
         */
        public Builder sourceChildInstanceTypes(java.util.List < String > sourceChildInstanceTypes) {
            this.putQueryParameter("SourceChildInstanceTypes", sourceChildInstanceTypes);
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }

        /**
         * 20
         */
        public Builder sourceInstanceIds(java.util.List < String > sourceInstanceIds) {
            this.putQueryParameter("SourceInstanceIds", sourceInstanceIds);
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }

        /**
         * The IDs of the destination route tables to which the routes belong. You can enter at most 32 route table IDs.
         * <p>
         * 
         * > The destination route table IDs take effect only when Direction is set to Export from Regional Gateway and the destination route tables belong to network instances deployed in the current region.
         */
        public Builder sourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.putQueryParameter("SourceInstanceIdsReverseMatch", sourceInstanceIdsReverseMatch);
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }

        /**
         * The IDs of the source route tables to which the routes belong. You can enter at most 32 route table IDs.
         */
        public Builder sourceRegionIds(java.util.List < String > sourceRegionIds) {
            this.putQueryParameter("SourceRegionIds", sourceRegionIds);
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }

        /**
         * The action that is performed on the community. Valid values:
         * <p>
         * 
         * *   **Additive**: adds the community to the route.
         * *   **Replace**: replaces the original community of the route.
         * 
         * This parameter specifies the action to be performed when a route meets the match condition.
         */
        public Builder sourceRouteTableIds(java.util.List < String > sourceRouteTableIds) {
            this.putQueryParameter("SourceRouteTableIds", sourceRouteTableIds);
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }

        @Override
        public ModifyCenRouteMapRequest build() {
            return new ModifyCenRouteMapRequest(this);
        } 

    } 

}
