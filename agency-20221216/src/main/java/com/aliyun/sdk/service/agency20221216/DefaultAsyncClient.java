// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.agency20221216.models.*;
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
        this.product = "Agency";
        this.version = "2022-12-16";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "agency.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "agency.aliyuncs.com"),
            new TeaPair("ap-south-1", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-chengdu", "agency.aliyuncs.com"),
            new TeaPair("cn-edge-1", "agency.aliyuncs.com"),
            new TeaPair("cn-fujian", "agency.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "agency.aliyuncs.com"),
            new TeaPair("cn-hongkong", "agency.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "agency.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "agency.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "agency.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "agency.aliyuncs.com"),
            new TeaPair("cn-qingdao", "agency.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-wuhan", "agency.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "agency.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "agency.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "agency.aliyuncs.com"),
            new TeaPair("eu-central-1", "agency.aliyuncs.com"),
            new TeaPair("eu-west-1", "agency.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "agency.aliyuncs.com"),
            new TeaPair("me-east-1", "agency.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "agency.aliyuncs.com"),
            new TeaPair("us-east-1", "agency.aliyuncs.com"),
            new TeaPair("us-west-1", "agency.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * Make sure that you are a distributor of the Alibaba Cloud international ecosystem.
      * You can call this operation to cancel the subscription to only one type of bill at a time.
      * After the subscription to a type of bill is canceled, bills of this type are no longer pushed to the specified Object Storage Service (OSS) bucket.
      * **This topic is published only on the international site (alibabacloud.com).
      *
     */
    @Override
    public CompletableFuture<CancelSubscriptionBillResponse> cancelSubscriptionBill(CancelSubscriptionBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelSubscriptionBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelSubscriptionBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelSubscriptionBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateCustomerResponse> createCustomer(CreateCustomerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeductOutstandingBalanceResponse> deductOutstandingBalance(DeductOutstandingBalanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeductOutstandingBalance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeductOutstandingBalanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeductOutstandingBalanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EditEndUserStatusResponse> editEndUserStatus(EditEndUserStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditEndUserStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditEndUserStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditEndUserStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EditNewBuyStatusResponse> editNewBuyStatus(EditNewBuyStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditNewBuyStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditNewBuyStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditNewBuyStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EditZeroCreditShutdownResponse> editZeroCreditShutdown(EditZeroCreditShutdownRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditZeroCreditShutdown").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditZeroCreditShutdownResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditZeroCreditShutdownResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetAccountInfoResponse> getAccountInfo(GetAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetCreditInfoResponse> getCreditInfo(GetCreditInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCreditInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCreditInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCreditInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDailyBillResponse> getDailyBill(GetDailyBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDailyBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDailyBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDailyBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetInviteStatusResponse> getInviteStatus(GetInviteStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInviteStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInviteStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInviteStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetMonthlyBillResponse> getMonthlyBill(GetMonthlyBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMonthlyBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMonthlyBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMonthlyBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetUnassociatedCustomerResponse> getUnassociatedCustomer(GetUnassociatedCustomerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUnassociatedCustomer").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUnassociatedCustomerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUnassociatedCustomerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<InviteSubAccountResponse> inviteSubAccount(InviteSubAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InviteSubAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InviteSubAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InviteSubAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListCountriesResponse> listCountries(ListCountriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCountries").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCountriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCountriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ResendEmailResponse> resendEmail(ResendEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResendEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResendEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResendEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetAccountInfoResponse> setAccountInfo(SetAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAccountInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetCreditLineResponse> setCreditLine(SetCreditLineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCreditLine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCreditLineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCreditLineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetWarningThresholdResponse> setWarningThreshold(SetWarningThresholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetWarningThreshold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetWarningThresholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetWarningThresholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Make sure that you are a distributor of the Alibaba Cloud international ecosystem.
      * *   You can call this operation to subscribe to only one type of bill at a time.
      * *   After the subscription to a type of bill is generated, the bill for the previous day is pushed on a daily basis from the next day. On the fifth day of each month, the full-data bill for the previous month is pushed.
      * *   A daily bill may be delayed. The delayed bill is pushed the next day after it is generated. The delayed bill may contain the bill data that is delayed until the previous day. We recommend that you query the full-data bill for the previous month at the beginning of each month.
      * *   Your account must be granted the [AliyunConsumeDump2OSSRole](https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D) permission.
      * *   The following file name formats are supported for bills:
      * ```
      * BillingItemDetailForBillingPeriod
      *   
      * File name format of a daily bill: UID_PartnerBillingItemDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_BillingItemDetail_20190310_0001_01. 
      *   
      * File name format of a monthly full-data bill: UID_PartnerBillingItemDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetail_201903_0001_01. 
      * InstanceDetailForBillingPeriod
      *  
      *  File name format of a daily bill: UID_PartnerInstanceDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_InstanceDetail_20190310_0001_01. 
      *   
      * File name format of a monthly full-data bill: UID_PartnerInstanceDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetail_201903_1999-0001_01. 
      * BillingItemDetailMonthly
      *   
      * File name format of a daily bill: UID_PartnerBillingItemDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetailMonthly_201903_0001_01. This bill contains the bill data that is generated from the beginning of the current month to the fifth day of the next month. 
      * InstanceDetailMonthly
      *   
      * File name format of a daily bill: UID_PartnerInstanceDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetailMonthly_201903_0001_01. This bill contains the bill data that is generated from the beginning of the current month to the fifth day of the next month. 
      * The fileNo field exists only when the number of bill rows reaches the maximum rows in a single bill file and the bill is split into multiple files.
      * ```
      * **This topic is published only on the international site (alibabacloud.com).
      *
     */
    @Override
    public CompletableFuture<SubscriptionBillResponse> subscriptionBill(SubscriptionBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubscriptionBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubscriptionBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubscriptionBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
