// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterProgramResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCasterProgramResponseBody</p>
 */
public class ModifyCasterProgramResponseBody extends TeaModel {
    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyCasterProgramResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCasterProgramResponseBody create() {
        return builder().build();
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String casterId; 
        private String requestId; 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCasterProgramResponseBody build() {
            return new ModifyCasterProgramResponseBody(this);
        } 

    } 

}
