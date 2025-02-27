// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSessionGroupResponse} extends {@link TeaModel}
 *
 * <p>ListSessionGroupResponse</p>
 */
public class ListSessionGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSessionGroupResponseBody body;

    private ListSessionGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSessionGroupResponse create() {
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
    public ListSessionGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSessionGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSessionGroupResponseBody body);

        @Override
        ListSessionGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSessionGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSessionGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSessionGroupResponse response) {
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
        public Builder body(ListSessionGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSessionGroupResponse build() {
            return new ListSessionGroupResponse(this);
        } 

    } 

}
