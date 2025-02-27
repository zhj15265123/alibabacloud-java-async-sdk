// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMultiAccountResourcesResponse} extends {@link TeaModel}
 *
 * <p>SearchMultiAccountResourcesResponse</p>
 */
public class SearchMultiAccountResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchMultiAccountResourcesResponseBody body;

    private SearchMultiAccountResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchMultiAccountResourcesResponse create() {
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
    public SearchMultiAccountResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchMultiAccountResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchMultiAccountResourcesResponseBody body);

        @Override
        SearchMultiAccountResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchMultiAccountResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchMultiAccountResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchMultiAccountResourcesResponse response) {
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
        public Builder body(SearchMultiAccountResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchMultiAccountResourcesResponse build() {
            return new SearchMultiAccountResourcesResponse(this);
        } 

    } 

}
