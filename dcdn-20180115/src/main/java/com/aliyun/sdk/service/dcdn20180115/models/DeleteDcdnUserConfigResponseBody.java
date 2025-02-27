// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnUserConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDcdnUserConfigResponseBody</p>
 */
public class DeleteDcdnUserConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDcdnUserConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnUserConfigResponseBody create() {
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

        public DeleteDcdnUserConfigResponseBody build() {
            return new DeleteDcdnUserConfigResponseBody(this);
        } 

    } 

}
