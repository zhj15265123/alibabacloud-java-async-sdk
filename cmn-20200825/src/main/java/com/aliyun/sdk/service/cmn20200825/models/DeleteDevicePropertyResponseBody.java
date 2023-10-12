// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevicePropertyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDevicePropertyResponseBody</p>
 */
public class DeleteDevicePropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDevicePropertyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevicePropertyResponseBody create() {
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

        public DeleteDevicePropertyResponseBody build() {
            return new DeleteDevicePropertyResponseBody(this);
        } 

    } 

}
