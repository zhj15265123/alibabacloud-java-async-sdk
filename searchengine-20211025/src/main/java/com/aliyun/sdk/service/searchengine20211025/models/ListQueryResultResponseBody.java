// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryResultResponseBody</p>
 */
public class ListQueryResultResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private ListQueryResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryResultResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQueryResultResponseBody build() {
            return new ListQueryResultResponseBody(this);
        } 

    } 

}
