// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportCensorJobResultResponse} extends {@link TeaModel}
 *
 * <p>ReportCensorJobResultResponse</p>
 */
public class ReportCensorJobResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReportCensorJobResultResponseBody body;

    private ReportCensorJobResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReportCensorJobResultResponse create() {
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
    public ReportCensorJobResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReportCensorJobResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReportCensorJobResultResponseBody body);

        @Override
        ReportCensorJobResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReportCensorJobResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReportCensorJobResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReportCensorJobResultResponse response) {
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
        public Builder body(ReportCensorJobResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReportCensorJobResultResponse build() {
            return new ReportCensorJobResultResponse(this);
        } 

    } 

}
