// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountMFAInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountMFAInfoResponseBody</p>
 */
public class GetAccountMFAInfoResponseBody extends TeaModel {
    @NameInMap("IsMFAEnable")
    private Boolean isMFAEnable;

    @NameInMap("RequestId")
    private String requestId;

    private GetAccountMFAInfoResponseBody(Builder builder) {
        this.isMFAEnable = builder.isMFAEnable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountMFAInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return isMFAEnable
     */
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isMFAEnable; 
        private String requestId; 

        /**
         * IsMFAEnable.
         */
        public Builder isMFAEnable(Boolean isMFAEnable) {
            this.isMFAEnable = isMFAEnable;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountMFAInfoResponseBody build() {
            return new GetAccountMFAInfoResponseBody(this);
        } 

    } 

}
