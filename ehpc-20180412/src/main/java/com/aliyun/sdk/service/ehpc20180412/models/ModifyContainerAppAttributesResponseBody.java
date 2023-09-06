// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyContainerAppAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyContainerAppAttributesResponseBody</p>
 */
public class ModifyContainerAppAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyContainerAppAttributesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyContainerAppAttributesResponseBody create() {
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

        public ModifyContainerAppAttributesResponseBody build() {
            return new ModifyContainerAppAttributesResponseBody(this);
        } 

    } 

}
