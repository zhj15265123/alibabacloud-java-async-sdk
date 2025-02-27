// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTraceAppByNameResponse} extends {@link TeaModel}
 *
 * <p>SearchTraceAppByNameResponse</p>
 */
public class SearchTraceAppByNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchTraceAppByNameResponseBody body;

    private SearchTraceAppByNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchTraceAppByNameResponse create() {
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
    public SearchTraceAppByNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchTraceAppByNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchTraceAppByNameResponseBody body);

        @Override
        SearchTraceAppByNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchTraceAppByNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchTraceAppByNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchTraceAppByNameResponse response) {
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
        public Builder body(SearchTraceAppByNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchTraceAppByNameResponse build() {
            return new SearchTraceAppByNameResponse(this);
        } 

    } 

}
