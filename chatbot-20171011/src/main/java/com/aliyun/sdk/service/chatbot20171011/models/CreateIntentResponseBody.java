// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIntentResponseBody</p>
 */
public class CreateIntentResponseBody extends TeaModel {
    @NameInMap("IntentId")
    private Long intentId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateIntentResponseBody(Builder builder) {
        this.intentId = builder.intentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntentResponseBody create() {
        return builder().build();
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long intentId; 
        private String requestId; 

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIntentResponseBody build() {
            return new CreateIntentResponseBody(this);
        } 

    } 

}
