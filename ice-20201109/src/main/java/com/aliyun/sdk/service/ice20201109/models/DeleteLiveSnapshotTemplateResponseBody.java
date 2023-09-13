// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveSnapshotTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLiveSnapshotTemplateResponseBody</p>
 */
public class DeleteLiveSnapshotTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteLiveSnapshotTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveSnapshotTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLiveSnapshotTemplateResponseBody build() {
            return new DeleteLiveSnapshotTemplateResponseBody(this);
        } 

    } 

}
