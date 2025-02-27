// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGADInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateGADInstanceRequest</p>
 */
public class CreateGADInstanceRequest extends Request {
    @Query
    @NameInMap("CentralDBInstanceId")
    @Validation(required = true)
    private String centralDBInstanceId;

    @Query
    @NameInMap("CentralRdsDtsAdminAccount")
    @Validation(required = true)
    private String centralRdsDtsAdminAccount;

    @Query
    @NameInMap("CentralRdsDtsAdminPassword")
    @Validation(required = true)
    private String centralRdsDtsAdminPassword;

    @Query
    @NameInMap("CentralRegionId")
    @Validation(required = true)
    private String centralRegionId;

    @Query
    @NameInMap("DBList")
    @Validation(required = true)
    private String DBList;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UnitNode")
    @Validation(required = true)
    private java.util.List < UnitNode> unitNode;

    private CreateGADInstanceRequest(Builder builder) {
        super(builder);
        this.centralDBInstanceId = builder.centralDBInstanceId;
        this.centralRdsDtsAdminAccount = builder.centralRdsDtsAdminAccount;
        this.centralRdsDtsAdminPassword = builder.centralRdsDtsAdminPassword;
        this.centralRegionId = builder.centralRegionId;
        this.DBList = builder.DBList;
        this.description = builder.description;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.unitNode = builder.unitNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGADInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return centralDBInstanceId
     */
    public String getCentralDBInstanceId() {
        return this.centralDBInstanceId;
    }

    /**
     * @return centralRdsDtsAdminAccount
     */
    public String getCentralRdsDtsAdminAccount() {
        return this.centralRdsDtsAdminAccount;
    }

    /**
     * @return centralRdsDtsAdminPassword
     */
    public String getCentralRdsDtsAdminPassword() {
        return this.centralRdsDtsAdminPassword;
    }

    /**
     * @return centralRegionId
     */
    public String getCentralRegionId() {
        return this.centralRegionId;
    }

    /**
     * @return DBList
     */
    public String getDBList() {
        return this.DBList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    /**
     * @return unitNode
     */
    public java.util.List < UnitNode> getUnitNode() {
        return this.unitNode;
    }

    public static final class Builder extends Request.Builder<CreateGADInstanceRequest, Builder> {
        private String centralDBInstanceId; 
        private String centralRdsDtsAdminAccount; 
        private String centralRdsDtsAdminPassword; 
        private String centralRegionId; 
        private String DBList; 
        private String description; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private java.util.List < UnitNode> unitNode; 

        private Builder() {
            super();
        } 

        private Builder(CreateGADInstanceRequest request) {
            super(request);
            this.centralDBInstanceId = request.centralDBInstanceId;
            this.centralRdsDtsAdminAccount = request.centralRdsDtsAdminAccount;
            this.centralRdsDtsAdminPassword = request.centralRdsDtsAdminPassword;
            this.centralRegionId = request.centralRegionId;
            this.DBList = request.DBList;
            this.description = request.description;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.unitNode = request.unitNode;
        } 

        /**
         * The ID of the primary instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of instance. The primary instance serves as the central node of the global active database cluster.
         * <p>
         * 
         * > 
         * 
         * *   A primary instance can serve as the central node only of a single global active database cluster.
         * 
         * *   Only a primary instance that is created in one of the following regions can serve as the central node of a global active database cluster: China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), China (Zhangjiakou), China (Shenzhen), and China (Chengdu).
         */
        public Builder centralDBInstanceId(String centralDBInstanceId) {
            this.putQueryParameter("CentralDBInstanceId", centralDBInstanceId);
            this.centralDBInstanceId = centralDBInstanceId;
            return this;
        }

        /**
         * The username of the privileged account of the central node. You can call the [DescribeAccounts](~~26265~~) operation to query the privileged account of the central node.
         */
        public Builder centralRdsDtsAdminAccount(String centralRdsDtsAdminAccount) {
            this.putQueryParameter("CentralRdsDtsAdminAccount", centralRdsDtsAdminAccount);
            this.centralRdsDtsAdminAccount = centralRdsDtsAdminAccount;
            return this;
        }

        /**
         * The password of the privileged account of the central node.
         */
        public Builder centralRdsDtsAdminPassword(String centralRdsDtsAdminPassword) {
            this.putQueryParameter("CentralRdsDtsAdminPassword", centralRdsDtsAdminPassword);
            this.centralRdsDtsAdminPassword = centralRdsDtsAdminPassword;
            return this;
        }

        /**
         * The region ID of the central node. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         */
        public Builder centralRegionId(String centralRegionId) {
            this.putQueryParameter("CentralRegionId", centralRegionId);
            this.centralRegionId = centralRegionId;
            return this;
        }

        /**
         * A JSON array that consists of the information about a specified database on the central node. All database information that you specify in this array is synchronized to the unit nodes of the global active database cluster. The JSON array contains the following fields:
         * <p>
         * 
         * *   **name**: the name of the database.
         * *   **all**: specifies whether to synchronize all data in the database or the table. Valid values: **true** and **false**.
         * *   **Table**: the name of the table. If you set the **all** field to **false**, you must nest the name of the table that you want to synchronize into the JSON array.
         * 
         * Example: `{ "testdb": { "name": "testdb", "all": false, "Table": { "order": { "name": "order", "all": true }, "ordernew": { "name": "ordernew", "all": true } } } }`
         */
        public Builder DBList(String DBList) {
            this.putQueryParameter("DBList", DBList);
            this.DBList = DBList;
            return this;
        }

        /**
         * The name of the global active database cluster.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * An array that consists of the details about the tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * An array that consists of the details about the unit node.
         */
        public Builder unitNode(java.util.List < UnitNode> unitNode) {
            this.putQueryParameter("UnitNode", unitNode);
            this.unitNode = unitNode;
            return this;
        }

        @Override
        public CreateGADInstanceRequest build() {
            return new CreateGADInstanceRequest(this);
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
             * The key of the tag. You can create N tag keys at a time. Valid values of N: **1 to 20**. The value of this parameter cannot be an empty string.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. You can create N tag values at a time. Valid values of N: **1 to 20**. The value of this parameter can be an empty string.
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
    public static class UnitNode extends TeaModel {
        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceStorage")
        private Long DBInstanceStorage;

        @NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @NameInMap("DbInstanceClass")
        private String dbInstanceClass;

        @NameInMap("DtsConflict")
        @Validation(required = true)
        private String dtsConflict;

        @NameInMap("DtsInstanceClass")
        @Validation(required = true)
        private String dtsInstanceClass;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("RegionID")
        @Validation(required = true)
        private String regionID;

        @NameInMap("SecurityIPList")
        private String securityIPList;

        @NameInMap("VSwitchID")
        private String vSwitchID;

        @NameInMap("VpcID")
        private String vpcID;

        @NameInMap("ZoneID")
        private String zoneID;

        @NameInMap("ZoneIDSlave1")
        private String zoneIDSlave1;

        @NameInMap("ZoneIDSlave2")
        private String zoneIDSlave2;

        private UnitNode(Builder builder) {
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.DBInstanceStorageType = builder.DBInstanceStorageType;
            this.dbInstanceClass = builder.dbInstanceClass;
            this.dtsConflict = builder.dtsConflict;
            this.dtsInstanceClass = builder.dtsInstanceClass;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.payType = builder.payType;
            this.regionID = builder.regionID;
            this.securityIPList = builder.securityIPList;
            this.vSwitchID = builder.vSwitchID;
            this.vpcID = builder.vpcID;
            this.zoneID = builder.zoneID;
            this.zoneIDSlave1 = builder.zoneIDSlave1;
            this.zoneIDSlave2 = builder.zoneIDSlave2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnitNode create() {
            return builder().build();
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceStorage
         */
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        /**
         * @return DBInstanceStorageType
         */
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        /**
         * @return dbInstanceClass
         */
        public String getDbInstanceClass() {
            return this.dbInstanceClass;
        }

        /**
         * @return dtsConflict
         */
        public String getDtsConflict() {
            return this.dtsConflict;
        }

        /**
         * @return dtsInstanceClass
         */
        public String getDtsInstanceClass() {
            return this.dtsInstanceClass;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return regionID
         */
        public String getRegionID() {
            return this.regionID;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return vSwitchID
         */
        public String getVSwitchID() {
            return this.vSwitchID;
        }

        /**
         * @return vpcID
         */
        public String getVpcID() {
            return this.vpcID;
        }

        /**
         * @return zoneID
         */
        public String getZoneID() {
            return this.zoneID;
        }

        /**
         * @return zoneIDSlave1
         */
        public String getZoneIDSlave1() {
            return this.zoneIDSlave1;
        }

        /**
         * @return zoneIDSlave2
         */
        public String getZoneIDSlave2() {
            return this.zoneIDSlave2;
        }

        public static final class Builder {
            private String DBInstanceDescription; 
            private Long DBInstanceStorage; 
            private String DBInstanceStorageType; 
            private String dbInstanceClass; 
            private String dtsConflict; 
            private String dtsInstanceClass; 
            private String engine; 
            private String engineVersion; 
            private String payType; 
            private String regionID; 
            private String securityIPList; 
            private String vSwitchID; 
            private String vpcID; 
            private String zoneID; 
            private String zoneIDSlave1; 
            private String zoneIDSlave2; 

            /**
             * The name of the unit node that you want to create. The name must meet the following requirements:
             * <p>
             * 
             * *   The name must be **2 to 255** characters in length.
             * *   The name can contain letters, digits, underscores (\_), and hyphens (-) and must start with a letter.
             * *   It cannot start with `http://` or `https://`.
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * The storage capacity of the unit node that you want to create. Unit: GB. The storage capacity increases in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can also call the [DescribeAvailableResource](~~134039~~) operation to query the storage capacity range that is supported for a specified instance type in a region.
             * <p>
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder DBInstanceStorage(Long DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * The storage type that is used by the instance. Valid values:
             * <p>
             * 
             * *   **local_ssd**: local SSD (recommended).
             * *   **cloud_ssd**: standard SSD. This storage type is not recommended. Standard SSDs are no longer available for purchase in some Alibaba Cloud regions.
             * *   **cloud_essd**: ESSD of performance level 1 (PL1).
             * *   **cloud_essd2**: ESSD of PL2.
             * *   **cloud_essd3**: ESSDs of PL3.
             * 
             * The default value of this parameter is determined by the instance type specified by the **DBInstanceClass** parameter.
             * 
             * *   If the instance type specifies the local disk storage type, the default value of this parameter is **local_ssd**.
             * *   If the instance type specifies the cloud disk storage type, the default value of this parameter is **cloud_essd**.
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * The instance type of the unit node that you want to create. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can call the [DescribeAvailableResource](~~134039~~) operation to query the available instance types in a region.
             * <p>
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder dbInstanceClass(String dbInstanceClass) {
                this.dbInstanceClass = dbInstanceClass;
                return this;
            }

            /**
             * The conflict resolution policy based on which Data Transmission Service (DTS) responds to primary key conflicts during data synchronization to the unit node that you want to create. Valid values:
             * <p>
             * 
             * *   **overwrite**: DTS overwrites the conflicting primary key on the destination node.
             * *   **interrupt**: DTS stops the synchronization task, reports an error, and then exits.
             * *   **ignore**: DTS hides the conflicting primary key on the node.
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder dtsConflict(String dtsConflict) {
                this.dtsConflict = dtsConflict;
                return this;
            }

            /**
             * The specifications of the data synchronization task for the unit node that you want to create. Valid values:
             * <p>
             * 
             * *   **small**
             * *   **medium**
             * *   **large**
             * *   **micro**
             * 
             * > For more information, see [Specifications of data synchronization tasks](~~26605~~).
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder dtsInstanceClass(String dtsInstanceClass) {
                this.dtsInstanceClass = dtsInstanceClass;
                return this;
            }

            /**
             * The database engine of the unit node that you want to create. Set the value to **MySQL**.
             * <p>
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version of the unit node that you want to create. Valid values:
             * <p>
             * 
             * *   **8.0**
             * *   **5.7**
             * *   **5.6**
             * *   **5.5**
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The billing method of the unit node that you want to create. Valid values:
             * <p>
             * 
             * *   **Postpaid**: pay-as-you-go.
             * *   **Prepaid**: subscription.
             * 
             * > The system automatically generates a purchase order and completes the payment.
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The region ID of the unit node that you want to create. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
             * <p>
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * The IP address whitelist of the unit node that you want to create. For more information, see [IP address whitelist](~~43185~~). If you want to add more than one entry to the IP address whitelist, separate the entries with commas (,). Each entry must be unique. The IP address whitelist can contain up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:
             * <p>
             * 
             * *   IP addresses, such as `10.10.10.10`.
             * *   CIDR blocks, such as `10.10.10.10/24`. In this example, **24** indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of **1 to 32**.
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * The vSwitch ID of the unit node that you want to create.
             * <p>
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder vSwitchID(String vSwitchID) {
                this.vSwitchID = vSwitchID;
                return this;
            }

            /**
             * The virtual private cloud (VPC) ID of the unit node that you want to create.
             * <p>
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder vpcID(String vpcID) {
                this.vpcID = vpcID;
                return this;
            }

            /**
             * The zone ID of the unit node that you want to create. You can call the [DescribeRegions](~~26243~~) operation to query the ID of the zone.
             * <p>
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder zoneID(String zoneID) {
                this.zoneID = zoneID;
                return this;
            }

            /**
             * The zone ID of the secondary node of the unit node that you want to create. You can call the [DescribeRegions](~~26243~~) operation to query the ID of the zone.
             * <p>
             * 
             * *   If the value of this parameter is the same as the **zone ID** of the unit node that you want to create, the single-zone deployment method is used.
             * *   If the value of this parameter is different from the **zone ID** of the unit node that you want to create, the multiple-zone deployment method is used.
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder zoneIDSlave1(String zoneIDSlave1) {
                this.zoneIDSlave1 = zoneIDSlave1;
                return this;
            }

            /**
             * The zone ID of the logger node of the unit node that you want to create. You can call the [DescribeRegions](~~26243~~) operation to query the ID of the zone.
             * <p>
             * 
             * *   If the value of this parameter is the same as the **zone ID** of the unit node that you want to create, the single-zone deployment method is used.
             * *   If the value of this parameter is different from the **zone ID** of the unit node that you want to create, the multiple-zone deployment method is used.
             * 
             * **N** specifies unit node N. The value of N is an integer that ranges from **1 to 10**. You can create up to 10 unit nodes in a global active database cluster.
             */
            public Builder zoneIDSlave2(String zoneIDSlave2) {
                this.zoneIDSlave2 = zoneIDSlave2;
                return this;
            }

            public UnitNode build() {
                return new UnitNode(this);
            } 

        } 

    }
}
