// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnSslServerLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnSslServerLogsResponseBody</p>
 */
public class DescribeVpnSslServerLogsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private Data data;

    @NameInMap("IsCompleted")
    private Boolean isCompleted;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeVpnSslServerLogsResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.isCompleted = builder.isCompleted;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnSslServerLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return isCompleted
     */
    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private Data data; 
        private Boolean isCompleted; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * IsCompleted.
         */
        public Builder isCompleted(Boolean isCompleted) {
            this.isCompleted = isCompleted;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVpnSslServerLogsResponseBody build() {
            return new DescribeVpnSslServerLogsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Logs")
        private java.util.List < String > logs;

        private Data(Builder builder) {
            this.logs = builder.logs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return logs
         */
        public java.util.List < String > getLogs() {
            return this.logs;
        }

        public static final class Builder {
            private java.util.List < String > logs; 

            /**
             * Logs.
             */
            public Builder logs(java.util.List < String > logs) {
                this.logs = logs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
