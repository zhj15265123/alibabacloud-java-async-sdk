// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSharedTargetsResponse} extends {@link TeaModel}
 *
 * <p>ListSharedTargetsResponse</p>
 */
public class ListSharedTargetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSharedTargetsResponseBody body;

    private ListSharedTargetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSharedTargetsResponse create() {
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
    public ListSharedTargetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSharedTargetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSharedTargetsResponseBody body);

        @Override
        ListSharedTargetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSharedTargetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSharedTargetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSharedTargetsResponse response) {
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
        public Builder body(ListSharedTargetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSharedTargetsResponse build() {
            return new ListSharedTargetsResponse(this);
        } 

    } 

}
