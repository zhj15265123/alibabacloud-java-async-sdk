// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyForwardEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyForwardEntryRequest</p>
 */
public class ModifyForwardEntryRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ExternalIp")
    private String externalIp;

    @Query
    @NameInMap("ExternalPort")
    private String externalPort;

    @Query
    @NameInMap("ForwardEntryId")
    @Validation(required = true)
    private String forwardEntryId;

    @Query
    @NameInMap("ForwardEntryName")
    private String forwardEntryName;

    @Query
    @NameInMap("ForwardTableId")
    @Validation(required = true)
    private String forwardTableId;

    @Query
    @NameInMap("InternalIp")
    private String internalIp;

    @Query
    @NameInMap("InternalPort")
    private String internalPort;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PortBreak")
    private Boolean portBreak;

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

    private ModifyForwardEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.externalIp = builder.externalIp;
        this.externalPort = builder.externalPort;
        this.forwardEntryId = builder.forwardEntryId;
        this.forwardEntryName = builder.forwardEntryName;
        this.forwardTableId = builder.forwardTableId;
        this.internalIp = builder.internalIp;
        this.internalPort = builder.internalPort;
        this.ipProtocol = builder.ipProtocol;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portBreak = builder.portBreak;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardEntryRequest create() {
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
     * @return externalIp
     */
    public String getExternalIp() {
        return this.externalIp;
    }

    /**
     * @return externalPort
     */
    public String getExternalPort() {
        return this.externalPort;
    }

    /**
     * @return forwardEntryId
     */
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    /**
     * @return forwardEntryName
     */
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    /**
     * @return forwardTableId
     */
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    /**
     * @return internalIp
     */
    public String getInternalIp() {
        return this.internalIp;
    }

    /**
     * @return internalPort
     */
    public String getInternalPort() {
        return this.internalPort;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
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
     * @return portBreak
     */
    public Boolean getPortBreak() {
        return this.portBreak;
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

    public static final class Builder extends Request.Builder<ModifyForwardEntryRequest, Builder> {
        private String clientToken; 
        private String externalIp; 
        private String externalPort; 
        private String forwardEntryId; 
        private String forwardEntryName; 
        private String forwardTableId; 
        private String internalIp; 
        private String internalPort; 
        private String ipProtocol; 
        private String ownerAccount; 
        private Long ownerId; 
        private Boolean portBreak; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyForwardEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.externalIp = request.externalIp;
            this.externalPort = request.externalPort;
            this.forwardEntryId = request.forwardEntryId;
            this.forwardEntryName = request.forwardEntryName;
            this.forwardTableId = request.forwardTableId;
            this.internalIp = request.internalIp;
            this.internalPort = request.internalPort;
            this.ipProtocol = request.ipProtocol;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portBreak = request.portBreak;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among all requests. ClientToken can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * *   When you modify DNAT entries of Internet NAT gateways, this parameter specifies the elastic IP addresses (EIPs) that are used to access the Internet.
         * <p>
         * *   When you modify DNAT entries of Virtual Private Cloud (VPC) NAT gateways, this parameter specifies the NAT IP addresses that are accessed by external networks.
         */
        public Builder externalIp(String externalIp) {
            this.putQueryParameter("ExternalIp", externalIp);
            this.externalIp = externalIp;
            return this;
        }

        /**
         * *   The external port that is used to forward traffic when you modify DNAT entries of Internet NAT gateways.
         * <p>
         * 
         *     *   Valid values: **1** to **65535**.
         *     *   If you want to modify the port range, separate port numbers with a forward slash (/), such as `10/20`.
         *     *   If you want to modify **ExternalPort** and **InternalPort** at the same time, and set **ExternalPort** to a port range, you must also set **InternalPort** to a port range. For example, you can set **ExternalPort** to `10/20` and set **InternalPor** to `80/90`.
         * 
         * *   The port that is accessed by external networks when you modify DNAT entries of VPC NAT gateways. Valid values: **1** to **65535**.
         */
        public Builder externalPort(String externalPort) {
            this.putQueryParameter("ExternalPort", externalPort);
            this.externalPort = externalPort;
            return this;
        }

        /**
         * The ID of the DNAT entry.
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.putQueryParameter("ForwardEntryId", forwardEntryId);
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        /**
         * The new name of the DNAT entry.
         * <p>
         * 
         * The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder forwardEntryName(String forwardEntryName) {
            this.putQueryParameter("ForwardEntryName", forwardEntryName);
            this.forwardEntryName = forwardEntryName;
            return this;
        }

        /**
         * The ID of the DNAT table to which the DNAT entry belongs.
         */
        public Builder forwardTableId(String forwardTableId) {
            this.putQueryParameter("ForwardTableId", forwardTableId);
            this.forwardTableId = forwardTableId;
            return this;
        }

        /**
         * *   The private IP address of the ECS instance that uses DNAT entries to communicate with the Internet when you modify DNAT entries of Internet NAT gateways.
         * <p>
         * *   The private IP address that uses DNAT entries to communicate when you modify DNAT entries of VPC NAT gateways.
         */
        public Builder internalIp(String internalIp) {
            this.putQueryParameter("InternalIp", internalIp);
            this.internalIp = internalIp;
            return this;
        }

        /**
         * *   The internal port or port range that is used to forward traffic when you modify DNAT entries of Internet NAT gateways. Valid values: **1** to **65535**.
         * <p>
         * *   The port of the destination ECS instance to be mapped when you modify DNAT entries of VPC NAT gateways. Valid values: **1** to **65535**.
         */
        public Builder internalPort(String internalPort) {
            this.putQueryParameter("InternalPort", internalPort);
            this.internalPort = internalPort;
            return this;
        }

        /**
         * The protocol type. Valid values:
         * <p>
         * 
         * *   **TCP**: The NAT gateway forwards TCP packets.
         * *   **UDP**: The NAT gateway forwards UDP packets.
         * *   **Any**: The NAT gateway forwards packets of all protocols.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
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
         * Specifies whether to remove limits on the port range. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no If an SNAT entry and a DNAT entry use the same public IP address, and you want to specify a port number greater than `1024`, set `PortBreak` to `true`.
         */
        public Builder portBreak(Boolean portBreak) {
            this.putQueryParameter("PortBreak", portBreak);
            this.portBreak = portBreak;
            return this;
        }

        /**
         * The region ID of the NAT gateway.
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
        public ModifyForwardEntryRequest build() {
            return new ModifyForwardEntryRequest(this);
        } 

    } 

}
