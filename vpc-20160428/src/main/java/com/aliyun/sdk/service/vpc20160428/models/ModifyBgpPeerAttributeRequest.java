// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBgpPeerAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyBgpPeerAttributeRequest</p>
 */
public class ModifyBgpPeerAttributeRequest extends Request {
    @Query
    @NameInMap("BfdMultiHop")
    private Integer bfdMultiHop;

    @Query
    @NameInMap("BgpGroupId")
    private String bgpGroupId;

    @Query
    @NameInMap("BgpPeerId")
    @Validation(required = true)
    private String bgpPeerId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EnableBfd")
    private Boolean enableBfd;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PeerIpAddress")
    private String peerIpAddress;

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

    private ModifyBgpPeerAttributeRequest(Builder builder) {
        super(builder);
        this.bfdMultiHop = builder.bfdMultiHop;
        this.bgpGroupId = builder.bgpGroupId;
        this.bgpPeerId = builder.bgpPeerId;
        this.clientToken = builder.clientToken;
        this.enableBfd = builder.enableBfd;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerIpAddress = builder.peerIpAddress;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBgpPeerAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bfdMultiHop
     */
    public Integer getBfdMultiHop() {
        return this.bfdMultiHop;
    }

    /**
     * @return bgpGroupId
     */
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    /**
     * @return bgpPeerId
     */
    public String getBgpPeerId() {
        return this.bgpPeerId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableBfd
     */
    public Boolean getEnableBfd() {
        return this.enableBfd;
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
     * @return peerIpAddress
     */
    public String getPeerIpAddress() {
        return this.peerIpAddress;
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

    public static final class Builder extends Request.Builder<ModifyBgpPeerAttributeRequest, Builder> {
        private Integer bfdMultiHop; 
        private String bgpGroupId; 
        private String bgpPeerId; 
        private String clientToken; 
        private Boolean enableBfd; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerIpAddress; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBgpPeerAttributeRequest response) {
            super(response);
            this.bfdMultiHop = response.bfdMultiHop;
            this.bgpGroupId = response.bgpGroupId;
            this.bgpPeerId = response.bgpPeerId;
            this.clientToken = response.clientToken;
            this.enableBfd = response.enableBfd;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.peerIpAddress = response.peerIpAddress;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * BfdMultiHop.
         */
        public Builder bfdMultiHop(Integer bfdMultiHop) {
            this.putQueryParameter("BfdMultiHop", bfdMultiHop);
            this.bfdMultiHop = bfdMultiHop;
            return this;
        }

        /**
         * BgpGroupId.
         */
        public Builder bgpGroupId(String bgpGroupId) {
            this.putQueryParameter("BgpGroupId", bgpGroupId);
            this.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * BgpPeerId.
         */
        public Builder bgpPeerId(String bgpPeerId) {
            this.putQueryParameter("BgpPeerId", bgpPeerId);
            this.bgpPeerId = bgpPeerId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EnableBfd.
         */
        public Builder enableBfd(Boolean enableBfd) {
            this.putQueryParameter("EnableBfd", enableBfd);
            this.enableBfd = enableBfd;
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
         * PeerIpAddress.
         */
        public Builder peerIpAddress(String peerIpAddress) {
            this.putQueryParameter("PeerIpAddress", peerIpAddress);
            this.peerIpAddress = peerIpAddress;
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

        @Override
        public ModifyBgpPeerAttributeRequest build() {
            return new ModifyBgpPeerAttributeRequest(this);
        } 

    } 

}
