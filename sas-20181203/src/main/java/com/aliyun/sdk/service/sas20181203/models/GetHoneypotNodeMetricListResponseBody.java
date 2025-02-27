// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotNodeMetricListResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotNodeMetricListResponseBody</p>
 */
public class GetHoneypotNodeMetricListResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
    private String requestId;

    private GetHoneypotNodeMetricListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotNodeMetricListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHoneypotNodeMetricListResponseBody build() {
            return new GetHoneypotNodeMetricListResponseBody(this);
        } 

    } 

}
