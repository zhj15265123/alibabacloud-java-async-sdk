// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterAuditLogCollectorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAuditLogCollectorResponseBody</p>
 */
public class DescribeDBClusterAuditLogCollectorResponseBody extends TeaModel {
    @NameInMap("CollectorStatus")
    private String collectorStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterAuditLogCollectorResponseBody(Builder builder) {
        this.collectorStatus = builder.collectorStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAuditLogCollectorResponseBody create() {
        return builder().build();
    }

    /**
     * @return collectorStatus
     */
    public String getCollectorStatus() {
        return this.collectorStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String collectorStatus; 
        private String requestId; 

        /**
         * The status of SQL data collector. Valid values:
         * <p>
         * 
         * *   Enable: SQL data collector is enabled.
         * *   Disabled: SQL data collector is disabled.
         */
        public Builder collectorStatus(String collectorStatus) {
            this.collectorStatus = collectorStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterAuditLogCollectorResponseBody build() {
            return new DescribeDBClusterAuditLogCollectorResponseBody(this);
        } 

    } 

}
