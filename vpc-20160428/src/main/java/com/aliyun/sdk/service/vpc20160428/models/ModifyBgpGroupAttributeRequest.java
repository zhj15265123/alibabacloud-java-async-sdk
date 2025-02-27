// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBgpGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyBgpGroupAttributeRequest</p>
 */
public class ModifyBgpGroupAttributeRequest extends Request {
    @Query
    @NameInMap("AuthKey")
    private String authKey;

    @Query
    @NameInMap("BgpGroupId")
    @Validation(required = true)
    private String bgpGroupId;

    @Query
    @NameInMap("ClearAuthKey")
    private Boolean clearAuthKey;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IsFakeAsn")
    private Boolean isFakeAsn;

    @Query
    @NameInMap("LocalAsn")
    private Long localAsn;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PeerAsn")
    private Long peerAsn;

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
    @NameInMap("RouteQuota")
    private Integer routeQuota;

    private ModifyBgpGroupAttributeRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.bgpGroupId = builder.bgpGroupId;
        this.clearAuthKey = builder.clearAuthKey;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.isFakeAsn = builder.isFakeAsn;
        this.localAsn = builder.localAsn;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerAsn = builder.peerAsn;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeQuota = builder.routeQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBgpGroupAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return bgpGroupId
     */
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    /**
     * @return clearAuthKey
     */
    public Boolean getClearAuthKey() {
        return this.clearAuthKey;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return isFakeAsn
     */
    public Boolean getIsFakeAsn() {
        return this.isFakeAsn;
    }

    /**
     * @return localAsn
     */
    public Long getLocalAsn() {
        return this.localAsn;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return peerAsn
     */
    public Long getPeerAsn() {
        return this.peerAsn;
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
     * @return routeQuota
     */
    public Integer getRouteQuota() {
        return this.routeQuota;
    }

    public static final class Builder extends Request.Builder<ModifyBgpGroupAttributeRequest, Builder> {
        private String authKey; 
        private String bgpGroupId; 
        private Boolean clearAuthKey; 
        private String clientToken; 
        private String description; 
        private Boolean isFakeAsn; 
        private Long localAsn; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Long peerAsn; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer routeQuota; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBgpGroupAttributeRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.bgpGroupId = request.bgpGroupId;
            this.clearAuthKey = request.clearAuthKey;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.isFakeAsn = request.isFakeAsn;
            this.localAsn = request.localAsn;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerAsn = request.peerAsn;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeQuota = request.routeQuota;
        } 

        /**
         * The authentication key of the BGP group.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * The ID of the BGP group.
         */
        public Builder bgpGroupId(String bgpGroupId) {
            this.putQueryParameter("BgpGroupId", bgpGroupId);
            this.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * Specifies whether to clear the secret key. Valid values:
         * <p>
         * 
         * *   **true:** clears the secret key.
         * *   **false:** does not clear the secret key.
         */
        public Builder clearAuthKey(Boolean clearAuthKey) {
            this.putQueryParameter("ClearAuthKey", clearAuthKey);
            this.clearAuthKey = clearAuthKey;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the BGP group.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to use a fake ASN. Valid values:
         * <p>
         * 
         * *   **false:** does not use a fake ASN.
         * *   **true:** uses a fake ASN.
         * 
         * >  A router that runs BGP typically belongs to only one autonomous system. If you want to use a different ASN to communicate with the peer but you cannot modify the BGP configuration because it may cause service interruptions, you can use a fake ASN. For example, you can use a fake ASN to communicate with the peer when you migrate or merge autonomous systems. This prevents service interruptions.
         */
        public Builder isFakeAsn(Boolean isFakeAsn) {
            this.putQueryParameter("IsFakeAsn", isFakeAsn);
            this.isFakeAsn = isFakeAsn;
            return this;
        }

        /**
         * The custom autonomous system number (ASN) of the BGP on the Alibaba Cloud side. Default value: 45104. Valid values:
         * <p>
         * 
         * *   **45104**
         * *   **64512~65534**
         * *   **4200000000~4294967294**
         * 
         * >  The value of **65025** is reserved by Alibaba Cloud. If you do not use the default value (45104) in scenarios where multiple connections are established, BGP loops may occur. Proceed with caution.
         */
        public Builder localAsn(Long localAsn) {
            this.putQueryParameter("LocalAsn", localAsn);
            this.localAsn = localAsn;
            return this;
        }

        /**
         * The name of the BGP group.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * The ASN of the gateway device in the data center.
         */
        public Builder peerAsn(Long peerAsn) {
            this.putQueryParameter("PeerAsn", peerAsn);
            this.peerAsn = peerAsn;
            return this;
        }

        /**
         * The ID of the region to which the BGP group belongs.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to obtain the region ID.
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
         * The maximum number of routes supported by a BGP peer. Default value: **110**.
         */
        public Builder routeQuota(Integer routeQuota) {
            this.putQueryParameter("RouteQuota", routeQuota);
            this.routeQuota = routeQuota;
            return this;
        }

        @Override
        public ModifyBgpGroupAttributeRequest build() {
            return new ModifyBgpGroupAttributeRequest(this);
        } 

    } 

}
