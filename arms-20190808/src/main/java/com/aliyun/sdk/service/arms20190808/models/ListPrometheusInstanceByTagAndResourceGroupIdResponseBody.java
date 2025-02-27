// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusInstanceByTagAndResourceGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusInstanceByTagAndResourceGroupIdResponseBody</p>
 */
public class ListPrometheusInstanceByTagAndResourceGroupIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListPrometheusInstanceByTagAndResourceGroupIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusInstanceByTagAndResourceGroupIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The struct returned.
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

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBody build() {
            return new ListPrometheusInstanceByTagAndResourceGroupIdResponseBody(this);
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
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class PrometheusInstances extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("GrafanaInstanceId")
        private String grafanaInstanceId;

        @NameInMap("PaymentType")
        private String paymentType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SubClustersJson")
        private String subClustersJson;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private PrometheusInstances(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.grafanaInstanceId = builder.grafanaInstanceId;
            this.paymentType = builder.paymentType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceType = builder.resourceType;
            this.securityGroupId = builder.securityGroupId;
            this.subClustersJson = builder.subClustersJson;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusInstances create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return grafanaInstanceId
         */
        public String getGrafanaInstanceId() {
            return this.grafanaInstanceId;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
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
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return subClustersJson
         */
        public String getSubClustersJson() {
            return this.subClustersJson;
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

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private String grafanaInstanceId; 
            private String paymentType; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceType; 
            private String securityGroupId; 
            private String subClustersJson; 
            private java.util.List < Tags> tags; 
            private String userId; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The ID of the Prometheus instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the Prometheus instance.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The type of the cluster. Valid values: remote-write: Prometheus instance for remote write.
             * <p>
             * 
             * *   ecs: Prometheus instances for ECS.
             * *   cloud-monitor: Prometheus instance for Alibaba Cloud services in the Chinese mainland.
             * *   cloud-product: Prometheus instance for Alibaba Cloud services outside China.
             * *   global-view: Prometheus instance for GlobalView.
             * *   aliyun-cs: Prometheus instance for Container Service.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The ID of the Grafana workspace.
             */
            public Builder grafanaInstanceId(String grafanaInstanceId) {
                this.grafanaInstanceId = grafanaInstanceId;
                return this;
            }

            /**
             * The billing method. Valid values:
             * <p>
             * 
             * *   PREPAY: subscription.
             * *   POSTPAY: pay-as-you-go.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * The region ID of the Prometheus instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the Prometheus instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * 资源类型
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The child instances of the Prometheus instance for GlobalView instance. The value is a JSON string.
             */
            public Builder subClustersJson(String subClustersJson) {
                this.subClustersJson = subClustersJson;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public PrometheusInstances build() {
                return new PrometheusInstances(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PrometheusInstances")
        private java.util.List < PrometheusInstances> prometheusInstances;

        private Data(Builder builder) {
            this.prometheusInstances = builder.prometheusInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return prometheusInstances
         */
        public java.util.List < PrometheusInstances> getPrometheusInstances() {
            return this.prometheusInstances;
        }

        public static final class Builder {
            private java.util.List < PrometheusInstances> prometheusInstances; 

            /**
             * The queried Prometheus instances.
             */
            public Builder prometheusInstances(java.util.List < PrometheusInstances> prometheusInstances) {
                this.prometheusInstances = prometheusInstances;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
