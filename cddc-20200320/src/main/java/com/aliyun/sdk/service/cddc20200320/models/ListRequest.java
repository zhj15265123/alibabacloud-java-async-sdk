// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRequest} extends {@link RequestModel}
 *
 * <p>ListRequest</p>
 */
public class ListRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("Bid")
    @Validation(required = true)
    private String bid;

    @Query
    @NameInMap("Keys")
    private java.util.List < String > keys;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Values")
    private java.util.List < String > values;

    private ListRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.bid = builder.bid;
        this.keys = builder.keys;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return keys
     */
    public java.util.List < String > getKeys() {
        return this.keys;
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
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return values
     */
    public java.util.List < String > getValues() {
        return this.values;
    }

    public static final class Builder extends Request.Builder<ListRequest, Builder> {
        private Long aliUid; 
        private String bid; 
        private java.util.List < String > keys; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List < String > resourceIds; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private java.util.List < String > values; 

        private Builder() {
            super();
        } 

        private Builder(ListRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.bid = request.bid;
            this.keys = request.keys;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.values = request.values;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * Bid.
         */
        public Builder bid(String bid) {
            this.putQueryParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * Keys.
         */
        public Builder keys(java.util.List < String > keys) {
            this.putQueryParameter("Keys", keys);
            this.keys = keys;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List < String > values) {
            this.putQueryParameter("Values", values);
            this.values = values;
            return this;
        }

        @Override
        public ListRequest build() {
            return new ListRequest(this);
        } 

    } 

}
