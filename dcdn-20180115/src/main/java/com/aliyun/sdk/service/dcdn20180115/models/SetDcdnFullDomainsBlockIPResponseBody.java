// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnFullDomainsBlockIPResponseBody} extends {@link TeaModel}
 *
 * <p>SetDcdnFullDomainsBlockIPResponseBody</p>
 */
public class SetDcdnFullDomainsBlockIPResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private SetDcdnFullDomainsBlockIPResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnFullDomainsBlockIPResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The status code that indicates the result.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetDcdnFullDomainsBlockIPResponseBody build() {
            return new SetDcdnFullDomainsBlockIPResponseBody(this);
        } 

    } 

}
