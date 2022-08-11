// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FTApiAliasApiResponseBody} extends {@link TeaModel}
 *
 * <p>FTApiAliasApiResponseBody</p>
 */
public class FTApiAliasApiResponseBody extends TeaModel {
    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    private FTApiAliasApiResponseBody(Builder builder) {
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FTApiAliasApiResponseBody create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String name; 
        private String requestId; 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FTApiAliasApiResponseBody build() {
            return new FTApiAliasApiResponseBody(this);
        } 

    } 

}
