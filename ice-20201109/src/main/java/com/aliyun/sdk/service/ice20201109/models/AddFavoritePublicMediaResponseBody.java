// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFavoritePublicMediaResponseBody} extends {@link TeaModel}
 *
 * <p>AddFavoritePublicMediaResponseBody</p>
 */
public class AddFavoritePublicMediaResponseBody extends TeaModel {
    @NameInMap("IgnoredList")
    private java.util.List < String > ignoredList;

    @NameInMap("RequestId")
    private String requestId;

    private AddFavoritePublicMediaResponseBody(Builder builder) {
        this.ignoredList = builder.ignoredList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFavoritePublicMediaResponseBody create() {
        return builder().build();
    }

    /**
     * @return ignoredList
     */
    public java.util.List < String > getIgnoredList() {
        return this.ignoredList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > ignoredList; 
        private String requestId; 

        /**
         * IgnoredList.
         */
        public Builder ignoredList(java.util.List < String > ignoredList) {
            this.ignoredList = ignoredList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddFavoritePublicMediaResponseBody build() {
            return new AddFavoritePublicMediaResponseBody(this);
        } 

    } 

}
