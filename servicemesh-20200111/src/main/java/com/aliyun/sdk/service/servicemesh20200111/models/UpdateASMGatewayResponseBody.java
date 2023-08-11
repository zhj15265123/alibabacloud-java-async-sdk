// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateASMGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateASMGatewayResponseBody</p>
 */
public class UpdateASMGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateASMGatewayResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateASMGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateASMGatewayResponseBody build() {
            return new UpdateASMGatewayResponseBody(this);
        } 

    } 

}
