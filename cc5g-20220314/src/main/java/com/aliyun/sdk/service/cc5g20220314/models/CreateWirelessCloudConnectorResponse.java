// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWirelessCloudConnectorResponse} extends {@link TeaModel}
 *
 * <p>CreateWirelessCloudConnectorResponse</p>
 */
public class CreateWirelessCloudConnectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWirelessCloudConnectorResponseBody body;

    private CreateWirelessCloudConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWirelessCloudConnectorResponse create() {
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
    public CreateWirelessCloudConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWirelessCloudConnectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWirelessCloudConnectorResponseBody body);

        @Override
        CreateWirelessCloudConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWirelessCloudConnectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWirelessCloudConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWirelessCloudConnectorResponse response) {
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
        public Builder body(CreateWirelessCloudConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWirelessCloudConnectorResponse build() {
            return new CreateWirelessCloudConnectorResponse(this);
        } 

    } 

}
