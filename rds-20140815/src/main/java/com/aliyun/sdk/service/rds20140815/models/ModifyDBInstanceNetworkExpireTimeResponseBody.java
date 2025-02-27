// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceNetworkExpireTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceNetworkExpireTimeResponseBody</p>
 */
public class ModifyDBInstanceNetworkExpireTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceNetworkExpireTimeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceNetworkExpireTimeResponseBody create() {
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

        public ModifyDBInstanceNetworkExpireTimeResponseBody build() {
            return new ModifyDBInstanceNetworkExpireTimeResponseBody(this);
        } 

    } 

}
