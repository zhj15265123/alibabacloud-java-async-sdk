// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBasicEndpointGroupResponseBody</p>
 */
public class DeleteBasicEndpointGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteBasicEndpointGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBasicEndpointGroupResponseBody create() {
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
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBasicEndpointGroupResponseBody build() {
            return new DeleteBasicEndpointGroupResponseBody(this);
        } 

    } 

}
