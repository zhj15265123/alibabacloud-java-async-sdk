// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlgorithmVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListAlgorithmVersionsResponse</p>
 */
public class ListAlgorithmVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlgorithmVersionsResponseBody body;

    private ListAlgorithmVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlgorithmVersionsResponse create() {
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
    public ListAlgorithmVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlgorithmVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlgorithmVersionsResponseBody body);

        @Override
        ListAlgorithmVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlgorithmVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlgorithmVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlgorithmVersionsResponse response) {
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
        public Builder body(ListAlgorithmVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlgorithmVersionsResponse build() {
            return new ListAlgorithmVersionsResponse(this);
        } 

    } 

}
