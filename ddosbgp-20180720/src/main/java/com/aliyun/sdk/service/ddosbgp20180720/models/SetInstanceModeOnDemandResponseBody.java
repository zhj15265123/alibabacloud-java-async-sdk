// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstanceModeOnDemandResponseBody} extends {@link TeaModel}
 *
 * <p>SetInstanceModeOnDemandResponseBody</p>
 */
public class SetInstanceModeOnDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetInstanceModeOnDemandResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetInstanceModeOnDemandResponseBody create() {
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

        public SetInstanceModeOnDemandResponseBody build() {
            return new SetInstanceModeOnDemandResponseBody(this);
        } 

    } 

}
