// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTracesResponse} extends {@link TeaModel}
 *
 * <p>SearchTracesResponse</p>
 */
public class SearchTracesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchTracesResponseBody body;

    private SearchTracesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchTracesResponse create() {
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
    public SearchTracesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchTracesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchTracesResponseBody body);

        @Override
        SearchTracesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchTracesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchTracesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchTracesResponse response) {
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
        public Builder body(SearchTracesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchTracesResponse build() {
            return new SearchTracesResponse(this);
        } 

    } 

}
