// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentsResponseBody</p>
 */
public class ListEnvironmentsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListEnvironmentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Status code: 200 indicates success.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEnvironmentsResponseBody build() {
            return new ListEnvironmentsResponseBody(this);
        } 

    } 

    public static class Addons extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Description")
        private String description;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("Name")
        private String name;

        private Addons(Builder builder) {
            this.alias = builder.alias;
            this.description = builder.description;
            this.icon = builder.icon;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String alias; 
            private String description; 
            private String icon; 
            private String name; 

            /**
             * Alias of Addon.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Description of Addon.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Icon of Addon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Name of Addon.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Addons build() {
                return new Addons(this);
            } 

        } 

    }
    public static class Features extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Description")
        private String description;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("Name")
        private String name;

        private Features(Builder builder) {
            this.alias = builder.alias;
            this.description = builder.description;
            this.icon = builder.icon;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String alias; 
            private String description; 
            private String icon; 
            private String name; 

            /**
             * Alias of Feature.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Description of Feature.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Icon address.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Name of Feature.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Environments extends TeaModel {
        @NameInMap("Addons")
        private java.util.List < Addons> addons;

        @NameInMap("BindResourceId")
        private String bindResourceId;

        @NameInMap("BindResourceProfile")
        private String bindResourceProfile;

        @NameInMap("BindResourceType")
        private String bindResourceType;

        @NameInMap("BindVpcCidr")
        private String bindVpcCidr;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreatedUserId")
        private String createdUserId;

        @NameInMap("EnvironmentId")
        private String environmentId;

        @NameInMap("EnvironmentName")
        private String environmentName;

        @NameInMap("EnvironmentType")
        private String environmentType;

        @NameInMap("Features")
        private java.util.List < Features> features;

        @NameInMap("GrafanaDatasourceUid")
        private String grafanaDatasourceUid;

        @NameInMap("GrafanaFolderTitle")
        private String grafanaFolderTitle;

        @NameInMap("GrafanaFolderUid")
        private String grafanaFolderUid;

        @NameInMap("LatestReleaseCreateTime")
        private String latestReleaseCreateTime;

        @NameInMap("PrometheusId")
        private Long prometheusId;

        @NameInMap("PrometheusInstanceId")
        private String prometheusInstanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReleaseCount")
        private Integer releaseCount;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UserId")
        private String userId;

        private Environments(Builder builder) {
            this.addons = builder.addons;
            this.bindResourceId = builder.bindResourceId;
            this.bindResourceProfile = builder.bindResourceProfile;
            this.bindResourceType = builder.bindResourceType;
            this.bindVpcCidr = builder.bindVpcCidr;
            this.createTime = builder.createTime;
            this.createdUserId = builder.createdUserId;
            this.environmentId = builder.environmentId;
            this.environmentName = builder.environmentName;
            this.environmentType = builder.environmentType;
            this.features = builder.features;
            this.grafanaDatasourceUid = builder.grafanaDatasourceUid;
            this.grafanaFolderTitle = builder.grafanaFolderTitle;
            this.grafanaFolderUid = builder.grafanaFolderUid;
            this.latestReleaseCreateTime = builder.latestReleaseCreateTime;
            this.prometheusId = builder.prometheusId;
            this.prometheusInstanceId = builder.prometheusInstanceId;
            this.regionId = builder.regionId;
            this.releaseCount = builder.releaseCount;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environments create() {
            return builder().build();
        }

        /**
         * @return addons
         */
        public java.util.List < Addons> getAddons() {
            return this.addons;
        }

        /**
         * @return bindResourceId
         */
        public String getBindResourceId() {
            return this.bindResourceId;
        }

        /**
         * @return bindResourceProfile
         */
        public String getBindResourceProfile() {
            return this.bindResourceProfile;
        }

        /**
         * @return bindResourceType
         */
        public String getBindResourceType() {
            return this.bindResourceType;
        }

        /**
         * @return bindVpcCidr
         */
        public String getBindVpcCidr() {
            return this.bindVpcCidr;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdUserId
         */
        public String getCreatedUserId() {
            return this.createdUserId;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return environmentName
         */
        public String getEnvironmentName() {
            return this.environmentName;
        }

        /**
         * @return environmentType
         */
        public String getEnvironmentType() {
            return this.environmentType;
        }

        /**
         * @return features
         */
        public java.util.List < Features> getFeatures() {
            return this.features;
        }

        /**
         * @return grafanaDatasourceUid
         */
        public String getGrafanaDatasourceUid() {
            return this.grafanaDatasourceUid;
        }

        /**
         * @return grafanaFolderTitle
         */
        public String getGrafanaFolderTitle() {
            return this.grafanaFolderTitle;
        }

        /**
         * @return grafanaFolderUid
         */
        public String getGrafanaFolderUid() {
            return this.grafanaFolderUid;
        }

        /**
         * @return latestReleaseCreateTime
         */
        public String getLatestReleaseCreateTime() {
            return this.latestReleaseCreateTime;
        }

        /**
         * @return prometheusId
         */
        public Long getPrometheusId() {
            return this.prometheusId;
        }

        /**
         * @return prometheusInstanceId
         */
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return releaseCount
         */
        public Integer getReleaseCount() {
            return this.releaseCount;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List < Addons> addons; 
            private String bindResourceId; 
            private String bindResourceProfile; 
            private String bindResourceType; 
            private String bindVpcCidr; 
            private String createTime; 
            private String createdUserId; 
            private String environmentId; 
            private String environmentName; 
            private String environmentType; 
            private java.util.List < Features> features; 
            private String grafanaDatasourceUid; 
            private String grafanaFolderTitle; 
            private String grafanaFolderUid; 
            private String latestReleaseCreateTime; 
            private Long prometheusId; 
            private String prometheusInstanceId; 
            private String regionId; 
            private Integer releaseCount; 
            private String resourceGroupId; 
            private java.util.List < Tags> tags; 
            private String userId; 

            /**
             * Addon list.
             */
            public Builder addons(java.util.List < Addons> addons) {
                this.addons = addons;
                return this;
            }

            /**
             * Id of the resource to be bound.
             */
            public Builder bindResourceId(String bindResourceId) {
                this.bindResourceId = bindResourceId;
                return this;
            }

            /**
             * Profile of the resource to be bound.
             */
            public Builder bindResourceProfile(String bindResourceProfile) {
                this.bindResourceProfile = bindResourceProfile;
                return this;
            }

            /**
             * Type of the resource to be bound.
             */
            public Builder bindResourceType(String bindResourceType) {
                this.bindResourceType = bindResourceType;
                return this;
            }

            /**
             * Bound Vpc IP Cidr.
             */
            public Builder bindVpcCidr(String bindVpcCidr) {
                this.bindVpcCidr = bindVpcCidr;
                return this;
            }

            /**
             * Create time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Created User ID.
             */
            public Builder createdUserId(String createdUserId) {
                this.createdUserId = createdUserId;
                return this;
            }

            /**
             * Environment ID.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * Environment name.
             */
            public Builder environmentName(String environmentName) {
                this.environmentName = environmentName;
                return this;
            }

            /**
             * Environment type.
             */
            public Builder environmentType(String environmentType) {
                this.environmentType = environmentType;
                return this;
            }

            /**
             * Featyre list.
             */
            public Builder features(java.util.List < Features> features) {
                this.features = features;
                return this;
            }

            /**
             * Grafana datasource UID.
             */
            public Builder grafanaDatasourceUid(String grafanaDatasourceUid) {
                this.grafanaDatasourceUid = grafanaDatasourceUid;
                return this;
            }

            /**
             * Grafana folder title.
             */
            public Builder grafanaFolderTitle(String grafanaFolderTitle) {
                this.grafanaFolderTitle = grafanaFolderTitle;
                return this;
            }

            /**
             * Grafana folder UID.
             */
            public Builder grafanaFolderUid(String grafanaFolderUid) {
                this.grafanaFolderUid = grafanaFolderUid;
                return this;
            }

            /**
             * Latest Release create time.
             */
            public Builder latestReleaseCreateTime(String latestReleaseCreateTime) {
                this.latestReleaseCreateTime = latestReleaseCreateTime;
                return this;
            }

            /**
             * Prometheus ID.
             */
            public Builder prometheusId(Long prometheusId) {
                this.prometheusId = prometheusId;
                return this;
            }

            /**
             * Prometheus instance ID.
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Number of Release.
             */
            public Builder releaseCount(Integer releaseCount) {
                this.releaseCount = releaseCount;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * User ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Environments build() {
                return new Environments(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Environments")
        private java.util.List < Environments> environments;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.environments = builder.environments;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return environments
         */
        public java.util.List < Environments> getEnvironments() {
            return this.environments;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Environments> environments; 
            private Long total; 

            /**
             * Environment list.
             */
            public Builder environments(java.util.List < Environments> environments) {
                this.environments = environments;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
