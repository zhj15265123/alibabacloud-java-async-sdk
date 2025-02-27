// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInterfaceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInterfaceAttributeResponseBody</p>
 */
public class DescribeNetworkInterfaceAttributeResponseBody extends TeaModel {
    @NameInMap("AssociatedPublicIp")
    private AssociatedPublicIp associatedPublicIp;

    @NameInMap("Attachment")
    private Attachment attachment;

    @NameInMap("BondInterfaceSpecification")
    private BondInterfaceSpecification bondInterfaceSpecification;

    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("DeleteOnRelease")
    private Boolean deleteOnRelease;

    @NameInMap("Description")
    private String description;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Ipv4PrefixSets")
    private Ipv4PrefixSets ipv4PrefixSets;

    @NameInMap("Ipv6PrefixSets")
    private Ipv6PrefixSets ipv6PrefixSets;

    @NameInMap("Ipv6Sets")
    private Ipv6Sets ipv6Sets;

    @NameInMap("MacAddress")
    private String macAddress;

    @NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @NameInMap("PrivateIpSets")
    private PrivateIpSets privateIpSets;

    @NameInMap("QueueNumber")
    private Integer queueNumber;

    @NameInMap("QueuePairNumber")
    private Integer queuePairNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SecurityGroupIds")
    private SecurityGroupIds securityGroupIds;

    @NameInMap("ServiceID")
    private Long serviceID;

    @NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @NameInMap("SlaveInterfaceSpecification")
    private SlaveInterfaceSpecification slaveInterfaceSpecification;

    @NameInMap("Status")
    private String status;

    @NameInMap("Tags")
    private Tags tags;

