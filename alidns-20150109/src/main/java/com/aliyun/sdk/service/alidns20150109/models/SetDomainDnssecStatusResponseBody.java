// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainDnssecStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetDomainDnssecStatusResponseBody</p>
 */
public class SetDomainDnssecStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetDomainDnssecStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainDnssecStatusResponseBody create() {
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

        public SetDomainDnssecStatusResponseBody build() {
            return new SetDomainDnssecStatusResponseBody(this);
        } 

    } 

}
