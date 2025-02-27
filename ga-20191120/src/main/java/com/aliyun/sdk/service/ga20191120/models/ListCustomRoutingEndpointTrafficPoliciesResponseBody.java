// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomRoutingEndpointTrafficPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomRoutingEndpointTrafficPoliciesResponseBody</p>
 */
public class ListCustomRoutingEndpointTrafficPoliciesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Policies")
    private java.util.List < Policies> policies;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListCustomRoutingEndpointTrafficPoliciesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policies = builder.policies;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomRoutingEndpointTrafficPoliciesResponseBody create() {
        return builder().build();
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
     * @return policies
     */
    public java.util.List < Policies> getPolicies() {
        return this.policies;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < Policies> policies; 
        private String requestId; 
        private Integer totalCount; 

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
         * The list of traffic policies.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
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

        public ListCustomRoutingEndpointTrafficPoliciesResponseBody build() {
            return new ListCustomRoutingEndpointTrafficPoliciesResponseBody(this);
        } 

    } 

    public static class PortRanges extends TeaModel {
        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("ToPort")
        private Integer toPort;

        private PortRanges(Builder builder) {
            this.fromPort = builder.fromPort;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRanges create() {
            return builder().build();
        }

        /**
         * @return fromPort
         */
        public Integer getFromPort() {
            return this.fromPort;
        }

        /**
         * @return toPort
         */
        public Integer getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private Integer fromPort; 
            private Integer toPort; 

            /**
             * The first port of the port range used by the traffic destination to process requests.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The last port of the port range used by the traffic destination to process requests.
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public PortRanges build() {
                return new PortRanges(this);
            } 

        } 

    }
    public static class ServiceManagedInfos extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ChildType")
        private String childType;

        @NameInMap("IsManaged")
        private Boolean isManaged;

        private ServiceManagedInfos(Builder builder) {
            this.action = builder.action;
            this.childType = builder.childType;
            this.isManaged = builder.isManaged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceManagedInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return childType
         */
        public String getChildType() {
            return this.childType;
        }

        /**
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public static final class Builder {
            private String action; 
            private String childType; 
            private Boolean isManaged; 

            /**
             * 托管策略动作名称，取值：
             * <p>
             * - **Create**：创建实例。
             * - **Update**：更新当前实例。
             * - **Delete**：删除当前实例。
             * - **Associate**：引用/被引用当前实例。
             * - **UserUnmanaged**：用户解托管实例。
             * - **CreateChild**：在当前实例下创建子资源。
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * 子资源类型，取值：
             * <p>
             * 
             * - **Listener**：监听资源。
             * 
             * - **IpSet**：加速地域资源。
             * 
             * - **EndpointGroup**：终端节点组资源。
             * 
             * - **ForwardingRule**：转发策略资源。
             * 
             * - **Endpoint**：终端节点资源。
             * 
             * - **EndpointGroupDestination**：自定义路由监听下的终端节点组协议映射资源。
             * 
             * - **EndpointPolicy**：自定义路由监听下的终端节点通行策略资源。
             * 
             * > 仅在**Action**参数为**CreateChild**时有效。
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * 托管策略动作是否被托管，取值：
             * <p>
             * 
             * - **true**：托管策略动作被托管，用户无权在托管实例下执行Action指定的操作。
             * 
             * - **false**：托管策略动作未被托管，用户可在托管实例下执行Action指定的操作。
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            public ServiceManagedInfos build() {
                return new ServiceManagedInfos(this);
            } 

        } 

    }
    public static class Policies extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("Address")
        private String address;

        @NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("PortRanges")
        private java.util.List < PortRanges> portRanges;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        private Policies(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.address = builder.address;
            this.endpointGroupId = builder.endpointGroupId;
            this.endpointId = builder.endpointId;
            this.listenerId = builder.listenerId;
            this.policyId = builder.policyId;
            this.portRanges = builder.portRanges;
            this.serviceId = builder.serviceId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceManagedInfos = builder.serviceManagedInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return portRanges
         */
        public java.util.List < PortRanges> getPortRanges() {
            return this.portRanges;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return serviceManagedInfos
         */
        public java.util.List < ServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String address; 
            private String endpointGroupId; 
            private String endpointId; 
            private String listenerId; 
            private String policyId; 
            private java.util.List < PortRanges> portRanges; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List < ServiceManagedInfos> serviceManagedInfos; 

            /**
             * The ID of the GA instance with which the endpoint is associated.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The IP address of the traffic destination.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The ID of the endpoint group to which the endpoint belongs.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * The ID of the endpoint to which the traffic destination belongs.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The ID of the custom routing listener with which the endpoint is associated.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The traffic policy ID.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The port range of the traffic policy.
             */
            public Builder portRanges(java.util.List < PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * 托管实例所属的服务方ID。
             * <p>
             * > 仅在**ServiceManaged**参数为**True**时有效。
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * 是否为托管实例。取值：  
             * <p>
             * 
             * - true：是托管资实例。  
             * 
             * - false：不是托管实例。
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * 用户在此托管实例下可执行的动作策略列表。
             * <p>
             * 
             * > 仅在**ServiceManaged**参数为**True**时有效。
             * > - 当实例处于托管状态时，用户对实例的操作会受到限制，某些操作行为会被禁止。
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
