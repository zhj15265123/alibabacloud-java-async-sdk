// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectionTicketRequest} extends {@link RequestModel}
 *
 * <p>GetConnectionTicketRequest</p>
 */
public class GetConnectionTicketRequest extends Request {
    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("AppInstanceGroupIdList")
    private java.util.List < String > appInstanceGroupIdList;

    @Body
    @NameInMap("AppInstanceId")
    private String appInstanceId;

    @Body
    @NameInMap("AppStartParam")
    private String appStartParam;

    @Body
    @NameInMap("AppVersion")
    private String appVersion;

    @Body
    @NameInMap("BizRegionId")
    private String bizRegionId;

    @Body
    @NameInMap("EndUserId")
    @Validation(required = true)
    private String endUserId;

    @Body
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    private GetConnectionTicketRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appInstanceGroupIdList = builder.appInstanceGroupIdList;
        this.appInstanceId = builder.appInstanceId;
        this.appStartParam = builder.appStartParam;
        this.appVersion = builder.appVersion;
        this.bizRegionId = builder.bizRegionId;
        this.endUserId = builder.endUserId;
        this.productType = builder.productType;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appInstanceGroupIdList
     */
    public java.util.List < String > getAppInstanceGroupIdList() {
        return this.appInstanceGroupIdList;
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return appStartParam
     */
    public String getAppStartParam() {
        return this.appStartParam;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetConnectionTicketRequest, Builder> {
        private String appId; 
        private java.util.List < String > appInstanceGroupIdList; 
        private String appInstanceId; 
        private String appStartParam; 
        private String appVersion; 
        private String bizRegionId; 
        private String endUserId; 
        private String productType; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectionTicketRequest request) {
            super(request);
            this.appId = request.appId;
            this.appInstanceGroupIdList = request.appInstanceGroupIdList;
            this.appInstanceId = request.appInstanceId;
            this.appStartParam = request.appStartParam;
            this.appVersion = request.appVersion;
            this.bizRegionId = request.bizRegionId;
            this.endUserId = request.endUserId;
            this.productType = request.productType;
            this.taskId = request.taskId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppInstanceGroupIdList.
         */
        public Builder appInstanceGroupIdList(java.util.List < String > appInstanceGroupIdList) {
            this.putBodyParameter("AppInstanceGroupIdList", appInstanceGroupIdList);
            this.appInstanceGroupIdList = appInstanceGroupIdList;
            return this;
        }

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putBodyParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * AppStartParam.
         */
        public Builder appStartParam(String appStartParam) {
            this.putBodyParameter("AppStartParam", appStartParam);
            this.appStartParam = appStartParam;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetConnectionTicketRequest build() {
            return new GetConnectionTicketRequest(this);
        } 

    } 

}
