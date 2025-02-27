// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private ListProjectsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class IpWhiteList extends TeaModel {
        @NameInMap("ipList")
        private String ipList;

        @NameInMap("vpcIpList")
        private String vpcIpList;

        private IpWhiteList(Builder builder) {
            this.ipList = builder.ipList;
            this.vpcIpList = builder.vpcIpList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpWhiteList create() {
            return builder().build();
        }

        /**
         * @return ipList
         */
        public String getIpList() {
            return this.ipList;
        }

        /**
         * @return vpcIpList
         */
        public String getVpcIpList() {
            return this.vpcIpList;
        }

        public static final class Builder {
            private String ipList; 
            private String vpcIpList; 

            /**
             * ipList.
             */
            public Builder ipList(String ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * vpcIpList.
             */
            public Builder vpcIpList(String vpcIpList) {
                this.vpcIpList = vpcIpList;
                return this;
            }

            public IpWhiteList build() {
                return new IpWhiteList(this);
            } 

        } 

    }
    public static class Encryption extends TeaModel {
        @NameInMap("algorithm")
        private String algorithm;

        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("key")
        private String key;

        private Encryption(Builder builder) {
            this.algorithm = builder.algorithm;
            this.enable = builder.enable;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Encryption create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String algorithm; 
            private Boolean enable; 
            private String key; 

            /**
             * algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Encryption build() {
                return new Encryption(this);
            } 

        } 

    }
    public static class TableLifecycle extends TeaModel {
        @NameInMap("type")
        private String type;

        @NameInMap("value")
        private String value;

        private TableLifecycle(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableLifecycle create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TableLifecycle build() {
                return new TableLifecycle(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @NameInMap("allowFullScan")
        private Boolean allowFullScan;

        @NameInMap("enableDecimal2")
        private Boolean enableDecimal2;

        @NameInMap("enableTunnelQuotaRoute")
        private Boolean enableTunnelQuotaRoute;

        @NameInMap("encryption")
        private Encryption encryption;

        @NameInMap("retentionDays")
        private Long retentionDays;

        @NameInMap("sqlMeteringMax")
        private String sqlMeteringMax;

        @NameInMap("tableLifecycle")
        private TableLifecycle tableLifecycle;

        @NameInMap("timezone")
        private String timezone;

        @NameInMap("tunnelQuota")
        private String tunnelQuota;

        @NameInMap("typeSystem")
        private String typeSystem;

        private Properties(Builder builder) {
            this.allowFullScan = builder.allowFullScan;
            this.enableDecimal2 = builder.enableDecimal2;
            this.enableTunnelQuotaRoute = builder.enableTunnelQuotaRoute;
            this.encryption = builder.encryption;
            this.retentionDays = builder.retentionDays;
            this.sqlMeteringMax = builder.sqlMeteringMax;
            this.tableLifecycle = builder.tableLifecycle;
            this.timezone = builder.timezone;
            this.tunnelQuota = builder.tunnelQuota;
            this.typeSystem = builder.typeSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return allowFullScan
         */
        public Boolean getAllowFullScan() {
            return this.allowFullScan;
        }

        /**
         * @return enableDecimal2
         */
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
        }

        /**
         * @return enableTunnelQuotaRoute
         */
        public Boolean getEnableTunnelQuotaRoute() {
            return this.enableTunnelQuotaRoute;
        }

        /**
         * @return encryption
         */
        public Encryption getEncryption() {
            return this.encryption;
        }

        /**
         * @return retentionDays
         */
        public Long getRetentionDays() {
            return this.retentionDays;
        }

        /**
         * @return sqlMeteringMax
         */
        public String getSqlMeteringMax() {
            return this.sqlMeteringMax;
        }

        /**
         * @return tableLifecycle
         */
        public TableLifecycle getTableLifecycle() {
            return this.tableLifecycle;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return tunnelQuota
         */
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

        /**
         * @return typeSystem
         */
        public String getTypeSystem() {
            return this.typeSystem;
        }

        public static final class Builder {
            private Boolean allowFullScan; 
            private Boolean enableDecimal2; 
            private Boolean enableTunnelQuotaRoute; 
            private Encryption encryption; 
            private Long retentionDays; 
            private String sqlMeteringMax; 
            private TableLifecycle tableLifecycle; 
            private String timezone; 
            private String tunnelQuota; 
            private String typeSystem; 

            /**
             * allowFullScan.
             */
            public Builder allowFullScan(Boolean allowFullScan) {
                this.allowFullScan = allowFullScan;
                return this;
            }

            /**
             * enableDecimal2.
             */
            public Builder enableDecimal2(Boolean enableDecimal2) {
                this.enableDecimal2 = enableDecimal2;
                return this;
            }

            /**
             * enableTunnelQuotaRoute.
             */
            public Builder enableTunnelQuotaRoute(Boolean enableTunnelQuotaRoute) {
                this.enableTunnelQuotaRoute = enableTunnelQuotaRoute;
                return this;
            }

            /**
             * encryption.
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * retentionDays.
             */
            public Builder retentionDays(Long retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * sqlMeteringMax.
             */
            public Builder sqlMeteringMax(String sqlMeteringMax) {
                this.sqlMeteringMax = sqlMeteringMax;
                return this;
            }

            /**
             * tableLifecycle.
             */
            public Builder tableLifecycle(TableLifecycle tableLifecycle) {
                this.tableLifecycle = tableLifecycle;
                return this;
            }

            /**
             * timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * tunnelQuota.
             */
            public Builder tunnelQuota(String tunnelQuota) {
                this.tunnelQuota = tunnelQuota;
                return this;
            }

            /**
             * typeSystem.
             */
            public Builder typeSystem(String typeSystem) {
                this.typeSystem = typeSystem;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class SaleTag extends TeaModel {
        @NameInMap("resourceId")
        private String resourceId;

        @NameInMap("resourceType")
        private String resourceType;

        private SaleTag(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleTag create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public SaleTag build() {
                return new SaleTag(this);
            } 

        } 

    }
    public static class ProjectProtection extends TeaModel {
        @NameInMap("exceptionPolicy")
        private String exceptionPolicy;

        @NameInMap("protected")
        private Boolean _protected;

        private ProjectProtection(Builder builder) {
            this.exceptionPolicy = builder.exceptionPolicy;
            this._protected = builder._protected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectProtection create() {
            return builder().build();
        }

        /**
         * @return exceptionPolicy
         */
        public String getExceptionPolicy() {
            return this.exceptionPolicy;
        }

        /**
         * @return _protected
         */
        public Boolean get_protected() {
            return this._protected;
        }

        public static final class Builder {
            private String exceptionPolicy; 
            private Boolean _protected; 

            /**
             * exceptionPolicy.
             */
            public Builder exceptionPolicy(String exceptionPolicy) {
                this.exceptionPolicy = exceptionPolicy;
                return this;
            }

            /**
             * protected.
             */
            public Builder _protected(Boolean _protected) {
                this._protected = _protected;
                return this;
            }

            public ProjectProtection build() {
                return new ProjectProtection(this);
            } 

        } 

    }
    public static class SecurityProperties extends TeaModel {
        @NameInMap("enableDownloadPrivilege")
        private Boolean enableDownloadPrivilege;

        @NameInMap("labelSecurity")
        private Boolean labelSecurity;

        @NameInMap("objectCreatorHasAccessPermission")
        private Boolean objectCreatorHasAccessPermission;

        @NameInMap("objectCreatorHasGrantPermission")
        private Boolean objectCreatorHasGrantPermission;

        @NameInMap("projectProtection")
        private ProjectProtection projectProtection;

        @NameInMap("usingAcl")
        private Boolean usingAcl;

        @NameInMap("usingPolicy")
        private Boolean usingPolicy;

        private SecurityProperties(Builder builder) {
            this.enableDownloadPrivilege = builder.enableDownloadPrivilege;
            this.labelSecurity = builder.labelSecurity;
            this.objectCreatorHasAccessPermission = builder.objectCreatorHasAccessPermission;
            this.objectCreatorHasGrantPermission = builder.objectCreatorHasGrantPermission;
            this.projectProtection = builder.projectProtection;
            this.usingAcl = builder.usingAcl;
            this.usingPolicy = builder.usingPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityProperties create() {
            return builder().build();
        }

        /**
         * @return enableDownloadPrivilege
         */
        public Boolean getEnableDownloadPrivilege() {
            return this.enableDownloadPrivilege;
        }

        /**
         * @return labelSecurity
         */
        public Boolean getLabelSecurity() {
            return this.labelSecurity;
        }

        /**
         * @return objectCreatorHasAccessPermission
         */
        public Boolean getObjectCreatorHasAccessPermission() {
            return this.objectCreatorHasAccessPermission;
        }

        /**
         * @return objectCreatorHasGrantPermission
         */
        public Boolean getObjectCreatorHasGrantPermission() {
            return this.objectCreatorHasGrantPermission;
        }

        /**
         * @return projectProtection
         */
        public ProjectProtection getProjectProtection() {
            return this.projectProtection;
        }

        /**
         * @return usingAcl
         */
        public Boolean getUsingAcl() {
            return this.usingAcl;
        }

        /**
         * @return usingPolicy
         */
        public Boolean getUsingPolicy() {
            return this.usingPolicy;
        }

        public static final class Builder {
            private Boolean enableDownloadPrivilege; 
            private Boolean labelSecurity; 
            private Boolean objectCreatorHasAccessPermission; 
            private Boolean objectCreatorHasGrantPermission; 
            private ProjectProtection projectProtection; 
            private Boolean usingAcl; 
            private Boolean usingPolicy; 

            /**
             * enableDownloadPrivilege.
             */
            public Builder enableDownloadPrivilege(Boolean enableDownloadPrivilege) {
                this.enableDownloadPrivilege = enableDownloadPrivilege;
                return this;
            }

            /**
             * labelSecurity.
             */
            public Builder labelSecurity(Boolean labelSecurity) {
                this.labelSecurity = labelSecurity;
                return this;
            }

            /**
             * objectCreatorHasAccessPermission.
             */
            public Builder objectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
                this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
                return this;
            }

            /**
             * objectCreatorHasGrantPermission.
             */
            public Builder objectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
                this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
                return this;
            }

            /**
             * projectProtection.
             */
            public Builder projectProtection(ProjectProtection projectProtection) {
                this.projectProtection = projectProtection;
                return this;
            }

            /**
             * usingAcl.
             */
            public Builder usingAcl(Boolean usingAcl) {
                this.usingAcl = usingAcl;
                return this;
            }

            /**
             * usingPolicy.
             */
            public Builder usingPolicy(Boolean usingPolicy) {
                this.usingPolicy = usingPolicy;
                return this;
            }

            public SecurityProperties build() {
                return new SecurityProperties(this);
            } 

        } 

    }
    public static class Projects extends TeaModel {
        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("comment")
        private String comment;

        @NameInMap("costStorage")
        private String costStorage;

        @NameInMap("defaultQuota")
        private String defaultQuota;

        @NameInMap("ipWhiteList")
        private IpWhiteList ipWhiteList;

        @NameInMap("name")
        private String name;

        @NameInMap("owner")
        private String owner;

        @NameInMap("properties")
        private Properties properties;

        @NameInMap("saleTag")
        private SaleTag saleTag;

        @NameInMap("securityProperties")
        private SecurityProperties securityProperties;

        @NameInMap("status")
        private String status;

        @NameInMap("type")
        private String type;

        private Projects(Builder builder) {
            this.tags = builder.tags;
            this.comment = builder.comment;
            this.costStorage = builder.costStorage;
            this.defaultQuota = builder.defaultQuota;
            this.ipWhiteList = builder.ipWhiteList;
            this.name = builder.name;
            this.owner = builder.owner;
            this.properties = builder.properties;
            this.saleTag = builder.saleTag;
            this.securityProperties = builder.securityProperties;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return costStorage
         */
        public String getCostStorage() {
            return this.costStorage;
        }

        /**
         * @return defaultQuota
         */
        public String getDefaultQuota() {
            return this.defaultQuota;
        }

        /**
         * @return ipWhiteList
         */
        public IpWhiteList getIpWhiteList() {
            return this.ipWhiteList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return saleTag
         */
        public SaleTag getSaleTag() {
            return this.saleTag;
        }

        /**
         * @return securityProperties
         */
        public SecurityProperties getSecurityProperties() {
            return this.securityProperties;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Tags> tags; 
            private String comment; 
            private String costStorage; 
            private String defaultQuota; 
            private IpWhiteList ipWhiteList; 
            private String name; 
            private String owner; 
            private Properties properties; 
            private SaleTag saleTag; 
            private SecurityProperties securityProperties; 
            private String status; 
            private String type; 

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * costStorage.
             */
            public Builder costStorage(String costStorage) {
                this.costStorage = costStorage;
                return this;
            }

            /**
             * defaultQuota.
             */
            public Builder defaultQuota(String defaultQuota) {
                this.defaultQuota = defaultQuota;
                return this;
            }

            /**
             * ipWhiteList.
             */
            public Builder ipWhiteList(IpWhiteList ipWhiteList) {
                this.ipWhiteList = ipWhiteList;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * properties.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * saleTag.
             */
            public Builder saleTag(SaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * securityProperties.
             */
            public Builder securityProperties(SecurityProperties securityProperties) {
                this.securityProperties = securityProperties;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("marker")
        private String marker;

        @NameInMap("maxItem")
        private Integer maxItem;

        @NameInMap("projects")
        private java.util.List < Projects> projects;

        private Data(Builder builder) {
            this.nextToken = builder.nextToken;
            this.marker = builder.marker;
            this.maxItem = builder.maxItem;
            this.projects = builder.projects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return maxItem
         */
        public Integer getMaxItem() {
            return this.maxItem;
        }

        /**
         * @return projects
         */
        public java.util.List < Projects> getProjects() {
            return this.projects;
        }

        public static final class Builder {
            private String nextToken; 
            private String marker; 
            private Integer maxItem; 
            private java.util.List < Projects> projects; 

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * marker.
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * maxItem.
             */
            public Builder maxItem(Integer maxItem) {
                this.maxItem = maxItem;
                return this;
            }

            /**
             * projects.
             */
            public Builder projects(java.util.List < Projects> projects) {
                this.projects = projects;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
