// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTLSCipherPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTLSCipherPolicyResponseBody</p>
 */
public class DeleteTLSCipherPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteTLSCipherPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTLSCipherPolicyResponseBody create() {
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

        public DeleteTLSCipherPolicyResponseBody build() {
            return new DeleteTLSCipherPolicyResponseBody(this);
        } 

    } 

}
