// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEditingProjectMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEditingProjectMaterialsResponseBody</p>
 */
public class DeleteEditingProjectMaterialsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteEditingProjectMaterialsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEditingProjectMaterialsResponseBody create() {
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

        public DeleteEditingProjectMaterialsResponseBody build() {
            return new DeleteEditingProjectMaterialsResponseBody(this);
        } 

    } 

}
