// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignReviewerResponse} extends {@link TeaModel}
 *
 * <p>AssignReviewerResponse</p>
 */
public class AssignReviewerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssignReviewerResponseBody body;

    private AssignReviewerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssignReviewerResponse create() {
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
    public AssignReviewerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssignReviewerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssignReviewerResponseBody body);

        @Override
        AssignReviewerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssignReviewerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssignReviewerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssignReviewerResponse response) {
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
        public Builder body(AssignReviewerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssignReviewerResponse build() {
            return new AssignReviewerResponse(this);
        } 

    } 

}
