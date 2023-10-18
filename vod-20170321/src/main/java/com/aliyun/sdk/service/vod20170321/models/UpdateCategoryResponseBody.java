// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCategoryResponseBody</p>
 */
public class UpdateCategoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateCategoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCategoryResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCategoryResponseBody build() {
            return new UpdateCategoryResponseBody(this);
        } 

    } 

}
