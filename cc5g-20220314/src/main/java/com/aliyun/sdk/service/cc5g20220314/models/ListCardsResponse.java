// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardsResponse} extends {@link TeaModel}
 *
 * <p>ListCardsResponse</p>
 */
public class ListCardsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCardsResponseBody body;

    private ListCardsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCardsResponse create() {
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
    public ListCardsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCardsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCardsResponseBody body);

        @Override
        ListCardsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCardsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCardsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCardsResponse response) {
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
        public Builder body(ListCardsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCardsResponse build() {
            return new ListCardsResponse(this);
        } 

    } 

}
