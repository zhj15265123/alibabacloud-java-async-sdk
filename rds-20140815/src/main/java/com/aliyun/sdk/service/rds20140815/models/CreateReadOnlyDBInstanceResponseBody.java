// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReadOnlyDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReadOnlyDBInstanceResponseBody</p>
 */
public class CreateReadOnlyDBInstanceResponseBody extends TeaModel {
    @NameInMap("ConnectionString")
    private String connectionString;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("Port")
    private String port;

    @NameInMap("RequestId")
    private String requestId;

    private CreateReadOnlyDBInstanceResponseBody(Builder builder) {
        this.connectionString = builder.connectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.orderId = builder.orderId;
        this.port = builder.port;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReadOnlyDBInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String connectionString; 
        private String DBInstanceId; 
        private String orderId; 
        private String port; 
        private String requestId; 

        /**
         * The internal endpoint that is used to connect to the read-only instance.
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * The ID of the read-only instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The ID of the order.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The internal port number that is used to connect to the read-only instance.
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateReadOnlyDBInstanceResponseBody build() {
            return new CreateReadOnlyDBInstanceResponseBody(this);
        } 

    } 

}
