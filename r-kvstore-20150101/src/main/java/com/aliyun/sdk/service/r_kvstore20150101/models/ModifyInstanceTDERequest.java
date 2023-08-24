// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceTDERequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceTDERequest</p>
 */
public class ModifyInstanceTDERequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @Query
    @NameInMap("EncryptionName")
    private String encryptionName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RoleArn")
    private String roleArn;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TDEStatus")
    @Validation(required = true)
    private String TDEStatus;

    private ModifyInstanceTDERequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionName = builder.encryptionName;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleArn = builder.roleArn;
        this.securityToken = builder.securityToken;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTDERequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionName
     */
    public String getEncryptionName() {
        return this.encryptionName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceTDERequest, Builder> {
        private String regionId; 
        private String encryptionKey; 
        private String encryptionName; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleArn; 
        private String securityToken; 
        private String TDEStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceTDERequest request) {
            super(request);
            this.regionId = request.regionId;
            this.encryptionKey = request.encryptionKey;
            this.encryptionName = request.encryptionName;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleArn = request.roleArn;
            this.securityToken = request.securityToken;
            this.TDEStatus = request.TDEStatus;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the custom key. You can call the [DescribeEncryptionKeyList](~~302339~~) operation to query the key ID.
         * <p>
         * 
         * > 
         * 
         * *   If you do not specify this parameter, [Key Management Service (KMS)](~~28935~~) automatically generates a key.
         * 
         * *   To create a custom key, you can call the [CreateKey](~~28947~~) operation of the KMS API.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * The encryption algorithm. Default value: AES-CTR-256.
         * <p>
         * 
         * > This parameter is available only if the **TDEStatus** parameter is set to **Enabled**.
         */
        public Builder encryptionName(String encryptionName) {
            this.putQueryParameter("EncryptionName", encryptionName);
            this.encryptionName = encryptionName;
            return this;
        }

        /**
         * The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query the ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role that you want to attach to your ApsaraDB for Redis instance. The ARN must be in the format of `acs:ram::$accountID:role/$roleName`. After the role is attached, your ApsaraDB for Redis instance can use KMS.
         * <p>
         * 
         * > 
         * 
         * *   `$accountID`: the ID of the Alibaba Cloud account. To view the account ID, log on to the Alibaba Cloud console, move the pointer over your profile picture in the upper-right corner of the page, and then click **Security Settings**.
         * 
         * *   `$roleName`: the name of the RAM role. Replace $roleName with **AliyunRdsInstanceEncryptionDefaultRole**.
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Specifies whether to enable TDE. Set the value to **Enabled**.
         * <p>
         * 
         * > TDE cannot be disabled after it is enabled. Before you enable it, evaluate whether this feature affects your business. For more information, see [Enable TDE](~~265913~~).
         */
        public Builder TDEStatus(String TDEStatus) {
            this.putQueryParameter("TDEStatus", TDEStatus);
            this.TDEStatus = TDEStatus;
            return this;
        }

        @Override
        public ModifyInstanceTDERequest build() {
            return new ModifyInstanceTDERequest(this);
        } 

    } 

}
