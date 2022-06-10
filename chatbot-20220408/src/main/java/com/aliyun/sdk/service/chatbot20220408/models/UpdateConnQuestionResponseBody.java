// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConnQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateConnQuestionResponseBody</p>
 */
public class UpdateConnQuestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateConnQuestionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnQuestionResponseBody create() {
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

        public UpdateConnQuestionResponseBody build() {
            return new UpdateConnQuestionResponseBody(this);
        } 

    } 

}
