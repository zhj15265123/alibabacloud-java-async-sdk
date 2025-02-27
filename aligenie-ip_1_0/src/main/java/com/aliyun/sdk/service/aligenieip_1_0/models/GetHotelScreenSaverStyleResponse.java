// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelScreenSaverStyleResponse} extends {@link TeaModel}
 *
 * <p>GetHotelScreenSaverStyleResponse</p>
 */
public class GetHotelScreenSaverStyleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelScreenSaverStyleResponseBody body;

    private GetHotelScreenSaverStyleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelScreenSaverStyleResponse create() {
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
    public GetHotelScreenSaverStyleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelScreenSaverStyleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelScreenSaverStyleResponseBody body);

        @Override
        GetHotelScreenSaverStyleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelScreenSaverStyleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelScreenSaverStyleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelScreenSaverStyleResponse response) {
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
        public Builder body(GetHotelScreenSaverStyleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelScreenSaverStyleResponse build() {
            return new GetHotelScreenSaverStyleResponse(this);
        } 

    } 

}
