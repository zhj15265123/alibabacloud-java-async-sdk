// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchWirelessCloudConnectorToBusinessResponse} extends {@link TeaModel}
 *
 * <p>SwitchWirelessCloudConnectorToBusinessResponse</p>
 */
public class SwitchWirelessCloudConnectorToBusinessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchWirelessCloudConnectorToBusinessResponseBody body;

    private SwitchWirelessCloudConnectorToBusinessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchWirelessCloudConnectorToBusinessResponse create() {
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
    public SwitchWirelessCloudConnectorToBusinessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchWirelessCloudConnectorToBusinessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchWirelessCloudConnectorToBusinessResponseBody body);

        @Override
        SwitchWirelessCloudConnectorToBusinessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchWirelessCloudConnectorToBusinessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchWirelessCloudConnectorToBusinessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchWirelessCloudConnectorToBusinessResponse response) {
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
        public Builder body(SwitchWirelessCloudConnectorToBusinessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchWirelessCloudConnectorToBusinessResponse build() {
            return new SwitchWirelessCloudConnectorToBusinessResponse(this);
        } 

    } 

}
