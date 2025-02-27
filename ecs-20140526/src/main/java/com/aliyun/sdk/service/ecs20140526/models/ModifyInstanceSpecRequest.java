// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSpecRequest</p>
 */
public class ModifyInstanceSpecRequest extends Request {
    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Query
    @NameInMap("Temporary")
    private Temporary temporary;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("AllowMigrateAcrossZone")
    private Boolean allowMigrateAcrossZone;

    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Disk")
    private java.util.List < Disk> disk;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    @Validation(maximum = 200, minimum = 1)
    private Integer internetMaxBandwidthIn;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("ModifyMode")
    private String modifyMode;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyInstanceSpecRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.temporary = builder.temporary;
        this.sourceRegionId = builder.sourceRegionId;
        this.allowMigrateAcrossZone = builder.allowMigrateAcrossZone;
        this.async = builder.async;
        this.clientToken = builder.clientToken;
        this.disk = builder.disk;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.modifyMode = builder.modifyMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return temporary
     */
    public Temporary getTemporary() {
        return this.temporary;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return allowMigrateAcrossZone
     */
    public Boolean getAllowMigrateAcrossZone() {
        return this.allowMigrateAcrossZone;
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return disk
     */
    public java.util.List < Disk> getDisk() {
        return this.disk;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceSpecRequest, Builder> {
        private SystemDisk systemDisk; 
        private Temporary temporary; 
        private String sourceRegionId; 
        private Boolean allowMigrateAcrossZone; 
        private Boolean async; 
        private String clientToken; 
        private java.util.List < Disk> disk; 
        private String instanceId; 
        private String instanceType; 
        private Integer internetMaxBandwidthIn; 
        private Integer internetMaxBandwidthOut; 
        private String modifyMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSpecRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.temporary = request.temporary;
            this.sourceRegionId = request.sourceRegionId;
            this.allowMigrateAcrossZone = request.allowMigrateAcrossZone;
            this.async = request.async;
            this.clientToken = request.clientToken;
            this.disk = request.disk;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetMaxBandwidthIn = request.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.modifyMode = request.modifyMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * Temporary.
         */
        public Builder temporary(Temporary temporary) {
            this.putQueryParameter("Temporary", temporary);
            this.temporary = temporary;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * Specifies whether to support cross-cluster instance type upgrades.
         * <p>
         * 
         * Default value: false.
         * 
         * When `AllowMigrateAcrossZone` is set to true and you upgrade the instance configurations based on the returned information, take note of the following items:
         * 
         * Instances of the classic network type:
         * 
         * *   For retired instance types, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the private IP address, disk device names, and software license codes of the instance are changed. For more information, see [Retired instance types](~~55263~~). For Linux instances, device names of basic disks (`cloud`) are changed to the form of **xvda** or **xvdb**, while device names of ultra disks (`cloud_efficiency`) and standard SSDs (`cloud_ssd`) are changed to the form of **vda** or **vdb**.
         * *   For instance families available for purchase, when the instance type of an instance is changed, the private IP address of the instance changes. For more information, see [Instance families](~~25378~~).
         * 
         * Instances that reside in virtual private clouds (VPCs): For [retired instance types](~~55263~~), when a non-I/O optimized instance is upgraded to an I/O optimized instance, the disk device names and software license codes of the instance change. For Linux instances, device names of basic disks (`cloud`) are changed to the form of **xvda** or **xvdb**, while device names of ultra disks (`cloud_efficiency`) and standard SSDs (`cloud_ssd`) are changed to the form of **vda** or **vdb**.
         */
        public Builder allowMigrateAcrossZone(Boolean allowMigrateAcrossZone) {
            this.putQueryParameter("AllowMigrateAcrossZone", allowMigrateAcrossZone);
            this.allowMigrateAcrossZone = allowMigrateAcrossZone;
            return this;
        }

        /**
         * Specifies whether to submit an asynchronous request.
         * <p>
         * 
         * Default value: false.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * >该参数暂未开放使用。
         */
        public Builder disk(java.util.List < Disk> disk) {
            this.putQueryParameter("Disk", disk);
            this.disk = disk;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent list of instance types.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
         * <p>
         * 
         * *   When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the value range of this parameter is from 1 to 10, and the default value is 10.
         * *   When the purchased outbound public bandwidth is greater than 10 Mbit/s, the value range of this parameter is from 1 to the value of `InternetMaxBandwidthOut`. The default value of InternetMaxBandwidthIn is the same as the value of `InternetMaxBandwidthOut`.
         * 
         * > When the **pay-by-traffic** billing method is used, the maximum inbound and outbound bandwidth values are used as the upper limits for bandwidth instead of guaranteed values. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
         * <p>
         * 
         * > When the **pay-by-traffic** billing method is used, the maximum inbound and outbound bandwidth values are used as the upper limits for bandwidth instead of guaranteed values. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** billing method for network usage.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * >该参数暂未开放使用。
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyInstanceSpecRequest build() {
            return new ModifyInstanceSpecRequest(this);
        } 

    } 

    public static class SystemDisk extends TeaModel {
        @NameInMap("Category")
        private String category;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private String category; 

            /**
             * The new category of the system disk. This parameter is valid only when you upgrade an instance from a retired instance type to an available instance type or when you upgrade a non-I/O optimized instance to an I/O optimized instance. For more information, see [Retired instance types](~~55263~~) and [Instance families](~~25378~~). Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class Temporary extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InternetMaxBandwidthOut")
        @Validation(maximum = 100, minimum = 1)
        private Integer internetMaxBandwidthOut;

        @NameInMap("StartTime")
        private String startTime;

        private Temporary(Builder builder) {
            this.endTime = builder.endTime;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Temporary create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private Integer internetMaxBandwidthOut; 
            private String startTime; 

            /**
             * > This parameter is in invitational preview and is unavailable for general users.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable for general users.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable for general users.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Temporary build() {
                return new Temporary(this);
            } 

        } 

    }
    public static class Disk extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        private Disk(Builder builder) {
            this.category = builder.category;
            this.diskId = builder.diskId;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String category; 
            private String diskId; 
            private String performanceLevel; 

            /**
             * >该参数暂未开放使用。
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * >该参数暂未开放使用。
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * >该参数暂未开放使用。
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
}
