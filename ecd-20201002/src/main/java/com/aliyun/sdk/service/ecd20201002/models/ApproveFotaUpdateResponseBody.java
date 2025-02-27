// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveFotaUpdateResponseBody} extends {@link TeaModel}
 *
 * <p>ApproveFotaUpdateResponseBody</p>
 */
public class ApproveFotaUpdateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ApproveFotaUpdateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveFotaUpdateResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ApproveFotaUpdateResponseBody build() {
            return new ApproveFotaUpdateResponseBody(this);
        } 

    } 

}
