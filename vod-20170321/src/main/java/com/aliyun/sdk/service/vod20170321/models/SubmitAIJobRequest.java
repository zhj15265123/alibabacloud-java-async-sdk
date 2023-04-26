// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAIJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAIJobRequest</p>
 */
public class SubmitAIJobRequest extends Request {
    @Query
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    @Query
    @NameInMap("Types")
    private String types;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitAIJobRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.mediaId = builder.mediaId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.types = builder.types;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
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
    public String getOwnerId() {
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
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitAIJobRequest, Builder> {
        private String config; 
        private String mediaId; 
        private String ownerAccount; 
        private String ownerId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String types; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAIJobRequest request) {
            super(request);
            this.config = request.config;
            this.mediaId = request.mediaId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.types = request.types;
            this.userData = request.userData;
        } 

        /**
         * The configurations of the AI job. The value is a JSON string.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The type of the AI job. Separate multiple types with commas (,). Valid values:
         * <p>
         * 
         * *   **AIMediaDNA**: The media fingerprinting job.
         * *   **AIVideoTag**: The smart tagging job.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
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
        public Builder ownerId(String ownerId) {
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
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the AI job.
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * The custom settings. The value is a JSON string. For more information, see [Request parameters](~~86952#h2--userdata-div-id-userdata-div-3~~).
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitAIJobRequest build() {
            return new SubmitAIJobRequest(this);
        } 

    } 

}
