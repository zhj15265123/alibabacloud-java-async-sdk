// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelOrderResponse} extends {@link TeaModel}
 *
 * <p>ListHotelOrderResponse</p>
 */
public class ListHotelOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotelOrderResponseBody body;

    private ListHotelOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotelOrderResponse create() {
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
    public ListHotelOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotelOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotelOrderResponseBody body);

        @Override
        ListHotelOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotelOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotelOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotelOrderResponse response) {
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
        public Builder body(ListHotelOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotelOrderResponse build() {
            return new ListHotelOrderResponse(this);
        } 

    } 

}
