// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6GatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpv6GatewaysResponseBody</p>
 */
public class DescribeIpv6GatewaysResponseBody extends TeaModel {
    @NameInMap("Ipv6Gateways")
    private Ipv6Gateways ipv6Gateways;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIpv6GatewaysResponseBody(Builder builder) {
        this.ipv6Gateways = builder.ipv6Gateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpv6GatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6Gateways
     */
    public Ipv6Gateways getIpv6Gateways() {
        return this.ipv6Gateways;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Ipv6Gateways ipv6Gateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the IPv6 gateway.
         */
        public Builder ipv6Gateways(Ipv6Gateways ipv6Gateways) {
            this.ipv6Gateways = ipv6Gateways;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIpv6GatewaysResponseBody build() {
            return new DescribeIpv6GatewaysResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Ipv6Gateway extends TeaModel {
        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("Ipv6GatewayId")
        private String ipv6GatewayId;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VpcId")
        private String vpcId;

        private Ipv6Gateway(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.ipv6GatewayId = builder.ipv6GatewayId;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Gateway create() {
            return builder().build();
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return ipv6GatewayId
         */
        public String getIpv6GatewayId() {
            return this.ipv6GatewayId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String businessStatus; 
            private String creationTime; 
            private String description; 
            private String expiredTime; 
            private String instanceChargeType; 
            private String ipv6GatewayId; 
            private String name; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private Tags tags; 
            private String vpcId; 

            /**
             * The state of the IPv6 gateway. Valid values:
             * <p>
             * 
             * *   **Normal**: The IPv6 gateway runs as expected.
             * *   **FinancialLocked:** The IPv6 gateway is locked due to overdue payments.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The time when the IPv6 gateway was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the IPv6 gateway.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the IPv6 gateway expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The billing method of the IPv6 gateway.
             * <p>
             * 
             * Only **PostPaid** may be returned, which indicates that the IPv6 gateway uses the pay-as-you-go billing method.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The ID of the IPv6 gateway.
             */
            public Builder ipv6GatewayId(String ipv6GatewayId) {
                this.ipv6GatewayId = ipv6GatewayId;
                return this;
            }

            /**
             * The name of the IPv6 gateway.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the region in which the IPv6 gateway is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * The status of the IPv6 gateway. Valid values:
             * <p>
             * 
             * *   **Pending**: The IPv6 gateway is being configured.
             * *   **Available**: The IPv6 gateway is available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The information about the tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the VPC to which the IPv6 gateway belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Ipv6Gateway build() {
                return new Ipv6Gateway(this);
            } 

        } 

    }
    public static class Ipv6Gateways extends TeaModel {
        @NameInMap("Ipv6Gateway")
        private java.util.List < Ipv6Gateway> ipv6Gateway;

        private Ipv6Gateways(Builder builder) {
            this.ipv6Gateway = builder.ipv6Gateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Gateways create() {
            return builder().build();
        }

        /**
         * @return ipv6Gateway
         */
        public java.util.List < Ipv6Gateway> getIpv6Gateway() {
            return this.ipv6Gateway;
        }

        public static final class Builder {
            private java.util.List < Ipv6Gateway> ipv6Gateway; 

            /**
             * Ipv6Gateway.
             */
            public Builder ipv6Gateway(java.util.List < Ipv6Gateway> ipv6Gateway) {
                this.ipv6Gateway = ipv6Gateway;
                return this;
            }

            public Ipv6Gateways build() {
                return new Ipv6Gateways(this);
            } 

        } 

    }
}
