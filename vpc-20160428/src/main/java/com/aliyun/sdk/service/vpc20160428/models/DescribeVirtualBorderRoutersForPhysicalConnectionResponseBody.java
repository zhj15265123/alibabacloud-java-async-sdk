// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody</p>
 */
public class DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VirtualBorderRouterForPhysicalConnectionSet")
    private VirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet;

    private DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.virtualBorderRouterForPhysicalConnectionSet = builder.virtualBorderRouterForPhysicalConnectionSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody create() {
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

    /**
     * @return virtualBorderRouterForPhysicalConnectionSet
     */
    public VirtualBorderRouterForPhysicalConnectionSet getVirtualBorderRouterForPhysicalConnectionSet() {
        return this.virtualBorderRouterForPhysicalConnectionSet;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VirtualBorderRouterForPhysicalConnectionSet.
         */
        public Builder virtualBorderRouterForPhysicalConnectionSet(VirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet) {
            this.virtualBorderRouterForPhysicalConnectionSet = virtualBorderRouterForPhysicalConnectionSet;
            return this;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody build() {
            return new DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody(this);
        } 

    } 

    public static class VirtualBorderRouterForPhysicalConnectionType extends TeaModel {
        @NameInMap("ActivationTime")
        private String activationTime;

        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("BandwidthStatus")
        private String bandwidthStatus;

        @NameInMap("CircuitCode")
        private String circuitCode;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EccId")
        private String eccId;

        @NameInMap("EnableIpv6")
        private Boolean enableIpv6;

        @NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @NameInMap("LocalIpv6GatewayIp")
        private String localIpv6GatewayIp;

        @NameInMap("PConnVbrBussinessStatus")
        private String PConnVbrBussinessStatus;

        @NameInMap("PConnVbrChargeType")
        private String PConnVbrChargeType;

        @NameInMap("PConnVbrExpireTime")
        private String PConnVbrExpireTime;

        @NameInMap("PeerGatewayIp")
        private String peerGatewayIp;

        @NameInMap("PeerIpv6GatewayIp")
        private String peerIpv6GatewayIp;

        @NameInMap("PeeringIpv6SubnetMask")
        private String peeringIpv6SubnetMask;

        @NameInMap("PeeringSubnetMask")
        private String peeringSubnetMask;

        @NameInMap("RecoveryTime")
        private String recoveryTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TerminationTime")
        private String terminationTime;

        @NameInMap("Type")
        private String type;

        @NameInMap("VbrId")
        private String vbrId;

        @NameInMap("VbrOwnerUid")
        private Long vbrOwnerUid;

        @NameInMap("VlanId")
        private Integer vlanId;

        private VirtualBorderRouterForPhysicalConnectionType(Builder builder) {
            this.activationTime = builder.activationTime;
            this.bandwidth = builder.bandwidth;
            this.bandwidthStatus = builder.bandwidthStatus;
            this.circuitCode = builder.circuitCode;
            this.creationTime = builder.creationTime;
            this.eccId = builder.eccId;
            this.enableIpv6 = builder.enableIpv6;
            this.localGatewayIp = builder.localGatewayIp;
            this.localIpv6GatewayIp = builder.localIpv6GatewayIp;
            this.PConnVbrBussinessStatus = builder.PConnVbrBussinessStatus;
            this.PConnVbrChargeType = builder.PConnVbrChargeType;
            this.PConnVbrExpireTime = builder.PConnVbrExpireTime;
            this.peerGatewayIp = builder.peerGatewayIp;
            this.peerIpv6GatewayIp = builder.peerIpv6GatewayIp;
            this.peeringIpv6SubnetMask = builder.peeringIpv6SubnetMask;
            this.peeringSubnetMask = builder.peeringSubnetMask;
            this.recoveryTime = builder.recoveryTime;
            this.status = builder.status;
            this.terminationTime = builder.terminationTime;
            this.type = builder.type;
            this.vbrId = builder.vbrId;
            this.vbrOwnerUid = builder.vbrOwnerUid;
            this.vlanId = builder.vlanId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterForPhysicalConnectionType create() {
            return builder().build();
        }

        /**
         * @return activationTime
         */
        public String getActivationTime() {
            return this.activationTime;
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthStatus
         */
        public String getBandwidthStatus() {
            return this.bandwidthStatus;
        }

        /**
         * @return circuitCode
         */
        public String getCircuitCode() {
            return this.circuitCode;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return eccId
         */
        public String getEccId() {
            return this.eccId;
        }

        /**
         * @return enableIpv6
         */
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
        }

        /**
         * @return localGatewayIp
         */
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        /**
         * @return localIpv6GatewayIp
         */
        public String getLocalIpv6GatewayIp() {
            return this.localIpv6GatewayIp;
        }

        /**
         * @return PConnVbrBussinessStatus
         */
        public String getPConnVbrBussinessStatus() {
            return this.PConnVbrBussinessStatus;
        }

        /**
         * @return PConnVbrChargeType
         */
        public String getPConnVbrChargeType() {
            return this.PConnVbrChargeType;
        }

        /**
         * @return PConnVbrExpireTime
         */
        public String getPConnVbrExpireTime() {
            return this.PConnVbrExpireTime;
        }

        /**
         * @return peerGatewayIp
         */
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        /**
         * @return peerIpv6GatewayIp
         */
        public String getPeerIpv6GatewayIp() {
            return this.peerIpv6GatewayIp;
        }

        /**
         * @return peeringIpv6SubnetMask
         */
        public String getPeeringIpv6SubnetMask() {
            return this.peeringIpv6SubnetMask;
        }

        /**
         * @return peeringSubnetMask
         */
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        /**
         * @return recoveryTime
         */
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terminationTime
         */
        public String getTerminationTime() {
            return this.terminationTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vbrId
         */
        public String getVbrId() {
            return this.vbrId;
        }

        /**
         * @return vbrOwnerUid
         */
        public Long getVbrOwnerUid() {
            return this.vbrOwnerUid;
        }

        /**
         * @return vlanId
         */
        public Integer getVlanId() {
            return this.vlanId;
        }

        public static final class Builder {
            private String activationTime; 
            private String bandwidth; 
            private String bandwidthStatus; 
            private String circuitCode; 
            private String creationTime; 
            private String eccId; 
            private Boolean enableIpv6; 
            private String localGatewayIp; 
            private String localIpv6GatewayIp; 
            private String PConnVbrBussinessStatus; 
            private String PConnVbrChargeType; 
            private String PConnVbrExpireTime; 
            private String peerGatewayIp; 
            private String peerIpv6GatewayIp; 
            private String peeringIpv6SubnetMask; 
            private String peeringSubnetMask; 
            private String recoveryTime; 
            private String status; 
            private String terminationTime; 
            private String type; 
            private String vbrId; 
            private Long vbrOwnerUid; 
            private Integer vlanId; 

            /**
             * ActivationTime.
             */
            public Builder activationTime(String activationTime) {
                this.activationTime = activationTime;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * BandwidthStatus.
             */
            public Builder bandwidthStatus(String bandwidthStatus) {
                this.bandwidthStatus = bandwidthStatus;
                return this;
            }

            /**
             * CircuitCode.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * EccId.
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * EnableIpv6.
             */
            public Builder enableIpv6(Boolean enableIpv6) {
                this.enableIpv6 = enableIpv6;
                return this;
            }

            /**
             * LocalGatewayIp.
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * LocalIpv6GatewayIp.
             */
            public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
                this.localIpv6GatewayIp = localIpv6GatewayIp;
                return this;
            }

            /**
             * PConnVbrBussinessStatus.
             */
            public Builder PConnVbrBussinessStatus(String PConnVbrBussinessStatus) {
                this.PConnVbrBussinessStatus = PConnVbrBussinessStatus;
                return this;
            }

            /**
             * PConnVbrChargeType.
             */
            public Builder PConnVbrChargeType(String PConnVbrChargeType) {
                this.PConnVbrChargeType = PConnVbrChargeType;
                return this;
            }

            /**
             * PConnVbrExpireTime.
             */
            public Builder PConnVbrExpireTime(String PConnVbrExpireTime) {
                this.PConnVbrExpireTime = PConnVbrExpireTime;
                return this;
            }

            /**
             * PeerGatewayIp.
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * PeerIpv6GatewayIp.
             */
            public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
                this.peerIpv6GatewayIp = peerIpv6GatewayIp;
                return this;
            }

            /**
             * PeeringIpv6SubnetMask.
             */
            public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
                this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
                return this;
            }

            /**
             * PeeringSubnetMask.
             */
            public Builder peeringSubnetMask(String peeringSubnetMask) {
                this.peeringSubnetMask = peeringSubnetMask;
                return this;
            }

            /**
             * RecoveryTime.
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TerminationTime.
             */
            public Builder terminationTime(String terminationTime) {
                this.terminationTime = terminationTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VbrId.
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            /**
             * VbrOwnerUid.
             */
            public Builder vbrOwnerUid(Long vbrOwnerUid) {
                this.vbrOwnerUid = vbrOwnerUid;
                return this;
            }

            /**
             * VlanId.
             */
            public Builder vlanId(Integer vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            public VirtualBorderRouterForPhysicalConnectionType build() {
                return new VirtualBorderRouterForPhysicalConnectionType(this);
            } 

        } 

    }
    public static class VirtualBorderRouterForPhysicalConnectionSet extends TeaModel {
        @NameInMap("VirtualBorderRouterForPhysicalConnectionType")
        private java.util.List < VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType;

        private VirtualBorderRouterForPhysicalConnectionSet(Builder builder) {
            this.virtualBorderRouterForPhysicalConnectionType = builder.virtualBorderRouterForPhysicalConnectionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterForPhysicalConnectionSet create() {
            return builder().build();
        }

        /**
         * @return virtualBorderRouterForPhysicalConnectionType
         */
        public java.util.List < VirtualBorderRouterForPhysicalConnectionType> getVirtualBorderRouterForPhysicalConnectionType() {
            return this.virtualBorderRouterForPhysicalConnectionType;
        }

        public static final class Builder {
            private java.util.List < VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType; 

            /**
             * VirtualBorderRouterForPhysicalConnectionType.
             */
            public Builder virtualBorderRouterForPhysicalConnectionType(java.util.List < VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType) {
                this.virtualBorderRouterForPhysicalConnectionType = virtualBorderRouterForPhysicalConnectionType;
                return this;
            }

            public VirtualBorderRouterForPhysicalConnectionSet build() {
                return new VirtualBorderRouterForPhysicalConnectionSet(this);
            } 

        } 

    }
}
