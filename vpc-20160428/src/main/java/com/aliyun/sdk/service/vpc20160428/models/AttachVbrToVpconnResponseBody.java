// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachVbrToVpconnResponseBody} extends {@link TeaModel}
 *
 * <p>AttachVbrToVpconnResponseBody</p>
 */
public class AttachVbrToVpconnResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VirtualPhysicalConnection")
    private String virtualPhysicalConnection;

    private AttachVbrToVpconnResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.virtualPhysicalConnection = builder.virtualPhysicalConnection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachVbrToVpconnResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return virtualPhysicalConnection
     */
    public String getVirtualPhysicalConnection() {
        return this.virtualPhysicalConnection;
    }

    public static final class Builder {
        private String requestId; 
        private String virtualPhysicalConnection; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the hosted connection.
         */
        public Builder virtualPhysicalConnection(String virtualPhysicalConnection) {
            this.virtualPhysicalConnection = virtualPhysicalConnection;
            return this;
        }

        public AttachVbrToVpconnResponseBody build() {
            return new AttachVbrToVpconnResponseBody(this);
        } 

    } 

}
