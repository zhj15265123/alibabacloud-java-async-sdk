// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTransferableNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateTransferableNodesResponseBody</p>
 */
public class ValidateTransferableNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private ValidateTransferableNodesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateTransferableNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Returned results:
         * <p>
         * 
         * *   true: can be migrated
         * *   false: cannot be migrated.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public ValidateTransferableNodesResponseBody build() {
            return new ValidateTransferableNodesResponseBody(this);
        } 

    } 

}
