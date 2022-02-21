// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBasicIpSetResponseBody</p>
 */
public class DeleteBasicIpSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteBasicIpSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBasicIpSetResponseBody create() {
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

        public DeleteBasicIpSetResponseBody build() {
            return new DeleteBasicIpSetResponseBody(this);
        } 

    } 

}
