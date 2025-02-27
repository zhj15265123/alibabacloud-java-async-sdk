// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIpResponseBody</p>
 */
public class DeleteIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpResponseBody create() {
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
         * Removes specific IP addresses from an Anti-DDoS Origin Enterprise instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteIpResponseBody build() {
            return new DeleteIpResponseBody(this);
        } 

    } 

}
