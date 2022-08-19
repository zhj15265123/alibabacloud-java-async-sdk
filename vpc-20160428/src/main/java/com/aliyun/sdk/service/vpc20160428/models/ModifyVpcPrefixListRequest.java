// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcPrefixListRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcPrefixListRequest</p>
 */
public class ModifyVpcPrefixListRequest extends Request {
    @Query
    @NameInMap("AddPrefixListEntry")
    private java.util.List < AddPrefixListEntry> addPrefixListEntry;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("MaxEntries")
    private Integer maxEntries;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PrefixListDescription")
    private String prefixListDescription;

    @Query
    @NameInMap("PrefixListId")
    @Validation(required = true)
    private String prefixListId;

    @Query
    @NameInMap("PrefixListName")
    private String prefixListName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemovePrefixListEntry")
    private java.util.List < RemovePrefixListEntry> removePrefixListEntry;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyVpcPrefixListRequest(Builder builder) {
        super(builder);
        this.addPrefixListEntry = builder.addPrefixListEntry;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.maxEntries = builder.maxEntries;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.prefixListDescription = builder.prefixListDescription;
        this.prefixListId = builder.prefixListId;
        this.prefixListName = builder.prefixListName;
        this.regionId = builder.regionId;
        this.removePrefixListEntry = builder.removePrefixListEntry;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcPrefixListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addPrefixListEntry
     */
    public java.util.List < AddPrefixListEntry> getAddPrefixListEntry() {
        return this.addPrefixListEntry;
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
     * @return maxEntries
     */
    public Integer getMaxEntries() {
        return this.maxEntries;
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
     * @return prefixListDescription
     */
    public String getPrefixListDescription() {
        return this.prefixListDescription;
    }

    /**
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * @return prefixListName
     */
    public String getPrefixListName() {
        return this.prefixListName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return removePrefixListEntry
     */
    public java.util.List < RemovePrefixListEntry> getRemovePrefixListEntry() {
        return this.removePrefixListEntry;
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

    public static final class Builder extends Request.Builder<ModifyVpcPrefixListRequest, Builder> {
        private java.util.List < AddPrefixListEntry> addPrefixListEntry; 
        private String clientToken; 
        private Boolean dryRun; 
        private Integer maxEntries; 
        private String ownerAccount; 
        private Long ownerId; 
        private String prefixListDescription; 
        private String prefixListId; 
        private String prefixListName; 
        private String regionId; 
        private java.util.List < RemovePrefixListEntry> removePrefixListEntry; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcPrefixListRequest request) {
            super(request);
            this.addPrefixListEntry = request.addPrefixListEntry;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.maxEntries = request.maxEntries;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.prefixListDescription = request.prefixListDescription;
            this.prefixListId = request.prefixListId;
            this.prefixListName = request.prefixListName;
            this.regionId = request.regionId;
            this.removePrefixListEntry = request.removePrefixListEntry;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * AddPrefixListEntry.
         */
        public Builder addPrefixListEntry(java.util.List < AddPrefixListEntry> addPrefixListEntry) {
            this.putQueryParameter("AddPrefixListEntry", addPrefixListEntry);
            this.addPrefixListEntry = addPrefixListEntry;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * MaxEntries.
         */
        public Builder maxEntries(Integer maxEntries) {
            this.putQueryParameter("MaxEntries", maxEntries);
            this.maxEntries = maxEntries;
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
         * PrefixListDescription.
         */
        public Builder prefixListDescription(String prefixListDescription) {
            this.putQueryParameter("PrefixListDescription", prefixListDescription);
            this.prefixListDescription = prefixListDescription;
            return this;
        }

        /**
         * PrefixListId.
         */
        public Builder prefixListId(String prefixListId) {
            this.putQueryParameter("PrefixListId", prefixListId);
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * PrefixListName.
         */
        public Builder prefixListName(String prefixListName) {
            this.putQueryParameter("PrefixListName", prefixListName);
            this.prefixListName = prefixListName;
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
         * RemovePrefixListEntry.
         */
        public Builder removePrefixListEntry(java.util.List < RemovePrefixListEntry> removePrefixListEntry) {
            this.putQueryParameter("RemovePrefixListEntry", removePrefixListEntry);
            this.removePrefixListEntry = removePrefixListEntry;
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
        public ModifyVpcPrefixListRequest build() {
            return new ModifyVpcPrefixListRequest(this);
        } 

    } 

    public static class AddPrefixListEntry extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("Description")
        private String description;

        private AddPrefixListEntry(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddPrefixListEntry create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String cidr; 
            private String description; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public AddPrefixListEntry build() {
                return new AddPrefixListEntry(this);
            } 

        } 

    }
    public static class RemovePrefixListEntry extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("Description")
        private String description;

        private RemovePrefixListEntry(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovePrefixListEntry create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String cidr; 
            private String description; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public RemovePrefixListEntry build() {
                return new RemovePrefixListEntry(this);
            } 

        } 

    }
}
