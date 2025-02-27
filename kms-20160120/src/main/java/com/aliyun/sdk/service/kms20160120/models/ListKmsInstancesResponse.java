// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListKmsInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListKmsInstancesResponse</p>
 */
public class ListKmsInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListKmsInstancesResponseBody body;

    private ListKmsInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListKmsInstancesResponse create() {
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
    public ListKmsInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListKmsInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListKmsInstancesResponseBody body);

        @Override
        ListKmsInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListKmsInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListKmsInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListKmsInstancesResponse response) {
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
        public Builder body(ListKmsInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListKmsInstancesResponse build() {
            return new ListKmsInstancesResponse(this);
        } 

    } 

}
