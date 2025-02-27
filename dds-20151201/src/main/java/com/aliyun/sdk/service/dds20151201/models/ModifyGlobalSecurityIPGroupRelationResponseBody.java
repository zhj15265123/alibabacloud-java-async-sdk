// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGlobalSecurityIPGroupRelationResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyGlobalSecurityIPGroupRelationResponseBody</p>
 */
public class ModifyGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyGlobalSecurityIPGroupRelationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGlobalSecurityIPGroupRelationResponseBody create() {
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

        public ModifyGlobalSecurityIPGroupRelationResponseBody build() {
            return new ModifyGlobalSecurityIPGroupRelationResponseBody(this);
        } 

    } 

}
