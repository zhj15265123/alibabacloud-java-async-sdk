// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCACertificateNameRequest} extends {@link RequestModel}
 *
 * <p>SetCACertificateNameRequest</p>
 */
public class SetCACertificateNameRequest extends Request {
    @Query
    @NameInMap("CACertificateId")
    @Validation(required = true)
    private String CACertificateId;

    @Query
    @NameInMap("CACertificateName")
    @Validation(required = true)
    private String CACertificateName;

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

    private SetCACertificateNameRequest(Builder builder) {
        super(builder);
        this.CACertificateId = builder.CACertificateId;
        this.CACertificateName = builder.CACertificateName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCACertificateNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CACertificateId
     */
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    /**
     * @return CACertificateName
     */
    public String getCACertificateName() {
        return this.CACertificateName;
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

    public static final class Builder extends Request.Builder<SetCACertificateNameRequest, Builder> {
        private String CACertificateId; 
        private String CACertificateName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SetCACertificateNameRequest response) {
            super(response);
            this.CACertificateId = response.CACertificateId;
            this.CACertificateName = response.CACertificateName;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * CACertificateId.
         */
        public Builder CACertificateId(String CACertificateId) {
            this.putQueryParameter("CACertificateId", CACertificateId);
            this.CACertificateId = CACertificateId;
            return this;
        }

        /**
         * CACertificateName.
         */
        public Builder CACertificateName(String CACertificateName) {
            this.putQueryParameter("CACertificateName", CACertificateName);
            this.CACertificateName = CACertificateName;
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
        public SetCACertificateNameRequest build() {
            return new SetCACertificateNameRequest(this);
        } 

    } 

}
