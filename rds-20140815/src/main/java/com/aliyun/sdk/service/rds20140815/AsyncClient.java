// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rds20140815.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Use the cloud migration feature](~~365562~~)
      *
     */
    CompletableFuture<ActivateMigrationTargetInstanceResponse> activateMigrationTargetInstance(ActivateMigrationTargetInstanceRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Usage notes
      * *   Each tag consists of a tag key and a tag value. The tag key is required, and the tag value is optional.
      * *   The tag key and tag value cannot start with aliyun.
      * *   The tag key and tag value are not case-sensitive.
      * *   The maximum length of a tag key is 64 characters, and the maximum length of a tag value is 128 characters.
      * *   A maximum of 10 tags can be added to each instance. Each tag that is added to the same instance must have a unique tag key. If you add a new tag to the instance and the key of the new tag is the same as that of an existing tag, the new tag overwrites the existing tag.
      *
     */
    CompletableFuture<AddTagsToResourceResponse> addTagsToResource(AddTagsToResourceRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Apply for a public endpoint for an ApsaraDB RDS for MySQL instance](~~26128~~)
      * *   [Apply for a public endpoint for an ApsaraDB RDS for PostgreSQL instance](~~97738~~)
      * *   [Apply for a public endpoint for an ApsaraDB RDS for SQL Server instance](~~97736~~)
      * *   [Apply for a public endpoint for an ApsaraDB RDS for MariaDB instance](~~97740~~)
      *
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
      * If read-only instances are attached to a primary ApsaraDB RDS for SQL Server instance, you can call this operation to apply for a unified read-only routing endpoint for the primary instance. After you apply for a read-only routing endpoint for a primary instance, the existing endpoints of the primary instance and its read-only instances remain valid. In addition, you can still apply for internal and public endpoints.
      * Before you call this operation, make sure that the following requirements are met:
      * *   If the instance runs MySQL, the instance uses a shared proxy.
      * *   The instance is in the Running state.
      * *   Read-only instances are attached to the primary instance.
      * *   The instance does not have an ongoing Data Transmission Service (DTS) migration task.
      * *   The instance runs one of the following database versions and RDS editions:
      *     *   SQL Server (cluster edition)
      *     *   MySQL 5.7 on RDS High-availability Edition with local SSDs
      *     *   MySQL 5.6
      *
     */
    CompletableFuture<AllocateReadWriteSplittingConnectionResponse> allocateReadWriteSplittingConnection(AllocateReadWriteSplittingConnectionRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      *
     */
    CompletableFuture<AttachWhitelistTemplateToInstanceResponse> attachWhitelistTemplateToInstance(AttachWhitelistTemplateToInstanceRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)Feature description
      * When the [read/write splitting](~~51073~~) feature is enabled, this operation is used to calculate system-assigned read weights. For more information about custom read weights, see [DescribeDBInstanceNetInfo](~~610423~~).
      * ### [](#)Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   If the instance runs MySQL, the instance uses a shared proxy.
      * *   The instance runs one of the following MySQL versions and RDS editions:
      *     *   MySQL 5.7 on RDS High-availability Edition (with local disks)
      *     *   MySQL 5.6
      *     *   SQL Server on RDS Cluster Edition
      *
     */
    CompletableFuture<CalculateDBInstanceWeightResponse> calculateDBInstanceWeight(CalculateDBInstanceWeightRequest request);

    /**
      * This operation is supported for instances that run SQL Server and belong to the dedicated or dedicated host instance family. For more information about how to start a migration task, see [ImportDatabaseBetweenInstances](~~26301~~).
      * >  This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
      *
     */
    CompletableFuture<CancelImportResponse> cancelImport(CancelImportRequest request);

    CompletableFuture<CheckAccountNameAvailableResponse> checkAccountNameAvailable(CheckAccountNameAvailableRequest request);

    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance](~~206671~~).
      * > : If your RDS instance uses the new architecture and is created after October 10, 2022, this feature is not supported for the RDS instance. For more information, see [\\[Notice\\] SLR authorization is required to create an ApsaraDB RDS for PostgreSQL instance from October 10, 2022](~~452313~~).
      *
     */
    CompletableFuture<CheckCreateDdrDBInstanceResponse> checkCreateDdrDBInstance(CheckCreateDdrDBInstanceRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<CheckDBNameAvailableResponse> checkDBNameAvailable(CheckDBNameAvailableRequest request);

    CompletableFuture<CheckInstanceExistResponse> checkInstanceExist(CheckInstanceExistRequest request);

    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Restore data of an ApsaraDB RDS for MySQL instance](~~96147~~)
      * *   [Restore data of an ApsaraDB RDS for PostgreSQL instance](~~96776~~)
      * *   [Restore data of an ApsaraDB RDS for SQL Server instance](~~95722~~)
      * *   [Restore data of an ApsaraDB RDS for MariaDB instance](~~97151~~)
      *
     */
    CompletableFuture<CloneDBInstanceResponse> cloneDBInstance(CloneDBInstanceRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    CompletableFuture<CloneParameterGroupResponse> cloneParameterGroup(CloneParameterGroupRequest request);

    /**
      * After you call the QueryNotify operation to query notifications for an instance, you can call this operation to mark the notifications as confirmed. For more information, see [Query notifications for an ApsaraDB RDS instance](~~427959~~).
      *
     */
    CompletableFuture<ConfirmNotifyResponse> confirmNotify(ConfirmNotifyRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<CopyDatabaseResponse> copyDatabase(CopyDatabaseRequest request);

    /**
      * ### Supported database engines
      * RDS SQL Server
      * ### References
      * > : Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Replicate databases between ApsaraDB RDS for SQL Server instances](~~95702~~)
      *
     */
    CompletableFuture<CopyDatabaseBetweenInstancesResponse> copyDatabaseBetweenInstances(CopyDatabaseBetweenInstancesRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### References
      * > : Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Create an account on an ApsaraDB RDS for MySQL instance](~~96089~~)
      * *   [Create an account on an ApsaraDB RDS for PostgreSQL instance](~~96753~~)
      * *   [Create an account on an ApsaraDB RDS for SQL Server instance](~~95810~~)
      * *   [Create an account on an ApsaraDB RDS for MariaDB instance](~~97132~~)
      *
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Usage notes
      * This operation uses the backup feature of ApsaraDB RDS to create a backup set. You can also use an operation of Database Backup (DBS) to create a backup set. For more information, see [List of operations by function of DBS](~~437245~~).
      * ### [](#)Precautions
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance does not have ongoing backup tasks.
      * *   The number of backup files that are created per day for an instance cannot exceed 20.
      * ### [](#)References
      * *   [Use the data backup feature for an ApsaraDB RDS for MySQL instance](~~378074~~)
      * *   [Use the data backup feature for an ApsaraDB RDS for PostgreSQL instance](~~96772~~)
      * *   [Use the data backup feature for an ApsaraDB RDS for SQL Server instance](~~95717~~)
      * *   [Use the data backup feature for an ApsaraDB RDS for MariaDB instance](~~97147~~)
      *
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use the cloud migration feature](~~365562~~)
      *
     */
    CompletableFuture<CreateCloudMigrationPrecheckTaskResponse> createCloudMigrationPrecheckTask(CreateCloudMigrationPrecheckTaskRequest request);

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Use the cloud migration feature](~~365562~~)
      *
     */
    CompletableFuture<CreateCloudMigrationTaskResponse> createCloudMigrationTask(CreateCloudMigrationTaskRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### References
      * > : Fees are generated if the call is successful. Before you call this operation, carefully read the following documentation:
      * *   [Create an ApsaraDB RDS for MySQL instance](~~148036~~)
      * *   [Create a serverless ApsaraDB RDS for MySQL instance](~~412231~~)
      * *   [Create an ApsaraDB RDS for PostgreSQL instance](~~148038~~)
      * *   [Create a serverless ApsaraDB RDS for PostgreSQL instance](~~607753~~)
      * *   [Enable Babelfish for an ApsaraDB RDS for PostgreSQL instance](~~428615~~)
      * *   [Create an ApsaraDB RDS for SQL Server instance](~~148037~~)
      * *   [Create a serverless ApsaraDB RDS for SQL Server instance](~~603465~~)
      * *   [Create an ApsaraDB RDS for MariaDB instance](~~148040~~)
      *
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
      * ### Supported database engine
      * MySQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:
      * [Add a read-only endpoint for a cluster](~~464132~~)
      *
     */
    CompletableFuture<CreateDBInstanceEndpointResponse> createDBInstanceEndpoint(CreateDBInstanceEndpointRequest request);

    /**
      * ### Supported database engine
      * MySQL
      * ### Precautions
      * *   You can create a public endpoint of an endpoint type only when no public endpoint is created for this endpoint type.
      * *   The node weights and other configurations are the same as those of the internal endpoint of this endpoint type. Only one public endpoint and one internal endpoint can be created for each endpoint type.
      *
     */
    CompletableFuture<CreateDBInstanceEndpointAddressResponse> createDBInstanceEndpointAddress(CreateDBInstanceEndpointAddressRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### References
      * > : Fees are generated if the call is successful. Before you call this operation, carefully read the following documentation:
      * *   [Manage ApsaraDB RDS for MySQL instances in the recycle bin](~~96065~~)
      * *   [Manage ApsaraDB RDS for PostgreSQL instances in the recycle bin](~~96752~~)
      * *   [Manage ApsaraDB RDS for SQL Server instances in the recycle bin](~~95669~~)
      * *   [Manage ApsaraDB RDS for MariaDB instances in the recycle bin](~~97131~~)
      *
     */
    CompletableFuture<CreateDBInstanceForRebuildResponse> createDBInstanceForRebuild(CreateDBInstanceForRebuildRequest request);

    /**
      * ### Supported database engines
      * MySQL
      * ### References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Add a node to an ApsaraDB RDS for MySQL cluster](~~464129~~)
      *
     */
    CompletableFuture<CreateDBNodesResponse> createDBNodes(CreateDBNodesRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for MySQL instance](~~184921~~)
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for PostgreSQL instance](~~418274~~)
      *
     */
    CompletableFuture<CreateDBProxyEndpointAddressResponse> createDBProxyEndpointAddress(CreateDBProxyEndpointAddressRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Create a database in an ApsaraDB RDS for MySQL instance](~~96105~~)
      * *   [Create a database in an ApsaraDB RDS for PostgreSQL instance](~~96758~~)
      * *   [Create a database in an ApsaraDB RDS for SQL Server instance](~~95698~~)
      * *   [Create a database in an ApsaraDB RDS for MariaDB instance](~~97136~~)
      *
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
      * >  Before restoration, you can call the [CheckCreateDdrDBInstance](~~121721~~) operation to check whether a cross-region backup set can be used for cross-region restoration.
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      *
     */
    CompletableFuture<CreateDdrInstanceResponse> createDdrInstance(CreateDdrInstanceRequest request);

    /**
      * > This operation is no longer maintained. You can use the CreateDiagnosticReport operation of Database Autonomy Service (DAS) to create a diagnostic report.
      * After you call this operation to create a diagnostic report, you can call the DescribeDiagnosticReportList operation to download the diagnostic report.
      *
     */
    CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request);

    /**
      * ### Prerequisites
      * *   Your Alibaba Cloud account is used.
      * *   The balance in your Alibaba Cloud account is greater than or equal to USD 100.
      * *   A primary ApsaraDB RDS for MySQL instance is created, and the instance is not running as a node in a global active database cluster. You can call the [CreateDBInstance](~~26228~~) operation to create an instance.
      * > You must create a primary ApsaraDB RDS for MySQL instance in one of the following regions: China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), China (Zhangjiakou), China (Shenzhen), and China (Chengdu).
      * For more information, see [Create and release an ApsaraDB RDS global active database cluster](~~328592~~).
      *
     */
    CompletableFuture<CreateGADInstanceResponse> createGADInstance(CreateGADInstanceRequest request);

    /**
      * ## [](#)Prerequisites
      * An ApsaraDB RDS global active database cluster is created. You can call the [CreateGADInstance](~~336893~~) operation to create a global active database cluster.
      * For more information, see [Add unit nodes to or move unit nodes from an ApsaraDB RDS global active database cluster](~~331851~~).
      *
     */
    CompletableFuture<CreateGadInstanceMemberResponse> createGadInstanceMember(CreateGadInstanceMemberRequest request);

    /**
      * ### [](#)Supported database engines
      * SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Migrate data from a self-managed SQL Server instance to an ApsaraDB RDS for SQL Server instance](~~100019~~)
      *
     */
    CompletableFuture<CreateMigrateTaskResponse> createMigrateTask(CreateMigrateTaskRequest request);

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * This operation is used to migrate backup data to the cloud. Before you call this operation, make sure that you understand the descriptions in the following topics:
      * *   [Migrate the full backup data of a self-managed SQL Server database to an ApsaraDB RDS instance that runs SQL Server 2008 R2](~~95737~~)
      * *   [Migrate full backup data of SQL Server 2012, 2014, 2016, 2017, or 2019 databases](~~95738~~)
      * *   [Migrate incremental backup data to ApsaraDB RDS for SQL Server 2012, 2014, 2016, 2017, or 2019](~~95736~~)
      *
     */
    CompletableFuture<CreateOnlineDatabaseTaskResponse> createOnlineDatabaseTask(CreateOnlineDatabaseTaskRequest request);

    /**
      * ### [](#)Supported database engines
      * MySQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Add a node to an ApsaraDB RDS for MySQL cluster](~~464129~~)
      *
     */
    CompletableFuture<CreateOrderForCreateDBNodesResponse> createOrderForCreateDBNodes(CreateOrderForCreateDBNodesRequest request);

    /**
      * ### [](#)Supported database engines
      * MySQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Delete a node from an ApsaraDB RDS for MySQL instance that runs RDS Cluster Edition](~~464130~~)
      *
     */
    CompletableFuture<CreateOrderForDeleteDBNodesResponse> createOrderForDeleteDBNodes(CreateOrderForDeleteDBNodesRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Manage extensions](~~2402409~~)
      * ### [](#)Precautions
      * Install only the plug-ins that are supported by the major engine version of the instance. Otherwise, the installation fails.
      * *   For more information, see [Extensions supported by ApsaraDB RDS for PostgreSQL](~~142340~~).
      * *   You can call the [DescribeDBInstanceAttribute](~~610394~~) operation to query the major engine version of an instance.
      *
     */
    CompletableFuture<CreatePostgresExtensionsResponse> createPostgresExtensions(CreatePostgresExtensionsRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Create a read-only ApsaraDB RDS for MySQL instance](~~56991~~)
      * *   [Create a read-only ApsaraDB RDS for PostgreSQL instance](~~108959~~)
      * *   [Create a read-only ApsaraDB RDS for SQL Server instance](~~99005~~)
      *
     */
    CompletableFuture<CreateReadOnlyDBInstanceResponse> createReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest request);

    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    /**
      * ### Supported database engine
      * PostgreSQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Service-linked roles](~~342840~~)
      *
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
      * ### [](#)Supported database engines
      * Your RDS instance runs SQL Server 2008 R2 with local disks.
      * ### [](#)Description
      * You can create a temporary instance based on a backup set or a point in time within the past seven days. Before you call this operation, make sure that the following requirements are met:
      * *   Your instance runs SQL Server 2008 R2 with local disks.
      * *   Your instance is in the Running state.
      * *   Your instance does not have ongoing migration tasks.
      * *   The last creation of a backup file is complete.
      * >  After a temporary instance is created, the temporary instance inherits the accounts and databases in the backup set.
      *
     */
    CompletableFuture<CreateTempDBInstanceResponse> createTempDBInstance(CreateTempDBInstanceRequest request);

    CompletableFuture<CreateYouhuiForOrderResponse> createYouhuiForOrder(CreateYouhuiForOrderRequest request);

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      *
     */
    CompletableFuture<DeleteADSettingResponse> deleteADSetting(DeleteADSettingRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Delete a database account from an ApsaraDB RDS for MySQL instance](~~96104~~)
      * *   [Delete a database account from an ApsaraDB RDS for PostgreSQL instance](~~147649~~)
      * *   [Delete a database account from an ApsaraDB RDS for SQL Server instance](~~95694~~)
      * *   [Delete a database account from an ApsaraDB RDS for MariaDB instance](~~97135~~)
      *
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * > Only instances that run RDS High-availability Edition are supported.
      * ### Description
      * You can call this operation to delete backup sets of the instance itself. Backup sets of the associated instances such as read-only, disaster recovery, and cloned instances are not deleted.
      * ### Precautions
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   If the log backup feature is disabled, instances cannot be restored by point in time. You can delete data backup sets that are retained for more than seven days.
      * *   If the log backup feature is enabled and the log backup retention period is shorter than the data backup retention period, you can delete the data backup files that are retained for a period longer than the log backup retention period.
      *
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
      * ### Supported database engine
      * SQL Server
      * ### Usage notes
      * This operation is available for users whose accounts are added to the whitelist. If your account is not added to the whitelist, you can join the Database Backup (DBS) DingTalk group whose ID is 35585947 and contact the on-duty engineer to add your account to the whitelist.
      *
     */
    CompletableFuture<DeleteBackupFileResponse> deleteBackupFile(DeleteBackupFileRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Note Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Release an ApsaraDB RDS for MySQL instance](~~96057~~)
      * *   [Release an ApsaraDB RDS for PostgreSQL instance](~~96749~~)
      * *   [Release an ApsaraDB RDS for SQL Server instance](~~95662~~)
      * *   [Release an ApsaraDB RDS for MariaDB instance](~~97128~~)
      *
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
      * ### Supported database engine
      * MySQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Delete the read-only endpoint of an ApsaraDB RDS for MySQL cluster](~~464133~~)
      *
     */
    CompletableFuture<DeleteDBInstanceEndpointResponse> deleteDBInstanceEndpoint(DeleteDBInstanceEndpointRequest request);

    /**
      * ### Supported database engine
      * MySQL
      * ### Precautions
      * You can delete only the public endpoint of each endpoint type from the instance. If you want to delete an internal endpoint of any endpoint type, you can delete the type of endpoint.
      *
     */
    CompletableFuture<DeleteDBInstanceEndpointAddressResponse> deleteDBInstanceEndpointAddress(DeleteDBInstanceEndpointAddressRequest request);

    /**
      * ### Supported database engine
      * MySQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Delete a node from an ApsaraDB RDS for MySQL instance that runs RDS Cluster Edition](~~464130~~)
      *
     */
    CompletableFuture<DeleteDBNodesResponse> deleteDBNodes(DeleteDBNodesRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for MySQL instance](~~184921~~)
      * *   [Configure the dedicated proxy endpoint for an ApsaraDB RDS for PostgreSQL instance](~~418274~~)
      *
     */
    CompletableFuture<DeleteDBProxyEndpointAddressResponse> deleteDBProxyEndpointAddress(DeleteDBProxyEndpointAddressRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### [](#)References
      * > : Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Delete a database from an ApsaraDB RDS for MySQL instance](~~96106~~)
      * *   [Delete a database from an ApsaraDB RDS for PostgreSQL instance](~~96759~~)
      * *   [Delete a database from an ApsaraDB RDS for SQL Server instance](~~95699~~)
      * *   [Delete a database from an ApsaraDB RDS for MariaDB instance](~~97137~~)
      *
     */
    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [Usage notes](#)
      * *   A global active database cluster cannot be restored after it is deleted. Proceed with caution.
      * *   If you delete a global active database cluster, the system removes all nodes and Data Transmission Service (DTS) synchronization tasks from the cluster. However, the system does not release the ApsaraDB RDS for MySQL instances that run as nodes in the cluster. If you no longer need the ApsaraDB RDS for MySQL instances, you can call the [DeleteDBInstance](~~26229~~) to release the instances one after another.
      *
     */
    CompletableFuture<DeleteGadInstanceResponse> deleteGadInstance(DeleteGadInstanceRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    CompletableFuture<DeleteParameterGroupResponse> deleteParameterGroup(DeleteParameterGroupRequest request);

    /**
      * ### Supported database engines
      * RDS PostgreSQL
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Manage extensions](~~2402409~~)
      *
     */
    CompletableFuture<DeletePostgresExtensionsResponse> deletePostgresExtensions(DeletePostgresExtensionsRequest request);

    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    /**
      * ### [](#)Supported database engine
      * *   PostgreSQL
      * ### [](#)Precautions
      * You can delete a replication slot only when the status of the slot is **INACTIVE**. You can call the DescribeSlots operation to query the status of a replication slot.
      *
     */
    CompletableFuture<DeleteSlotResponse> deleteSlot(DeleteSlotRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [](#)Description
      * *   A full backup file contains the data of a self-managed MySQL instance. You can restore the data of a self-managed MySQL instance from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * *   This operation deletes full backup files only from the ApsaraDB RDS console. This operation does not affect the full backup files that are stored as objects in Object Storage Service (OSS) buckets. After you call this operation to delete a full backup file, you can call the [ImportUserBackupFile](~~260266~~)operation to import the full backup file again.
      *
     */
    CompletableFuture<DeleteUserBackupFileResponse> deleteUserBackupFile(DeleteUserBackupFileRequest request);

    /**
      * ### [](#)Supported database engines
      * MySQL
      * ### [](#)References
      * [Migrate data between ApsaraDB RDS for MySQL instances](~~96154~~)
      *
     */
    CompletableFuture<DescibeImportsFromDatabaseResponse> descibeImportsFromDatabase(DescibeImportsFromDatabaseRequest request);

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      *
     */
    CompletableFuture<DescribeADInfoResponse> describeADInfo(DescribeADInfoRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<DescribeActionEventPolicyResponse> describeActionEventPolicy(DescribeActionEventPolicyRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    CompletableFuture<DescribeAllWhitelistTemplateResponse> describeAllWhitelistTemplate(DescribeAllWhitelistTemplateRequest request);

    CompletableFuture<DescribeAnalyticdbByPrimaryDBInstanceResponse> describeAnalyticdbByPrimaryDBInstance(DescribeAnalyticdbByPrimaryDBInstanceRequest request);

    CompletableFuture<DescribeAvailableClassesResponse> describeAvailableClasses(DescribeAvailableClassesRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      *
     */
    CompletableFuture<DescribeAvailableCrossRegionResponse> describeAvailableCrossRegion(DescribeAvailableCrossRegionRequest request);

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [View the Enhanced Monitoring metrics](~~299200~~)
      *
     */
    CompletableFuture<DescribeAvailableMetricsResponse> describeAvailableMetrics(DescribeAvailableMetricsRequest request);

    /**
      * >  To view the time range within which you can restore data from a standard backup set, see [DescribeBackups](~~26273~~)
      * ### [](#)Supported database engines
      * MySQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      *
     */
    CompletableFuture<DescribeAvailableRecoveryTimeResponse> describeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeAvailableZonesResponse> describeAvailableZones(DescribeAvailableZonesRequest request);

    /**
      * > This operation is phased out.
      *
     */
    CompletableFuture<DescribeBackupDatabaseResponse> describeBackupDatabase(DescribeBackupDatabaseRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   MariaDB
      * ### Usage notes
      * *   If the return value of the **DownloadLink** parameter is NULL, ApsaraDB RDS does not provide a download URL.
      * *   If the return value of the **DownloadLink** parameter is not NULL, ApsaraDB RDS provides a URL for you to download backup files. The expiration time of the URL is specified by the **LinkExpiredTime** parameter. You must download the backup files before the expiration time.
      * *   If you use a RAM user to download backup files, you must grant permissions to the RAM user. For more information, see [Grant backup file download permissions to a RAM user with read-only permissions](~~100043~~).
      * *   Each log file that is returned by this operation contains the log entries that are generated over the time range that is specified by the StartTime and EndTime parameters.
      *
     */
    CompletableFuture<DescribeBinlogFilesResponse> describeBinlogFiles(DescribeBinlogFilesRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeCharacterSetNameResponse> describeCharacterSetName(DescribeCharacterSetNameRequest request);

    CompletableFuture<DescribeClassDetailsResponse> describeClassDetails(DescribeClassDetailsRequest request);

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      *
     */
    CompletableFuture<DescribeCloudMigrationPrecheckResultResponse> describeCloudMigrationPrecheckResult(DescribeCloudMigrationPrecheckResultRequest request);

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      *
     */
    CompletableFuture<DescribeCloudMigrationResultResponse> describeCloudMigrationResult(DescribeCloudMigrationResultRequest request);

    /**
      * ### Supported database engine
      * SQL Server
      *
     */
    CompletableFuture<DescribeCollationTimeZonesResponse> describeCollationTimeZones(DescribeCollationTimeZonesRequest request);

    /**
      * ApsaraDB RDS for MySQL instances support cross-region backup and restoration. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~) and [Restore the data of an ApsaraDB RDS for MySQL instance across regions](~~120875~~).
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance](~~206671~~).
      *
     */
    CompletableFuture<DescribeCrossBackupMetaListResponse> describeCrossBackupMetaList(DescribeCrossBackupMetaListRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance](~~206671~~).
      *
     */
    CompletableFuture<DescribeCrossRegionBackupDBInstanceResponse> describeCrossRegionBackupDBInstance(DescribeCrossRegionBackupDBInstanceRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * >  For more information about how to query cross-region log backup files, see [DescribeCrossRegionLogBackupFiles](~~121734~~).
      *
     */
    CompletableFuture<DescribeCrossRegionBackupsResponse> describeCrossRegionBackups(DescribeCrossRegionBackupsRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * >  For more information about how to query cross-region data backup files, see [DescribeCrossRegionBackups](~~121733~~).
      *
     */
    CompletableFuture<DescribeCrossRegionLogBackupFilesResponse> describeCrossRegionLogBackupFiles(DescribeCrossRegionLogBackupFilesRequest request);

    CompletableFuture<DescribeCurrentModifyOrderResponse> describeCurrentModifyOrder(DescribeCurrentModifyOrderRequest request);

    CompletableFuture<DescribeCustinsResourceInfoResponse> describeCustinsResourceInfo(DescribeCustinsResourceInfoRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeDBInstanceByTagsResponse> describeDBInstanceByTags(DescribeDBInstanceByTagsRequest request);

    CompletableFuture<DescribeDBInstanceConnectivityResponse> describeDBInstanceConnectivity(DescribeDBInstanceConnectivityRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<DescribeDBInstanceDetailResponse> describeDBInstanceDetail(DescribeDBInstanceDetailRequest request);

    CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      *
     */
    CompletableFuture<DescribeDBInstanceEndpointsResponse> describeDBInstanceEndpoints(DescribeDBInstanceEndpointsRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Query the data replication mode of an ApsaraDB RDS for MySQL instance](~~96055~~)
      * *   [Query the data replication mode of an ApsaraDB RDS for PostgreSQL instance](~~151265~~)
      * *   [Query the data replication mode of an ApsaraDB RDS for SQL Server instance](~~415433~~)
      *
     */
    CompletableFuture<DescribeDBInstanceHAConfigResponse> describeDBInstanceHAConfig(DescribeDBInstanceHAConfigRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<DescribeDBInstanceIPArrayListResponse> describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS SQL Server
      * ### [](#)Prerequisites
      * *   The RDS instance runs RDS Basic Edition, RDS High-availability Edition, or RDS Cluster Edition. If your RDS instance runs RDS High-availability Edition, make sure that the instance runs SQL Server 2012 or later.
      * *   The RDS instance belongs to a general-purpose or dedicated instance family. The shared instance family is not supported.
      * *   If the RDS instance runs RDS Basic Edition, the instance is created on or after September 02, 2022. You can view the Creation Time
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Configure a distributed transaction whitelist](~~124321~~)
      *
     */
    CompletableFuture<DescribeDBInstanceIpHostnameResponse> describeDBInstanceIpHostname(DescribeDBInstanceIpHostnameRequest request);

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [View the Enhanced Monitoring metrics](~~299200~~)
      *
     */
    CompletableFuture<DescribeDBInstanceMetricsResponse> describeDBInstanceMetrics(DescribeDBInstanceMetricsRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeDBInstanceMonitorResponse> describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoForChannelResponse> describeDBInstanceNetInfoForChannel(DescribeDBInstanceNetInfoForChannelRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeDBInstancePromoteActivityResponse> describeDBInstancePromoteActivity(DescribeDBInstancePromoteActivityRequest request);

    /**
      * This operation is used to query the original settings of shared proxies rather than the latest settings of dedicated proxies. For more information about how to query the settings of dedicated proxies, see [DescribeDBProxy](~~141055~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature must be enabled for the primary instance.
      * *   The read/write splitting feature must be enabled for the primary instance.
      *
     */
    CompletableFuture<DescribeDBInstanceProxyConfigurationResponse> describeDBInstanceProxyConfiguration(DescribeDBInstanceProxyConfigurationRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      *
     */
    CompletableFuture<DescribeDBInstanceTDEResponse> describeDBInstanceTDE(DescribeDBInstanceTDERequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
      * @deprecated
      * **
      * **Description:** This operation is phased out. Use the [DescribeDBInstances](~~610396~~) operation instead.
      *
     */
    CompletableFuture<DescribeDBInstancesAsCsvResponse> describeDBInstancesAsCsv(DescribeDBInstancesAsCsvRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<DescribeDBInstancesByExpireTimeResponse> describeDBInstancesByExpireTime(DescribeDBInstancesByExpireTimeRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<DescribeDBInstancesByPerformanceResponse> describeDBInstancesByPerformance(DescribeDBInstancesByPerformanceRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<DescribeDBInstancesForCloneResponse> describeDBInstancesForClone(DescribeDBInstancesForCloneRequest request);

    /**
      * Before you purchase or upgrade an instance that runs MySQL or PostgreSQL, you can call the DescribeDBMiniEngineVersions operation to query the minor engine versions that are available for the instance.
      *
     */
    CompletableFuture<DescribeDBMiniEngineVersionsResponse> describeDBMiniEngineVersions(DescribeDBMiniEngineVersionsRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      *
     */
    CompletableFuture<DescribeDBProxyResponse> describeDBProxy(DescribeDBProxyRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      *
     */
    CompletableFuture<DescribeDBProxyEndpointResponse> describeDBProxyEndpoint(DescribeDBProxyEndpointRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * >  Starting October 17, 2023, ApsaraDB RDS provides a dedicated proxy free of charge for each ApsaraDB RDS for MySQL instance on RDS Cluster Edition. For more information, see [\\[Special offers/Price changes\\] One proxy is provided free of charge for ApsaraDB RDS for MySQL instances on RDS Cluster Edition](~~2555466~~).
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [View the monitoring data of an ApsaraDB RDS for MySQL instance](~~194241~~)
      * *   [View the monitoring data of an ApsaraDB RDS for PostgreSQL instance](~~418275~~)
      *
     */
    CompletableFuture<DescribeDBProxyPerformanceResponse> describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request);

    /**
      * ### [](#)Supported database engines
      * SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Configures a distributed transaction whitelist for an ApsaraDB RDS for SQL Server instance](~~124321~~)
      *
     */
    CompletableFuture<DescribeDTCSecurityIpHostsForSQLServerResponse> describeDTCSecurityIpHostsForSQLServer(DescribeDTCSecurityIpHostsForSQLServerRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    /**
      * Dedicated clusters allow you to manage a number of instances in a cluster at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    CompletableFuture<DescribeDedicatedHostGroupsResponse> describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request);

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    /**
      * ### Supported database engine
      * MySQL
      * > This operation is available only for instances that use local disks.
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * For more information about how to retain the data backup files of an instance after the instance is released, see [Configure automatic backup](~~98818~~).
      *
     */
    CompletableFuture<DescribeDetachedBackupsResponse> describeDetachedBackups(DescribeDetachedBackupsRequest request);

    /**
      * @deprecated
      * >  This operation is phased out.
      *
     */
    CompletableFuture<DescribeDiagnosticReportListResponse> describeDiagnosticReportList(DescribeDiagnosticReportListRequest request);

    /**
      * Error logs contain the time when they were generated and the error messages.
      *
     */
    CompletableFuture<DescribeErrorLogsResponse> describeErrorLogs(DescribeErrorLogsRequest request);

    /**
      * The event history feature enables you to view the events that occurred within a region over a specific time range. Historical events include instance creation and parameter modification. For more information, see [View the event history of an ApsaraDB RDS instance](~~129759~~).
      * Before you call this operation, make sure that the event history feature is enabled. Otherwise, this operation fails.
      *
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      *
     */
    CompletableFuture<DescribeGadInstancesResponse> describeGadInstances(DescribeGadInstancesRequest request);

    /**
      * By default, Alibaba Cloud uses persistent connections to check the availability of an instance. For more information, see [What is availability detection?](~~207467~~)
      *
     */
    CompletableFuture<DescribeHADiagnoseConfigResponse> describeHADiagnoseConfig(DescribeHADiagnoseConfigRequest request);

    /**
      * After a primary/secondary switchover is complete, the primary instance is demoted to the secondary instance and the secondary instance is promoted to primary. For more information, see [Switch workloads over between primary and secondary ApsaraDB RDS instances](~~96054~~).
      * When you call this operation, you must make sure that the instance runs RDS High-availability Edition, RDS Enterprise Edition, and RDS Cluster Edition. RDS Cluster Edition is supported for ApsaraDB RDS for MySQL and ApsaraDB RDS for SQL Server.
      *
     */
    CompletableFuture<DescribeHASwitchConfigResponse> describeHASwitchConfig(DescribeHASwitchConfigRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Tasks of an ApsaraDB RDS for MySQL instance](~~474275~~)
      * *   [Tasks of an ApsaraDB RDS for PostrgreSQL instance](~~474537~~)
      * *   [Tasks of an ApsaraDB RDS for SQL Server instance](~~614826~~)
      *
     */
    CompletableFuture<DescribeHistoryTasksResponse> describeHistoryTasks(DescribeHistoryTasksRequest request);

    CompletableFuture<DescribeHostGroupElasticStrategyParametersResponse> describeHostGroupElasticStrategyParameters(DescribeHostGroupElasticStrategyParametersRequest request);

    /**
      * >  This operation is available only for instances that run SQL Server. If you require this operation, contact **Alibaba Cloud technical support**.
      * ### [](#)Prerequisites
      * The instance meets the following requirements:
      * *   The instance resides in a region other than the China (Zhangjiakou) region.
      * *   The instance runs RDS Basic Edition, RDS Cluster Edition, or RDS High-availability Edition. If your instance runs RDS High-availability Edition, make sure that the instance runs SQL Server 2012 or later.
      * *   The instance belongs to the general-purpose or dedicated instance family. The shared instance family is not supported.
      * *   The instance resides in a virtual private cloud (VPC). For more information about how to change the network type of an RDS instance, see [Change the network type](~~95707~~).
      * *   If the instance runs RDS High-availability Edition or RDS Cluster Edition, the instance is created on or after January 1, 2021. If the instance runs RDS Basic Edition, the instance is created on or after September 02, 2022. You can view the **Creation Time** parameter of an instance in the **Status** section of the **Basic Information** page in the ApsaraDB RDS console.
      * Your **Alibaba Cloud account** is used for logons.
      *
     */
    CompletableFuture<DescribeHostWebShellResponse> describeHostWebShell(DescribeHostWebShellRequest request);

    CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      *
     */
    CompletableFuture<DescribeInstanceCrossBackupPolicyResponse> describeInstanceCrossBackupPolicy(DescribeInstanceCrossBackupPolicyRequest request);

    CompletableFuture<DescribeInstanceKeywordsResponse> describeInstanceKeywords(DescribeInstanceKeywordsRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    CompletableFuture<DescribeInstanceLinkedWhitelistTemplateResponse> describeInstanceLinkedWhitelistTemplate(DescribeInstanceLinkedWhitelistTemplateRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeLocalAvailableRecoveryTimeResponse> describeLocalAvailableRecoveryTime(DescribeLocalAvailableRecoveryTimeRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS SQL Server
      * >  You can call the [DescribeBinlogFiles](~~610550~~) operation to query the log files of other database engines.
      *
     */
    CompletableFuture<DescribeLogBackupFilesResponse> describeLogBackupFiles(DescribeLogBackupFilesRequest request);

    CompletableFuture<DescribeMarketingActivityResponse> describeMarketingActivity(DescribeMarketingActivityRequest request);

    /**
      * ### [](#)Supported database engines
      * MySQL
      * > This operation is available for RDS instances that run MySQL 8.0, MySQL 5.7, and MySQL 5.6 on RDS High-availability Edition with local disks.
      * ### [](#)Description
      * Before you call the [RestoreTable](~~131510~~) operation to restore individual databases or tables of an ApsaraDB RDS for MySQL instance, you can call this operation to query the information about the databases and tables that can be restored. For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~).
      *
     */
    CompletableFuture<DescribeMetaListResponse> describeMetaList(DescribeMetaListRequest request);

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      *
     */
    CompletableFuture<DescribeMigrateTaskByIdResponse> describeMigrateTaskById(DescribeMigrateTaskByIdRequest request);

    /**
      * This operation allows you to query the migration tasks that are created for the instance over the last week.
      * > 
      * *   This operation is supported only for migration tasks that are created to migrate full backup files.
      * *   This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
      *
     */
    CompletableFuture<DescribeMigrateTasksResponse> describeMigrateTasks(DescribeMigrateTasksRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS PostgreSQL
      *
     */
    CompletableFuture<DescribeModifyPGHbaConfigLogResponse> describeModifyPGHbaConfigLog(DescribeModifyPGHbaConfigLogRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeModifyParameterLogResponse> describeModifyParameterLog(DescribeModifyParameterLogRequest request);

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      * ### [Usage notes](#)
      * This operation is not supported for instances that run SQL Server 2017 EE or SQL Server 2019 EE.
      *
     */
    CompletableFuture<DescribeOssDownloadsResponse> describeOssDownloads(DescribeOssDownloadsRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS PostgreSQL
      *
     */
    CompletableFuture<DescribePGHbaConfigResponse> describePGHbaConfig(DescribePGHbaConfigRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template for an ApsaraDB RDS for MySQL instance](~~130565~~)
      * *   [Use a parameter template for an ApsaraDB RDS for PostgreSQL instance](~~457176~~)
      *
     */
    CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    /**
      * ### Applicable engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
      * ### Supported database engines
      * RDS PostgreSQL
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Manage extensions](~~2402409~~)
      *
     */
    CompletableFuture<DescribePostgresExtensionsResponse> describePostgresExtensions(DescribePostgresExtensionsRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribeQuickSaleConfigResponse> describeQuickSaleConfig(DescribeQuickSaleConfigRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeRdsResourceSettingsResponse> describeRdsResourceSettings(DescribeRdsResourceSettingsRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The primary instance must run the MySQL or PostgreSQL database engine.
      * *   The primary instance must be attached with a read-only instance.
      *
     */
    CompletableFuture<DescribeReadDBInstanceDelayResponse> describeReadDBInstanceDelay(DescribeReadDBInstanceDelayRequest request);

    CompletableFuture<DescribeRegionInfosResponse> describeRegionInfos(DescribeRegionInfosRequest request);

    /**
      * Before you call the [CreateDBInstance](~~26228~~) operation to create an RDS instance, you can call the DescribeRegions operation to query the available regions and zones.
      * >  If a zone supports the multi-zone deployment method, the value of the ZoneId parameter for the zone contains an MAZ part. Examples: cn-hangzhou-MAZ6(b,f) and cn-hangzhou-MAZ5(b,e,f).
      *
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    CompletableFuture<DescribeResourceDetailsResponse> describeResourceDetails(DescribeResourceDetailsRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeResourceUsageResponse> describeResourceUsage(DescribeResourceUsageRequest request);

    /**
      * This operation is applicable to the following database engine versions:
      * *   MySQL
      * *   SQL Server 2008 R2
      * *   PostgreSQL
      *
     */
    CompletableFuture<DescribeSQLCollectorPolicyResponse> describeSQLCollectorPolicy(DescribeSQLCollectorPolicyRequest request);

    /**
      * The SQL explorer feature must be enabled for the instance.
      * The instance must run MySQL. For more information, see [SQL Explorer](~~96123~~).
      *
     */
    CompletableFuture<DescribeSQLCollectorRetentionResponse> describeSQLCollectorRetention(DescribeSQLCollectorRetentionRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL
      * *   SQL Server 2008 R2
      * *   PostgreSQL
      * > 
      * *   The DescribeSQLLogFiles operation cannot be called to query the log files that are generated by SQL Explorer Trial Edition for an ApsaraDB RDS for MySQL instance.
      * *   The DescribeSQLLogFiles operation cannot be called to query the log files that are generated by the SQL Explorer feature and manually exported from the ApsaraDB RDS console. The DescribeSQLLogFiles operation can be called to query the SQL Explorer log files that are generated by calling the [DescribeSQLLogRecords](~~610533~~) operation with the request parameter **Form** set to **File**.
      *
     */
    CompletableFuture<DescribeSQLLogFilesResponse> describeSQLLogFiles(DescribeSQLLogFilesRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL
      * *   SQL Server
      * *   PostgreSQL
      * > 
      * *   You can call this operation up to 1,000 times per minute per account. The calls initiated by using both your Alibaba Cloud account and RAM users within your Alibaba Cloud account are counted.
      * *   This operation cannot be used to query the logs that are generated by SQL Explorer Trial Edition for an ApsaraDB RDS for MySQL instance.
      * *   When you call this operation and set the **Form** parameter to **File** to generate an audit file, a maximum of 1 million log entries can be recorded in the audit file, and you cannot filter log entries by keyword.
      *
     */
    CompletableFuture<DescribeSQLLogRecordsResponse> describeSQLLogRecords(DescribeSQLLogRecordsRequest request);

    CompletableFuture<DescribeSQLLogReportListResponse> describeSQLLogReportList(DescribeSQLLogReportListRequest request);

    /**
      * ### [](#)Supported database engine
      * *   MySQL
      *
     */
    CompletableFuture<DescribeSecretsResponse> describeSecrets(DescribeSecretsRequest request);

    /**
      * After an RDS instance is added to an ECS security group, all ECS instances in the security group can access the RDS instance. For more information, see [Configure a whitelist for an RDS instance](~~96118~~).
      *
     */
    CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request);

    /**
      * This operation is available only for ApsaraDB RDS for PostgreSQL instances.
      *
     */
    CompletableFuture<DescribeSlotsResponse> describeSlots(DescribeSlotsRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### Precautions
      * The response parameters returned by this operation are updated every minute.
      *
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      *     **
      *     **Note**MySQL 5.7 on RDS Basic Edition is not supported.
      * *   SQL Server
      *     **
      *     **Note**Only SQL Server 2008 R2 is supported.
      * *   MariaDB
      * ### Usage notes
      * Slow query logs are not collected in real time and may show a latency of 6 hours to 8 hours.
      *
     */
    CompletableFuture<DescribeSlowLogsResponse> describeSlowLogs(DescribeSlowLogsRequest request);

    /**
      * ### Supported database engine
      * SQL Server
      *
     */
    CompletableFuture<DescribeSupportOnlineResizeDiskResponse> describeSupportOnlineResizeDisk(DescribeSupportOnlineResizeDiskRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [Usage notes](#)
      * *   If an instance ID is specified, all tags that are added to this instance are queried, and other filter conditions are invalid.
      * *   If you specify only TagKey, the results that match the specified TagKey are returned. If you specify both TagKey and TagValue, the results that match both the specified TagKey and TagValue are returned.
      *
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
      * Before you upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance, you must perform an upgrade check and make sure that the check result is **Success**. You can call this operation to query the upgrade check report.  
      * If the check result is **Fail**, you must handle the errors that occurred. For more information about how to handle common errors, see [Introduction to the check report for a major engine version upgrade to an ApsaraDB RDS for PostgreSQL instance](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/introduction-to-the-check-report-of-a-major-engine-version-upgrade-for-an-apsaradb-rds-for-postgresql-instance).
      *
     */
    CompletableFuture<DescribeUpgradeMajorVersionPrecheckTaskResponse> describeUpgradeMajorVersionPrecheckTask(DescribeUpgradeMajorVersionPrecheckTaskRequest request);

    CompletableFuture<DescribeUpgradeMajorVersionTasksResponse> describeUpgradeMajorVersionTasks(DescribeUpgradeMajorVersionTasksRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    CompletableFuture<DescribeWhitelistTemplateResponse> describeWhitelistTemplate(DescribeWhitelistTemplateRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    CompletableFuture<DescribeWhitelistTemplateLinkedInstanceResponse> describeWhitelistTemplateLinkedInstance(DescribeWhitelistTemplateLinkedInstanceRequest request);

    /**
      * The DestroyDBInstance operation is phased out.
      *
     */
    CompletableFuture<DestroyDBInstanceResponse> destroyDBInstance(DestroyDBInstanceRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [Usage notes](#)
      * This operation can be used to remove only unit nodes.
      *
     */
    CompletableFuture<DetachGadInstanceMemberResponse> detachGadInstanceMember(DetachGadInstanceMemberRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    CompletableFuture<DetachWhitelistTemplateToInstanceResponse> detachWhitelistTemplateToInstance(DetachWhitelistTemplateToInstanceRequest request);

    CompletableFuture<EvaluateLocalExtendDiskResponse> evaluateLocalExtendDisk(EvaluateLocalExtendDiskRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<GetDBInstanceTopologyResponse> getDBInstanceTopology(GetDBInstanceTopologyRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      *
     */
    CompletableFuture<GetDbProxyInstanceSslResponse> getDbProxyInstanceSsl(GetDbProxyInstanceSslRequest request);

    /**
      * Each account can be granted permissions on one or more databases. Before you call this operation, make sure that the instance is in the Running state.
      * > This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition or run PostgreSQL with local disks.
      *
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Grant permissions to the service account of an ApsaraDB RDS for MySQL instance](~~96102~~)
      * *   [Grant permissions to the service account of an ApsaraDB RDS for SQL Server instance](~~95693~~)
      *
     */
    CompletableFuture<GrantOperatorPermissionResponse> grantOperatorPermission(GrantOperatorPermissionRequest request);

    /**
      * We recommend that you use Data Transmission Service (DTS). DTS provides data migration, subscription, and synchronization features that allow you to establish stable, secure transmission links. For more information, see [DTS API overview](~~49456~~).
      * During the migration, the source instance is in the **Migrating** state, and the destination instance is in the **Importing** state.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The source and destination instances must run SQL Server and belong to the dedicated or dedicated host instance family. For more information about the supported instance types, see [Primary instance types](~~26312~~).
      * *   The source and destination instances must be created by using the same user credentials.
      * *   The instance is in the Running state.
      * *   The source and destination databases must be in the Running state.
      * *   The remaining storage of the destination instance must be greater than the storage capacity of the source instance.
      * > 
      * *   This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
      * *   You can migrate the data of multiple databases at a time.
      *
     */
    CompletableFuture<ImportDatabaseBetweenInstancesResponse> importDatabaseBetweenInstances(ImportDatabaseBetweenInstancesRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [](#)Description
      * A full backup file contains the data of a self-managed MySQL instance. You can restore the data of a self-managed MySQL instance from a full backup file to an ApsaraDB RDS for MySQL instance.
      * ### [](#)Usage notes
      * Before you call this operation, make sure that the following requirements are met:
      * *   The self-managed MySQL instance runs MySQL 5.7 and is backed up by using XtraBackup. The name of the backup file ends with `_qp.xb`. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * *   The full backup file of the self-managed MySQL instance is uploaded to an Object Storage Service (OSS) bucket in the region of the ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * >  This operation is supported only for MySQL 5.7.
      *
     */
    CompletableFuture<ImportUserBackupFileResponse> importUserBackupFile(ImportUserBackupFileRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<ListClassesResponse> listClasses(ListClassesRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * > 
      * *   A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * *   Before you call the [CreateDBInstance](~~26228~~) operation to create an ApsaraDB RDS for MySQL instance into which you want to import full backup files, you can call this operation to query the IDs of full backup files.
      * *   You can call the [ImportUserBackupFile](~~260266~~) operation to import a full backup file into an ApsaraDB RDS for MySQL instance.
      *
     */
    CompletableFuture<ListUserBackupFilesResponse> listUserBackupFiles(ListUserBackupFilesRequest request);

    /**
      * You cannot use a locked account to log on to the corresponding instance. You must first unlock the account. For more information, see [Lock and delete an account](~~147649~~).
      *
     */
    CompletableFuture<LockAccountResponse> lockAccount(LockAccountRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Migrate an ApsaraDB RDS for MySQL instance across zones in the same region](~~96746~~)
      * *   [Migrate an ApsaraDB RDS for PostgreSQL instance across zones in the same region](~~96746~~)
      * *   [Migrate an ApsaraDB RDS for SQL Server instance across zones in the same region](~~95658~~)
      *
     */
    CompletableFuture<MigrateConnectionToOtherZoneResponse> migrateConnectionToOtherZone(MigrateConnectionToOtherZoneRequest request);

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    CompletableFuture<MigrateDBInstanceResponse> migrateDBInstance(MigrateDBInstanceRequest request);

    /**
      * *   In standard whitelist mode, IP addresses in the whitelist apply to both the classic network and VPCs. To minimize security risks, we recommend that you use the enhanced whitelist mode.
      * *   In enhanced whitelist mode, IP addresses in the whitelist are divided into VPC IP addresses and IP addresses of the classic network and Internet.
      * > 
      * *   You cannot change the whitelist mode from the enhanced whitelist mode to the standard whitelist mode.
      * *   This operation is not supported for instances that run SQL Server and MariaDB.
      *
     */
    CompletableFuture<MigrateSecurityIPModeResponse> migrateSecurityIPMode(MigrateSecurityIPModeRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Migrate an ApsaraDB RDS for MySQL instance across zones in the same region](~~96053~~)
      * *   [Migrate an ApsaraDB RDS for PostgreSQL instance across zones in the same region](~~96746~~)
      * *   [Migrate an ApsaraDB RDS for SQL Server instance across zones in the same region](~~95658~~)
      *
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
      * ### [](#)Supported database engine
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Connect an RDS instance to a self-managed domain](~~170734~~)
      *
     */
    CompletableFuture<ModifyADInfoResponse> modifyADInfo(ModifyADInfoRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
      * The event history feature enables you to view historical events that occurred in a region over a specific time range. These events include instance creation and parameter reconfiguration. For more information, see [Event history](~~129759~~).
      *
     */
    CompletableFuture<ModifyActionEventPolicyResponse> modifyActionEventPolicy(ModifyActionEventPolicyRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Scheduled events for ApsaraDB RDS for MySQL instances](~~104183~~)
      * *   [Scheduled events for ApsaraDB RDS for PostgreSQL instances](~~104452~~)
      * *   [Scheduled events for ApsaraDB RDS for SQL Server instances](~~104451~~)
      * *   [Scheduled events for ApsaraDB RDS for MariaDB instances](~~104454~~)
      *
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Configure an automatic backup policy for an ApsaraDB RDS for MySQL instance](~~98818~~)
      * *   [Configure an automatic backup policy for an ApsaraDB RDS for PostgreSQL instance](~~96772~~)
      * *   [Configure an automatic backup policy for an ApsaraDB RDS for SQL Server instance](~~95717~~)
      * *   [Configure an automatic backup policy for an ApsaraDB RDS for MariaDB instance](~~97147~~)
      *
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
      * > This operation is phased out.
      *
     */
    CompletableFuture<ModifyCollationTimeZoneResponse> modifyCollationTimeZone(ModifyCollationTimeZoneRequest request);

    CompletableFuture<ModifyCustinsResourceResponse> modifyCustinsResource(ModifyCustinsResourceRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    CompletableFuture<ModifyDBDescriptionResponse> modifyDBDescription(ModifyDBDescriptionRequest request);

    /**
      * This operation is supported only for instances that run MySQL.
      *
     */
    CompletableFuture<ModifyDBInstanceAutoUpgradeMinorVersionResponse> modifyDBInstanceAutoUpgradeMinorVersion(ModifyDBInstanceAutoUpgradeMinorVersionRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * > : The configuration item that is supported is [PgBouncer](~~2398301~~) of ApsaraDB RDS for PostgreSQL instances.
      *
     */
    CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request);

    /**
      * > The API has been taken offline
      *
     */
    CompletableFuture<ModifyDBInstanceConnectionModeResponse> modifyDBInstanceConnectionMode(ModifyDBInstanceConnectionModeRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:
      * *   [Change the endpoint and port number of an ApsaraDB RDS for MySQL instance](~~96163~~)
      * *   [Change the endpoint and port number of an ApsaraDB RDS for PostgreSQL instance](~~96788~~)
      * *   [Change the endpoint and port number of an ApsaraDB RDS for SQL Server instance](~~95740~~)
      * *   [Change the endpoint and port number of an ApsaraDB RDS for MariaDB instance](~~97157~~)
      *
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    CompletableFuture<ModifyDBInstanceDelayedReplicationTimeResponse> modifyDBInstanceDelayedReplicationTime(ModifyDBInstanceDelayedReplicationTimeRequest request);

    /**
      * For more information, see [Enable or disable the release protection feature for an ApsaraDB RDS for MySQL instance](~~414512~~).
      *
     */
    CompletableFuture<ModifyDBInstanceDeletionProtectionResponse> modifyDBInstanceDeletionProtection(ModifyDBInstanceDeletionProtectionRequest request);

    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      *
     */
    CompletableFuture<ModifyDBInstanceEndpointResponse> modifyDBInstanceEndpoint(ModifyDBInstanceEndpointRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      * ### [](#)Precautions
      * *   You can modify the following information about the endpoint of an instance: the public and internal endpoints, the public and internal ports, and the virtual private cloud (VPC), vSwitch, and IP address of the internal endpoint.
      * *   The VPC and vSwitch must be modified at the same time. If you specify the VPC, vSwitch, and IP address of the internal endpoint, you do not need to specify the endpoint and port. If you specify the endpoint and port, you do not need to specify the VPC, vSwitch, and IP address of the internal endpoint.
      *
     */
    CompletableFuture<ModifyDBInstanceEndpointAddressResponse> modifyDBInstanceEndpointAddress(ModifyDBInstanceEndpointAddressRequest request);

    CompletableFuture<ModifyDBInstanceHAConfigResponse> modifyDBInstanceHAConfig(ModifyDBInstanceHAConfigRequest request);

    /**
      * You can set the maintenance time to a period of time during off-peak hours. Alibaba Cloud performs routine maintenance within the maintenance time to minimize impacts on your business.
      *
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [View the Enhanced Monitoring metrics](~~299200~~)
      *
     */
    CompletableFuture<ModifyDBInstanceMetricsResponse> modifyDBInstanceMetrics(ModifyDBInstanceMetricsRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)Usage notes
      * If you use the Every 5 Seconds monitoring frequency, you are charged additional fees. Before you call this operation, make sure that you understand the [billing methods and pricing](~~45020~~) of ApsaraDB RDS.
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure the monitoring frequency for an ApsaraDB RDS for MySQL instance](~~96112~~)
      * *   [Configure the monitoring frequency for an ApsaraDB RDS for SQL Server instance](~~95710~~)
      *
     */
    CompletableFuture<ModifyDBInstanceMonitorResponse> modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request);

    /**
      * When an ApsaraDB for RDS instance is in the hybrid access mode, which uses both a VPC endpoint and a classic network endpoint, this operation is used to extend the expiration time of the classic network endpoint.
      *
     */
    CompletableFuture<ModifyDBInstanceNetworkExpireTimeResponse> modifyDBInstanceNetworkExpireTime(ModifyDBInstanceNetworkExpireTimeRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Change the network type of an ApsaraDB RDS for MySQL instance](~~96109~~)
      * *   [Change the network type of an ApsaraDB RDS for PostgreSQL instance](~~96761~~)
      * *   [Change the network type of an ApsaraDB RDS for SQL Server instance](~~95707~~)
      *
     */
    CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request);

    /**
      * This operation is used to change only the billing method of an instance from pay-as-you-go to subscription.
      * The following requirements must be met:
      * *   The instance belongs to the current account.
      * *   The instance uses one of the most recent instance types. For more information, see [Instance types](~~26312~~).
      *     **
      *     **Note**You cannot change the billing method of an instance that uses a phased-out instance type from pay-as-you-go to subscription. If you want to change the billing method of an instance that uses a phased-out instance type from pay-as-you-go to subscription, you must change the instance type of the instance to one of the most recent instance types. Then, you can change the billing method of the instance from pay-as-you-go to subscription. To change the instance type of an instance, you can change the instance specifications of the instance. For more information, see [Change the specifications of an ApsaraDB RDS instance](~~96061~~).
      * *   The instance uses the pay-as-you-go billing method and is in the Running state.
      * *   Your Alibaba Cloud account has no unpaid orders for the instance for which you want to change the billing method.
      *
     */
    CompletableFuture<ModifyDBInstancePayTypeResponse> modifyDBInstancePayType(ModifyDBInstancePayTypeRequest request);

    /**
      * > This operation is phased out.
      *
     */
    CompletableFuture<ModifyDBInstanceProxyConfigurationResponse> modifyDBInstanceProxyConfiguration(ModifyDBInstanceProxyConfigurationRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Use the SSL encryption feature for an ApsaraDB RDS for MySQL instance](~~96120~~)
      * *   [Use the SSL encryption feature for an ApsaraDB RDS for PostgreSQL instance](~~229517~~)
      * *   [Use the SSL encryption feature for an ApsaraDB RDS for SQL Server instance](~~95715~~)
      *
     */
    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Fees are generated if the call is successful. Before you call this operation, carefully read the following documentation:
      * *   [Change the specifications of an ApsaraDB RDS for MySQL instance](~~96061~~)
      * *   [Change the specifications of an ApsaraDB RDS for PostgreSQL instance](~~96750~~)
      * *   [Change the specifications of an ApsaraDB RDS for SQL Server instance](~~95665~~)
      * *   [Change the specifications of an ApsaraDB RDS for MariaDB instance](~~97129~~)
      *
     */
    CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Configure TDE for an ApsaraDB RDS for MySQL instance](~~96121~~)
      * *   [Configure TDE for an ApsaraDB RDS for PostgreSQL instance](~~465652~~)
      * *   [Configure TDE for an ApsaraDB RDS for SQL Server instance](~~95716~~)
      *
     */
    CompletableFuture<ModifyDBInstanceTDEResponse> modifyDBInstanceTDE(ModifyDBInstanceTDERequest request);

    CompletableFuture<ModifyDBNodeResponse> modifyDBNode(ModifyDBNodeRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * >  Starting October 17, 2023, ApsaraDB RDS provides a dedicated proxy free of charge for each ApsaraDB RDS for MySQL instance on RDS Cluster Edition. For more information, see [\\[Special offers/Price changes\\] One proxy is provided free of charge for ApsaraDB RDS for MySQL instances on RDS Cluster Edition](~~2555466~~).
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Enable and configure the dedicated proxy feature for an ApsaraDB RDS for MySQL instance](~~197456~~)
      * *   [Enable and configure the dedicated proxy feature for an ApsaraDB RDS for PostgreSQL instance](~~418272~~)
      *
     */
    CompletableFuture<ModifyDBProxyResponse> modifyDBProxy(ModifyDBProxyRequest request);

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Enable and configure the dedicated proxy feature](~~197456~~)
      * *   [Create a database proxy terminal for an ApsaraDB RDS for PostgreSQL instance](~~418273~~)
      *
     */
    CompletableFuture<ModifyDBProxyEndpointResponse> modifyDBProxyEndpoint(ModifyDBProxyEndpointRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for MySQL instance](~~184921~~)
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for PostgreSQL instance](~~418274~~)
      *
     */
    CompletableFuture<ModifyDBProxyEndpointAddressResponse> modifyDBProxyEndpointAddress(ModifyDBProxyEndpointAddressRequest request);

    /**
      * Before you call the ModifyDBProxyInstance operation, make sure that the [ModifyDBProxy](~~141054~~) operation is called to enable the database proxy feature for the instance.
      * *   The dedicated proxy feature of ApsaraDB RDS for MySQL provides capabilities such as read/write splitting and short-lived connection optimization. For more information, see [What are database proxies?](~~138705~~)
      * *   The database proxy feature of ApsaraDB RDS for PostgreSQL supports read/write splitting. For more information, see [What are database proxies?](~~412194~~)
      *
     */
    CompletableFuture<ModifyDBProxyInstanceResponse> modifyDBProxyInstance(ModifyDBProxyInstanceRequest request);

    /**
      * Distributed transaction whitelists allow for distributed transactions between an Elastic Compute Service (ECS) instance and an RDS instance. For more information, see [Configure a distributed transaction whitelist](~~124321~~).
      * This operation is applicable to instances that run one of the following SQL Server versions in the RDS High-Availability Edition: 2012 SE, 2012 EE, 2014 SE, 2016 SE, 2016 EE, and 2017 SE.
      *
     */
    CompletableFuture<ModifyDTCSecurityIpHostsForSQLServerResponse> modifyDTCSecurityIpHostsForSQLServer(ModifyDTCSecurityIpHostsForSQLServerRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure automatic storage expansion for ApsaraDB RDS for MySQL](~~173826~~)
      * *   [Configure automatic storage expansion for ApsaraDB RDS for PostgreSQL](~~432496~~)
      *
     */
    CompletableFuture<ModifyDasInstanceConfigResponse> modifyDasInstanceConfig(ModifyDasInstanceConfigRequest request);

    /**
      * ### [](#)Supported database engine
      * *   SQL Server
      *
     */
    CompletableFuture<ModifyDatabaseConfigResponse> modifyDatabaseConfig(ModifyDatabaseConfigRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      * ### [](#)References
      * > : Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:
      * [Configure SSL encryption for a proxy endpoint](~~188164~~)
      *
     */
    CompletableFuture<ModifyDbProxyInstanceSslResponse> modifyDbProxyInstanceSsl(ModifyDbProxyInstanceSslRequest request);

    /**
      * By default, Alibaba Cloud uses persistent connections to check the availability of an instance. For more information, see [What is availability detection?](~~207467~~)
      *
     */
    CompletableFuture<ModifyHADiagnoseConfigResponse> modifyHADiagnoseConfig(ModifyHADiagnoseConfigRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for MySQL instance](~~96054~~)
      * *   [Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for PostgreSQL instance](~~96747~~)
      * *   [Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for SQL Server instance](~~95659~~)
      * *   [Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for MariaDB instance](~~97127~~)
      *
     */
    CompletableFuture<ModifyHASwitchConfigResponse> modifyHASwitchConfig(ModifyHASwitchConfigRequest request);

    /**
      * If you enable auto-renewal for your instance, you do not need to manually renew your subscription or be concerned about business interruptions caused by subscription expiration. For more information, see [Configure auto-renewal](~~96049~~).
      *
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      *
     */
    CompletableFuture<ModifyInstanceCrossBackupPolicyResponse> modifyInstanceCrossBackupPolicy(ModifyInstanceCrossBackupPolicyRequest request);

    /**
      * ### [](#)Supported database engines
      * RDS PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Connect an ApsaraDB RDS for PostgreSQL instance to a self-managed AD domain](~~349288~~)
      * *   [The pg_hba.conf File](https://www.postgresql.org/docs/11/auth-pg-hba-conf.html)
      *
     */
    CompletableFuture<ModifyPGHbaConfigResponse> modifyPGHbaConfig(ModifyPGHbaConfigRequest request);

    /**
      * You can modify the parameters directly or by using a parameter template. After you submit the parameter modification request, ApsaraDB RDS starts a task to apply the new parameter values to the instance. If a new parameter value takes effect only after the instance restarts, ApsaraDB RDS restarts the instance. For information about configurable parameters, see [Configure the parameters of an ApsaraDB RDS for MySQL instance](~~96063~~).
      * > Before the system runs a parameter modification task, the system checks whether the parameters exist, whether they are configurable, and whether the new parameter values are valid.
      *
     */
    CompletableFuture<ModifyParameterResponse> modifyParameter(ModifyParameterRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    CompletableFuture<ModifyParameterGroupResponse> modifyParameterGroup(ModifyParameterGroupRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The read/write splitting feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The instance must run one of the following database engine versions and RDS editions:
      *     *   MySQL 5.7 on RDS High-availability Edition with local disks
      *     *   MySQL 5.6
      *     *   SQL Server on RDS Cluster Edition
      *
     */
    CompletableFuture<ModifyReadWriteSplittingConnectionResponse> modifyReadWriteSplittingConnection(ModifyReadWriteSplittingConnectionRequest request);

    /**
      * ### Supported database engines
      * RDS MySQL
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Set the data replication latency of a read-only ApsaraDB RDS for MySQL instance](~~96056~~)
      *
     */
    CompletableFuture<ModifyReadonlyInstanceDelayReplicationTimeResponse> modifyReadonlyInstanceDelayReplicationTime(ModifyReadonlyInstanceDelayReplicationTimeRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Transfer resources across resource groups](~~94487~~)
      *
     */
    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Use the SQL Explorer and Audit feature for an ApsaraDB RDS for MySQL instance](~~476574~~)
      * *   [Use the SQL Audit feature for an ApsaraDB RDS for PostgreSQL instance](~~96766~~)
      * *   [Use the SQL Audit feature for an ApsaraDB RDS for SQL Server instance](~~95712~~)
      *
     */
    CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request);

    /**
      * ### Supported database engines
      * RDS MySQL
      * ### Precautions
      * After you shorten the log backup retention period, log backup files that are stored longer than the specified log backup retention period are immediately deleted.
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Use the SQL Explorer and Audit feature](~~476574~~)
      *
     */
    CompletableFuture<ModifySQLCollectorRetentionResponse> modifySQLCollectorRetention(ModifySQLCollectorRetentionRequest request);

    /**
      * After an RDS instance is added to an ECS security group, all ECS instances in the security group can access the RDS instance. For more information, see [Configure a whitelist for an RDS instance](~~96118~~).
      *
     */
    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Configure an IP address whitelist for an ApsaraDB RDS for MySQL instance](~~96118~~)
      * *   [Configure an IP address whitelist for an ApsaraDB RDS for PostgreSQL instance](~~43187~~)
      * *   [Configure an IP address whitelist for an ApsaraDB RDS for SQL Server instance](~~43186~~)
      * *   [Configure an IP address whitelist for an ApsaraDB RDS for MariaDB instance](~~90336~~)
      *
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    CompletableFuture<ModifyWhitelistTemplateResponse> modifyWhitelistTemplate(ModifyWhitelistTemplateRequest request);

    CompletableFuture<PreCheckCreateOrderForCreateDBNodesResponse> preCheckCreateOrderForCreateDBNodes(PreCheckCreateOrderForCreateDBNodesRequest request);

    CompletableFuture<PreCheckCreateOrderForDeleteDBNodesResponse> preCheckCreateOrderForDeleteDBNodes(PreCheckCreateOrderForDeleteDBNodesRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### Description
      * The system automatically uploads log backup files to Object Storage Service (OSS) buckets. If the remaining storage of an instance is insufficient, you can call this operation to upload the log backup files of the instance to OSS buckets. After the upload is complete, the system deletes these files from the instance to release storage. This operation is called to upload log backup files from an instance to OSS buckets and then delete these files from the instance. If the instance runs SQL Server, transaction log backup files are compressed before they are uploaded.
      * ### Precautions
      * *   When you upload log backup files, the data restoration feature is not affected.
      * *   This operation is called to release storage. The backup storage usage is not reduced.
      * *   The OSS buckets to which log backup files are uploaded are provided by the system. You do not need to purchase these OSS buckets. In addition, you cannot access these OSS buckets.
      *
     */
    CompletableFuture<PurgeDBInstanceLogResponse> purgeDBInstanceLog(PurgeDBInstanceLogRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### Feature description
      * The notifications are highlighted at the top of the ApsaraDB RDS console. The notifications include renewal reminders and reminders of instance creation failures.
      * After you call this operation to query notifications, you can call the [ConfirmNotify](~~610444~~) operation to mark the notifications as confirmed, which means that you understand the content of the notifications.
      *
     */
    CompletableFuture<QueryNotifyResponse> queryNotify(QueryNotifyRequest request);

    CompletableFuture<QueryRecommendByCodeResponse> queryRecommendByCode(QueryRecommendByCodeRequest request);

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    CompletableFuture<RebuildDBInstanceResponse> rebuildDBInstance(RebuildDBInstanceRequest request);

    /**
      * ## Prerequisites
      * A disaster recovery instance is created.
      *
     */
    CompletableFuture<ReceiveDBInstanceResponse> receiveDBInstance(ReceiveDBInstanceRequest request);

    /**
      * You can call this operation to restore databases to a new instance or an existing instance. If you want to restore databases to an existing instance, we recommend that you call the [Copy databases](~~88810~~) operation.
      * If you want to restore databases to a new instance, you must create an instance and then restore specific or all databases to the new instance.
      * *   If you specify the name of a database, only the specified database is restored to the new instance.
      * *   If you do not specify the name of a database, all databases are restored to the new instance.
      * > This operation is supported only for instances that run SQL Server 2012 or later.
      *
     */
    CompletableFuture<RecoveryDBInstanceResponse> recoveryDBInstance(RecoveryDBInstanceRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * *   [Release the public endpoint of an ApsaraDB RDS for MySQL instance](~~26128~~)
      * *   [Release the public endpoint of an ApsaraDB RDS for PostgreSQL instance](~~97738~~)
      * *   [Release the public endpoint of an ApsaraDB RDS for SQL Server instance](~~97736~~)
      * *   [Release the public endpoint of an ApsaraDB RDS for MariaDB instance](~~97740~~)
      *
     */
    CompletableFuture<ReleaseInstanceConnectionResponse> releaseInstanceConnection(ReleaseInstanceConnectionRequest request);

    /**
      * To ensure data security, you can release the public endpoint when you do not need to access the database from the Internet.
      *
     */
    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The read/write splitting feature is enabled for the instance.
      * *   The instance must run one of the following database engine versions and RDS editions:
      *     *   MySQL 5.7 on RDS High-availability Edition (with local disks)
      *     *   MySQL 5.6
      *     *   SQL Server on RDS Cluster Edition
      *
     */
    CompletableFuture<ReleaseReadWriteSplittingConnectionResponse> releaseReadWriteSplittingConnection(ReleaseReadWriteSplittingConnectionRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Usage notes
      * *   A maximum of 10 tags can be removed in a single request.
      * *   If a tag is removed from all instances to which the tag is added, the tag is automatically deleted.
      * *   If you specify only TagKey, all tags that match the TagKey condition are removed.
      * *   You must specify at least TagKey or a pair of TagKey and TagValue.
      *
     */
    CompletableFuture<RemoveTagsFromResourceResponse> removeTagsFromResource(RemoveTagsFromResourceRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of ApsaraDB RDS. For more information, see [Billable items, billing methods, and pricing](~~45020~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is a subscription instance.
      * *   Your account supports credit card payments or balance payments.
      *     **
      *     **Note**By default, coupons available for your account are preferentially used for payment.
      *
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Reset of the permissions of privileged accounts](~~140724~~)
      *
     */
    CompletableFuture<ResetAccountResponse> resetAccount(ResetAccountRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Reset the password of an ApsaraDB RDS for MySQL instance](~~96100~~)
      * *   [Reset the password of an ApsaraDB RDS for PostgreSQL instance](~~96814~~)
      * *   [Reset the password of an ApsaraDB RDS for SQL Server instance](~~95691~~)
      * *   [Reset the password of an ApsaraDB RDS for MariaDB instance](~~97133~~)
      *
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Restart an ApsaraDB RDS for MySQL instance](~~96051~~)
      * *   [Restart an ApsaraDB RDS for PostgreSQL instance](~~96798~~)
      * *   [Restart an ApsaraDB RDS for SQL Server instance](~~95656~~)
      * *   [Restart an ApsaraDB RDS for MariaDB instance](~~97472~~)
      *
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    CompletableFuture<RestoreDdrTableResponse> restoreDdrTable(RestoreDdrTableRequest request);

    /**
      * ### [](#)Supported database engines
      * MySQL
      * ### [](#)Description
      * ApsaraDB RDS for MySQL supports the restoration of individual databases and tables. If you delete databases or tables from an instance, you can restore the databases or tables by using a backup file. For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~). Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance does not have ongoing migration tasks.
      * *   If you want to restore data to a specific point in time, make sure that the log backup feature is enabled for the instance. For more information, see [Back up an ApsaraDB RDS for MySQL instance](~~98818~~).
      * *   The restoration of individual databases or tables is enabled, and new backups are created. For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~).
      * *   The names that you want to use for the restored tables do not exist in the instance.
      *
     */
    CompletableFuture<RestoreTableResponse> restoreTable(RestoreTableRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Prerequisites
      * *   The instance is in the Running state.
      * *   The database is in the Running state.
      * ### [](#)Precautions
      * *   The permissions that can be revoked include SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, CREATE TEMPORARY TABLES, LOCK TABLES, EXECUTE, CREATE VIEW, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, EVENT, and TRIGGER.
      * *   This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition and run PostgreSQL.
      *
     */
    CompletableFuture<RevokeAccountPrivilegeResponse> revokeAccountPrivilege(RevokeAccountPrivilegeRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Grant permissions to the service account of an ApsaraDB RDS for MySQL instance](~~96102~~)
      * *   [Grant permissions to the service account of an ApsaraDB RDS for PostgreSQL instance](~~146887~~)
      * *   [Grant permissions to the service account of an ApsaraDB RDS for SQL Server instance](~~95693~~)
      *
     */
    CompletableFuture<RevokeOperatorPermissionResponse> revokeOperatorPermission(RevokeOperatorPermissionRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:
      * *   [Resume an ApsaraDB RDS for MySQL instance](~~427093~~)
      * *   [Resume an ApsaraDB RDS for PostgreSQL instance](~~452314~~)
      * *   [Resume an ApsaraDB RDS for SQL Server instance](~~462504~~)
      *
     */
    CompletableFuture<StartDBInstanceResponse> startDBInstance(StartDBInstanceRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Suspend an ApsaraDB RDS for MySQL instance](~~427093~~)
      * *   [Suspend an ApsaraDB RDS for PostgreSQL instance](~~452314~~)
      * *   [Suspend an ApsaraDB RDS for SQL Server instance](~~462504~~)
      *
     */
    CompletableFuture<StopDBInstanceResponse> stopDBInstance(StopDBInstanceRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Switch workloads between primary and secondary ApsaraDB RDS for MySQL instances](~~96054~~)
      * *   [Switch workloads between primary and secondary ApsaraDB RDS for PostgreSQL instances](~~96747~~)
      * *   [Switch workloads between primary and secondary ApsaraDB RDS for SQL Server instances](~~95659~~)
      * *   [Switch workloads between primary and secondary ApsaraDB RDS for MariaDB instances](~~97127~~)
      *
     */
    CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### Prerequisites
      * *   The instance is connected by using its internal or public endpoint.
      * *   The instance is in the Running state.
      * *   The number of times that you have switched the instance between its internal and public endpoints within the last 24 hours does not reach 20.
      * *   The instance resides in the classic network.
      * ### Usage notes
      * After the endpoint that is used to connect to the instance is changed, you must update the endpoint information in the code of your application and restart the application.
      *
     */
    CompletableFuture<SwitchDBInstanceNetTypeResponse> switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Change the VPC and vSwitch for an ApsaraDB RDS for MySQL instance](~~137567~~)
      * *   [Change the vSwitch for an ApsaraDB RDS for PostgreSQL instance](~~146885~~)
      * *   [Change the VPC and vSwitch for an ApsaraDB RDS for SQL Server instance](~~347675~~)
      *
     */
    CompletableFuture<SwitchDBInstanceVpcResponse> switchDBInstanceVpc(SwitchDBInstanceVpcRequest request);

    CompletableFuture<SwitchGuardToMasterInstanceResponse> switchGuardToMasterInstance(SwitchGuardToMasterInstanceRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Create tags for an ApsaraDB RDS for MySQL instance](~~96149~~)
      * *   [Create tags for an ApsaraDB RDS for PostgreSQL instance](~~96777~~)
      * *   [Create tags for an ApsaraDB RDS for SQL Server instance](~~95726~~)
      * *   [Create tags for an ApsaraDB RDS for MariaDB instance](~~97152~~)
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      *
     */
    CompletableFuture<TerminateMigrateTaskResponse> terminateMigrateTask(TerminateMigrateTaskRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Fees are generated if the call is successful. Before you call this operation, you must read the following documentation.
      * *   [Change the billing method of an ApsaraDB RDS for MySQL instance from pay-as-you-go to subscription](~~96048~~) or [Change the billing method of an ApsaraDB RDS for MySQL instance from subscription to pay-as-you-go](~~161875~~)
      * *   [Change the billing method of an ApsaraDB RDS for PostgreSQL instance from pay-as-you-go to subscription](~~96743~~) or [Change the billing method of an ApsaraDB RDS for PostgreSQL instance from subscription to pay-as-you-go](~~162756~~)
      * *   [Change the billing method of an ApsaraDB RDS for SQL Server instance from pay-as-you-go to subscription](~~95631~~) or [Change the billing method of an ApsaraDB RDS for SQL Server instance from subscription to pay-as-you-go](~~162755~~)
      * *   [Change the billing method of an ApsaraDB RDS for MariaDB instance from pay-as-you-go to subscription](~~97120~~) or [Change the billing method of an ApsaraDB RDS for MariaDB instance from subscription to pay-as-you-go](~~169252~~)
      *
     */
    CompletableFuture<TransformDBInstancePayTypeResponse> transformDBInstancePayType(TransformDBInstancePayTypeRequest request);

    /**
      * ### Supported database engine
      * PostgreSQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Lock an account of an ApsaraDB RDS for PostgreSQL instance](~~147649~~)
      *
     */
    CompletableFuture<UnlockAccountResponse> unlockAccount(UnlockAccountRequest request);

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Usage notes
      * *   You can remove up to 20 tags at a time.
      * *   If a tag is removed from an instance and is not added to other instances, the tag is automatically deleted.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * ### Supported database engines
      * RDS PostgreSQL
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Manage extensions](~~2402409~~)
      *
     */
    CompletableFuture<UpdatePostgresExtensionsResponse> updatePostgresExtensions(UpdatePostgresExtensionsRequest request);

    /**
      * ### Supported database engines
      * RDS MySQL
      * ### References
      * A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 or MySQL 8.0 instance to an ApsaraDB RDS for MySQL instance](~~251779~~).
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      *
     */
    CompletableFuture<UpdateUserBackupFileResponse> updateUserBackupFile(UpdateUserBackupFileRequest request);

    /**
      * ### Supported database engine
      * MySQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Upgrade the major engine version of an ApsaraDB RDS for MySQL instance](~~96058~~)
      *
     */
    CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Update the minor engine version of an ApsaraDB RDS for MySQL instance](~~96059~~)
      * *   [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~)
      * *   [Update the minor engine version of an ApsaraDB RDS for SQL Server instance](~~213582~~)
      *
     */
    CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request);

    /**
      * ### Supported database engine
      * PostgreSQL
      * ### References
      * Fees are generated if the call is successful. Before you call this operation, read the following documentation and make sure that you fully understand the billing rules, prerequisites, and impacts of this operation.
      * [Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance](~~203309~~)
      *
     */
    CompletableFuture<UpgradeDBInstanceMajorVersionResponse> upgradeDBInstanceMajorVersion(UpgradeDBInstanceMajorVersionRequest request);

    /**
      * ### Supported database engine
      * PostgreSQL
      * ### References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance](~~203309~~)
      *
     */
    CompletableFuture<UpgradeDBInstanceMajorVersionPrecheckResponse> upgradeDBInstanceMajorVersionPrecheck(UpgradeDBInstanceMajorVersionPrecheckRequest request);

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Upgrade the dedicated proxy version of an ApsaraDB RDS for MySQL instance](~~197465~~)
      * *   [Upgrade the dedicated proxy version of an ApsaraDB RDS for PostgreSQL instance](~~418469~~)
      *
     */
    CompletableFuture<UpgradeDBProxyInstanceKernelVersionResponse> upgradeDBProxyInstanceKernelVersion(UpgradeDBProxyInstanceKernelVersionRequest request);

}
