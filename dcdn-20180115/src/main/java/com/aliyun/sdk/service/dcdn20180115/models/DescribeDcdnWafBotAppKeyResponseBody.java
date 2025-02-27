// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafBotAppKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafBotAppKeyResponseBody</p>
 */
public class DescribeDcdnWafBotAppKeyResponseBody extends TeaModel {
    @NameInMap("AppKey")
    private String appKey;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnWafBotAppKeyResponseBody(Builder builder) {
        this.appKey = builder.appKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafBotAppKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appKey; 
        private String requestId; 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafBotAppKeyResponseBody build() {
            return new DescribeDcdnWafBotAppKeyResponseBody(this);
        } 

    } 

}
