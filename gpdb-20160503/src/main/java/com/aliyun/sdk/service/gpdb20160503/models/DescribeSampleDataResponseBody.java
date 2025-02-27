// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSampleDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSampleDataResponseBody</p>
 */
public class DescribeSampleDataResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HasSampleData")
    private Boolean hasSampleData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSampleDataResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.errorMessage = builder.errorMessage;
        this.hasSampleData = builder.hasSampleData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return hasSampleData
     */
    public Boolean getHasSampleData() {
        return this.hasSampleData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String errorMessage; 
        private Boolean hasSampleData; 
        private String requestId; 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The error message returned if an error occurs. This message does not affect the execution of the operation.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Indicates whether a sample dataset is loaded to the instance. Valid values:
         * <p>
         * 
         * *   **true**: A sample dataset is loaded.
         * *   **false**: No sample dataset is loaded.
         */
        public Builder hasSampleData(Boolean hasSampleData) {
            this.hasSampleData = hasSampleData;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSampleDataResponseBody build() {
            return new DescribeSampleDataResponseBody(this);
        } 

    } 

}
