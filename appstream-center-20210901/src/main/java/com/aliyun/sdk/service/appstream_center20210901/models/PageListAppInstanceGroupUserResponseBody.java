// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageListAppInstanceGroupUserResponseBody} extends {@link TeaModel}
 *
 * <p>PageListAppInstanceGroupUserResponseBody</p>
 */
public class PageListAppInstanceGroupUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Users")
    private java.util.List < String > users;

    private PageListAppInstanceGroupUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageListAppInstanceGroupUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return users
     */
    public java.util.List < String > getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > users; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List < String > users) {
            this.users = users;
            return this;
        }

        public PageListAppInstanceGroupUserResponseBody build() {
            return new PageListAppInstanceGroupUserResponseBody(this);
        } 

    } 

}
