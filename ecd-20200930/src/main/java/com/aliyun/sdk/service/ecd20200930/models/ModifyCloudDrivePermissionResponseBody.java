// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudDrivePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCloudDrivePermissionResponseBody</p>
 */
public class ModifyCloudDrivePermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyCloudDrivePermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudDrivePermissionResponseBody create() {
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

        public ModifyCloudDrivePermissionResponseBody build() {
            return new ModifyCloudDrivePermissionResponseBody(this);
        } 

    } 

}
