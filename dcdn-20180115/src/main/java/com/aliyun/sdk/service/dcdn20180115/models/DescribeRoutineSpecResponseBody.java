// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoutineSpecResponseBody</p>
 */
public class DescribeRoutineSpecResponseBody extends TeaModel {
    @NameInMap("Content")
    private java.util.Map < String, ? > content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRoutineSpecResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineSpecResponseBody create() {
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
         * The specification of the CPU time slice. Valid values: 5 ms, 50 ms, and 100 ms.
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

        public DescribeRoutineSpecResponseBody build() {
            return new DescribeRoutineSpecResponseBody(this);
        } 

    } 

}
