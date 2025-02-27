// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOfficeSitesResponseBody</p>
 */
public class DescribeOfficeSitesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("OfficeSites")
    private java.util.List < OfficeSites> officeSites;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOfficeSitesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.officeSites = builder.officeSites;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOfficeSitesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return officeSites
     */
    public java.util.List < OfficeSites> getOfficeSites() {
        return this.officeSites;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < OfficeSites> officeSites; 
        private String requestId; 

        /**
         * The token that determines the start point of the next query. If this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Details of the workspaces.
         */
        public Builder officeSites(java.util.List < OfficeSites> officeSites) {
            this.officeSites = officeSites;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOfficeSitesResponseBody build() {
            return new DescribeOfficeSitesResponseBody(this);
        } 

    } 

    public static class ADConnectors extends TeaModel {
        @NameInMap("ADConnectorAddress")
        private String ADConnectorAddress;

        @NameInMap("ConnectorStatus")
        private String connectorStatus;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("Specification")
        private String specification;

        @NameInMap("TrustKey")
        private String trustKey;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private ADConnectors(Builder builder) {
            this.ADConnectorAddress = builder.ADConnectorAddress;
            this.connectorStatus = builder.connectorStatus;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.specification = builder.specification;
            this.trustKey = builder.trustKey;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ADConnectors create() {
            return builder().build();
        }

        /**
         * @return ADConnectorAddress
         */
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
        }

        /**
         * @return connectorStatus
         */
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return trustKey
         */
        public String getTrustKey() {
            return this.trustKey;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String ADConnectorAddress; 
            private String connectorStatus; 
            private String networkInterfaceId; 
            private String specification; 
            private String trustKey; 
            private String vSwitchId; 

            /**
             * The IP address of the AD connector.
             */
            public Builder ADConnectorAddress(String ADConnectorAddress) {
                this.ADConnectorAddress = ADConnectorAddress;
                return this;
            }

            /**
             * The state of the AD connector.
             */
            public Builder connectorStatus(String connectorStatus) {
                this.connectorStatus = connectorStatus;
                return this;
            }

            /**
             * The ID of the network interface controller (NIC) that is associated with the AD connector.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * The type of the AD connector.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * The trust password that is specified when you configured the AD trust relationship.
             */
            public Builder trustKey(String trustKey) {
                this.trustKey = trustKey;
                return this;
            }

            /**
             * The ID of the vSwitch that corresponds to the network of the AD connector.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public ADConnectors build() {
                return new ADConnectors(this);
            } 

        } 

    }
    public static class Logs extends TeaModel {
        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("Step")
        private String step;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private Logs(Builder builder) {
            this.level = builder.level;
            this.message = builder.message;
            this.step = builder.step;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String level; 
            private String message; 
            private String step; 
            private String timeStamp; 

            /**
             * The log level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Details of the log entry.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The step that corresponds to the log entry.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * The time when the log entry was printed.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    public static class OfficeSites extends TeaModel {
        @NameInMap("ADConnectors")
        private java.util.List < ADConnectors> ADConnectors;

        @NameInMap("AdHostname")
        private String adHostname;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("CenAttachStatus")
        private String cenAttachStatus;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CloudBoxOfficeSite")
        private Boolean cloudBoxOfficeSite;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CustomSecurityGroupId")
        private String customSecurityGroupId;

        @NameInMap("DesktopAccessType")
        private String desktopAccessType;

        @NameInMap("DesktopCount")
        private Long desktopCount;

        @NameInMap("DesktopVpcEndpoint")
        private String desktopVpcEndpoint;

        @NameInMap("DnsAddress")
        private java.util.List < String > dnsAddress;

        @NameInMap("DnsUserName")
        private String dnsUserName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainPassword")
        private String domainPassword;

        @NameInMap("DomainUserName")
        private String domainUserName;

        @NameInMap("EnableAdminAccess")
        private Boolean enableAdminAccess;

        @NameInMap("EnableCrossDesktopAccess")
        private Boolean enableCrossDesktopAccess;

        @NameInMap("EnableInternetAccess")
        private Boolean enableInternetAccess;

        @NameInMap("FileSystemIds")
        private java.util.List < String > fileSystemIds;

        @NameInMap("Logs")
        private java.util.List < Logs> logs;

        @NameInMap("MfaEnabled")
        private Boolean mfaEnabled;

        @NameInMap("Name")
        private String name;

        @NameInMap("NeedVerifyLoginRisk")
        private Boolean needVerifyLoginRisk;

        @NameInMap("NeedVerifyZeroDevice")
        private Boolean needVerifyZeroDevice;

        @NameInMap("NetworkPackageId")
        private String networkPackageId;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteType")
        private String officeSiteType;

        @NameInMap("OuName")
        private String ouName;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("RdsLicenseAddress")
        private String rdsLicenseAddress;

        @NameInMap("RdsLicenseDomainName")
        private String rdsLicenseDomainName;

        @NameInMap("RdsLicenseStatus")
        private String rdsLicenseStatus;

        @NameInMap("SsoEnabled")
        private Boolean ssoEnabled;

        @NameInMap("SsoType")
        private String ssoType;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubDnsAddress")
        private java.util.List < String > subDnsAddress;

        @NameInMap("SubDomainName")
        private String subDomainName;

        @NameInMap("TotalEdsCount")
        private Long totalEdsCount;

        @NameInMap("TotalEdsCountForGroup")
        private Long totalEdsCountForGroup;

        @NameInMap("TrustPassword")
        private String trustPassword;

        @NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcType")
        private String vpcType;

        private OfficeSites(Builder builder) {
            this.ADConnectors = builder.ADConnectors;
            this.adHostname = builder.adHostname;
            this.bandwidth = builder.bandwidth;
            this.cenAttachStatus = builder.cenAttachStatus;
            this.cenId = builder.cenId;
            this.cidrBlock = builder.cidrBlock;
            this.cloudBoxOfficeSite = builder.cloudBoxOfficeSite;
            this.creationTime = builder.creationTime;
            this.customSecurityGroupId = builder.customSecurityGroupId;
            this.desktopAccessType = builder.desktopAccessType;
            this.desktopCount = builder.desktopCount;
            this.desktopVpcEndpoint = builder.desktopVpcEndpoint;
            this.dnsAddress = builder.dnsAddress;
            this.dnsUserName = builder.dnsUserName;
            this.domainName = builder.domainName;
            this.domainPassword = builder.domainPassword;
            this.domainUserName = builder.domainUserName;
            this.enableAdminAccess = builder.enableAdminAccess;
            this.enableCrossDesktopAccess = builder.enableCrossDesktopAccess;
            this.enableInternetAccess = builder.enableInternetAccess;
            this.fileSystemIds = builder.fileSystemIds;
            this.logs = builder.logs;
            this.mfaEnabled = builder.mfaEnabled;
            this.name = builder.name;
            this.needVerifyLoginRisk = builder.needVerifyLoginRisk;
            this.needVerifyZeroDevice = builder.needVerifyZeroDevice;
            this.networkPackageId = builder.networkPackageId;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteType = builder.officeSiteType;
            this.ouName = builder.ouName;
            this.protocolType = builder.protocolType;
            this.rdsLicenseAddress = builder.rdsLicenseAddress;
            this.rdsLicenseDomainName = builder.rdsLicenseDomainName;
            this.rdsLicenseStatus = builder.rdsLicenseStatus;
            this.ssoEnabled = builder.ssoEnabled;
            this.ssoType = builder.ssoType;
            this.status = builder.status;
            this.subDnsAddress = builder.subDnsAddress;
            this.subDomainName = builder.subDomainName;
            this.totalEdsCount = builder.totalEdsCount;
            this.totalEdsCountForGroup = builder.totalEdsCountForGroup;
            this.trustPassword = builder.trustPassword;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.vpcType = builder.vpcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfficeSites create() {
            return builder().build();
        }

        /**
         * @return ADConnectors
         */
        public java.util.List < ADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        /**
         * @return adHostname
         */
        public String getAdHostname() {
            return this.adHostname;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return cenAttachStatus
         */
        public String getCenAttachStatus() {
            return this.cenAttachStatus;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return cloudBoxOfficeSite
         */
        public Boolean getCloudBoxOfficeSite() {
            return this.cloudBoxOfficeSite;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return customSecurityGroupId
         */
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        /**
         * @return desktopAccessType
         */
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        /**
         * @return desktopCount
         */
        public Long getDesktopCount() {
            return this.desktopCount;
        }

        /**
         * @return desktopVpcEndpoint
         */
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        /**
         * @return dnsAddress
         */
        public java.util.List < String > getDnsAddress() {
            return this.dnsAddress;
        }

        /**
         * @return dnsUserName
         */
        public String getDnsUserName() {
            return this.dnsUserName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainPassword
         */
        public String getDomainPassword() {
            return this.domainPassword;
        }

        /**
         * @return domainUserName
         */
        public String getDomainUserName() {
            return this.domainUserName;
        }

        /**
         * @return enableAdminAccess
         */
        public Boolean getEnableAdminAccess() {
            return this.enableAdminAccess;
        }

        /**
         * @return enableCrossDesktopAccess
         */
        public Boolean getEnableCrossDesktopAccess() {
            return this.enableCrossDesktopAccess;
        }

        /**
         * @return enableInternetAccess
         */
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        /**
         * @return fileSystemIds
         */
        public java.util.List < String > getFileSystemIds() {
            return this.fileSystemIds;
        }

        /**
         * @return logs
         */
        public java.util.List < Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return mfaEnabled
         */
        public Boolean getMfaEnabled() {
            return this.mfaEnabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needVerifyLoginRisk
         */
        public Boolean getNeedVerifyLoginRisk() {
            return this.needVerifyLoginRisk;
        }

        /**
         * @return needVerifyZeroDevice
         */
        public Boolean getNeedVerifyZeroDevice() {
            return this.needVerifyZeroDevice;
        }

        /**
         * @return networkPackageId
         */
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return ouName
         */
        public String getOuName() {
            return this.ouName;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return rdsLicenseAddress
         */
        public String getRdsLicenseAddress() {
            return this.rdsLicenseAddress;
        }

        /**
         * @return rdsLicenseDomainName
         */
        public String getRdsLicenseDomainName() {
            return this.rdsLicenseDomainName;
        }

        /**
         * @return rdsLicenseStatus
         */
        public String getRdsLicenseStatus() {
            return this.rdsLicenseStatus;
        }

        /**
         * @return ssoEnabled
         */
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        /**
         * @return ssoType
         */
        public String getSsoType() {
            return this.ssoType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subDnsAddress
         */
        public java.util.List < String > getSubDnsAddress() {
            return this.subDnsAddress;
        }

        /**
         * @return subDomainName
         */
        public String getSubDomainName() {
            return this.subDomainName;
        }

        /**
         * @return totalEdsCount
         */
        public Long getTotalEdsCount() {
            return this.totalEdsCount;
        }

        /**
         * @return totalEdsCountForGroup
         */
        public Long getTotalEdsCountForGroup() {
            return this.totalEdsCountForGroup;
        }

        /**
         * @return trustPassword
         */
        public String getTrustPassword() {
            return this.trustPassword;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        public static final class Builder {
            private java.util.List < ADConnectors> ADConnectors; 
            private String adHostname; 
            private Integer bandwidth; 
            private String cenAttachStatus; 
            private String cenId; 
            private String cidrBlock; 
            private Boolean cloudBoxOfficeSite; 
            private String creationTime; 
            private String customSecurityGroupId; 
            private String desktopAccessType; 
            private Long desktopCount; 
            private String desktopVpcEndpoint; 
            private java.util.List < String > dnsAddress; 
            private String dnsUserName; 
            private String domainName; 
            private String domainPassword; 
            private String domainUserName; 
            private Boolean enableAdminAccess; 
            private Boolean enableCrossDesktopAccess; 
            private Boolean enableInternetAccess; 
            private java.util.List < String > fileSystemIds; 
            private java.util.List < Logs> logs; 
            private Boolean mfaEnabled; 
            private String name; 
            private Boolean needVerifyLoginRisk; 
            private Boolean needVerifyZeroDevice; 
            private String networkPackageId; 
            private String officeSiteId; 
            private String officeSiteType; 
            private String ouName; 
            private String protocolType; 
            private String rdsLicenseAddress; 
            private String rdsLicenseDomainName; 
            private String rdsLicenseStatus; 
            private Boolean ssoEnabled; 
            private String ssoType; 
            private String status; 
            private java.util.List < String > subDnsAddress; 
            private String subDomainName; 
            private Long totalEdsCount; 
            private Long totalEdsCountForGroup; 
            private String trustPassword; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 
            private String vpcType; 

            /**
             * Details of the AD connectors.
             */
            public Builder ADConnectors(java.util.List < ADConnectors> ADConnectors) {
                this.ADConnectors = ADConnectors;
                return this;
            }

            /**
             * The hostname of the domain controller. The hostname must comply with the naming conventions for hostnames in Windows.
             */
            public Builder adHostname(String adHostname) {
                this.adHostname = adHostname;
                return this;
            }

            /**
             * The maximum public bandwidth of the Internet access package. Valid values: 0 to 1000.\
             * <p>
             * If the value of this parameter is 0, Internet access is disabled.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * CenAttachStatus.
             */
            public Builder cenAttachStatus(String cenAttachStatus) {
                this.cenAttachStatus = cenAttachStatus;
                return this;
            }

            /**
             * The ID of the Cloud Enterprise Network (CEN) instance.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The IPv4 CIDR block that is included in the secure office network of the workspace.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * Indicates whether the workspace is created for cloud desktops on a cloud box.
             */
            public Builder cloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
                this.cloudBoxOfficeSite = cloudBoxOfficeSite;
                return this;
            }

            /**
             * The time when the workspace was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder customSecurityGroupId(String customSecurityGroupId) {
                this.customSecurityGroupId = customSecurityGroupId;
                return this;
            }

            /**
             * The method used to connect the Alibaba Cloud Workspace client to cloud desktops.
             */
            public Builder desktopAccessType(String desktopAccessType) {
                this.desktopAccessType = desktopAccessType;
                return this;
            }

            /**
             * The number of cloud desktops that are created.
             */
            public Builder desktopCount(Long desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * The endpoint that is used to connect to cloud desktops over a VPC.
             */
            public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
                this.desktopVpcEndpoint = desktopVpcEndpoint;
                return this;
            }

            /**
             * The DNS addresses of the AD domains.
             */
            public Builder dnsAddress(java.util.List < String > dnsAddress) {
                this.dnsAddress = dnsAddress;
                return this;
            }

            /**
             * The username of the DNS account.
             */
            public Builder dnsUserName(String dnsUserName) {
                this.dnsUserName = dnsUserName;
                return this;
            }

            /**
             * The domain name of the enterprise Active Directory (AD) system.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The password of the domain administrator.
             */
            public Builder domainPassword(String domainPassword) {
                this.domainPassword = domainPassword;
                return this;
            }

            /**
             * The username of the domain administrator.
             */
            public Builder domainUserName(String domainUserName) {
                this.domainUserName = domainUserName;
                return this;
            }

            /**
             * Indicates whether the permissions of the desktop administrator are granted to the user of the cloud desktop.
             */
            public Builder enableAdminAccess(Boolean enableAdminAccess) {
                this.enableAdminAccess = enableAdminAccess;
                return this;
            }

            /**
             * Indicates whether the desktop communication feature is enabled for cloud desktops in the same workspace. If the feature is enabled, cloud desktops in the same workspace can access each other.
             */
            public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
                this.enableCrossDesktopAccess = enableCrossDesktopAccess;
                return this;
            }

            /**
             * Indicates whether Internet access is enabled.
             */
            public Builder enableInternetAccess(Boolean enableInternetAccess) {
                this.enableInternetAccess = enableInternetAccess;
                return this;
            }

            /**
             * The IDs of the Apsara File Storage NAS (NAS) file systems.
             */
            public Builder fileSystemIds(java.util.List < String > fileSystemIds) {
                this.fileSystemIds = fileSystemIds;
                return this;
            }

            /**
             * Details of the registration logs.
             */
            public Builder logs(java.util.List < Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Indicates whether multi-factor authentication (MFA) is enabled.
             */
            public Builder mfaEnabled(Boolean mfaEnabled) {
                this.mfaEnabled = mfaEnabled;
                return this;
            }

            /**
             * The name of the workspace. The name is unique in the same region.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether two-factor verification for logons is enabled. This parameter is returned only for workspaces of the convenience account type.\
             * <p>
             * If two-factor verification is enabled, the system checks whether security risks exist within the logon account when a convenience user logs on to an Alibaba Cloud Workspace client. If risks are detected, the system sends a verification code to the email address that is associated with the account. Then, the convenience user can log on to the client only after the user enters the correct verification code.
             */
            public Builder needVerifyLoginRisk(Boolean needVerifyLoginRisk) {
                this.needVerifyLoginRisk = needVerifyLoginRisk;
                return this;
            }

            /**
             * Indicates whether trusted device verification is enabled.
             */
            public Builder needVerifyZeroDevice(Boolean needVerifyZeroDevice) {
                this.needVerifyZeroDevice = needVerifyZeroDevice;
                return this;
            }

            /**
             * The ID of the Internet access package.
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The account type of the workspace.
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * The name of the organizational unit (OU) that is connected to the AD domain.
             */
            public Builder ouName(String ouName) {
                this.ouName = ouName;
                return this;
            }

            /**
             * The type of the protocol.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * RdsLicenseAddress.
             */
            public Builder rdsLicenseAddress(String rdsLicenseAddress) {
                this.rdsLicenseAddress = rdsLicenseAddress;
                return this;
            }

            /**
             * RdsLicenseDomainName.
             */
            public Builder rdsLicenseDomainName(String rdsLicenseDomainName) {
                this.rdsLicenseDomainName = rdsLicenseDomainName;
                return this;
            }

            /**
             * RdsLicenseStatus.
             */
            public Builder rdsLicenseStatus(String rdsLicenseStatus) {
                this.rdsLicenseStatus = rdsLicenseStatus;
                return this;
            }

            /**
             * Indicates whether single sign-on (SSO) is enabled.
             */
            public Builder ssoEnabled(Boolean ssoEnabled) {
                this.ssoEnabled = ssoEnabled;
                return this;
            }

            /**
             * The type of SSO.
             */
            public Builder ssoType(String ssoType) {
                this.ssoType = ssoType;
                return this;
            }

            /**
             * The state of the workspace.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The DNS addresses of the AD subdomains.
             */
            public Builder subDnsAddress(java.util.List < String > subDnsAddress) {
                this.subDnsAddress = subDnsAddress;
                return this;
            }

            /**
             * The username of a Domain Name System (DNS) account in the AD subdomain.
             */
            public Builder subDomainName(String subDomainName) {
                this.subDomainName = subDomainName;
                return this;
            }

            /**
             * TotalEdsCount.
             */
            public Builder totalEdsCount(Long totalEdsCount) {
                this.totalEdsCount = totalEdsCount;
                return this;
            }

            /**
             * TotalEdsCountForGroup.
             */
            public Builder totalEdsCountForGroup(Long totalEdsCountForGroup) {
                this.totalEdsCountForGroup = totalEdsCountForGroup;
                return this;
            }

            /**
             * > This parameter is unavailable.
             */
            public Builder trustPassword(String trustPassword) {
                this.trustPassword = trustPassword;
                return this;
            }

            /**
             * The IDs of the vSwitches.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * The ID of the secure office network of the workspace. The ID is also the ID of the virtual private cloud (VPC) used by the workspace.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The VPC type.
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            public OfficeSites build() {
                return new OfficeSites(this);
            } 

        } 

    }
}
