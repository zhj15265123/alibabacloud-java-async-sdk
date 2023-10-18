// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAIImageAuditJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAIImageAuditJobRequest</p>
 */
public class SubmitAIImageAuditJobRequest extends Request {
    @Query
    @NameInMap("MediaAuditConfiguration")
    private String mediaAuditConfiguration;

    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
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
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private SubmitAIImageAuditJobRequest(Builder builder) {
        super(builder);
        this.mediaAuditConfiguration = builder.mediaAuditConfiguration;
        this.mediaId = builder.mediaId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIImageAuditJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaAuditConfiguration
     */
    public String getMediaAuditConfiguration() {
        return this.mediaAuditConfiguration;
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<SubmitAIImageAuditJobRequest, Builder> {
        private String mediaAuditConfiguration; 
        private String mediaId; 
        private String ownerAccount; 
        private String ownerId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAIImageAuditJobRequest request) {
            super(request);
            this.mediaAuditConfiguration = request.mediaAuditConfiguration;
            this.mediaId = request.mediaId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateId = request.templateId;
        } 

        /**
         * The configuration information about the review task.
         * <p>
         * 
         * *   Other configuration items of the review task. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.
         * *   If you want to adjust moderation policies and rules based on ResourceType, submit a ticket to request technical support.
         * *   The value of ResourceType can contain only letters, digits, and underscores (\_).
         * 
         * >  You can specify a value for the ResourceType field based on the preceding limits. After you specify a value for the ResourceType field, you must submit a ticket. The value takes effect after Alibaba Cloud processes your ticket.
         */
        public Builder mediaAuditConfiguration(String mediaAuditConfiguration) {
            this.putQueryParameter("MediaAuditConfiguration", mediaAuditConfiguration);
            this.mediaAuditConfiguration = mediaAuditConfiguration;
            return this;
        }

        /**
         * The ID of the image.
         * <p>
         * 
         * The unique ID of the image is returned after the image is uploaded to ApsaraVideo VOD.
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
         * The ID of the review template.
         * <p>
         * 
         * If you want to use an AI template, you can call the following operations:
         * 
         * *   [ListAITemplate](~~102936~~)
         * *   [AddAITemplate](~~102930~~)
         * *   [GetAITemplate](~~102933~~)
         * *   [SetDefaultAITemplate](~~102937~~)
         * 
         * If you do not specify this parameter, the ID of the default AI template for automated review is used.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public SubmitAIImageAuditJobRequest build() {
            return new SubmitAIImageAuditJobRequest(this);
        } 

    } 

}
