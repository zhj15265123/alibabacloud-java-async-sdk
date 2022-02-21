// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableBusiRegionsResponse} extends {@link TeaModel}
 *
 * <p>ListAvailableBusiRegionsResponse</p>
 */
public class ListAvailableBusiRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAvailableBusiRegionsResponseBody body;

    private ListAvailableBusiRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAvailableBusiRegionsResponse create() {
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
    public ListAvailableBusiRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAvailableBusiRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAvailableBusiRegionsResponseBody body);

        @Override
        ListAvailableBusiRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAvailableBusiRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAvailableBusiRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAvailableBusiRegionsResponse response) {
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
        public Builder body(ListAvailableBusiRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAvailableBusiRegionsResponse build() {
            return new ListAvailableBusiRegionsResponse(this);
        } 

    } 

}
