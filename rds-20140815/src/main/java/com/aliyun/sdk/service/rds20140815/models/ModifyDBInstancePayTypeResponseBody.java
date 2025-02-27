// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstancePayTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstancePayTypeResponseBody</p>
 */
public class ModifyDBInstancePayTypeResponseBody extends TeaModel {
    @NameInMap("OrderId")
    private Long orderId;

    private ModifyDBInstancePayTypeResponseBody(Builder builder) {
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstancePayTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    public static final class Builder {
        private Long orderId; 

        /**
         * The ID of the order.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        public ModifyDBInstancePayTypeResponseBody build() {
            return new ModifyDBInstancePayTypeResponseBody(this);
        } 

    } 

}
