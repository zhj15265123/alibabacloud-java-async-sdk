// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSessionRateTrendResponse} extends {@link TeaModel}
 *
 * <p>ListSessionRateTrendResponse</p>
 */
public class ListSessionRateTrendResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSessionRateTrendResponseBody body;

    private ListSessionRateTrendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSessionRateTrendResponse create() {
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
    public ListSessionRateTrendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSessionRateTrendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSessionRateTrendResponseBody body);

        @Override
        ListSessionRateTrendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSessionRateTrendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSessionRateTrendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSessionRateTrendResponse response) {
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
        public Builder body(ListSessionRateTrendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSessionRateTrendResponse build() {
            return new ListSessionRateTrendResponse(this);
        } 

    } 

}
