// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bpstudio20210931.models.*;
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

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
      * Before you call this operation to delete an application, make sure that the application is in the `Destroyed_Success` state. Otherwise, the application fails to be deleted.`` You can call the [GetApplication](https://www.alibabacloud.com/help/zh/bp-studio/latest/api-doc-bpstudio-2021-09-31-api-doc-getapplication) operation to query the status of an application.
      *
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeployApplicationResponse> deployApplication(DeployApplicationRequest request);

    CompletableFuture<ExecuteOperationASyncResponse> executeOperationASync(ExecuteOperationASyncRequest request);

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetExecuteOperationResultResponse> getExecuteOperationResult(GetExecuteOperationResultRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    CompletableFuture<ListApplicationResponse> listApplication(ListApplicationRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTemplateResponse> listTemplate(ListTemplateRequest request);

    CompletableFuture<ReleaseApplicationResponse> releaseApplication(ReleaseApplicationRequest request);

    CompletableFuture<ValidateApplicationResponse> validateApplication(ValidateApplicationRequest request);

    CompletableFuture<ValuateApplicationResponse> valuateApplication(ValuateApplicationRequest request);

    CompletableFuture<ValuateTemplateResponse> valuateTemplate(ValuateTemplateRequest request);

}
