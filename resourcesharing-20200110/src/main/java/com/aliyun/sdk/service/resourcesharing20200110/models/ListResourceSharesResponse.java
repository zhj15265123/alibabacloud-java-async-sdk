// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceSharesResponse} extends {@link TeaModel}
 *
 * <p>ListResourceSharesResponse</p>
 */
public class ListResourceSharesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceSharesResponseBody body;

    private ListResourceSharesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceSharesResponse create() {
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
    public ListResourceSharesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceSharesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceSharesResponseBody body);

        @Override
        ListResourceSharesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceSharesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceSharesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceSharesResponse response) {
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
        public Builder body(ListResourceSharesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceSharesResponse build() {
            return new ListResourceSharesResponse(this);
        } 

    } 

}
