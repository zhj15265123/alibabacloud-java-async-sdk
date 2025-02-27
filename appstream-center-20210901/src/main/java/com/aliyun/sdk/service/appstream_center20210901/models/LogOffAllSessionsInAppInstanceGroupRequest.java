// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogOffAllSessionsInAppInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>LogOffAllSessionsInAppInstanceGroupRequest</p>
 */
public class LogOffAllSessionsInAppInstanceGroupRequest extends Request {
    @Body
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Body
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    private LogOffAllSessionsInAppInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogOffAllSessionsInAppInstanceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<LogOffAllSessionsInAppInstanceGroupRequest, Builder> {
        private String appInstanceGroupId; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(LogOffAllSessionsInAppInstanceGroupRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.productType = request.productType;
        } 

        /**
         * 实例组id
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * 产品类型
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public LogOffAllSessionsInAppInstanceGroupRequest build() {
            return new LogOffAllSessionsInAppInstanceGroupRequest(this);
        } 

    } 

}
