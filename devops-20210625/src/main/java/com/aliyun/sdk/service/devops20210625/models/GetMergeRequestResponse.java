// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMergeRequestResponse} extends {@link TeaModel}
 *
 * <p>GetMergeRequestResponse</p>
 */
public class GetMergeRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMergeRequestResponseBody body;

    private GetMergeRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMergeRequestResponse create() {
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
    public GetMergeRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMergeRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMergeRequestResponseBody body);

        @Override
        GetMergeRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMergeRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMergeRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMergeRequestResponse response) {
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
        public Builder body(GetMergeRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMergeRequestResponse build() {
            return new GetMergeRequestResponse(this);
        } 

    } 

}
