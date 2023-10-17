// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeUserLangResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeUserLangResponseBody</p>
 */
public class ChangeUserLangResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ChangeUserLangResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeUserLangResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChangeUserLangResponseBody build() {
            return new ChangeUserLangResponseBody(this);
        } 

    } 

}
