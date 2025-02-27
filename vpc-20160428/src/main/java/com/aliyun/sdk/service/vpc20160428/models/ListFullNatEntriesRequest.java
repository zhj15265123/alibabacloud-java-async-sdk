// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFullNatEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListFullNatEntriesRequest</p>
 */
public class ListFullNatEntriesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("FullNatEntryId")
    private String fullNatEntryId;

    @Query
    @NameInMap("FullNatEntryNames")
    private java.util.List < String > fullNatEntryNames;

    @Query
    @NameInMap("FullNatTableId")
    private String fullNatTableId;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @Query
    @NameInMap("NetworkInterfaceIds")
    private java.util.List < String > networkInterfaceIds;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListFullNatEntriesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fullNatEntryId = builder.fullNatEntryId;
        this.fullNatEntryNames = builder.fullNatEntryNames;
        this.fullNatTableId = builder.fullNatTableId;
        this.ipProtocol = builder.ipProtocol;
        this.maxResults = builder.maxResults;
        this.natGatewayId = builder.natGatewayId;
        this.networkInterfaceIds = builder.networkInterfaceIds;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFullNatEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return fullNatEntryId
     */
    public String getFullNatEntryId() {
        return this.fullNatEntryId;
    }

    /**
     * @return fullNatEntryNames
     */
    public java.util.List < String > getFullNatEntryNames() {
        return this.fullNatEntryNames;
    }

    /**
     * @return fullNatTableId
     */
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return networkInterfaceIds
     */
    public java.util.List < String > getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
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

    public static final class Builder extends Request.Builder<ListFullNatEntriesRequest, Builder> {
        private String clientToken; 
        private String fullNatEntryId; 
        private java.util.List < String > fullNatEntryNames; 
        private String fullNatTableId; 
        private String ipProtocol; 
        private Long maxResults; 
        private String natGatewayId; 
        private java.util.List < String > networkInterfaceIds; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListFullNatEntriesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.fullNatEntryId = request.fullNatEntryId;
            this.fullNatEntryNames = request.fullNatEntryNames;
            this.fullNatTableId = request.fullNatTableId;
            this.ipProtocol = request.ipProtocol;
            this.maxResults = request.maxResults;
            this.natGatewayId = request.natGatewayId;
            this.networkInterfaceIds = request.networkInterfaceIds;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must ensure that it is unique among all requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the FULLNAT entry that you want to query.
         */
        public Builder fullNatEntryId(String fullNatEntryId) {
            this.putQueryParameter("FullNatEntryId", fullNatEntryId);
            this.fullNatEntryId = fullNatEntryId;
            return this;
        }

        /**
         * The name of the FULLNAT entry.
         */
        public Builder fullNatEntryNames(java.util.List < String > fullNatEntryNames) {
            this.putQueryParameter("FullNatEntryNames", fullNatEntryNames);
            this.fullNatEntryNames = fullNatEntryNames;
            return this;
        }

        /**
         * The ID of the FULLNAT table to which the FULLNAT entries to be queried belong.
         * <p>
         * 
         * >  You must specify at least one of the **FullNatTableId** and **NatGatewayId** parameters.
         */
        public Builder fullNatTableId(String fullNatTableId) {
            this.putQueryParameter("FullNatTableId", fullNatTableId);
            this.fullNatTableId = fullNatTableId;
            return this;
        }

        /**
         * The protocol of the packets that are forwarded by the port. Valid values:
         * <p>
         * 
         * *   **TCP**
         * *   **UDP**
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * The number of entries to return per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         * <p>
         * 
         * >  You must specify at least one of the **FullNatTableId** and **NatGatewayId** parameters.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The IDs of ENIs.
         */
        public Builder networkInterfaceIds(java.util.List < String > networkInterfaceIds) {
            this.putQueryParameter("NetworkInterfaceIds", networkInterfaceIds);
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If this is your first query or no next queries are to be sent, ignore this parameter.
         * *   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.
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
         * The region ID of the virtual private cloud (VPC) NAT gateway to which the FULLNAT entries to be queried belong.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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

        @Override
        public ListFullNatEntriesRequest build() {
            return new ListFullNatEntriesRequest(this);
        } 

    } 

}
