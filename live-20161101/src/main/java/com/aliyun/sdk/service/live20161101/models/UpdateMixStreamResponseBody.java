// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMixStreamResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMixStreamResponseBody</p>
 */
public class UpdateMixStreamResponseBody extends TeaModel {
    @NameInMap("MixStreamId")
    private String mixStreamId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateMixStreamResponseBody(Builder builder) {
        this.mixStreamId = builder.mixStreamId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMixStreamResponseBody create() {
        return builder().build();
    }

    /**
     * @return mixStreamId
     */
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mixStreamId; 
        private String requestId; 

        /**
         * MixStreamId.
         */
        public Builder mixStreamId(String mixStreamId) {
            this.mixStreamId = mixStreamId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateMixStreamResponseBody build() {
            return new UpdateMixStreamResponseBody(this);
        } 

    } 

}
