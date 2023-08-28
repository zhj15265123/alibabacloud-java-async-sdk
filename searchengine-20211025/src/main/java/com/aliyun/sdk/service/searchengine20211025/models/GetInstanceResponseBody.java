// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private GetInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The description of the instance.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
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
            private String resourceGroupId; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String updateTime; 

            /**
             * 付费类型
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * 商品code
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * WB01240825
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * 是否欠费
             */
            public Builder inDebt(Boolean inDebt) {
                this.inDebt = inDebt;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 锁定状态
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * ### Sample responses
             * <p>
             * 
             * **Sample success responses**
             * 
             *     {
             *       "requestId": "90D6B8F5-FE97-4509-9AAB-367836C51818",
             *       "result": 
             *       {
             *         "instanceId":"fadsfsafs",
             *         "inDebt":true,
             *         "lockMode":"Unlock",
             *         "expiredTime":"asdfas",
             *         "updateTime":"dfasf",
             *         "createTime":"dfasf",
             *         "resourceGroupId":"resourceGroupID",
             *         "commodityCode":"commodityCode",
             *         "chargeType":"POSYPAY",
             *         "description":"this is description",
             *         "apiVersion": "tisplus/v1",
             *         "network": {
             *           "vSwitchId": "vswitch_id_xxx",
             *           "vpcId": "vpc_id_xxx",	  
             *         },
             *         "userName": "user",
             *         "spec": {
             *           "searchResource": {
             *             "disk": 50,
             *             "mem": 8,
             *             "cpu": 2,
             *             "nodeCount": 2
             *           },
             *           "qrsResource": {
             *             "disk": 50,
             *             "mem": 8,
             *             "cpu": 2,
             *             "nodeCount": 2
             *           }
             *         },
             *        "status": "INIT",
             *       }
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
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * 更新时间
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
