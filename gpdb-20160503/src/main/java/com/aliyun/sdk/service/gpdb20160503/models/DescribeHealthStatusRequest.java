// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeHealthStatusRequest</p>
 */
public class DescribeHealthStatusRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    private DescribeHealthStatusRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<DescribeHealthStatusRequest, Builder> {
        private String DBInstanceId; 
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHealthStatusRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.key = response.key;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public DescribeHealthStatusRequest build() {
            return new DescribeHealthStatusRequest(this);
        } 

    } 

}
