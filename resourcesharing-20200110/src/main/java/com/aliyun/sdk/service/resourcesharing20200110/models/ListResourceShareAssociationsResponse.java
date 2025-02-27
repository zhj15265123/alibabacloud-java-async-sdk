// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceShareAssociationsResponse} extends {@link TeaModel}
 *
 * <p>ListResourceShareAssociationsResponse</p>
 */
public class ListResourceShareAssociationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceShareAssociationsResponseBody body;

    private ListResourceShareAssociationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceShareAssociationsResponse create() {
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
    public ListResourceShareAssociationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceShareAssociationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceShareAssociationsResponseBody body);

        @Override
        ListResourceShareAssociationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceShareAssociationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceShareAssociationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceShareAssociationsResponse response) {
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
        public Builder body(ListResourceShareAssociationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceShareAssociationsResponse build() {
            return new ListResourceShareAssociationsResponse(this);
        } 

    } 

}
