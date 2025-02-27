// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadBackupSetStorageInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeDownloadBackupSetStorageInfoResponse</p>
 */
public class DescribeDownloadBackupSetStorageInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDownloadBackupSetStorageInfoResponseBody body;

    private DescribeDownloadBackupSetStorageInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDownloadBackupSetStorageInfoResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DescribeDownloadBackupSetStorageInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDownloadBackupSetStorageInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDownloadBackupSetStorageInfoResponseBody body);

        @Override
        DescribeDownloadBackupSetStorageInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDownloadBackupSetStorageInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDownloadBackupSetStorageInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDownloadBackupSetStorageInfoResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeDownloadBackupSetStorageInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDownloadBackupSetStorageInfoResponse build() {
            return new DescribeDownloadBackupSetStorageInfoResponse(this);
        } 

    } 

}
