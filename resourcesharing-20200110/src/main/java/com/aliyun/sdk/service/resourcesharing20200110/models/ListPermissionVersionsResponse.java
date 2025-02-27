// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPermissionVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListPermissionVersionsResponse</p>
 */
public class ListPermissionVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPermissionVersionsResponseBody body;

    private ListPermissionVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPermissionVersionsResponse create() {
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
    public ListPermissionVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPermissionVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPermissionVersionsResponseBody body);

        @Override
        ListPermissionVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPermissionVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPermissionVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPermissionVersionsResponse response) {
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
        public Builder body(ListPermissionVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPermissionVersionsResponse build() {
            return new ListPermissionVersionsResponse(this);
        } 

    } 

}
