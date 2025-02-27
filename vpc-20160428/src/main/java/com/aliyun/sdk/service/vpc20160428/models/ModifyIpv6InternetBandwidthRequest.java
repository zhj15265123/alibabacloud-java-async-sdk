// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpv6InternetBandwidthRequest} extends {@link RequestModel}
 *
 * <p>ModifyIpv6InternetBandwidthRequest</p>
 */
public class ModifyIpv6InternetBandwidthRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true)
    private Long bandwidth;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Ipv6AddressId")
    private String ipv6AddressId;

    @Query
    @NameInMap("Ipv6InternetBandwidthId")
    private String ipv6InternetBandwidthId;

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

    private ModifyIpv6InternetBandwidthRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.ipv6AddressId = builder.ipv6AddressId;
        this.ipv6InternetBandwidthId = builder.ipv6InternetBandwidthId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIpv6InternetBandwidthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipv6AddressId
     */
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    /**
     * @return ipv6InternetBandwidthId
     */
    public String getIpv6InternetBandwidthId() {
        return this.ipv6InternetBandwidthId;
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

    public static final class Builder extends Request.Builder<ModifyIpv6InternetBandwidthRequest, Builder> {
        private Long bandwidth; 
        private String clientToken; 
        private String ipv6AddressId; 
        private String ipv6InternetBandwidthId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIpv6InternetBandwidthRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.ipv6AddressId = request.ipv6AddressId;
            this.ipv6InternetBandwidthId = request.ipv6InternetBandwidthId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The Internet bandwidth for the IPv6 CIDR block. Unit: Mbit/s. Valid values: **1** to **5000**.
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the IPv6 address.
         * <p>
         * 
         * >  You must specify one of **Ipv6AddressId** and **Ipv6InternetBandwidthId**.
         */
        public Builder ipv6AddressId(String ipv6AddressId) {
            this.putQueryParameter("Ipv6AddressId", ipv6AddressId);
            this.ipv6AddressId = ipv6AddressId;
            return this;
        }

        /**
         * The ID of the Internet bandwidth that you purchased for the IPv6 CIDR block.
         * <p>
         * 
         * >  You must specify one of **Ipv6AddressId** and **Ipv6InternetBandwidthId**.
         */
        public Builder ipv6InternetBandwidthId(String ipv6InternetBandwidthId) {
            this.putQueryParameter("Ipv6InternetBandwidthId", ipv6InternetBandwidthId);
            this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
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
         * The ID of the region where the IPv6 gateway is deployed. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
        public ModifyIpv6InternetBandwidthRequest build() {
            return new ModifyIpv6InternetBandwidthRequest(this);
        } 

    } 

}
