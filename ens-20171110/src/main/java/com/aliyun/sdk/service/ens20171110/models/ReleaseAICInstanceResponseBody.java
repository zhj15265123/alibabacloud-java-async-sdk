// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseAICInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseAICInstanceResponseBody</p>
 */
public class ReleaseAICInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ReleaseAICInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseAICInstanceResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReleaseAICInstanceResponseBody build() {
            return new ReleaseAICInstanceResponseBody(this);
        } 

    } 

}
