// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAccountPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>ResetAccountPasswordResponseBody</p>
 */
public class ResetAccountPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ResetAccountPasswordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAccountPasswordResponseBody create() {
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
         * The account for which you want to reset the password. Set the value to **root**.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResetAccountPasswordResponseBody build() {
            return new ResetAccountPasswordResponseBody(this);
        } 

    } 

}
