// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdvanceConfigDirResponse} extends {@link TeaModel}
 *
 * <p>ListAdvanceConfigDirResponse</p>
 */
public class ListAdvanceConfigDirResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAdvanceConfigDirResponseBody body;

    private ListAdvanceConfigDirResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAdvanceConfigDirResponse create() {
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
    public ListAdvanceConfigDirResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAdvanceConfigDirResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAdvanceConfigDirResponseBody body);

        @Override
        ListAdvanceConfigDirResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAdvanceConfigDirResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAdvanceConfigDirResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAdvanceConfigDirResponse response) {
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
        public Builder body(ListAdvanceConfigDirResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAdvanceConfigDirResponse build() {
            return new ListAdvanceConfigDirResponse(this);
        } 

    } 

}
