// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDomainRecordResponseBody</p>
 */
public class DeleteDomainRecordResponseBody extends TeaModel {
    @NameInMap("RecordId")
    private String recordId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteDomainRecordResponseBody(Builder builder) {
        this.recordId = builder.recordId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String recordId; 
        private String requestId; 

        /**
         * The ID of the DNS record.
         */
        public Builder recordId(String recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteDomainRecordResponseBody build() {
            return new DeleteDomainRecordResponseBody(this);
        } 

    } 

}
