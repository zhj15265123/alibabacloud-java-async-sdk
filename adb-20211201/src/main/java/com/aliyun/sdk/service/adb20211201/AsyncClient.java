// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.adb20211201.models.*;
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

    CompletableFuture<AllocateClusterPublicConnectionResponse> allocateClusterPublicConnection(AllocateClusterPublicConnectionRequest request);

    CompletableFuture<AttachUserENIResponse> attachUserENI(AttachUserENIRequest request);

    CompletableFuture<BindAccountResponse> bindAccount(BindAccountRequest request);

    CompletableFuture<BindDBResourceGroupWithUserResponse> bindDBResourceGroupWithUser(BindDBResourceGroupWithUserRequest request);

    CompletableFuture<CheckBindRamUserResponse> checkBindRamUser(CheckBindRamUserRequest request);

    CompletableFuture<CheckSampleDataSetResponse> checkSampleDataSet(CheckSampleDataSetRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    CompletableFuture<CreateDBResourceGroupResponse> createDBResourceGroup(CreateDBResourceGroupRequest request);

    CompletableFuture<CreateElasticPlanResponse> createElasticPlan(CreateElasticPlanRequest request);

    CompletableFuture<CreateOssSubDirectoryResponse> createOssSubDirectory(CreateOssSubDirectoryRequest request);

    CompletableFuture<CreateSparkTemplateResponse> createSparkTemplate(CreateSparkTemplateRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
      * ###
      * You can call this operation to delete only subscription clusters.
      *
     */
    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    CompletableFuture<DeleteDBResourceGroupResponse> deleteDBResourceGroup(DeleteDBResourceGroupRequest request);

    CompletableFuture<DeleteElasticPlanResponse> deleteElasticPlan(DeleteElasticPlanRequest request);

    CompletableFuture<DeleteProcessInstanceResponse> deleteProcessInstance(DeleteProcessInstanceRequest request);

    CompletableFuture<DeleteSparkTemplateResponse> deleteSparkTemplate(DeleteSparkTemplateRequest request);

    CompletableFuture<DeleteSparkTemplateFileResponse> deleteSparkTemplateFile(DeleteSparkTemplateFileRequest request);

    CompletableFuture<DescribeAccountAllPrivilegesResponse> describeAccountAllPrivileges(DescribeAccountAllPrivilegesRequest request);

    CompletableFuture<DescribeAccountPrivilegeObjectsResponse> describeAccountPrivilegeObjects(DescribeAccountPrivilegeObjectsRequest request);

    CompletableFuture<DescribeAccountPrivilegesResponse> describeAccountPrivileges(DescribeAccountPrivilegesRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeAdbMySqlColumnsResponse> describeAdbMySqlColumns(DescribeAdbMySqlColumnsRequest request);

    CompletableFuture<DescribeAdbMySqlSchemasResponse> describeAdbMySqlSchemas(DescribeAdbMySqlSchemasRequest request);

    CompletableFuture<DescribeAdbMySqlTablesResponse> describeAdbMySqlTables(DescribeAdbMySqlTablesRequest request);

    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    CompletableFuture<DescribeApsActionLogsResponse> describeApsActionLogs(DescribeApsActionLogsRequest request);

    CompletableFuture<DescribeApsResourceGroupsResponse> describeApsResourceGroups(DescribeApsResourceGroupsRequest request);

    CompletableFuture<DescribeAuditLogRecordsResponse> describeAuditLogRecords(DescribeAuditLogRecordsRequest request);

    CompletableFuture<DescribeClusterAccessWhiteListResponse> describeClusterAccessWhiteList(DescribeClusterAccessWhiteListRequest request);

    CompletableFuture<DescribeClusterNetInfoResponse> describeClusterNetInfo(DescribeClusterNetInfoRequest request);

    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request);

    CompletableFuture<DescribeDBClusterHealthStatusResponse> describeDBClusterHealthStatus(DescribeDBClusterHealthStatusRequest request);

    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    CompletableFuture<DescribeDBClusterStatusResponse> describeDBClusterStatus(DescribeDBClusterStatusRequest request);

    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    CompletableFuture<DescribeDBResourceGroupResponse> describeDBResourceGroup(DescribeDBResourceGroupRequest request);

    CompletableFuture<DescribeDiagnosisDimensionsResponse> describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request);

    CompletableFuture<DescribeDiagnosisRecordsResponse> describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request);

    CompletableFuture<DescribeDiagnosisSQLInfoResponse> describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request);

    CompletableFuture<DescribeDownloadRecordsResponse> describeDownloadRecords(DescribeDownloadRecordsRequest request);

    CompletableFuture<DescribeElasticPlanAttributeResponse> describeElasticPlanAttribute(DescribeElasticPlanAttributeRequest request);

    CompletableFuture<DescribeElasticPlanJobsResponse> describeElasticPlanJobs(DescribeElasticPlanJobsRequest request);

    CompletableFuture<DescribeElasticPlanSpecificationsResponse> describeElasticPlanSpecifications(DescribeElasticPlanSpecificationsRequest request);

    CompletableFuture<DescribeElasticPlansResponse> describeElasticPlans(DescribeElasticPlansRequest request);

    CompletableFuture<DescribeEnabledPrivilegesResponse> describeEnabledPrivileges(DescribeEnabledPrivilegesRequest request);

    CompletableFuture<DescribePatternPerformanceResponse> describePatternPerformance(DescribePatternPerformanceRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSQLPatternsResponse> describeSQLPatterns(DescribeSQLPatternsRequest request);

    CompletableFuture<DescribeSchemasResponse> describeSchemas(DescribeSchemasRequest request);

    CompletableFuture<DescribeSparkCodeLogResponse> describeSparkCodeLog(DescribeSparkCodeLogRequest request);

    CompletableFuture<DescribeSparkCodeOutputResponse> describeSparkCodeOutput(DescribeSparkCodeOutputRequest request);

    CompletableFuture<DescribeSparkCodeWebUiResponse> describeSparkCodeWebUi(DescribeSparkCodeWebUiRequest request);

    CompletableFuture<DescribeSqlPatternResponse> describeSqlPattern(DescribeSqlPatternRequest request);

    CompletableFuture<DescribeTableAccessCountResponse> describeTableAccessCount(DescribeTableAccessCountRequest request);

    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    CompletableFuture<DescribeUserQuotaResponse> describeUserQuota(DescribeUserQuotaRequest request);

    CompletableFuture<DetachUserENIResponse> detachUserENI(DetachUserENIRequest request);

    CompletableFuture<DisableElasticPlanResponse> disableElasticPlan(DisableElasticPlanRequest request);

    CompletableFuture<DownloadDiagnosisRecordsResponse> downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request);

    CompletableFuture<EnableElasticPlanResponse> enableElasticPlan(EnableElasticPlanRequest request);

    CompletableFuture<ExistRunningSQLEngineResponse> existRunningSQLEngine(ExistRunningSQLEngineRequest request);

    CompletableFuture<GetDatabaseObjectsResponse> getDatabaseObjects(GetDatabaseObjectsRequest request);

    CompletableFuture<GetSparkAppAttemptLogResponse> getSparkAppAttemptLog(GetSparkAppAttemptLogRequest request);

    CompletableFuture<GetSparkAppInfoResponse> getSparkAppInfo(GetSparkAppInfoRequest request);

    CompletableFuture<GetSparkAppLogResponse> getSparkAppLog(GetSparkAppLogRequest request);

    CompletableFuture<GetSparkAppMetricsResponse> getSparkAppMetrics(GetSparkAppMetricsRequest request);

    CompletableFuture<GetSparkAppStateResponse> getSparkAppState(GetSparkAppStateRequest request);

    CompletableFuture<GetSparkAppWebUiAddressResponse> getSparkAppWebUiAddress(GetSparkAppWebUiAddressRequest request);

    CompletableFuture<GetSparkConfigLogPathResponse> getSparkConfigLogPath(GetSparkConfigLogPathRequest request);

    CompletableFuture<GetSparkDefinitionsResponse> getSparkDefinitions(GetSparkDefinitionsRequest request);

    CompletableFuture<GetSparkLogAnalyzeTaskResponse> getSparkLogAnalyzeTask(GetSparkLogAnalyzeTaskRequest request);

    CompletableFuture<GetSparkSQLEngineStateResponse> getSparkSQLEngineState(GetSparkSQLEngineStateRequest request);

    CompletableFuture<GetSparkTemplateFileContentResponse> getSparkTemplateFileContent(GetSparkTemplateFileContentRequest request);

    /**
      * You can call this operation to query the directory structure but not application data in the directory. To query the directory structure that contains application data, call the [GetSparkTemplateFullTree](~~456205~~) operation.
      *
     */
    CompletableFuture<GetSparkTemplateFolderTreeResponse> getSparkTemplateFolderTree(GetSparkTemplateFolderTreeRequest request);

    CompletableFuture<GetSparkTemplateFullTreeResponse> getSparkTemplateFullTree(GetSparkTemplateFullTreeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    CompletableFuture<GetTableColumnsResponse> getTableColumns(GetTableColumnsRequest request);

    CompletableFuture<GetTableDDLResponse> getTableDDL(GetTableDDLRequest request);

    CompletableFuture<GetTableObjectsResponse> getTableObjects(GetTableObjectsRequest request);

    CompletableFuture<GetViewDDLResponse> getViewDDL(GetViewDDLRequest request);

    CompletableFuture<GetViewObjectsResponse> getViewObjects(GetViewObjectsRequest request);

    CompletableFuture<KillSparkAppResponse> killSparkApp(KillSparkAppRequest request);

    CompletableFuture<KillSparkLogAnalyzeTaskResponse> killSparkLogAnalyzeTask(KillSparkLogAnalyzeTaskRequest request);

    CompletableFuture<KillSparkSQLEngineResponse> killSparkSQLEngine(KillSparkSQLEngineRequest request);

    CompletableFuture<ListSparkAppAttemptsResponse> listSparkAppAttempts(ListSparkAppAttemptsRequest request);

    CompletableFuture<ListSparkAppsResponse> listSparkApps(ListSparkAppsRequest request);

    CompletableFuture<ListSparkLogAnalyzeTasksResponse> listSparkLogAnalyzeTasks(ListSparkLogAnalyzeTasksRequest request);

    CompletableFuture<ListSparkTemplateFileIdsResponse> listSparkTemplateFileIds(ListSparkTemplateFileIdsRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyAccountPrivilegesResponse> modifyAccountPrivileges(ModifyAccountPrivilegesRequest request);

    CompletableFuture<ModifyAuditLogConfigResponse> modifyAuditLogConfig(ModifyAuditLogConfigRequest request);

    CompletableFuture<ModifyClusterAccessWhiteListResponse> modifyClusterAccessWhiteList(ModifyClusterAccessWhiteListRequest request);

    CompletableFuture<ModifyClusterConnectionStringResponse> modifyClusterConnectionString(ModifyClusterConnectionStringRequest request);

    /**
      * *   During a scaling event, you are not allowed to execute the `SUBMIT JOB` statement to submit asynchronous tasks. If your business requires asynchronous tasks, perform scaling during appropriate periods.
      * *   When cluster specifications are scaled up or down, data in the cluster is migrated for redistribution. The amount of time required for data migration is proportional to the volume of data. During a scale-up or scale-down event, the services provided by the cluster are not interrupted. During a scale-down event, data migration can take up to dozens of hours to complete. Proceed with caution especially when your cluster contains a large amount of data.
      * *   If the cluster has a built-in dataset loaded, make sure that the cluster has reserved storage resources of at least 24 AnalyticDB compute units (ACUs). Otherwise, the built-in dataset cannot be used.
      *
     */
    CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request);

    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    CompletableFuture<ModifyDBResourceGroupResponse> modifyDBResourceGroup(ModifyDBResourceGroupRequest request);

    CompletableFuture<ModifyElasticPlanResponse> modifyElasticPlan(ModifyElasticPlanRequest request);

    CompletableFuture<PreloadSparkAppMetricsResponse> preloadSparkAppMetrics(PreloadSparkAppMetricsRequest request);

    CompletableFuture<ReleaseClusterPublicConnectionResponse> releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request);

    CompletableFuture<RenameSparkTemplateFileResponse> renameSparkTemplateFile(RenameSparkTemplateFileRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<SetSparkAppLogRootPathResponse> setSparkAppLogRootPath(SetSparkAppLogRootPathRequest request);

    CompletableFuture<StartSparkSQLEngineResponse> startSparkSQLEngine(StartSparkSQLEngineRequest request);

    CompletableFuture<SubmitSparkAppResponse> submitSparkApp(SubmitSparkAppRequest request);

    CompletableFuture<SubmitSparkLogAnalyzeTaskResponse> submitSparkLogAnalyzeTask(SubmitSparkLogAnalyzeTaskRequest request);

    CompletableFuture<UnbindAccountResponse> unbindAccount(UnbindAccountRequest request);

    CompletableFuture<UnbindDBResourceGroupWithUserResponse> unbindDBResourceGroupWithUser(UnbindDBResourceGroupWithUserRequest request);

    CompletableFuture<UpdateSparkTemplateFileResponse> updateSparkTemplateFile(UpdateSparkTemplateFileRequest request);

}
