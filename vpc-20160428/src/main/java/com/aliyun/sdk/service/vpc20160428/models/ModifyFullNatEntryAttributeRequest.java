// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFullNatEntryAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyFullNatEntryAttributeRequest</p>
 */
public class ModifyFullNatEntryAttributeRequest extends Request {
    @Query
    @NameInMap("AccessIp")
    private String accessIp;

    @Query
    @NameInMap("AccessPort")
    private String accessPort;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("FullNatEntryDescription")
    private String fullNatEntryDescription;

    @Query
    @NameInMap("FullNatEntryId")
    @Validation(required = true)
    private String fullNatEntryId;

    @Query
    @NameInMap("FullNatEntryName")
    private String fullNatEntryName;

    @Query
    @NameInMap("FullNatTableId")
    @Validation(required = true)
    private String fullNatTableId;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("NatIp")
    private String natIp;

    @Query
    @NameInMap("NatIpPort")
    private String natIpPort;

    @Query
    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

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

    private ModifyFullNatEntryAttributeRequest(Builder builder) {
        super(builder);
        this.accessIp = builder.accessIp;
        this.accessPort = builder.accessPort;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.fullNatEntryDescription = builder.fullNatEntryDescription;
        this.fullNatEntryId = builder.fullNatEntryId;
        this.fullNatEntryName = builder.fullNatEntryName;
        this.fullNatTableId = builder.fullNatTableId;
        this.ipProtocol = builder.ipProtocol;
        this.natIp = builder.natIp;
        this.natIpPort = builder.natIpPort;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFullNatEntryAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessIp
     */
    public String getAccessIp() {
        return this.accessIp;
    }

    /**
     * @return accessPort
     */
    public String getAccessPort() {
        return this.accessPort;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fullNatEntryDescription
     */
    public String getFullNatEntryDescription() {
        return this.fullNatEntryDescription;
    }

    /**
     * @return fullNatEntryId
     */
    public String getFullNatEntryId() {
        return this.fullNatEntryId;
    }

    /**
     * @return fullNatEntryName
     */
    public String getFullNatEntryName() {
        return this.fullNatEntryName;
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
     * @return natIp
     */
    public String getNatIp() {
        return this.natIp;
    }

    /**
     * @return natIpPort
     */
    public String getNatIpPort() {
        return this.natIpPort;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
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

    public static final class Builder extends Request.Builder<ModifyFullNatEntryAttributeRequest, Builder> {
        private String accessIp; 
        private String accessPort; 
        private String clientToken; 
        private Boolean dryRun; 
        private String fullNatEntryDescription; 
        private String fullNatEntryId; 
        private String fullNatEntryName; 
        private String fullNatTableId; 
        private String ipProtocol; 
        private String natIp; 
        private String natIpPort; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFullNatEntryAttributeRequest request) {
            super(request);
            this.accessIp = request.accessIp;
            this.accessPort = request.accessPort;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.fullNatEntryDescription = request.fullNatEntryDescription;
            this.fullNatEntryId = request.fullNatEntryId;
            this.fullNatEntryName = request.fullNatEntryName;
            this.fullNatTableId = request.fullNatTableId;
            this.ipProtocol = request.ipProtocol;
            this.natIp = request.natIp;
            this.natIpPort = request.natIpPort;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The backend IP address to be modified in FULLNAT address translation.
         */
        public Builder accessIp(String accessIp) {
            this.putQueryParameter("AccessIp", accessIp);
            this.accessIp = accessIp;
            return this;
        }

        /**
         * The backend port to be modified in FULLNAT port mapping. Valid values: **1** to **65535**.
         */
        public Builder accessPort(String accessPort) {
            this.putQueryParameter("AccessPort", accessPort);
            this.accessPort = accessPort;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether only to precheck this request. Valid values:
         * <p>
         * 
         * *   **true**: prechecks the request but does not modify the FULLNAT entry. The system checks your AccessKey pair, the RAM user permissions, and the required parameters. If the request fails the precheck, an error code is returned. If the request passes the check, the `DryRunOperation` error code is returned.
         * *   **false**: sends the API request. After the request passes the check, a 2XX HTTP status code is returned and the FULLNAT entry is modified. This is the default value.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The new description of the FULLNAT entry.
         * <p>
         * 
         * This parameter is optional. If you enter a description, the description must be 2 to 256 characters in length, and cannot start with `http://` or `https://`.
         */
        public Builder fullNatEntryDescription(String fullNatEntryDescription) {
            this.putQueryParameter("FullNatEntryDescription", fullNatEntryDescription);
            this.fullNatEntryDescription = fullNatEntryDescription;
            return this;
        }

        /**
         * The ID of the FULLNAT entry to be modified.
         */
        public Builder fullNatEntryId(String fullNatEntryId) {
            this.putQueryParameter("FullNatEntryId", fullNatEntryId);
            this.fullNatEntryId = fullNatEntryId;
            return this;
        }

        /**
         * The new name of the FULLNAT entry.
         * <p>
         * 
         * The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder fullNatEntryName(String fullNatEntryName) {
            this.putQueryParameter("FullNatEntryName", fullNatEntryName);
            this.fullNatEntryName = fullNatEntryName;
            return this;
        }

        /**
         * The ID of the FULLNAT table to be modified.
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
         * *   **TCP**: TCP
         * *   **UDP**: UDP
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * The NAT IP address to be modified.
         */
        public Builder natIp(String natIp) {
            this.putQueryParameter("NatIp", natIp);
            this.natIp = natIp;
            return this;
        }

        /**
         * The frontend port to be modified in FULLNAT port mapping. Valid values: **1** to **65535**.
         */
        public Builder natIpPort(String natIpPort) {
            this.putQueryParameter("NatIpPort", natIpPort);
            this.natIpPort = natIpPort;
            return this;
        }

        /**
         * The ID of the elastic network interface (ENI) to be modified.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
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
         * The region ID of the Virtual Private Cloud (VPC) NAT gateway to which the FULLNAT entry to be modified belongs.
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
        public ModifyFullNatEntryAttributeRequest build() {
            return new ModifyFullNatEntryAttributeRequest(this);
        } 

    } 

}