    @NameInMap("Type")
    private String type;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeNetworkInterfaceAttributeResponseBody(Builder builder) {
        this.associatedPublicIp = builder.associatedPublicIp;
        this.attachment = builder.attachment;
        this.bondInterfaceSpecification = builder.bondInterfaceSpecification;
        this.creationTime = builder.creationTime;
        this.deleteOnRelease = builder.deleteOnRelease;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.ipv4PrefixSets = builder.ipv4PrefixSets;
        this.ipv6PrefixSets = builder.ipv6PrefixSets;
        this.ipv6Sets = builder.ipv6Sets;
        this.macAddress = builder.macAddress;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
        this.ownerId = builder.ownerId;
        this.privateIpAddress = builder.privateIpAddress;
        this.privateIpSets = builder.privateIpSets;
        this.queueNumber = builder.queueNumber;
        this.queuePairNumber = builder.queuePairNumber;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.serviceID = builder.serviceID;
        this.serviceManaged = builder.serviceManaged;
        this.slaveInterfaceSpecification = builder.slaveInterfaceSpecification;
        this.status = builder.status;
        this.tags = builder.tags;
        this.type = builder.type;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInterfaceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return associatedPublicIp
     */
    public AssociatedPublicIp getAssociatedPublicIp() {
        return this.associatedPublicIp;
    }

    /**
     * @return attachment
     */
    public Attachment getAttachment() {
        return this.attachment;
    }

    /**
     * @return bondInterfaceSpecification
     */
    public BondInterfaceSpecification getBondInterfaceSpecification() {
        return this.bondInterfaceSpecification;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return deleteOnRelease
     */
    public Boolean getDeleteOnRelease() {
        return this.deleteOnRelease;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipv4PrefixSets
     */
    public Ipv4PrefixSets getIpv4PrefixSets() {
        return this.ipv4PrefixSets;
    }

    /**
     * @return ipv6PrefixSets
     */
    public Ipv6PrefixSets getIpv6PrefixSets() {
        return this.ipv6PrefixSets;
    }

    /**
     * @return ipv6Sets
     */
    public Ipv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    /**
     * @return macAddress
     */
    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return networkInterfaceName
     */
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * @return networkInterfaceTrafficMode
     */
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return privateIpSets
     */
    public PrivateIpSets getPrivateIpSets() {
        return this.privateIpSets;
    }

    /**
     * @return queueNumber
     */
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    /**
     * @return queuePairNumber
     */
    public Integer getQueuePairNumber() {
        return this.queuePairNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityGroupIds
     */
    public SecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return serviceID
     */
    public Long getServiceID() {
        return this.serviceID;
    }

    /**
     * @return serviceManaged
     */
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    /**
     * @return slaveInterfaceSpecification
     */
    public SlaveInterfaceSpecification getSlaveInterfaceSpecification() {
        return this.slaveInterfaceSpecification;
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
     * @return type
     */
    public String getType() {
        return this.type;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private AssociatedPublicIp associatedPublicIp; 
        private Attachment attachment; 
        private BondInterfaceSpecification bondInterfaceSpecification; 
        private String creationTime; 
        private Boolean deleteOnRelease; 
        private String description; 
        private String instanceId; 
        private Ipv4PrefixSets ipv4PrefixSets; 
        private Ipv6PrefixSets ipv6PrefixSets; 
        private Ipv6Sets ipv6Sets; 
        private String macAddress; 
        private String networkInterfaceId; 
        private String networkInterfaceName; 
        private String networkInterfaceTrafficMode; 
        private String ownerId; 
        private String privateIpAddress; 
        private PrivateIpSets privateIpSets; 
        private Integer queueNumber; 
        private Integer queuePairNumber; 
        private String requestId; 
        private String resourceGroupId; 
        private SecurityGroupIds securityGroupIds; 
        private Long serviceID; 
        private Boolean serviceManaged; 
        private SlaveInterfaceSpecification slaveInterfaceSpecification; 
        private String status; 
        private Tags tags; 
        private String type; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        /**
         * The elastic IP address (EIP) that is associated with the secondary private IP address of the ENI.
         */
        public Builder associatedPublicIp(AssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable.
         */
        public Builder attachment(Attachment attachment) {
            this.attachment = attachment;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable.
         */
        public Builder bondInterfaceSpecification(BondInterfaceSpecification bondInterfaceSpecification) {
            this.bondInterfaceSpecification = bondInterfaceSpecification;
            return this;
        }

        /**
         * The time when the ENI was created.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * DeleteOnRelease.
         */
        public Builder deleteOnRelease(Boolean deleteOnRelease) {
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }

        /**
         * The description of the ENI.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the instance to which the ENI is attached.
         * <p>
         * 
         * > If the ENI is managed and controlled by other Alibaba Cloud services, no instance ID is returned.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The IPv4 address prefixes of the ENI.
         */
        public Builder ipv4PrefixSets(Ipv4PrefixSets ipv4PrefixSets) {
            this.ipv4PrefixSets = ipv4PrefixSets;
            return this;
        }

        /**
         * The IPv6 address prefixes of the ENI.
         */
        public Builder ipv6PrefixSets(Ipv6PrefixSets ipv6PrefixSets) {
            this.ipv6PrefixSets = ipv6PrefixSets;
            return this;
        }

        /**
         * The IPv6 addresses of the ENI.
         */
        public Builder ipv6Sets(Ipv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }

        /**
         * The media access control (MAC) address of the ENI.
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        /**
         * The ID of the ENI.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * The name of the ENI.
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * The communication mode of the ENI. Valid values:
         * <p>
         * 
         * *   Standard: The TCP communication mode is used.
         * *   HighPerformance: Elastic RDMA Interface (ERI) is enabled and the remote direct memory access (RDMA) communication mode is used.
         * 
         * > This parameter can have a value of HighPerformance only when the ENI is attached to a c7re RDMA-enhanced instance that resides in Beijing Zone K.
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }

        /**
         * The ID of the account to which the ENI belongs.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The private IP address of the ENI.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * Details about the private IP addresses.
         */
        public Builder privateIpSets(PrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }

        /**
         * The number of queues supported by the ENI.
         * <p>
         * 
         * *   For a primary ENI: The default number of queues that the instance type supports for the ENI is returned.
         * 
         * *   For a secondary ENI:
         * 
         *     *   When the ENI is in the InUse state, the following situations occur for the QueueNumber parameter:
         * 
         *         *   If the number of queues supported by the ENI has not been modified, the default number of queues that the instance type supports for the ENI is returned.
         *         *   If the number of queues supported by the ENI has been modified, the new number of queues is returned.
         * 
         *     *   When the ENI is in the Available state, the following situations occur for the QueueNumber parameter:
         * 
         *         *   If the number of queues supported by the ENI has not been modified, the return value is empty.
         *         *   If the number of queues supported by the ENI has been modified, the new number of queues is returned.
         */
        public Builder queueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable.
         */
        public Builder queuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.
         * <p>
         * 
         * > Resources in the default resource group are displayed in the response regardless of how this parameter is set.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The IDs of the security groups to which the ENI belongs.
         */
        public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The ID of the distributor to which the ENI belongs.
         */
        public Builder serviceID(Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        /**
         * Indicates whether the user of the ENI is an Alibaba Cloud service or a distributor.
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable.
         */
        public Builder slaveInterfaceSpecification(SlaveInterfaceSpecification slaveInterfaceSpecification) {
            this.slaveInterfaceSpecification = slaveInterfaceSpecification;
            return this;
        }

        /**
         * The state of the ENI. Valid values:
         * <p>
         * 
         * *   Available: The ENI is not attached to an instance.
         * *   Attaching: The ENI is being attached to an instance.
         * *   InUse: The ENI is attached to an instance.
         * *   Detaching: The ENI is being detached from an instance.
         * *   Deleting: The ENI is being deleted.
         * 
         * This parameter is empty by default, which indicates that all states are queried.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The tags of the ENI.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The type of the ENI. Valid values:
         * <p>
         * 
         * *   Primary
         * *   Secondary
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The ID of the vSwitch to which the ENI is connected.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the ENI belongs.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeNetworkInterfaceAttributeResponseBody build() {
            return new DescribeNetworkInterfaceAttributeResponseBody(this);
        } 

    } 

    public static class AssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("PublicIpAddress")
        private String publicIpAddress;

        private AssociatedPublicIp(Builder builder) {
            this.allocationId = builder.allocationId;
            this.publicIpAddress = builder.publicIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedPublicIp create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public static final class Builder {
            private String allocationId; 
            private String publicIpAddress; 

            /**
             * The ID of the EIP.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The EIP.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            public AssociatedPublicIp build() {
                return new AssociatedPublicIp(this);
            } 

        } 

    }
    public static class MemberNetworkInterfaceIds extends TeaModel {
        @NameInMap("MemberNetworkInterfaceId")
        private java.util.List < String > memberNetworkInterfaceId;

        private MemberNetworkInterfaceIds(Builder builder) {
            this.memberNetworkInterfaceId = builder.memberNetworkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberNetworkInterfaceIds create() {
            return builder().build();
        }

        /**
         * @return memberNetworkInterfaceId
         */
        public java.util.List < String > getMemberNetworkInterfaceId() {
            return this.memberNetworkInterfaceId;
        }

        public static final class Builder {
            private java.util.List < String > memberNetworkInterfaceId; 

            /**
             * MemberNetworkInterfaceId.
             */
            public Builder memberNetworkInterfaceId(java.util.List < String > memberNetworkInterfaceId) {
                this.memberNetworkInterfaceId = memberNetworkInterfaceId;
                return this;
            }

            public MemberNetworkInterfaceIds build() {
                return new MemberNetworkInterfaceIds(this);
            } 

        } 

    }
    public static class Attachment extends TeaModel {
        @NameInMap("DeviceIndex")
        private Integer deviceIndex;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MemberNetworkInterfaceIds")
        private MemberNetworkInterfaceIds memberNetworkInterfaceIds;

        @NameInMap("NetworkCardIndex")
        private Integer networkCardIndex;

        @NameInMap("TrunkNetworkInterfaceId")
        private String trunkNetworkInterfaceId;

        private Attachment(Builder builder) {
            this.deviceIndex = builder.deviceIndex;
            this.instanceId = builder.instanceId;
            this.memberNetworkInterfaceIds = builder.memberNetworkInterfaceIds;
            this.networkCardIndex = builder.networkCardIndex;
            this.trunkNetworkInterfaceId = builder.trunkNetworkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachment create() {
            return builder().build();
        }

        /**
         * @return deviceIndex
         */
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return memberNetworkInterfaceIds
         */
        public MemberNetworkInterfaceIds getMemberNetworkInterfaceIds() {
            return this.memberNetworkInterfaceIds;
        }

        /**
         * @return networkCardIndex
         */
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

        /**
         * @return trunkNetworkInterfaceId
         */
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

        public static final class Builder {
            private Integer deviceIndex; 
            private String instanceId; 
            private MemberNetworkInterfaceIds memberNetworkInterfaceIds; 
            private Integer networkCardIndex; 
            private String trunkNetworkInterfaceId; 

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder deviceIndex(Integer deviceIndex) {
                this.deviceIndex = deviceIndex;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder memberNetworkInterfaceIds(MemberNetworkInterfaceIds memberNetworkInterfaceIds) {
                this.memberNetworkInterfaceIds = memberNetworkInterfaceIds;
                return this;
            }

            /**
             * 网卡挂载指定的物理网卡索引。
             * <p>
             * - 如果网卡是未挂载（Available）状态或者挂载时未指定索引，则不返回此值。
             * - 如果网卡是已挂载（InUse）状态且挂载时指定，此值表示网卡挂载指定的物理网卡索引。
             */
            public Builder networkCardIndex(Integer networkCardIndex) {
                this.networkCardIndex = networkCardIndex;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder trunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
                this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
                return this;
            }

            public Attachment build() {
                return new Attachment(this);
            } 

        } 

    }
    public static class SlaveInterfaceSpecificationSet extends TeaModel {
        @NameInMap("BondNetworkInterfaceId")
        private String bondNetworkInterfaceId;

        @NameInMap("SlaveNetworkInterfaceId")
        private String slaveNetworkInterfaceId;

        @NameInMap("WorkState")
        private String workState;

        private SlaveInterfaceSpecificationSet(Builder builder) {
            this.bondNetworkInterfaceId = builder.bondNetworkInterfaceId;
            this.slaveNetworkInterfaceId = builder.slaveNetworkInterfaceId;
            this.workState = builder.workState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveInterfaceSpecificationSet create() {
            return builder().build();
        }

        /**
         * @return bondNetworkInterfaceId
         */
        public String getBondNetworkInterfaceId() {
            return this.bondNetworkInterfaceId;
        }

        /**
         * @return slaveNetworkInterfaceId
         */
        public String getSlaveNetworkInterfaceId() {
            return this.slaveNetworkInterfaceId;
        }

        /**
         * @return workState
         */
        public String getWorkState() {
            return this.workState;
        }

        public static final class Builder {
            private String bondNetworkInterfaceId; 
            private String slaveNetworkInterfaceId; 
            private String workState; 

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder bondNetworkInterfaceId(String bondNetworkInterfaceId) {
                this.bondNetworkInterfaceId = bondNetworkInterfaceId;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder slaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
                this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder workState(String workState) {
                this.workState = workState;
                return this;
            }

            public SlaveInterfaceSpecificationSet build() {
                return new SlaveInterfaceSpecificationSet(this);
            } 

        } 

    }
    public static class BondInterfaceSpecificationSlaveInterfaceSpecification extends TeaModel {
        @NameInMap("SlaveInterfaceSpecificationSet")
        private java.util.List < SlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet;

        private BondInterfaceSpecificationSlaveInterfaceSpecification(Builder builder) {
            this.slaveInterfaceSpecificationSet = builder.slaveInterfaceSpecificationSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BondInterfaceSpecificationSlaveInterfaceSpecification create() {
            return builder().build();
        }

        /**
         * @return slaveInterfaceSpecificationSet
         */
        public java.util.List < SlaveInterfaceSpecificationSet> getSlaveInterfaceSpecificationSet() {
            return this.slaveInterfaceSpecificationSet;
        }

        public static final class Builder {
            private java.util.List < SlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet; 

            /**
             * SlaveInterfaceSpecificationSet.
             */
            public Builder slaveInterfaceSpecificationSet(java.util.List < SlaveInterfaceSpecificationSet> slaveInterfaceSpecificationSet) {
                this.slaveInterfaceSpecificationSet = slaveInterfaceSpecificationSet;
                return this;
            }

            public BondInterfaceSpecificationSlaveInterfaceSpecification build() {
                return new BondInterfaceSpecificationSlaveInterfaceSpecification(this);
            } 

        } 

    }
    public static class BondInterfaceSpecification extends TeaModel {
        @NameInMap("BondMode")
        private String bondMode;

        @NameInMap("SlaveInterfaceSpecification")
        private BondInterfaceSpecificationSlaveInterfaceSpecification slaveInterfaceSpecification;

        private BondInterfaceSpecification(Builder builder) {
            this.bondMode = builder.bondMode;
            this.slaveInterfaceSpecification = builder.slaveInterfaceSpecification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BondInterfaceSpecification create() {
            return builder().build();
        }

        /**
         * @return bondMode
         */
        public String getBondMode() {
            return this.bondMode;
        }

        /**
         * @return slaveInterfaceSpecification
         */
        public BondInterfaceSpecificationSlaveInterfaceSpecification getSlaveInterfaceSpecification() {
            return this.slaveInterfaceSpecification;
        }

        public static final class Builder {
            private String bondMode; 
            private BondInterfaceSpecificationSlaveInterfaceSpecification slaveInterfaceSpecification; 

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder bondMode(String bondMode) {
                this.bondMode = bondMode;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder slaveInterfaceSpecification(BondInterfaceSpecificationSlaveInterfaceSpecification slaveInterfaceSpecification) {
                this.slaveInterfaceSpecification = slaveInterfaceSpecification;
                return this;
            }

            public BondInterfaceSpecification build() {
                return new BondInterfaceSpecification(this);
            } 

        } 

    }
    public static class Ipv4PrefixSet extends TeaModel {
        @NameInMap("Ipv4Prefix")
        private String ipv4Prefix;

        private Ipv4PrefixSet(Builder builder) {
            this.ipv4Prefix = builder.ipv4Prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4PrefixSet create() {
            return builder().build();
        }

        /**
         * @return ipv4Prefix
         */
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

        public static final class Builder {
            private String ipv4Prefix; 

            /**
             * The IPv4 address prefix.
             */
            public Builder ipv4Prefix(String ipv4Prefix) {
                this.ipv4Prefix = ipv4Prefix;
                return this;
            }

            public Ipv4PrefixSet build() {
                return new Ipv4PrefixSet(this);
            } 

        } 

    }
    public static class Ipv4PrefixSets extends TeaModel {
        @NameInMap("Ipv4PrefixSet")
        private java.util.List < Ipv4PrefixSet> ipv4PrefixSet;

        private Ipv4PrefixSets(Builder builder) {
            this.ipv4PrefixSet = builder.ipv4PrefixSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4PrefixSets create() {
            return builder().build();
        }

        /**
         * @return ipv4PrefixSet
         */
        public java.util.List < Ipv4PrefixSet> getIpv4PrefixSet() {
            return this.ipv4PrefixSet;
        }

        public static final class Builder {
            private java.util.List < Ipv4PrefixSet> ipv4PrefixSet; 

            /**
             * Ipv4PrefixSet.
             */
            public Builder ipv4PrefixSet(java.util.List < Ipv4PrefixSet> ipv4PrefixSet) {
                this.ipv4PrefixSet = ipv4PrefixSet;
                return this;
            }

            public Ipv4PrefixSets build() {
                return new Ipv4PrefixSets(this);
            } 

        } 

    }
    public static class Ipv6PrefixSet extends TeaModel {
        @NameInMap("Ipv6Prefix")
        private String ipv6Prefix;

        private Ipv6PrefixSet(Builder builder) {
            this.ipv6Prefix = builder.ipv6Prefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6PrefixSet create() {
            return builder().build();
        }

        /**
         * @return ipv6Prefix
         */
        public String getIpv6Prefix() {
            return this.ipv6Prefix;
        }

        public static final class Builder {
            private String ipv6Prefix; 

            /**
             * The IPv6 address prefix.
             */
            public Builder ipv6Prefix(String ipv6Prefix) {
                this.ipv6Prefix = ipv6Prefix;
                return this;
            }

            public Ipv6PrefixSet build() {
                return new Ipv6PrefixSet(this);
            } 

        } 

    }
    public static class Ipv6PrefixSets extends TeaModel {
        @NameInMap("Ipv6PrefixSet")
        private java.util.List < Ipv6PrefixSet> ipv6PrefixSet;

        private Ipv6PrefixSets(Builder builder) {
            this.ipv6PrefixSet = builder.ipv6PrefixSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6PrefixSets create() {
            return builder().build();
        }

        /**
         * @return ipv6PrefixSet
         */
        public java.util.List < Ipv6PrefixSet> getIpv6PrefixSet() {
            return this.ipv6PrefixSet;
        }

        public static final class Builder {
            private java.util.List < Ipv6PrefixSet> ipv6PrefixSet; 

            /**
             * Ipv6PrefixSet.
             */
            public Builder ipv6PrefixSet(java.util.List < Ipv6PrefixSet> ipv6PrefixSet) {
                this.ipv6PrefixSet = ipv6PrefixSet;
                return this;
            }

            public Ipv6PrefixSets build() {
                return new Ipv6PrefixSets(this);
            } 

        } 

    }
    public static class Ipv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        private String ipv6Address;

        private Ipv6Set(Builder builder) {
            this.ipv6Address = builder.ipv6Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Set create() {
            return builder().build();
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private String ipv6Address; 

            /**
             * The IPv6 address assigned to the ENI.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            public Ipv6Set build() {
                return new Ipv6Set(this);
            } 

        } 

    }
    public static class Ipv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        private java.util.List < Ipv6Set> ipv6Set;

        private Ipv6Sets(Builder builder) {
            this.ipv6Set = builder.ipv6Set;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Sets create() {
            return builder().build();
        }

        /**
         * @return ipv6Set
         */
        public java.util.List < Ipv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

        public static final class Builder {
            private java.util.List < Ipv6Set> ipv6Set; 

            /**
             * Ipv6Set.
             */
            public Builder ipv6Set(java.util.List < Ipv6Set> ipv6Set) {
                this.ipv6Set = ipv6Set;
                return this;
            }

            public Ipv6Sets build() {
                return new Ipv6Sets(this);
            } 

        } 

    }
    public static class PrivateIpSetAssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("PublicIpAddress")
        private String publicIpAddress;

        private PrivateIpSetAssociatedPublicIp(Builder builder) {
            this.allocationId = builder.allocationId;
            this.publicIpAddress = builder.publicIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSetAssociatedPublicIp create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public static final class Builder {
            private String allocationId; 
            private String publicIpAddress; 

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The EIP.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            public PrivateIpSetAssociatedPublicIp build() {
                return new PrivateIpSetAssociatedPublicIp(this);
            } 

        } 

    }
    public static class PrivateIpSet extends TeaModel {
        @NameInMap("AssociatedPublicIp")
        private PrivateIpSetAssociatedPublicIp associatedPublicIp;

        @NameInMap("Primary")
        private Boolean primary;

        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        private PrivateIpSet(Builder builder) {
            this.associatedPublicIp = builder.associatedPublicIp;
            this.primary = builder.primary;
            this.privateIpAddress = builder.privateIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSet create() {
            return builder().build();
        }

        /**
         * @return associatedPublicIp
         */
        public PrivateIpSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public static final class Builder {
            private PrivateIpSetAssociatedPublicIp associatedPublicIp; 
            private Boolean primary; 
            private String privateIpAddress; 

            /**
             * The EIP that is associated with the secondary private IP address of the ENI.
             */
            public Builder associatedPublicIp(PrivateIpSetAssociatedPublicIp associatedPublicIp) {
                this.associatedPublicIp = associatedPublicIp;
                return this;
            }

            /**
             * Indicates whether the IP address is the primary private IP address. Valid values:
             * <p>
             * 
             * *   true: The IP address is the primary private IP address.
             * *   false: The IP address is the secondary private IP address.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * The private IP address of the ENI.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            public PrivateIpSet build() {
                return new PrivateIpSet(this);
            } 

        } 

    }
    public static class PrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        private java.util.List < PrivateIpSet> privateIpSet;

        private PrivateIpSets(Builder builder) {
            this.privateIpSet = builder.privateIpSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpSets create() {
            return builder().build();
        }

        /**
         * @return privateIpSet
         */
        public java.util.List < PrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

        public static final class Builder {
            private java.util.List < PrivateIpSet> privateIpSet; 

            /**
             * PrivateIpSet.
             */
            public Builder privateIpSet(java.util.List < PrivateIpSet> privateIpSet) {
                this.privateIpSet = privateIpSet;
                return this;
            }

            public PrivateIpSets build() {
                return new PrivateIpSets(this);
            } 

        } 

    }
    public static class SecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        private java.util.List < String > securityGroupId;

        private SecurityGroupIds(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupIds create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List < String > getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List < String > securityGroupId; 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List < String > securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIds build() {
                return new SecurityGroupIds(this);
            } 

        } 

    }
    public static class SlaveInterfaceSpecification extends TeaModel {
        @NameInMap("BondNetworkInterfaceId")
        private String bondNetworkInterfaceId;

        @NameInMap("SlaveNetworkInterfaceId")
        private String slaveNetworkInterfaceId;

        @NameInMap("WorkState")
        private String workState;

        private SlaveInterfaceSpecification(Builder builder) {
            this.bondNetworkInterfaceId = builder.bondNetworkInterfaceId;
            this.slaveNetworkInterfaceId = builder.slaveNetworkInterfaceId;
            this.workState = builder.workState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveInterfaceSpecification create() {
            return builder().build();
        }

        /**
         * @return bondNetworkInterfaceId
         */
        public String getBondNetworkInterfaceId() {
            return this.bondNetworkInterfaceId;
        }

        /**
         * @return slaveNetworkInterfaceId
         */
        public String getSlaveNetworkInterfaceId() {
            return this.slaveNetworkInterfaceId;
        }

        /**
         * @return workState
         */
        public String getWorkState() {
            return this.workState;
        }

        public static final class Builder {
            private String bondNetworkInterfaceId; 
            private String slaveNetworkInterfaceId; 
            private String workState; 

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder bondNetworkInterfaceId(String bondNetworkInterfaceId) {
                this.bondNetworkInterfaceId = bondNetworkInterfaceId;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder slaveNetworkInterfaceId(String slaveNetworkInterfaceId) {
                this.slaveNetworkInterfaceId = slaveNetworkInterfaceId;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder workState(String workState) {
                this.workState = workState;
                return this;
            }

            public SlaveInterfaceSpecification build() {
                return new SlaveInterfaceSpecification(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
}
