// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceTypesResponseBody</p>
 */
public class ListResourceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceTypeSummaries")
    private java.util.List < ResourceTypeSummaries> resourceTypeSummaries;

    @NameInMap("ResourceTypes")
    private java.util.List < String > resourceTypes;

    private ListResourceTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceTypeSummaries = builder.resourceTypeSummaries;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceTypeSummaries
     */
    public java.util.List < ResourceTypeSummaries> getResourceTypeSummaries() {
        return this.resourceTypeSummaries;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List < String > getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceTypeSummaries> resourceTypeSummaries; 
        private java.util.List < String > resourceTypes; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource type summaries.
         */
        public Builder resourceTypeSummaries(java.util.List < ResourceTypeSummaries> resourceTypeSummaries) {
            this.resourceTypeSummaries = resourceTypeSummaries;
            return this;
        }

        /**
         * The array of resource types.
         */
        public Builder resourceTypes(java.util.List < String > resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public ListResourceTypesResponseBody build() {
            return new ListResourceTypesResponseBody(this);
        } 

    } 

    public static class ResourceTypeSummaries extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DefaultVersionId")
        private String defaultVersionId;

        @NameInMap("Description")
        private String description;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("LatestVersionId")
        private String latestVersionId;

        @NameInMap("Provider")
        private String provider;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("TotalVersionCount")
        private Integer totalVersionCount;

        @NameInMap("UpdateTime")
        private String updateTime;

        private ResourceTypeSummaries(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultVersionId = builder.defaultVersionId;
            this.description = builder.description;
            this.entityType = builder.entityType;
            this.latestVersionId = builder.latestVersionId;
            this.provider = builder.provider;
            this.resourceType = builder.resourceType;
            this.totalVersionCount = builder.totalVersionCount;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypeSummaries create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultVersionId
         */
        public String getDefaultVersionId() {
            return this.defaultVersionId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return latestVersionId
         */
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return totalVersionCount
         */
        public Integer getTotalVersionCount() {
            return this.totalVersionCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String defaultVersionId; 
            private String description; 
            private String entityType; 
            private String latestVersionId; 
            private String provider; 
            private String resourceType; 
            private Integer totalVersionCount; 
            private String updateTime; 

            /**
             * The creation time. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the default version.
             */
            public Builder defaultVersionId(String defaultVersionId) {
                this.defaultVersionId = defaultVersionId;
                return this;
            }

            /**
             * The description of the resource type.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The entity type. Valid values:
             * <p>
             * 
             * *   Resource: regular resources.
             * *   DataSource: DataSource resources.
             * *   Module: modules.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * The ID of the latest version.
             */
            public Builder latestVersionId(String latestVersionId) {
                this.latestVersionId = latestVersionId;
                return this;
            }

            /**
             * The provider of the resource type. Valid values:
             * <p>
             * 
             * *   ROS: The resource type is provided by ROS.
             * *   Self: The resource type is provided by you.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The number of versions.
             */
            public Builder totalVersionCount(Integer totalVersionCount) {
                this.totalVersionCount = totalVersionCount;
                return this;
            }

            /**
             * The update time. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResourceTypeSummaries build() {
                return new ResourceTypeSummaries(this);
            } 

        } 

    }
}
