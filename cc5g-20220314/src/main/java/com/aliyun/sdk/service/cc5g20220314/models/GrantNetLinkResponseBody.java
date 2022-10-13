// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantNetLinkResponseBody} extends {@link TeaModel}
 *
 * <p>GrantNetLinkResponseBody</p>
 */
public class GrantNetLinkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private GrantNetLinkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantNetLinkResponseBody create() {
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

        public GrantNetLinkResponseBody build() {
            return new GrantNetLinkResponseBody(this);
        } 

    } 

}
