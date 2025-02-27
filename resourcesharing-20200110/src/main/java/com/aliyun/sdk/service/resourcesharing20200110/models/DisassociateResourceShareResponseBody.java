// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociateResourceShareResponseBody} extends {@link TeaModel}
 *
 * <p>DisassociateResourceShareResponseBody</p>
 */
public class DisassociateResourceShareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceShareAssociations")
    private java.util.List < ResourceShareAssociations> resourceShareAssociations;

    private DisassociateResourceShareResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceShareAssociations = builder.resourceShareAssociations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateResourceShareResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceShareAssociations
     */
    public java.util.List < ResourceShareAssociations> getResourceShareAssociations() {
        return this.resourceShareAssociations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceShareAssociations> resourceShareAssociations; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the entities that are associated with the resource share.
         */
        public Builder resourceShareAssociations(java.util.List < ResourceShareAssociations> resourceShareAssociations) {
            this.resourceShareAssociations = resourceShareAssociations;
            return this;
        }

        public DisassociateResourceShareResponseBody build() {
            return new DisassociateResourceShareResponseBody(this);
        } 

    } 

    public static class ResourceShareAssociations extends TeaModel {
        @NameInMap("AssociationStatus")
        private String associationStatus;

        @NameInMap("AssociationStatusMessage")
        private String associationStatusMessage;

        @NameInMap("AssociationType")
        private String associationType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("ResourceShareId")
        private String resourceShareId;

        @NameInMap("ResourceShareName")
        private String resourceShareName;

        @NameInMap("UpdateTime")
        private String updateTime;

        private ResourceShareAssociations(Builder builder) {
            this.associationStatus = builder.associationStatus;
            this.associationStatusMessage = builder.associationStatusMessage;
            this.associationType = builder.associationType;
            this.createTime = builder.createTime;
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.resourceShareId = builder.resourceShareId;
            this.resourceShareName = builder.resourceShareName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceShareAssociations create() {
            return builder().build();
        }

        /**
         * @return associationStatus
         */
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        /**
         * @return associationStatusMessage
         */
        public String getAssociationStatusMessage() {
            return this.associationStatusMessage;
        }

        /**
         * @return associationType
         */
        public String getAssociationType() {
            return this.associationType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return resourceShareId
         */
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        /**
         * @return resourceShareName
         */
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String associationStatus; 
            private String associationStatusMessage; 
            private String associationType; 
            private String createTime; 
            private String entityId; 
            private String entityType; 
            private String resourceShareId; 
            private String resourceShareName; 
            private String updateTime; 

            /**
             * The association status. Valid values:
             * <p>
             * 
             * *   Associating: The entity is being associated.
             * *   Associated: The entity is associated.
             * *   Failed: The entity fails to be associated.
             * *   Disassociating: The entity is being disassociated.
             * *   Disassociated: The entity is disassociated.
             * 
             * >  The system deletes the records of entities in the `Failed` or `Disassociated` state within 48 hours to 96 hours.
             */
            public Builder associationStatus(String associationStatus) {
                this.associationStatus = associationStatus;
                return this;
            }

            /**
             * The cause of the disassociation failure.
             */
            public Builder associationStatusMessage(String associationStatusMessage) {
                this.associationStatusMessage = associationStatusMessage;
                return this;
            }

            /**
             * The association type. Valid values:
             * <p>
             * 
             * *   Resource
             * *   Target
             */
            public Builder associationType(String associationType) {
                this.associationType = associationType;
                return this;
            }

            /**
             * The time when the disassociation of the entity was performed. The value of this parameter depends on the value of the AssociationType parameter:
             * <p>
             * 
             * *   If the value of `AssociationType` is `Resource`, the value of this parameter is the time when the resource was disassociated from the resource share.
             * *   If the value of `AssociationType` is `Target`, the value of this parameter is the time when the principal was disassociated from the resource share.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:
             * <p>
             * 
             * *   If the value of `AssociationType` is `Resource`, the value of this parameter is the ID of the resource.
             * *   If the value of `AssociationType` is `Target`, the value of this parameter is the ID of the resource directory, folder, or member.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:
             * <p>
             * 
             * *   If the value of AssociationType is Resource, the value of this parameter is the type of the resource. For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).
             * *   If the value of AssociationType is Target, the value of this parameter is Account.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * The ID of the resource share.
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * The name of the resource share.
             */
            public Builder resourceShareName(String resourceShareName) {
                this.resourceShareName = resourceShareName;
                return this;
            }

            /**
             * The time when the disassociation of the entity was updated. The value of this parameter depends on the value of the AssociationType parameter:
             * <p>
             * 
             * *   If the value of `AssociationType` is `Resource`, the value of this parameter is the time when the disassociation of the resource was updated.
             * *   If the value of `AssociationType` is `Target`, the value of this parameter is the time when the disassociation of the principal was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResourceShareAssociations build() {
                return new ResourceShareAssociations(this);
            } 

        } 

    }
}
