// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWirelessCloudConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteWirelessCloudConnectorResponseBody</p>
 */
public class DeleteWirelessCloudConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteWirelessCloudConnectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWirelessCloudConnectorResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteWirelessCloudConnectorResponseBody build() {
            return new DeleteWirelessCloudConnectorResponseBody(this);
        } 

    } 

}
