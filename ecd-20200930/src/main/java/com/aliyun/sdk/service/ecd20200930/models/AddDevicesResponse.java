// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDevicesResponse} extends {@link TeaModel}
 *
 * <p>AddDevicesResponse</p>
 */
public class AddDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDevicesResponseBody body;

    private AddDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDevicesResponse create() {
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
    public AddDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDevicesResponseBody body);

        @Override
        AddDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDevicesResponse response) {
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
        public Builder body(AddDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDevicesResponse build() {
            return new AddDevicesResponse(this);
        } 

    } 

}
