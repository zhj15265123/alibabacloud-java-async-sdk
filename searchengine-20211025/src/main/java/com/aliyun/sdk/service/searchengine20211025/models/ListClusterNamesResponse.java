// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterNamesResponse} extends {@link TeaModel}
 *
 * <p>ListClusterNamesResponse</p>
 */
public class ListClusterNamesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterNamesResponseBody body;

    private ListClusterNamesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterNamesResponse create() {
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
    public ListClusterNamesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterNamesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterNamesResponseBody body);

        @Override
        ListClusterNamesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterNamesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterNamesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterNamesResponse response) {
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
        public Builder body(ListClusterNamesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterNamesResponse build() {
            return new ListClusterNamesResponse(this);
        } 

    } 

}
