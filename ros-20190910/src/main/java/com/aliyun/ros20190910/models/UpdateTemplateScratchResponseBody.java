// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateTemplateScratchResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTemplateScratchResponseBody</p>
 */
public class UpdateTemplateScratchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateScratchId")
    private String templateScratchId;


    private UpdateTemplateScratchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateScratchId = builder.templateScratchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateScratchResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static final class Builder {
        private String requestId; 
        private String templateScratchId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TemplateScratchId.</p>
         */
        public Builder templateScratchId(String templateScratchId) {
            this.templateScratchId = templateScratchId;
            return this;
        }

        public UpdateTemplateScratchResponseBody build() {
            return new UpdateTemplateScratchResponseBody(this);
        } 

    } 

}
