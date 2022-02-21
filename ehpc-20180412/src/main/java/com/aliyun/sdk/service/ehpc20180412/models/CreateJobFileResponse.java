// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobFileResponse} extends {@link TeaModel}
 *
 * <p>CreateJobFileResponse</p>
 */
public class CreateJobFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateJobFileResponseBody body;

    private CreateJobFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateJobFileResponse create() {
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
    public CreateJobFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateJobFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateJobFileResponseBody body);

        @Override
        CreateJobFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateJobFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateJobFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateJobFileResponse response) {
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
        public Builder body(CreateJobFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateJobFileResponse build() {
            return new CreateJobFileResponse(this);
        } 

    } 

}
