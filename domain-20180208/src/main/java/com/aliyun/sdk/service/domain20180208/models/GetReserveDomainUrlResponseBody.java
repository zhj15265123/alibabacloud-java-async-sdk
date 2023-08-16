// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetReserveDomainUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetReserveDomainUrlResponseBody</p>
 */
public class GetReserveDomainUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Url")
    private String url;

    private GetReserveDomainUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReserveDomainUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String requestId; 
        private String url; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetReserveDomainUrlResponseBody build() {
            return new GetReserveDomainUrlResponseBody(this);
        } 

    } 

}
