// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppWebUiAddressRequest} extends {@link RequestModel}
 *
 * <p>GetSparkAppWebUiAddressRequest</p>
 */
public class GetSparkAppWebUiAddressRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true, maxLength = 64)
    private String appId;

    private GetSparkAppWebUiAddressRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppWebUiAddressRequest create() {
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

    public static final class Builder extends Request.Builder<GetSparkAppWebUiAddressRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkAppWebUiAddressRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * The ID of the Spark application.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public GetSparkAppWebUiAddressRequest build() {
            return new GetSparkAppWebUiAddressRequest(this);
        } 

    } 

}
