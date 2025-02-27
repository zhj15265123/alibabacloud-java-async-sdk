// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer totalCount; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result returned
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class Network extends TeaModel {
        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("vSwitchId")
        private String vSwitchId;

        @NameInMap("vpcId")
        private String vpcId;

        private Network(Builder builder) {
            this.endpoint = builder.endpoint;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
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
            private String endpoint; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * 353490
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * ### Sample responses
             * <p>
             * 
             * **Sample success responses**
             * 
             *     {
             *         "requestId": "90D6B8F5-FE97-4509-9AAB-367836C51818",
             *         "result": [
             *             {
             *                 "instanceId": "igraph-cn-xxxxxx1",
             *                 "spec": {
             *                     "password": "passwd",
             *                     "searchResource": {
             *                         "disk": 50,
             *                         "mem": 8,
             *                         "cpu": 2,
             *                         "nodeCount": 2
             *                     },
             *                     "instanceName": "testInstance",
             *                     "vSwitchId": "vswitch_id_xxx",
             *                     "vpcId": "vpc_id_xxx",
             *                     "qrsResource": {
             *                         "disk": 50,
             *                         "mem": 8,
             *                         "cpu": 2,
             *                         "nodeCount": 2
             *                     },
             *                     "region": "cn-hangzhou",
             *                     "userName": "user"
             *                 },
             *                 "status": {
             *                     "phase": "PENDING",
             *                     "instancePhase": "INIT",
             *                     "createSuccess": false
             *                 }
             *             },
             *             {
             *                 "instanceId": "igraph-cn-xxxxxx2",
             *                 "spec": {
             *                     "password": "passwd",
             *                     "searchResource": {
             *                         "disk": 50,
             *                         "mem": 8,
             *                         "cpu": 2,
             *                         "nodeCount": 2
             *                     },
             *                     "instanceName": "testInstance",
             *                     "vSwitchId": "vswitch_id_xxx",
             *                     "vpcId": "vpc_id_xxx",
             *                     "qrsResource": {
             *                         "disk": 50,
             *                         "mem": 8,
             *                         "cpu": 2,
             *                         "nodeCount": 2
             *                     },
             *                     "region": "cn-hangzhou",
             *                     "userName": "user"
             *                 },
             *                 "status": {
             *                     "phase": "PENDING",
             *                     "instancePhase": "INIT",
             *                     "createSuccess": false
             *                 }
             *             }
             *         ],
             *         "totalCount": 20
             *     }
             * 
             * **Sample error responses**
             * 
             *     {
             *       "requestId": "BD1EA715-DF6F-06C2-004C-C1FA0D3A9820",
             *       "httpCode": 404,
             *       "code": "App.NotFound",
             *       "message": "App not found"
             *     }
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * Queries instances.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("value")
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
    public static class Result extends TeaModel {
        @NameInMap("chargeType")
        private String chargeType;

        @NameInMap("commodityCode")
        private String commodityCode;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("description")
        private String description;

        @NameInMap("expiredTime")
        private String expiredTime;

        @NameInMap("inDebt")
        private Boolean inDebt;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("lockMode")
        private String lockMode;

        @NameInMap("network")
        private Network network;

        @NameInMap("resourceGroupId")
        private String resourceGroupId;

        @NameInMap("status")
        private String status;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        @NameInMap("updateTime")
        private String updateTime;

        private Result(Builder builder) {
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.inDebt = builder.inDebt;
            this.instanceId = builder.instanceId;
            this.lockMode = builder.lockMode;
            this.network = builder.network;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return inDebt
         */
        public Boolean getInDebt() {
            return this.inDebt;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String chargeType; 
            private String commodityCode; 
            private String createTime; 
            private String description; 
            private String expiredTime; 
            private Boolean inDebt; 
            private String instanceId; 
            private String lockMode; 
            private Network network; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String updateTime; 

            /**
             * The ID of the resource group to which the instance belongs.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The total number of entries returned
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * Havenask instance
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the virtual switch
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the Virtual Private Cloud (VPC) network
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The ID of the request
             */
            public Builder inDebt(Boolean inDebt) {
                this.inDebt = inDebt;
                return this;
            }

            /**
             * The access point of the gateway
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Emergency test
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The lock status
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The expiration time
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The time when the instance was last updated
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
