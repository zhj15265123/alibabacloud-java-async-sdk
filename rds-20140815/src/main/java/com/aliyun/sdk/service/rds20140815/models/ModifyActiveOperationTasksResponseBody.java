// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActiveOperationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyActiveOperationTasksResponseBody</p>
 */
public class ModifyActiveOperationTasksResponseBody extends TeaModel {
    @NameInMap("Ids")
    private String ids;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyActiveOperationTasksResponseBody(Builder builder) {
        this.ids = builder.ids;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActiveOperationTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ids; 
        private String requestId; 

        /**
         * The ID of the O\&M task. IDs are separated by commas (,).
         */
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyActiveOperationTasksResponseBody build() {
            return new ModifyActiveOperationTasksResponseBody(this);
        } 

    } 

}
