// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnDemandInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOnDemandInstanceStatusResponseBody</p>
 */
public class DescribeOnDemandInstanceStatusResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOnDemandInstanceStatusResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnDemandInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 

        /**
         * The ID of the Alibaba Cloud account.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The CIDR block of the on-demand instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOnDemandInstanceStatusResponseBody build() {
            return new DescribeOnDemandInstanceStatusResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("Declared")
        private String declared;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Net")
        private String net;

        @NameInMap("RegistedAs")
        private String registedAs;

        @NameInMap("UserId")
        private String userId;

        private Instances(Builder builder) {
            this.declared = builder.declared;
            this.desc = builder.desc;
            this.instanceId = builder.instanceId;
            this.mode = builder.mode;
            this.net = builder.net;
            this.registedAs = builder.registedAs;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return declared
         */
        public String getDeclared() {
            return this.declared;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return net
         */
        public String getNet() {
            return this.net;
        }

        /**
         * @return registedAs
         */
        public String getRegistedAs() {
            return this.registedAs;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String declared; 
            private String desc; 
            private String instanceId; 
            private String mode; 
            private String net; 
            private String registedAs; 
            private String userId; 

            /**
             * WB269094
             */
            public Builder declared(String declared) {
                this.declared = declared;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * DescribeOnDemandInstanceStatus
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
             * <p>
             * 
             * For more information about sample requests, see the **"Examples"** section of this topic.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Net.
             */
            public Builder net(String net) {
                this.net = net;
                return this;
            }

            /**
             * DescribeOnDemandInstanceStatus
             */
            public Builder registedAs(String registedAs) {
                this.registedAs = registedAs;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
