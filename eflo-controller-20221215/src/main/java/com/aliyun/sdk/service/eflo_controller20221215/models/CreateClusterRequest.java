// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ClusterDescription")
    private String clusterDescription;

    @Body
    @NameInMap("ClusterName")
    private String clusterName;

    @Body
    @NameInMap("ClusterType")
    private String clusterType;

    @Body
    @NameInMap("Components")
    private java.util.List < Components> components;

    @Body
    @NameInMap("HpnZone")
    private String hpnZone;

    @Body
    @NameInMap("IgnoreFailedNodeTasks")
    private Boolean ignoreFailedNodeTasks;

    @Body
    @NameInMap("Networks")
    private Networks networks;

    @Body
    @NameInMap("NimizVSwitches")
    private java.util.List < String > nimizVSwitches;

    @Body
    @NameInMap("NodeGroups")
    private java.util.List < NodeGroups> nodeGroups;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterDescription = builder.clusterDescription;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.components = builder.components;
        this.hpnZone = builder.hpnZone;
        this.ignoreFailedNodeTasks = builder.ignoreFailedNodeTasks;
        this.networks = builder.networks;
        this.nimizVSwitches = builder.nimizVSwitches;
        this.nodeGroups = builder.nodeGroups;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterDescription
     */
    public String getClusterDescription() {
        return this.clusterDescription;
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
     * @return components
     */
    public java.util.List < Components> getComponents() {
        return this.components;
    }

    /**
     * @return hpnZone
     */
    public String getHpnZone() {
        return this.hpnZone;
    }

    /**
     * @return ignoreFailedNodeTasks
     */
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    /**
     * @return networks
     */
    public Networks getNetworks() {
        return this.networks;
    }

    /**
     * @return nimizVSwitches
     */
    public java.util.List < String > getNimizVSwitches() {
        return this.nimizVSwitches;
    }

    /**
     * @return nodeGroups
     */
    public java.util.List < NodeGroups> getNodeGroups() {
        return this.nodeGroups;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String regionId; 
        private String clusterDescription; 
        private String clusterName; 
        private String clusterType; 
        private java.util.List < Components> components; 
        private String hpnZone; 
        private Boolean ignoreFailedNodeTasks; 
        private Networks networks; 
        private java.util.List < String > nimizVSwitches; 
        private java.util.List < NodeGroups> nodeGroups; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterDescription = request.clusterDescription;
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.components = request.components;
            this.hpnZone = request.hpnZone;
            this.ignoreFailedNodeTasks = request.ignoreFailedNodeTasks;
            this.networks = request.networks;
            this.nimizVSwitches = request.nimizVSwitches;
            this.nodeGroups = request.nodeGroups;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClusterDescription.
         */
        public Builder clusterDescription(String clusterDescription) {
            this.putBodyParameter("ClusterDescription", clusterDescription);
            this.clusterDescription = clusterDescription;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * Components.
         */
        public Builder components(java.util.List < Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putBodyParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * HpnZone.
         */
        public Builder hpnZone(String hpnZone) {
            this.putBodyParameter("HpnZone", hpnZone);
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * IgnoreFailedNodeTasks.
         */
        public Builder ignoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
            this.putBodyParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks);
            this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
            return this;
        }

        /**
         * Networks.
         */
        public Builder networks(Networks networks) {
            String networksShrink = shrink(networks, "Networks", "json");
            this.putBodyParameter("Networks", networksShrink);
            this.networks = networks;
            return this;
        }

        /**
         * NimizVSwitches.
         */
        public Builder nimizVSwitches(java.util.List < String > nimizVSwitches) {
            String nimizVSwitchesShrink = shrink(nimizVSwitches, "NimizVSwitches", "json");
            this.putBodyParameter("NimizVSwitches", nimizVSwitchesShrink);
            this.nimizVSwitches = nimizVSwitches;
            return this;
        }

        /**
         * NodeGroups.
         */
        public Builder nodeGroups(java.util.List < NodeGroups> nodeGroups) {
            String nodeGroupsShrink = shrink(nodeGroups, "NodeGroups", "json");
            this.putBodyParameter("NodeGroups", nodeGroupsShrink);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    public static class ComponentConfig extends TeaModel {
        @NameInMap("BasicArgs")
        private Object basicArgs;

        @NameInMap("NodeUnits")
        private java.util.List < ? > nodeUnits;

        private ComponentConfig(Builder builder) {
            this.basicArgs = builder.basicArgs;
            this.nodeUnits = builder.nodeUnits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentConfig create() {
            return builder().build();
        }

        /**
         * @return basicArgs
         */
        public Object getBasicArgs() {
            return this.basicArgs;
        }

        /**
         * @return nodeUnits
         */
        public java.util.List < ? > getNodeUnits() {
            return this.nodeUnits;
        }

        public static final class Builder {
            private Object basicArgs; 
            private java.util.List < ? > nodeUnits; 

            /**
             * BasicArgs.
             */
            public Builder basicArgs(Object basicArgs) {
                this.basicArgs = basicArgs;
                return this;
            }

            /**
             * NodeUnits.
             */
            public Builder nodeUnits(java.util.List < ? > nodeUnits) {
                this.nodeUnits = nodeUnits;
                return this;
            }

            public ComponentConfig build() {
                return new ComponentConfig(this);
            } 

        } 

    }
    public static class Components extends TeaModel {
        @NameInMap("ComponentConfig")
        private ComponentConfig componentConfig;

        @NameInMap("ComponentType")
        private String componentType;

        private Components(Builder builder) {
            this.componentConfig = builder.componentConfig;
            this.componentType = builder.componentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentConfig
         */
        public ComponentConfig getComponentConfig() {
            return this.componentConfig;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        public static final class Builder {
            private ComponentConfig componentConfig; 
            private String componentType; 

            /**
             * ComponentConfig.
             */
            public Builder componentConfig(ComponentConfig componentConfig) {
                this.componentConfig = componentConfig;
                return this;
            }

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    public static class Bonds extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Subnet")
        private String subnet;

        private Bonds(Builder builder) {
            this.name = builder.name;
            this.subnet = builder.subnet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bonds create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subnet
         */
        public String getSubnet() {
            return this.subnet;
        }

        public static final class Builder {
            private String name; 
            private String subnet; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Subnet.
             */
            public Builder subnet(String subnet) {
                this.subnet = subnet;
                return this;
            }

            public Bonds build() {
                return new Bonds(this);
            } 

        } 

    }
    public static class BondPolicy extends TeaModel {
        @NameInMap("BondDefaultSubnet")
        private String bondDefaultSubnet;

        @NameInMap("Bonds")
        private java.util.List < Bonds> bonds;

        private BondPolicy(Builder builder) {
            this.bondDefaultSubnet = builder.bondDefaultSubnet;
            this.bonds = builder.bonds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BondPolicy create() {
            return builder().build();
        }

        /**
         * @return bondDefaultSubnet
         */
        public String getBondDefaultSubnet() {
            return this.bondDefaultSubnet;
        }

        /**
         * @return bonds
         */
        public java.util.List < Bonds> getBonds() {
            return this.bonds;
        }

        public static final class Builder {
            private String bondDefaultSubnet; 
            private java.util.List < Bonds> bonds; 

            /**
             * BondDefaultSubnet.
             */
            public Builder bondDefaultSubnet(String bondDefaultSubnet) {
                this.bondDefaultSubnet = bondDefaultSubnet;
                return this;
            }

            /**
             * Bonds.
             */
            public Builder bonds(java.util.List < Bonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            public BondPolicy build() {
                return new BondPolicy(this);
            } 

        } 

    }
    public static class MachineTypePolicyBonds extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Subnet")
        private String subnet;

        private MachineTypePolicyBonds(Builder builder) {
            this.name = builder.name;
            this.subnet = builder.subnet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineTypePolicyBonds create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subnet
         */
        public String getSubnet() {
            return this.subnet;
        }

        public static final class Builder {
            private String name; 
            private String subnet; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Subnet.
             */
            public Builder subnet(String subnet) {
                this.subnet = subnet;
                return this;
            }

            public MachineTypePolicyBonds build() {
                return new MachineTypePolicyBonds(this);
            } 

        } 

    }
    public static class MachineTypePolicy extends TeaModel {
        @NameInMap("Bonds")
        private java.util.List < MachineTypePolicyBonds> bonds;

        @NameInMap("MachineType")
        private String machineType;

        private MachineTypePolicy(Builder builder) {
            this.bonds = builder.bonds;
            this.machineType = builder.machineType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineTypePolicy create() {
            return builder().build();
        }

        /**
         * @return bonds
         */
        public java.util.List < MachineTypePolicyBonds> getBonds() {
            return this.bonds;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        public static final class Builder {
            private java.util.List < MachineTypePolicyBonds> bonds; 
            private String machineType; 

            /**
             * Bonds.
             */
            public Builder bonds(java.util.List < MachineTypePolicyBonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            /**
             * MachineType.
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            public MachineTypePolicy build() {
                return new MachineTypePolicy(this);
            } 

        } 

    }
    public static class NodePolicyBonds extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Subnet")
        private String subnet;

        private NodePolicyBonds(Builder builder) {
            this.name = builder.name;
            this.subnet = builder.subnet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePolicyBonds create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subnet
         */
        public String getSubnet() {
            return this.subnet;
        }

        public static final class Builder {
            private String name; 
            private String subnet; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Subnet.
             */
            public Builder subnet(String subnet) {
                this.subnet = subnet;
                return this;
            }

            public NodePolicyBonds build() {
                return new NodePolicyBonds(this);
            } 

        } 

    }
    public static class NodePolicy extends TeaModel {
        @NameInMap("Bonds")
        private java.util.List < NodePolicyBonds> bonds;

        @NameInMap("NodeId")
        private String nodeId;

        private NodePolicy(Builder builder) {
            this.bonds = builder.bonds;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePolicy create() {
            return builder().build();
        }

        /**
         * @return bonds
         */
        public java.util.List < NodePolicyBonds> getBonds() {
            return this.bonds;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private java.util.List < NodePolicyBonds> bonds; 
            private String nodeId; 

            /**
             * Bonds.
             */
            public Builder bonds(java.util.List < NodePolicyBonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public NodePolicy build() {
                return new NodePolicy(this);
            } 

        } 

    }
    public static class IpAllocationPolicy extends TeaModel {
        @NameInMap("BondPolicy")
        private BondPolicy bondPolicy;

        @NameInMap("MachineTypePolicy")
        private java.util.List < MachineTypePolicy> machineTypePolicy;

        @NameInMap("NodePolicy")
        private java.util.List < NodePolicy> nodePolicy;

        private IpAllocationPolicy(Builder builder) {
            this.bondPolicy = builder.bondPolicy;
            this.machineTypePolicy = builder.machineTypePolicy;
            this.nodePolicy = builder.nodePolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpAllocationPolicy create() {
            return builder().build();
        }

        /**
         * @return bondPolicy
         */
        public BondPolicy getBondPolicy() {
            return this.bondPolicy;
        }

        /**
         * @return machineTypePolicy
         */
        public java.util.List < MachineTypePolicy> getMachineTypePolicy() {
            return this.machineTypePolicy;
        }

        /**
         * @return nodePolicy
         */
        public java.util.List < NodePolicy> getNodePolicy() {
            return this.nodePolicy;
        }

        public static final class Builder {
            private BondPolicy bondPolicy; 
            private java.util.List < MachineTypePolicy> machineTypePolicy; 
            private java.util.List < NodePolicy> nodePolicy; 

            /**
             * BondPolicy.
             */
            public Builder bondPolicy(BondPolicy bondPolicy) {
                this.bondPolicy = bondPolicy;
                return this;
            }

            /**
             * MachineTypePolicy.
             */
            public Builder machineTypePolicy(java.util.List < MachineTypePolicy> machineTypePolicy) {
                this.machineTypePolicy = machineTypePolicy;
                return this;
            }

            /**
             * NodePolicy.
             */
            public Builder nodePolicy(java.util.List < NodePolicy> nodePolicy) {
                this.nodePolicy = nodePolicy;
                return this;
            }

            public IpAllocationPolicy build() {
                return new IpAllocationPolicy(this);
            } 

        } 

    }
    public static class VpdSubnets extends TeaModel {
        @NameInMap("SubnetCidr")
        private String subnetCidr;

        @NameInMap("SubnetType")
        private String subnetType;

        @NameInMap("ZoneId")
        private String zoneId;

        private VpdSubnets(Builder builder) {
            this.subnetCidr = builder.subnetCidr;
            this.subnetType = builder.subnetType;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpdSubnets create() {
            return builder().build();
        }

        /**
         * @return subnetCidr
         */
        public String getSubnetCidr() {
            return this.subnetCidr;
        }

        /**
         * @return subnetType
         */
        public String getSubnetType() {
            return this.subnetType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String subnetCidr; 
            private String subnetType; 
            private String zoneId; 

            /**
             * SubnetCidr.
             */
            public Builder subnetCidr(String subnetCidr) {
                this.subnetCidr = subnetCidr;
                return this;
            }

            /**
             * SubnetType.
             */
            public Builder subnetType(String subnetType) {
                this.subnetType = subnetType;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VpdSubnets build() {
                return new VpdSubnets(this);
            } 

        } 

    }
    public static class NewVpdInfo extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CloudLinkCidr")
        private String cloudLinkCidr;

        @NameInMap("CloudLinkId")
        private String cloudLinkId;

        @NameInMap("MonitorVpcId")
        private String monitorVpcId;

        @NameInMap("MonitorVswitchId")
        private String monitorVswitchId;

        @NameInMap("VpdCidr")
        private String vpdCidr;

        @NameInMap("VpdSubnets")
        private java.util.List < VpdSubnets> vpdSubnets;

        private NewVpdInfo(Builder builder) {
            this.cenId = builder.cenId;
            this.cloudLinkCidr = builder.cloudLinkCidr;
            this.cloudLinkId = builder.cloudLinkId;
            this.monitorVpcId = builder.monitorVpcId;
            this.monitorVswitchId = builder.monitorVswitchId;
            this.vpdCidr = builder.vpdCidr;
            this.vpdSubnets = builder.vpdSubnets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewVpdInfo create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cloudLinkCidr
         */
        public String getCloudLinkCidr() {
            return this.cloudLinkCidr;
        }

        /**
         * @return cloudLinkId
         */
        public String getCloudLinkId() {
            return this.cloudLinkId;
        }

        /**
         * @return monitorVpcId
         */
        public String getMonitorVpcId() {
            return this.monitorVpcId;
        }

        /**
         * @return monitorVswitchId
         */
        public String getMonitorVswitchId() {
            return this.monitorVswitchId;
        }

        /**
         * @return vpdCidr
         */
        public String getVpdCidr() {
            return this.vpdCidr;
        }

        /**
         * @return vpdSubnets
         */
        public java.util.List < VpdSubnets> getVpdSubnets() {
            return this.vpdSubnets;
        }

        public static final class Builder {
            private String cenId; 
            private String cloudLinkCidr; 
            private String cloudLinkId; 
            private String monitorVpcId; 
            private String monitorVswitchId; 
            private String vpdCidr; 
            private java.util.List < VpdSubnets> vpdSubnets; 

            /**
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * CloudLinkCidr.
             */
            public Builder cloudLinkCidr(String cloudLinkCidr) {
                this.cloudLinkCidr = cloudLinkCidr;
                return this;
            }

            /**
             * CloudLinkId.
             */
            public Builder cloudLinkId(String cloudLinkId) {
                this.cloudLinkId = cloudLinkId;
                return this;
            }

            /**
             * MonitorVpcId.
             */
            public Builder monitorVpcId(String monitorVpcId) {
                this.monitorVpcId = monitorVpcId;
                return this;
            }

            /**
             * MonitorVswitchId.
             */
            public Builder monitorVswitchId(String monitorVswitchId) {
                this.monitorVswitchId = monitorVswitchId;
                return this;
            }

            /**
             * VpdCidr.
             */
            public Builder vpdCidr(String vpdCidr) {
                this.vpdCidr = vpdCidr;
                return this;
            }

            /**
             * VpdSubnets.
             */
            public Builder vpdSubnets(java.util.List < VpdSubnets> vpdSubnets) {
                this.vpdSubnets = vpdSubnets;
                return this;
            }

            public NewVpdInfo build() {
                return new NewVpdInfo(this);
            } 

        } 

    }
    public static class VpdInfo extends TeaModel {
        @NameInMap("VpdId")
        private String vpdId;

        @NameInMap("VpdSubnets")
        private java.util.List < String > vpdSubnets;

        private VpdInfo(Builder builder) {
            this.vpdId = builder.vpdId;
            this.vpdSubnets = builder.vpdSubnets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpdInfo create() {
            return builder().build();
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return vpdSubnets
         */
        public java.util.List < String > getVpdSubnets() {
            return this.vpdSubnets;
        }

        public static final class Builder {
            private String vpdId; 
            private java.util.List < String > vpdSubnets; 

            /**
             * 专有网络 id
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * 集群子网id列表
             */
            public Builder vpdSubnets(java.util.List < String > vpdSubnets) {
                this.vpdSubnets = vpdSubnets;
                return this;
            }

            public VpdInfo build() {
                return new VpdInfo(this);
            } 

        } 

    }
    public static class Networks extends TeaModel {
        @NameInMap("IpAllocationPolicy")
        private java.util.List < IpAllocationPolicy> ipAllocationPolicy;

        @NameInMap("NewVpdInfo")
        private NewVpdInfo newVpdInfo;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("VSwitchZoneId")
        private String vSwitchZoneId;

        @NameInMap("VpdInfo")
        private VpdInfo vpdInfo;

        private Networks(Builder builder) {
            this.ipAllocationPolicy = builder.ipAllocationPolicy;
            this.newVpdInfo = builder.newVpdInfo;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchZoneId = builder.vSwitchZoneId;
            this.vpdInfo = builder.vpdInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Networks create() {
            return builder().build();
        }

        /**
         * @return ipAllocationPolicy
         */
        public java.util.List < IpAllocationPolicy> getIpAllocationPolicy() {
            return this.ipAllocationPolicy;
        }

        /**
         * @return newVpdInfo
         */
        public NewVpdInfo getNewVpdInfo() {
            return this.newVpdInfo;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchZoneId
         */
        public String getVSwitchZoneId() {
            return this.vSwitchZoneId;
        }

        /**
         * @return vpdInfo
         */
        public VpdInfo getVpdInfo() {
            return this.vpdInfo;
        }

        public static final class Builder {
            private java.util.List < IpAllocationPolicy> ipAllocationPolicy; 
            private NewVpdInfo newVpdInfo; 
            private String securityGroupId; 
            private String vSwitchZoneId; 
            private VpdInfo vpdInfo; 

            /**
             * IpAllocationPolicy.
             */
            public Builder ipAllocationPolicy(java.util.List < IpAllocationPolicy> ipAllocationPolicy) {
                this.ipAllocationPolicy = ipAllocationPolicy;
                return this;
            }

            /**
             * NewVpdInfo.
             */
            public Builder newVpdInfo(NewVpdInfo newVpdInfo) {
                this.newVpdInfo = newVpdInfo;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VSwitchZoneId.
             */
            public Builder vSwitchZoneId(String vSwitchZoneId) {
                this.vSwitchZoneId = vSwitchZoneId;
                return this;
            }

            /**
             * 复用VPD信息
             */
            public Builder vpdInfo(VpdInfo vpdInfo) {
                this.vpdInfo = vpdInfo;
                return this;
            }

            public Networks build() {
                return new Networks(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("LoginPassword")
        private String loginPassword;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private Nodes(Builder builder) {
            this.hostname = builder.hostname;
            this.loginPassword = builder.loginPassword;
            this.nodeId = builder.nodeId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return loginPassword
         */
        public String getLoginPassword() {
            return this.loginPassword;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
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
            private String hostname; 
            private String loginPassword; 
            private String nodeId; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * LoginPassword.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class NodeGroups extends TeaModel {
        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("MachineType")
        private String machineType;

        @NameInMap("NodeGroupDescription")
        private String nodeGroupDescription;

        @NameInMap("NodeGroupName")
        private String nodeGroupName;

        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("ZoneId")
        private String zoneId;

        private NodeGroups(Builder builder) {
            this.imageId = builder.imageId;
            this.machineType = builder.machineType;
            this.nodeGroupDescription = builder.nodeGroupDescription;
            this.nodeGroupName = builder.nodeGroupName;
            this.nodes = builder.nodes;
            this.userData = builder.userData;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroups create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return nodeGroupDescription
         */
        public String getNodeGroupDescription() {
            return this.nodeGroupDescription;
        }

        /**
         * @return nodeGroupName
         */
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String imageId; 
            private String machineType; 
            private String nodeGroupDescription; 
            private String nodeGroupName; 
            private java.util.List < Nodes> nodes; 
            private String userData; 
            private String zoneId; 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * MachineType.
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * NodeGroupDescription.
             */
            public Builder nodeGroupDescription(String nodeGroupDescription) {
                this.nodeGroupDescription = nodeGroupDescription;
                return this;
            }

            /**
             * NodeGroupName.
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public NodeGroups build() {
                return new NodeGroups(this);
            } 

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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
}
