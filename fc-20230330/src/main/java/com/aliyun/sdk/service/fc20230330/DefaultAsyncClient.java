// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.fc20230330.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "FC";
        this.version = "2023-03-30";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * 创建函数别名。
      *
     */
    @Override
    public CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAlias").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/aliases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 创建自定义域名。
      *
     */
    @Override
    public CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCustomDomain").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/custom-domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 创建函数。
      *
     */
    @Override
    public CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFunction").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 创建层版本。
      *
     */
    @Override
    public CompletableFuture<CreateLayerVersionResponse> createLayerVersion(CreateLayerVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLayerVersion").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/layers/{layerName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLayerVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLayerVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 创建函数触发器。
      *
     */
    @Override
    public CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTrigger").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/triggers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 创建VPC绑定。
      *
     */
    @Override
    public CompletableFuture<CreateVpcBindingResponse> createVpcBinding(CreateVpcBindingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVpcBinding").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/vpc-bindings").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcBindingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcBindingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除函数别名。
      *
     */
    @Override
    public CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlias").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/aliases/{aliasName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除函数异步调用配置。
      *
     */
    @Override
    public CompletableFuture<DeleteAsyncInvokeConfigResponse> deleteAsyncInvokeConfig(DeleteAsyncInvokeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAsyncInvokeConfig").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/async-invoke-config").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAsyncInvokeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAsyncInvokeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除函数并发度配置。
      *
     */
    @Override
    public CompletableFuture<DeleteConcurrencyConfigResponse> deleteConcurrencyConfig(DeleteConcurrencyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConcurrencyConfig").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/concurrency").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConcurrencyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConcurrencyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除自定义域名。
      *
     */
    @Override
    public CompletableFuture<DeleteCustomDomainResponse> deleteCustomDomain(DeleteCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCustomDomain").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/custom-domains/{domainName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除函数。
      *
     */
    @Override
    public CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFunction").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除函数版本。
      *
     */
    @Override
    public CompletableFuture<DeleteFunctionVersionResponse> deleteFunctionVersion(DeleteFunctionVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFunctionVersion").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/versions/{versionId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFunctionVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFunctionVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除层版本。
      *
     */
    @Override
    public CompletableFuture<DeleteLayerVersionResponse> deleteLayerVersion(DeleteLayerVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLayerVersion").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/layers/{layerName}/versions/{version}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLayerVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLayerVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除函数预留配置。
      *
     */
    @Override
    public CompletableFuture<DeleteProvisionConfigResponse> deleteProvisionConfig(DeleteProvisionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProvisionConfig").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/provision-config").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProvisionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProvisionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除函数触发器。
      *
     */
    @Override
    public CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTrigger").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/triggers/{triggerName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除VPC绑定。
      *
     */
    @Override
    public CompletableFuture<DeleteVpcBindingResponse> deleteVpcBinding(DeleteVpcBindingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteVpcBinding").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/functions/{functionName}/vpc-bindings/{vpcId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcBindingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcBindingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取函数别名信息。
      *
     */
    @Override
    public CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlias").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/aliases/{aliasName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取函数异步调用配置。
      *
     */
    @Override
    public CompletableFuture<GetAsyncInvokeConfigResponse> getAsyncInvokeConfig(GetAsyncInvokeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAsyncInvokeConfig").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/async-invoke-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAsyncInvokeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAsyncInvokeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取函数并发度配置。
      *
     */
    @Override
    public CompletableFuture<GetConcurrencyConfigResponse> getConcurrencyConfig(GetConcurrencyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConcurrencyConfig").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/concurrency").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConcurrencyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConcurrencyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取自定义域名。
      *
     */
    @Override
    public CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCustomDomain").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/custom-domains/{domainName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取函数信息。
      *
     */
    @Override
    public CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFunction").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取函数代码。
      *
     */
    @Override
    public CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFunctionCode").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/code").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFunctionCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFunctionCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取层版本。
      *
     */
    @Override
    public CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLayerVersion").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/layers/{layerName}/versions/{version}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLayerVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLayerVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 根据资源标识获取层版本。
      *
     */
    @Override
    public CompletableFuture<GetLayerVersionByArnResponse> getLayerVersionByArn(GetLayerVersionByArnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLayerVersionByArn").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/layerarn/{arn}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLayerVersionByArnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLayerVersionByArnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取函数预留配置。
      *
     */
    @Override
    public CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProvisionConfig").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/provision-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProvisionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProvisionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取资源标签。
      *
     */
    @Override
    public CompletableFuture<GetResourceTagsResponse> getResourceTags(GetResourceTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceTags").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/tag").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 获取函数触发器。
      *
     */
    @Override
    public CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrigger").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/triggers/{triggerName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 调用函数。
      *
     */
    @Override
    public CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeFunction").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/invocations").setBodyType(BodyType.BINARY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<InvokeFunctionResponse> invokeFunctionWithRequestBody(InvokeFunctionRequest request, RequestBody requestBody) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeFunction").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/invocations").setBodyType(BodyType.BINARY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withRequestBody(requestBody).withOutput(InvokeFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> invokeFunctionWithAsyncResponseHandler(InvokeFunctionRequest request, AsyncResponseHandler<InvokeFunctionResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeFunction").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/invocations").setBodyType(BodyType.BINARY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(InvokeFunctionResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((InvokeFunctionResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出函数别名。
      *
     */
    @Override
    public CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAliases").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/aliases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAliasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAliasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出函数异步调用配置。
      *
     */
    @Override
    public CompletableFuture<ListAsyncInvokeConfigsResponse> listAsyncInvokeConfigs(ListAsyncInvokeConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAsyncInvokeConfigs").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/async-invoke-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAsyncInvokeConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAsyncInvokeConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出函数并发度配置。
      *
     */
    @Override
    public CompletableFuture<ListConcurrencyConfigsResponse> listConcurrencyConfigs(ListConcurrencyConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConcurrencyConfigs").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/concurrency-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConcurrencyConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConcurrencyConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出自定义域名。
      *
     */
    @Override
    public CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCustomDomains").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/custom-domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出函数版本。
      *
     */
    @Override
    public CompletableFuture<ListFunctionVersionsResponse> listFunctionVersions(ListFunctionVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFunctionVersions").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFunctionVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFunctionVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出函数。
      *
     */
    @Override
    public CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFunctions").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFunctionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFunctionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出函数实例。
      *
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出层版本。
      *
     */
    @Override
    public CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLayerVersions").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/layers/{layerName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLayerVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLayerVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出层。
      *
     */
    @Override
    public CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLayers").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/layers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLayersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLayersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出函数预留配置。
      *
     */
    @Override
    public CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProvisionConfigs").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/provision-configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProvisionConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProvisionConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出具有标签的资源。
      *
     */
    @Override
    public CompletableFuture<ListTaggedResourcesResponse> listTaggedResources(ListTaggedResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTaggedResources").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTaggedResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTaggedResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出函数触发器。
      *
     */
    @Override
    public CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTriggers").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/triggers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTriggersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTriggersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 列出VPC绑定配置。
      *
     */
    @Override
    public CompletableFuture<ListVpcBindingsResponse> listVpcBindings(ListVpcBindingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVpcBindings").setMethod(HttpMethod.GET).setPathRegex("/2023-03-30/functions/{functionName}/vpc-bindings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcBindingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcBindingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 发布函数版本。
      *
     */
    @Override
    public CompletableFuture<PublishFunctionVersionResponse> publishFunctionVersion(PublishFunctionVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishFunctionVersion").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/functions/{functionName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishFunctionVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishFunctionVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 设置函数异步调用配置。
      *
     */
    @Override
    public CompletableFuture<PutAsyncInvokeConfigResponse> putAsyncInvokeConfig(PutAsyncInvokeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutAsyncInvokeConfig").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/async-invoke-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutAsyncInvokeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutAsyncInvokeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 设置函数并发度配置。
      *
     */
    @Override
    public CompletableFuture<PutConcurrencyConfigResponse> putConcurrencyConfig(PutConcurrencyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutConcurrencyConfig").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/concurrency").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutConcurrencyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutConcurrencyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 设置层的访问权限。
      *
     */
    @Override
    public CompletableFuture<PutLayerACLResponse> putLayerACL(PutLayerACLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutLayerACL").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/layers/{layerName}/acl").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutLayerACLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutLayerACLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 设置函数预留配置。
      *
     */
    @Override
    public CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutProvisionConfig").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/provision-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutProvisionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutProvisionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 设置资源标签。
      *
     */
    @Override
    public CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResource").setMethod(HttpMethod.POST).setPathRegex("/2023-03-30/tag").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 删除资源标签。
      *
     */
    @Override
    public CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResource").setMethod(HttpMethod.DELETE).setPathRegex("/2023-03-30/tag").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 更新函数别名。
      *
     */
    @Override
    public CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlias").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/aliases/{aliasName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 更新自定义域名。
      *
     */
    @Override
    public CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCustomDomain").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/custom-domains/{domainName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 更新函数。
      *
     */
    @Override
    public CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFunction").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * 更新函数触发器。
      *
     */
    @Override
    public CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTrigger").setMethod(HttpMethod.PUT).setPathRegex("/2023-03-30/functions/{functionName}/triggers/{triggerName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
