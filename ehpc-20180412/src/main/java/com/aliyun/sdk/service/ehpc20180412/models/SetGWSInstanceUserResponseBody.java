// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGWSInstanceUserResponseBody} extends {@link TeaModel}
 *
 * <p>SetGWSInstanceUserResponseBody</p>
 */
public class SetGWSInstanceUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetGWSInstanceUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGWSInstanceUserResponseBody create() {
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

        public SetGWSInstanceUserResponseBody build() {
            return new SetGWSInstanceUserResponseBody(this);
        } 

    } 

}
