// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitStagingRoutineCodeResponseBody} extends {@link TeaModel}
 *
 * <p>CommitStagingRoutineCodeResponseBody</p>
 */
public class CommitStagingRoutineCodeResponseBody extends TeaModel {
    @NameInMap("Content")
    private java.util.Map < String, ? > content;

    @NameInMap("RequestId")
    private String requestId;

    private CommitStagingRoutineCodeResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitStagingRoutineCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.Map < String, ? > getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > content; 
        private String requestId; 

        /**
         * The version number of the code.
         */
        public Builder content(java.util.Map < String, ? > content) {
            this.content = content;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CommitStagingRoutineCodeResponseBody build() {
            return new CommitStagingRoutineCodeResponseBody(this);
        } 

    } 

}
